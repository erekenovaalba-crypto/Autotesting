package practice_pattern_programming.task9;

public class PDFProcessor implements DocumentProcessor{
  private final String fileName;

    public PDFProcessor(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void process() {
        System.out.println("Конвертация PDF в DOC " + fileName);
    }
}
