package practice_pattern_programming.task9;

public class DOCProcessor implements DocumentProcessor{
    private final String fileName;

    public DOCProcessor(String fileNme) {
        this.fileName = fileNme;
    }

    @Override
    public void process() {
        System.out.println("Обработка DOC файла " + fileName);
    }
}
