package SyntaxHighlighting;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }else if(factory.equalsIgnoreCase("FONT")){
            return new FontFactory();
        }else if(factory.equalsIgnoreCase("PARSER")){
            return new ParserFactory();
        }
        return null;
    }
}
