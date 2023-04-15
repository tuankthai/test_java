package test_java;

import java.util.Scanner;

// import javax.net.ssl.TrustManagerFactory;
// import javax.sound.sampled.BooleanControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.DayOfWeek;
import java.time.Month;

public class Ch10 {
    Scanner scanner;
    Ch10Enum ch10Enum;
    Scanner scannerX;
    // init String array with array literals
    String[] arrOfEnum = { "NORTH", "EAST", "SOUTH", "WEST" };

    public Ch10(Scanner scanner, Scanner scannerX) {
        this.scanner = scanner;
        this.scannerX = scannerX;
    }

    public void testEnum(String[] arrX) {

        String line = String.format("length of array is %d", arrX.length);
        System.out.println(line);

        for (String msg : arrX) {
            Ch10Enum token = Ch10Enum.valueOf(msg);
            line = Ch10Enum.getDisplayValue(token);
            System.out.println(line);
        }

    }

    public void testEnumList(ArrayList<String> arrList) {

        String line = String.format("length of array List is %d", arrList.size());
        System.out.println(line);

        for (String msg : arrList) {
            Ch10Enum token = Ch10Enum.valueOf(msg);
            line = Ch10Enum.getDisplayValue(token);
            System.out.println(line);
        }

    }

    public void testEnumOne() {
        System.out.println("testEnumOne");
        testEnum(arrOfEnum);
    }

    public void testEnumTwo() {
        String[] arrStr = new String[4];

        arrStr[0] = "NORTH";
        arrStr[1] = "EAST";
        arrStr[2] = "SOUTH";
        arrStr[3] = "WEST";

        System.out.println("testEnumTwo");
        testEnum(arrStr);
    }

    public void testEnumThree() {
        ArrayList<String> listOfEnum = new ArrayList<>(
                Arrays.asList("NORTH", "EAST", "SOUTH", "WEST"));

        System.out.println("testEnumThree");
        testEnumList(listOfEnum);
    }

    public void testEnumFour() {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }

    public void testArrList() {
        String outStr;
        ArrayList<String> listOfEnum = new ArrayList<>(
                Arrays.asList("NORTH", "EAST", "SOUTH", "WEST"));

        ArrayList<Game> listOfGame = new ArrayList<>(
                Arrays.asList(new Game(1), new Game(2)));

        ArrayList<Integer> listOfInt = new ArrayList<>(
                Arrays.asList(11, 12, 13));

        ArrayList<Character> listOfChar = new ArrayList<>(
                Arrays.asList('a', 'b', 'c'));

        ArrayList<String> listOfString = new ArrayList<>(
                Arrays.asList("string1", "string2", "string3"));
        // cannot remove item with String type
        /*
         * System.out.println("testArrList");
         * testEnumList(listOfEnum);
         * for (String msg : listOfEnum) {
         * if (msg.equals("WEST")) {
         * // listOfEnum.remove(msg); //does not work for String class type
         * }
         * }
         * 
         * System.out.println("After removing #1 testArrList");
         * testEnumList(listOfEnum);
         */

        System.out.println("After removing item 0 testArrList");
        listOfEnum.remove(0);
        testEnumList(listOfEnum);

        // get, set, add
        outStr = String.format("idx 0 item %s, ", listOfEnum.get(0));
        System.out.println(outStr);

        listOfEnum.set(0, "NORTH");
        System.out.println("After setting idx 0 item testArrList");
        testEnumList(listOfEnum);

        listOfEnum.add(0, "EAST");
        System.out.println("After adding at idx 0 item testArrList");
        testEnumList(listOfEnum);

        listOfEnum.add("SOUTH");
        System.out.println("After adding item testArrList");
        testEnumList(listOfEnum);

        listOfEnum.remove("SOUTH");
        System.out.println("After removing item with SOUTH testArrList");
        testEnumList(listOfEnum);

        System.out.println("print game:");
        for (Game game : listOfGame) {
            System.out.println(game);
        }

        Game gameX = listOfGame.get(0);
        listOfGame.remove(gameX);
        System.out.println("after removing, print game:");
        for (Game game : listOfGame) {
            System.out.println(game);
        }

        System.out.println("print list of integers:");
        for (Integer num : listOfInt) {
            System.out.println(num);
        }

        System.out.println("print list of chars:");
        for (Character charX : listOfChar) {
            System.out.println(charX);
        }

        Character aChar = listOfChar.get(0);
        listOfChar.remove(aChar);

        printListOfChar(listOfChar);
        listOfChar.add('e');

        printListOfChar(listOfChar);

        /* */
        printListOfString(listOfString);
        String aStr = listOfString.get(0);
        listOfString.remove(aStr);
        printListOfString(listOfString);

    }

    private void printListOfChar(ArrayList<Character> charList) {
        System.out.println("print list of chars:");
        for (Character charX : charList) {
            System.out.println(charX);
        }

    }

