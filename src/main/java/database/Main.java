package database;

import analytics.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        DataBase db2 = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db2)) {
            ReportBuilder br2 = new ReportBuilder(db2);
        }
    }
}
