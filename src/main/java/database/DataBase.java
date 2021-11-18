package database;

public class DataBase extends БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    public String getDataStatistic() {
        return super.отриматиСтатистичніДані();
    }
}
