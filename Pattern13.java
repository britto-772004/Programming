// output

// 1 10 11 20 21
// 2 9  12 19 22
// 3 8  13 18 23
// 4 7  14 17 24
// 5 6  15 16 25

public class Pattern13 {
    public static void main(String[] args) {
        int l = 11;
        int j,u;
        for(int i=1;i<=5;i++){
            u =i;
            System.out.print(u+" ");
            j = l - i;
            for(int k=1;k<=2;k++){
                u+=10;
                System.out.print(j+" "+u+" ");
                j+=10;
            }
        System.out.println();       
        }
    }
}
