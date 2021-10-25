package guice;



import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application {
    private final int mode;//значение параметра выбирается при создании экземпляра
                            //в слассе MainModule
    private String tag;

    @Inject
    public Application(@NotNull int mode,@NotNull String tag){
        this.mode=mode;
        this.tag=tag;
    }
    protected void waitForInput(){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {
                String line=scanner.nextLine();
                switch (mode){
                    //вывод в консоль
                    case 1:{
                        LoggerConsole log = new LoggerConsole(tag,line);
                        log.doLog();
                        break;
                    }
                    //вывод в файл
                    case 2:{
                        LoggerFile log=new LoggerFile(tag,line);
                        log.doLog();
                        break;
                    }
                    //композитное
                    case 3: {
                        LoggerConsole log1 = new LoggerConsole(tag,line);
                        log1.doLog();
                        LoggerFile log2 = new LoggerFile(tag,line);
                        log2.doLog();
                        break;
                    }
                }

            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.err.println(e);
        }
    }
}

