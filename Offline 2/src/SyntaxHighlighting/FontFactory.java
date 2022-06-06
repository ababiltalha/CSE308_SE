package SyntaxHighlighting;

public class FontFactory extends AbstractFactory{
    @Override
    Fonts getFontFactory(String name) {
        if(name==null){
            return null;
        }
        else if(name.equalsIgnoreCase("COURIERNEW")){
            return new CourierNew();
        }
        else if(name.equalsIgnoreCase("MONACO")){
            return new Monaco();
        }
        else if(name.equalsIgnoreCase("CONSOLAS")){
            return new Consolas();
        }

        return null;
    }

    @Override
    Parser getParserFactory(String name) {
        return null;
    }
}
