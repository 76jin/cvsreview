package com.cvsreview;

import lombok.extern.java.Log;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by ranian129@gmail.com on 2019-03-14
 * Blog : http://76jin.tistory.com
 * Github : http://github.com/76jin
 */
@SpringBootTest
@Log
public class DBConnectionTest {

    private static final Logger logger = LoggerFactory.getLogger(DBConnectionTest.class);

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConection() {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:49161:XE",
                "cvsreviewDev",
                "cvsreviewDev$")) {
            System.out.println("#### testConnection");
            System.out.println(conn);

            logger.info(conn.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
    }
}
