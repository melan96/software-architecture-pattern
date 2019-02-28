package decorator_imp;

public abstract class FilterHandler implements Processor {

    Processor processor;

    public FilterHandler(Processor processor) {
        this.processor = processor;
    }
}
