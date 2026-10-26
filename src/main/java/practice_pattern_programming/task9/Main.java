package practice_pattern_programming.task9;

public class Main {
    static void main() {
        DOCProcessor docProcessor = new DOCProcessor("file.doc");
        docProcessor.process();
        PDFProcessor pdfProcessor = new PDFProcessor("file.pdf");
        DocumentProcessor adapter = new DocumentAdapter(pdfProcessor);
        adapter.process();
    }
}
