
import java.util.Arrays;

public class MergeIntersect {
    public static int[] intersect(int[] arr1, int[] arr2){
        if(arr1.length==0 || arr2.length==0){ //if on is empty yeet
            int[] pog = new int[0];
            return pog;
        }
        int length =0; //keep track of the length of RetArry
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int shortest=0;
        int count1 =0; //count for first array
        int count2=0; //count for second array


        if(arr1.length< arr2.length) {
            shortest = arr1.length;
            int [] shortestArr = arr1;
        }
        else {
            shortest = arr2.length;
            int [] shortestArr = arr2;
        }
        int[] retArray = new int[shortest];
        while(count1!=arr1.length && count2!=arr2.length){
            if(arr1[count1] == arr2[count2]){ 
                if(length==0){
                    retArray[length]=arr1[count1];
                    length++;
                }
                else if(retArray[length-1]!=arr1[count1]){
                    retArray[length]=arr1[count1];
                    length++;
                }
                count1++;
                count2++;
            }
            else if(arr1[count1]>arr2[count2]){
                count2++;
            }
            else if(arr2[count2]>arr1[count1]) {
                count1++;
            }
        }
        return retArray;
    }
    public static void main(String[] arg){
        int[] a1 = {0, 2, -4, 6, 10, 8, 12,213, 100,444,3123,};
        int[] a2 = {12, 0, -4, 8,3223};
        int[] result = MergeIntersect.intersect(a1, a2);
        System.out.println( Arrays.toString(result) );
    }
}
