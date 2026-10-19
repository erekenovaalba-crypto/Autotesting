package practice_pattern_programming.task6;

public class Main {
    static void main() {
        GUIFactory guiFactory = new WindowsFactory();
        guiFactory.createButton().click();
        guiFactory.createMenu().configure();
        guiFactory.createWindow().draw();
        GUIFactory guiFactory1 = new MacFactory();
        guiFactory1.createWindow().draw();
        guiFactory1.createMenu().configure();
        guiFactory1.createButton().click();
    }
}
