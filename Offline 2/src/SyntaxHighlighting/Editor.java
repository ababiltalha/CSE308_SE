package SyntaxHighlighting;

public class Editor {
    private static Editor editor=null;
    private Fonts font;
    private Parser parser;
    private AbstractFactory fontFactory= FactoryProducer.getFactory("FONT");
    private AbstractFactory parserFactory= FactoryProducer.getFactory("PARSER");
    private Editor(){
    }
    public static Editor getInstance(){
        if(editor==null) editor=new Editor();
        return editor;
    }
    public void parse(String filename){
        String[] fileDetails=filename.split("\\.");
        if (fileDetails.length>2) {
            System.out.println("Invalid file type. No matching parser.");
            return;
        }
        if(fileDetails[1].equalsIgnoreCase("C")){
            editor.parser=parserFactory.getParserFactory("C");
            editor.font=fontFactory.getFontFactory("COURIERNEW");
        } else if(fileDetails[1].equalsIgnoreCase("CPP")){
            editor.parser=parserFactory.getParserFactory("CPP");
            editor.font=fontFactory.getFontFactory("MONACO");
        } else if(fileDetails[1].equalsIgnoreCase("PY")){
            editor.parser=parserFactory.getParserFactory("PY");
            editor.font=fontFactory.getFontFactory("CONSOLAS");
        } else {
            System.out.println("Invalid file type. No matching parser.");
            return;
        }
        editor.font.showFont();
        editor.parser.parse();

    }
}
