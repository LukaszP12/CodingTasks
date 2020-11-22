package Codility.countingElements;

public class permCheck2 {

    public static void main(String[] args) {
        int tab[] = {4,1,3,2};
        int tab1[] = {1,2,4};
        System.out.println(permCheck2(tab));
        System.out.println(permCheck2(tab1));
    }

    public static int permCheck2(int Arr[]){
        boolean[] seen = new boolean[Arr.length + 1];

        //  repeated elements
        for (int i=0; i< Arr.length; i++){
            if(Arr[i] < 1 || Arr[i] > Arr.length) return 0;
            if (seen[Arr[i]] == true) return 0;
            else seen[Arr[i]] = true;
        }

        return 1;
    }


}
