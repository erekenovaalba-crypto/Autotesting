package practice_pattern_programming.task9;

public class DOCProcessor implements DocumentProcessor{
    private String fileNme;

    public DOCProcessor(String fileNme) {
        this.fileNme = fileNme;
    }

    @Override
    public void process() {
        System.out.println("Обработка DOC файла " + fileNme);
    }
}
