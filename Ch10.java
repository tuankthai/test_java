package test_java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Ch10 {
    Scanner scanner;
    Ch10Enum ch10Enum;
    // init String array with array literals
    String[] arrOfEnum = { "NORTH", "EAST", "SOUTH", "WEST" };

    public Ch10(Scanner scanner) {
        this.scanner = scanner;
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

    }
    
    public void testString() {
        StringBuilder strX = new StringBuilder();
        strX.append("A very long string to print. a short string to type.");
        String strY = strX.toString();

        //test substring()
        String msg = strY.substring(0, 11);
        System.out.println(msg);

        int idx = strY.indexOf("long");
        msg = strY.substring(idx, strY.length());  //substring does not include endIdx position
        System.out.println(msg);

        idx = strY.indexOf("print");
        msg = strY.substring(idx); // substring does not include endIdx position
        System.out.println(msg);
 
        // test indexOf() usages
        idx = strY.indexOf("string");
        msg = strY.substring(idx); 
        System.out.println(msg);

        int startIdx = idx; 
        idx = strY.indexOf("string",  startIdx+6);
        msg = strY.substring(idx); 
        System.out.println(msg);

        idx = strY.indexOf("strength");
        if (idx == -1) {
            System.out.println("cannot find strength");
        } 

    }

}