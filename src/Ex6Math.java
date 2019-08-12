public class Ex6Math {
    public static void main(String[] args) {
        int  firstNumber = 20;
        int  secondNumber = 7;
        float res = firstNumber / (secondNumber *1.00f);
        int res2 = firstNumber / secondNumber;
        int res3 = firstNumber % secondNumber;
        firstNumber/= 100;
        System.out.printf("Ket qua phep chia :" + res);
        System.out.printf("\nKet qua phep chia :" + res2);
        System.out.printf("\n Ket qua phep chia lấy dư :" + res3);
        System.out.println("\n" + firstNumber);
    }
}
