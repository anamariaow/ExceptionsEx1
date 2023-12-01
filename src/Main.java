public class Main {
    public static void main(String[] args) {
        //numero nel range
        System.out.println(rangeNum(2, 10, 20));
        //numero fuori dal range
        System.out.println(rangeNum(2, 30, 20));
    }

    public static boolean rangeNum(int min, int num, int max) {
        if (num > min && num < max) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non è nel range");
        }
    }
}