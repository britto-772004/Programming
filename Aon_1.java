// input = { 3,12,24,7,14,2}
// output = 3 + 7 = 10 
// explanation => 3 and 7 is the number which is same when the digits of that numbers are added and also the neighbour of that number is divisible by that number it self . Therefore the addition of 3 and 7 is 10 . 10 is the correct answer 


public class Main {
    
    public static int findElements(int[] array){
        int[] arr = new int[array.length];
        for(int i=0;i< array.length - 1;i++){
            if(sumOfDigit(array[i])){
                int j = i+1;
                if(array[j] % array[i] == 0 ){
                    arr[i]= array[i];
                }
            }
        }
        int result = sumOfarray(arr);
        return result;
    }
    
    public static boolean sumOfDigit(int number){
        int sum =0;
        int hi;
        while (number > 0){
            hi = number / 10;
            sum = sum + hi;
            number = hi;
        }
        if(sum == number){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int sumOfarray(int [] array){
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }
    
    public static void main (String[] args){
        int[]  arr = {3,12,7,14,11};
        int answer = findElements(arr);
        System.out.println("answer : " +answer);
    }
}
