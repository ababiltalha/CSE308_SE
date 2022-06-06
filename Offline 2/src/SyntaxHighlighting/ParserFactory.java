package SyntaxHighlighting;

public class ParserFactory extends AbstractFactory {
    @Override
    Fonts getFontFactory(String name) {
        return null;
    }

    @Override
    Parser getParserFactory(String name) {
        if(name==null){
            return null;
        }
        else if(name.equalsIgnoreCase("C")){
            return new CParser();
        }
        else if(name.equalsIgnoreCase("CPP")){
            return new CPPParser();
        }
        else if(name.equalsIgnoreCase("PY")){
            return new PythonParser();
        }

        return null;
    }
}