    private void printListOfString(ArrayList<String> stringList) {
        System.out.println("print list of strings:");
        for (String strX : stringList) {
            System.out.println(strX);
        }

    }

    public void testString() {
        // test StringBuilder
        StringBuilder strA = new StringBuilder("Give me a new string");
        strA.insert(5, "her and ");
        System.out.println(strA.toString());

        StringBuilder strX = new StringBuilder();
        strX.append("A very long string to print. a short string to type.");
        String strY = strX.toString();

        // test substring()
        String msg = strY.substring(0, 11);
        System.out.println(msg);

        int idx = strY.indexOf("long");
        msg = strY.substring(idx, strY.length()); // substring does not include endIdx position
        System.out.println(msg);

        idx = strY.indexOf("print");
        msg = strY.substring(idx); // substring does not include endIdx position
        System.out.println(msg);

        // test indexOf() usages
        idx = strY.indexOf("string");
        msg = strY.substring(idx);
        System.out.println(msg);

        int startIdx = idx;
        idx = strY.indexOf("string", startIdx + 6);
        msg = strY.substring(idx);
        System.out.println(msg);

        idx = strY.indexOf("strength");
        if (idx == -1) {
            System.out.println("cannot find strength");
        }

        String fmtStr = String.format("Format a string %+,10.2f, %+,.3f. reverse %2$.2f, %1$(10.3f, %<0,+12.3f",
                -2000.434, 3000.535);
        System.out.println(fmtStr);
    }

    public void testException() throws IllegalArgumentException {

        try {
            throwBadException();
        }

        catch (IllegalArgumentException e) {
            String msg = e.getMessage();

            System.out.println(String.format("IllegalArgumentException detected, error msg: %s", msg));
        }

        
    }

    private void throwBadException() {

        throw new IllegalArgumentException(String.format("Menu option id %d is not an available option.", 4));

    }

    /**
     * It does not throw unchecked exception for me.
     * 
     * @param arg
     * @return
     */
    private double throwAnotherBadException(int arg) {
        System.out.println("in throwAnotherBadException()");
        double num = (float) 1 / arg;
        return num;
    }

    public void testToyObj() {
        Toy toy1 = new Toy(1, "bear");
        Toy toy2 = new Toy(2, "Pig");
        Toy toy3 = new Toy(2, "Pig");

        if (toy1.equals(toy2)) {
            System.out.println("toy 1 == toy 2");
        } else {
            System.out.println("toy 1 not equal toy 2");
        }

        if (toy3.equals(toy2)) {
            System.out.println("toy 3 == toy 2");
        } else {
            System.out.println("toy 3 not equal toy 2");
        }
    }

    private void printMsg(String msg) {
        System.out.println("You input: " + msg);
    }

    private void printMsg(int nbr) {
        System.out.println("You input: " + nbr);
    }

    private void printMsg(boolean boo) {
        System.out.println("You input: " + boo);
    }

    private void printMsg(double dbl) {
        System.out.println("You input: " + dbl);
    }

    public void testScanner() {
        System.out.println("Enter String:");
        String msg = scanner.nextLine();
        printMsg(msg);

        System.out.println("Enter integer:");
        int nbr = scanner.nextInt();
        printMsg(nbr);

        System.out.println("Enter boolean:");
        boolean boo = scanner.nextBoolean();
        printMsg(boo);

        System.out.println("Enter double:");
        double dbl = scanner.nextDouble();
        printMsg(dbl);

        System.out.println("Enter a word:");
        String word = scanner.next();
        printMsg(word);

        word = scanner.next();
        printMsg(word);

        scanner.close();
    }

    public void testScannerX() {
        boolean boo;
        String msg;
        int nbr;
        double dbl;

        System.out.println("Start ScannerX:");

        System.out.println("Enter String:");
        msg = scannerX.nextLine();
        printMsg(msg);

        System.out.println("Enter integer:");
        nbr = scannerX.nextInt();
        printMsg(nbr);

        System.out.println("Enter integer:");

        if (scannerX.hasNextInt()) {
            nbr = scannerX.nextInt();
            printMsg(nbr);
        } else {

            if (scannerX.hasNextDouble()) {
                dbl = scannerX.nextDouble();
                printMsg("a double " + dbl);
            } else {
                if (scannerX.hasNextBoolean()) {
                    boo = scannerX.nextBoolean();
                    printMsg("a boolean " + boo);
                } else {

                    if (scannerX.hasNextLine()) {
                    
                        scannerX.nextLine(); // skip end of line
                        if (scannerX.hasNextLine()) {
                            msg = scannerX.nextLine();
                            printMsg("a string " + msg);
                        } else {
                            System.out.println("Hey, Don't know what it is");
                        }
                        
                    } else {
                        System.out.println("Don't know what it is");
                    }
                }
            }
        }

        scannerX.close();

    }

}
