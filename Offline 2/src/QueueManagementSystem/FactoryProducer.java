package QueueManagementSystem;

public class FactoryProducer {
    public static AbstractFactory getFactory(String part){
        if(part==null){
            return null;
        }else if(part.equalsIgnoreCase("DISPLAY")){
            return new DisplayFactory();
        }else if(part.equalsIgnoreCase("PROCESSOR")){
            return new ProcessorFactory();
        }else if(part.equalsIgnoreCase("COMM")){
            return new CommModuleFactory();
        }
        return null;
    }
}