package hexlet.code;

public class Utils {
    public static int randomNum() {
        int randomNum;
        randomNum = (int) (Math.random() * 20);
        return randomNum;
    }
    public static int randomNum(int number) {
        int randomNum;
        randomNum = (int) (Math.random() * number);
        return randomNum;
    }
}
