package practice_pattern_programming.task9;

public class PDFProcessor implements DocumentProcessor{
  private  String fileName;

    public PDFProcessor(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void process() {
        System.out.println("Конвертация PDF в DOC " + fileName);
    }
}
