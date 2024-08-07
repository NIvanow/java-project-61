package hexlet.code;

public class Utils {
    public static int randomNum(int num) {
        int randomNum;
        randomNum = (int) (Math.random() * num);
        return randomNum;
    }
}
