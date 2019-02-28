package decorator_imp;

public class AuthenticationFilter extends FilterHandler {

    public AuthenticationFilter(Processor processor) {
        super(processor);
    }

    @Override
    public String execute() {
        return processor.execute()+" --> Authentication Filter Added";
    }
}
