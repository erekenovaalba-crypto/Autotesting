package practice_pattern_programming.task9;

public class DocumentAdapter implements DocumentProcessor{
    private final PDFProcessor pdfProcessor;
    public DocumentAdapter(PDFProcessor pdfProcessor){
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
      pdfProcessor.process();
    }
}
