public class Main {

    static int calculate(int a, int b){
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);

    }

    public static void main(String[] args) {
        System.out.println("Нахождение наибольшего общего делителя 2х чисел!");
        int a = 72 , b = 33;
        System.out.println("a = " + a + ", b = " + b + ", НОД = " + calculate(a, b));
    }
}