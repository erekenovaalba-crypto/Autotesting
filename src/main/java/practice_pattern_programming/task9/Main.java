package practice_pattern_programming.task9;

public class Main {
    static void main() {
  DOCProcessor docProcessor = new DOCProcessor("file.doc");
        docProcessor.process();

        DocumentProcessor adapter = new DocumentAdapter(docProcessor);
        adapter.process();
    }
}
