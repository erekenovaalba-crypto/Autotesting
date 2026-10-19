package practice_pattern_programming.task1;

/*В приложении необходимо создать класс ConfigurationManager, который будет управлять настройками приложения, такими как:
Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
Путь к папке для хранения файлов.
Настройки логирования (например, уровень логирования, путь к лог-файлу).
Класс ConfigurationManager должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса,
который будет предоставлять доступ к конфигурационным данным.*/
public class ConfigurationManager {
    private final String USERNAME = "alba-madona";
    private final String PASSWORD = "password";
    private final String BASE_URL = "oracle.com";
    private final String FILE_STORAGE_PATH = "./documents";
    private final String LOG_LEVEL = "HIGH";
    private final String LOG_FILE_PATH = "./log.history.log";
    public static ConfigurationManager configurationManager;
    private ConfigurationManager(){}
    public static ConfigurationManager getInstance(){
        if (configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
    public void displayConfig(){
        System.out.println("username: " + USERNAME +
                "\npassword: " + PASSWORD +
                "\ndatabase URL: " + BASE_URL +
                "\nfile storage path: " + FILE_STORAGE_PATH +
                "\nlog level: " + LOG_LEVEL +
                "\nlog file path: " + LOG_FILE_PATH);
    }
}

