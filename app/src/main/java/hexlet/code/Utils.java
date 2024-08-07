package hexlet.code;

public class Utils {
    public static int randomNum() {
        int randomNum;
        int NUMBER_RANGE = 20;
        randomNum = (int) (Math.random() * NUMBER_RANGE);
        return randomNum;
    }
    public static int randomNum(int number) {
        int randomNum;
        randomNum = (int) (Math.random() * number);
        return randomNum;
    }
}
