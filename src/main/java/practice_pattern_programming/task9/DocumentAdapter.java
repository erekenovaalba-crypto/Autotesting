package practice_pattern_programming.task9;

public class DocumentAdapter implements DocumentProcessor{
    private DOCProcessor doc;
    public DocumentAdapter(DOCProcessor doc){
        this.doc = doc;
    }

    @Override
    public void process() {
       System.out.println("Преобразование DOC в PDF");
    }
}
