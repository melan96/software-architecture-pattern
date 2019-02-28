package decorator_imp;

public class DebuggingFilter extends FilterHandler {


    public DebuggingFilter(Processor processor) {
        super(processor);
    }

    @Override
    public String execute() {
        return processor.execute()+" --> Debugging Filter Added";
    }

}
