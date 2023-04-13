package test_java;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;


public class TestRunner {

    public static void main(String[] args){
        

        Scanner scanner = new Scanner(new InputStreamReader(System.in,
                Charset.forName("UTF-8")));

        Ch10 ch10 = new Ch10(scanner);

        ch10.testEnumOne();
        
        ch10.testEnumTwo();

        ch10.testEnumThree();

        ch10.testEnumFour();

        ch10.testArrList();

        ch10.testException();

        ch10.testString();

        ch10.testToyObj();

    }
}