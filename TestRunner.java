package test_java;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(new InputStreamReader(System.in,
                Charset.forName("UTF-8")));

        Scanner scannerX = new Scanner(System.in);

        Ch10 ch10 = new Ch10(scanner, scannerX);

        // ch10.testEnumOne();

        // ch10.testEnumTwo();

        // ch10.testEnumThree();

        // ch10.testEnumFour();

        // ch10.testArrList();

        // ch10.testException();

        // ch10.testString();

        // ch10.testToyObj();

        // ch10.testScanner();

        try {
            ch10.testScannerX();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException Exception detected :" + e.getMessage());

            scanner.close();
            scannerX.close();

        }

    }
}