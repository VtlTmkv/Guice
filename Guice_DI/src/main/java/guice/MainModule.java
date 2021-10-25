package guice;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class MainModule extends AbstractModule {

    @Override
    protected void configure(){
        Multibinder<LoggerHelper> multibinder
                = Multibinder.newSetBinder(binder(), LoggerHelper.class);
        multibinder.addBinding().to(LoggerConsole.class);
        multibinder.addBinding().to(LoggerFile.class);
        bind(Application.class).toInstance(new Application(3,"a"));
    }
}
