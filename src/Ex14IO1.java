public class Ex14IO1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        float res = b* 1.000f / a;
        double res2 = 999999999.2547;
        boolean isHiden = false;
       // System.out.println("res = " + res);
        System.out.printf("KQ : %,10.4f", res2);
        System.out.printf("\nis it hiden ? \n%b", isHiden);

    }
}
