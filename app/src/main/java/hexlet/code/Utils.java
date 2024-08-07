package hexlet.code;

public class Utils {
    static final int NUMBER_RANGE = 20;
    public static int randomNum() {
        int randomNum;

        randomNum = (int) (Math.random() * NUMBER_RANGE);
        return randomNum;
    }
    public static int randomNum(int number) {
        int randomNum;
        randomNum = (int) (Math.random() * number);
        return randomNum;
    }
}
