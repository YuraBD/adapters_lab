package database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
    private БазаДаних базаДаних;
    private DataBase dataBase;

    @BeforeEach
    void setUp() {
        базаДаних = new БазаДаних();
        dataBase = new DataBase();
    }

    @Test
    void getUserData() {
        assertEquals(базаДаних.отриматиДаніКористувача(), dataBase.getUserData());
    }

    @Test
    void getDataStatistic() {
        assertEquals(базаДаних.отриматиСтатистичніДані(), dataBase.getDataStatistic());
    }
}