// output 

// 5 10 15 20 25
// 4  9 14 19 24
// 3  8 13 18 23
// 2  7 12 17 22
// 1  6 11 16 21

public class Pattern14 {
    public static void main(String[] args) {
        int k;
        for(int i=5;i>=1;i--){
            k=i;
            for(int j=1;j<=5;j++){
                System.out.print(k+" ");
                k+=5;
            }
            System.out.println();
        }
    }
}
