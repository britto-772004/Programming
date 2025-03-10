// output 

// 5  6 15 16 25
// 4  7 14 17 24
// 3  8 13 18 23
// 2  9 12 19 22
// 1 10 11 20 21

public class Pattern15 {
    public static void main(String[] args) {
        int k,l;
        int m=1;
        for(int i=5;i>=1;i--){
            k=i;
            System.out.print(k + " ");
            l=k+m;
            for(int j=1;j<=2;j++){
                System.out.print(l+" ");
                l+=10;
                k+=10;
                System.out.print(k+" ");

            }
            m+=2;
            System.out.println();
        }
    }
}
