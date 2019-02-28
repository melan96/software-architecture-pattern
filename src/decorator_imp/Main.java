package decorator_imp;

public class Main {

    public static void main(String[] args){
        Processor process = new CoreProcessor();

        process = new AuthenticationFilter(process);

        process = new DebuggingFilter(process);

        System.out.println(process.execute());
    }
}
