package Problem3;

import java.util.Arrays;
import java.util.Scanner;

public class RunLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want:");
        String value = sc.next();
        System.out.println("Choose the method you want to apply: \n [1] runLengthEncode \n [2] runLengthDecode ");
        int choose = sc.nextInt();
        if(choose == 1){
            System.out.println();
        }
        System.out.println(choose == 1? runLengthEncode(value) : choose == 2 ? runLengthDecode(value) : "please Enter right value [1 or 2]" );

    }

    static String runLengthEncode(String str){
        int count = 1;
        String result = "";
        for (int i = 1; i < str.length() ; i++) {
            if(str.charAt(i-1) == str.charAt(i)){
                count++;
            }else{
                result += (str.charAt(i-1)+""+count);
                count=1;
            }
            if(i == str.length()-1){
                result+= (str.charAt(i)+""+count);
            };
        }
        return result;
    }
    static String runLengthDecode(String str){

        String[] chars = str.split("\\d+");
        int[] vals = Arrays.stream(str.replaceAll("[^0-9]+", " ").split(" "))
                .filter(x -> !x.equals(""))
                .map(Integer::valueOf)
                .mapToInt(x -> x)
                .toArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < vals.length ; i++) {
            while (vals[i] > 0 ){
                result.append(chars[i]);
                vals[i]--;
            }
        }
        return result.toString();
    }
}
