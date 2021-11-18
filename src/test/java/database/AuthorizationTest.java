package database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    private Authorization authorization;
    private Авторизація авторизація;

    @BeforeEach
    void setUp() {
        авторизація = new Авторизація();
        authorization = new Authorization();
    }

    @Test
    void authorize() {
        DataBase dataBase = new DataBase();
        assertEquals(авторизація.авторизуватися(dataBase), authorization.authorize(dataBase));
    }
}