package Reverse_a_String;
public class Reverse_a_String{


    static String reverse_a_string(String str ){
        String newstr ="";
        for(int i=str.length() ; i>0;i--){
            newstr = newstr + str.charAt(i-1);
        }
        return newstr;
    }
    public static void main(String [] args){
        // call the reverse string function 
        System.out.println("reverse of the string == Hello world == is " + reverse_a_string("helloworld"));
    }
}