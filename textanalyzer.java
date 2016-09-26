public Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer analyzer : analyzers) {
        Label result;
        
        if ((result = analyzer.processText(text)) != Label.OK) {
           return result;
        }
    }
    return Label.OK;
}
abstract class KeywordAnalyzer implements TextAnalyzer {
    
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    
    @Override
    public Label processText(String text) {
        for (String s : getKeywords()) {
            if (text.contains(s)) return getLabel();
        }
        return Label.OK;
    }
}
class SpamAnalyzer extends KeywordAnalyzer {
    
    private String[] keywords;
    
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
}
    @Override
    protected String[] getKeywords() {
        return keywords;
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] melancholySequence = {":|", ":(", "=("};
    
    @Override
    protected String[] getKeywords() {
        return melancholySequence;
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
        ClassCastException s;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }
}
