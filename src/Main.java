import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int successCount;

    public static void main(String[] args) {
        List<Double> list = new ArrayList();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        list.add(6.0);
        list.add(7.0);
        list.add(8.0);
        list.add(9.0);
        permute(list, 0);
        System.out.println("Success count: " + successCount);
    }

    static void permute(java.util.List<Double> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            testArray(arr);
        }
    }

    static void testArray(List<Double> arr){
        double result = arr.get(0) + ((13 * arr.get(1)) / arr.get(2)) + arr.get(3) + (12 * arr.get(4)) - arr.get(5) - 11 + ((arr.get(6) * arr.get(7)) / arr.get(8)) - 10;
        if(result == 66) {
            System.out.println("Success! : " + result);
            System.out.println(java.util.Arrays.toString(arr.toArray()));
            System.out.println(arr.get(0) + " + 13 * " + arr.get(1) + " / " + arr.get(2) + " + " +arr.get(3) + " + 12 * " + arr.get(4) + " - " +arr.get(5) + " - 11 + " + arr.get(6) + " * " + arr.get(7) + " / " + arr.get(8) + " - 10");
            successCount++;
        }
    }
}
