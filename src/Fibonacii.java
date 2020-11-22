//
//Fibonacii by recurence

public class Fibonacii {

    public static int seq(int x){

        return (x > 2) ? seq(x-1) + seq(x-2) + seq(x-3) : x ;

    }

    public static void main(String[] args) {
        System.out.println(seq(5));

    }

}
