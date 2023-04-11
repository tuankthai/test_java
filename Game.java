package test_java;

public class Game {
    private int joystick;
    
    public Game(int firstNum) {
        joystick = firstNum;
    }
    
    public int getJoyStick() {
        return joystick;
    }

    public String toString(){
        String msg = String.format("%d", joystick);
        return msg;
    }
}
