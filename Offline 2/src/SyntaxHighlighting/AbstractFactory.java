package SyntaxHighlighting;

public abstract class AbstractFactory {
    abstract Fonts getFontFactory(String name);
    abstract Parser getParserFactory(String name);
}
