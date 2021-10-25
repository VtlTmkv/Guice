package guice;

import javax.inject.Inject;
import java.io.File;
import java.io.FileWriter;


//логирование в файл
public class LoggerFile extends LoggerHelper{
    private String line;
    private File fl=new File("/Users/vtltmkv/desktop/guice/log.txt");


    @Inject
    public LoggerFile( String tag,String line) {
        super(tag);
        this.line=line;
    }

    @Override
    public void doLog() {
        try(FileWriter fw=new FileWriter(fl,true)){
            fw.write(String.valueOf(getCounter())+" : "+openTag+line+closeTag+"\n");
            fw.close();
            setCounter();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
