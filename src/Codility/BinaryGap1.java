package Codility;

public class BinaryGap1 {

    public static void main(String[] args) {
        numberToBinary(8);
    }

    public static void numberToBinary(int n) {
        String result = "";
        int gap = 0;
        int gapMax = 0;

        while(n>0){
            if(n%2 != 0){
                result += "1";
                if(gap>gapMax){
                    gapMax=gap;
                    gap=0;
                }
            }else {
                result += "0";
                gap++;
            }

            n = n/2;;
        }

        System.out.println("The result is " + reverseString(result) + " and the max binary gap " + gapMax);
    }


    public static String reverseString(String input){
        String result = "";
        for(int i=input.length();i>0;i--){
            result += input.charAt(i-1);
        }
        return result;
    }

}