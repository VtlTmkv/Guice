package guice;


import javax.inject.Inject;

//логирование в консоль
public class LoggerConsole extends LoggerHelper {
    private String line;

    @Inject
    public LoggerConsole(String tag,String line) {
        super(tag);
        this.line=line;
    }

    @Override
    public void doLog() {
        try{
            System.out.println(String.valueOf(getCounter())+" : "+openTag+line+closeTag);
            setCounter();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
