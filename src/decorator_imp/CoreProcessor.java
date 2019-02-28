package decorator_imp;

public class CoreProcessor implements Processor {


    @Override
    public String execute() {
        return "--> Core Processor Base Triggered";
    }
}
