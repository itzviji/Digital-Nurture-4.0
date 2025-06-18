public class Logger
{
    private static Logger instance;
    private Logger()
    {
        System.out.println("Logger instantiated");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance =new Logger();
        }
        return instance;
    }
    public void log(String str){
        System.out.println(str);
    }

}