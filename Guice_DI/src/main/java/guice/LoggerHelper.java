package guice;


import javax.inject.Inject;

//Абстрактный класс логирования
public abstract class LoggerHelper {
    private static int counter=0;
    protected String openTag;
    protected String closeTag;


    @Inject
    public LoggerHelper(String tag){
        this.openTag="<"+tag+">";
        this.closeTag="</"+tag+">";
    }

    public int getCounter(){
        return counter;
    }

    public void setCounter(){
        this.counter+=1;
    }

    public abstract void doLog();
}
