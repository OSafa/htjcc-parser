package test;

import html.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;


/**
 * JUnit tests for parser
 * Note:
 * The absolute path of test files is used to pass the input in the file input stream
 * first 5 testcases test for correct output
 * the rest test for validation and detection
 *
 */
class HypertextTest {

    @org.junit.jupiter.api.Test
    void test() {
        System.out.println(System.getProperty("user.dir"));
        String output = "<img src=\"https://www.w3schools.com/html/pic_trulli.jpg\"/>";
        String result = null;
        try {
            result = new Hypertext(new FileInputStream("C:\\test\\test.txt")).create();
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(output,result);

    }
    @org.junit.jupiter.api.Test
    void test2() {
        String output = "<h1>Hello World</h1>";
        String result = null;
        try {
            result = new Hypertext(new FileInputStream("C:\\test\\test2.txt")).create();
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(output,result);

    }
    @org.junit.jupiter.api.Test
    void test3() {
        String output = "<p style=\"color:Red;font-family:Arial;\">Welcome</p>";
        String result = null;
        try {
            result = new Hypertext(new FileInputStream("C:\\test\\test3.txt")).create();
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(output,result);

    }
    @org.junit.jupiter.api.Test
    void test4() {
        String output = "<a href=\"http://google.com\">Search</a>";

        String result = null;
        try {
            result = new Hypertext(new FileInputStream("C:\\test\\test4.txt")).create();
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(output,result);

    }
    @org.junit.jupiter.api.Test
    void test5() {
        String output = "<a href=\"http://gmail.com\" style=\"color:Green;\">Email</a>";

        String result = null;
        try {
            result = new Hypertext(new FileInputStream("C:\\test\\test5.txt")).create();
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(output,result);

    }
    @org.junit.jupiter.api.Test
    void test6() {
        ParseException exception = assertThrows(ParseException.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test6.txt")).create();
        });

    }
    @Test
    void test7() {
            TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
                String result = new Hypertext(new FileInputStream("C:\\test\\test7.txt")).create();
            });

    }
    @Test
    void test8() {
        TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test8.txt")).create();
        });

    }
    @Test
    void test9() {
        ParseException exception = assertThrows(ParseException.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test9.txt")).create();
        });

    }
    @Test
    void test10() {
        TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test10.txt")).create();
        });
    }
    @Test
    void test11() {
        TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test11.txt")).create();
        });
        String expectedMessage = "Lexical";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void test12() {
        TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test12.txt")).create();
        });

    }
    @Test
    void test13() {
        TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test13.txt")).create();
        });

    }
    @Test
    void test14() {
        ParseException exception = assertThrows(ParseException.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test14.txt")).create();
        });

    }
    @Test
    void test15() {
        TokenMgrError exception = assertThrows(TokenMgrError.class, () -> {
            String result = new Hypertext(new FileInputStream("C:\\test\\test15.txt")).create();
        });

    }


}