package practice_pattern_programming.task2;

public class Main {
    static void main() {
        Logger logger = Logger.getInstance();
        logger.errorLog("Ошибка при выполнении операции");
        logger.infoLog("Успешное подключение к базе данных");
        logger.warningLog("Попытка работы с устаревшими методами");
        Logger logger1 =Logger.getInstance();
        logger1.infoLog("Успешное подключение к серверу");
    }
}
