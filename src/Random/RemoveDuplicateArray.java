package Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class RemoveDuplicateArray {
    public static void main(String[] args) {
        String[] data = new String[]{"pritam", "saili", "rupak", "pritam", "geeta", "jay", "john", "rupak"};
        List<String> oldList = Arrays.asList(data);
        List<String> newList = new ArrayList<String>(new HashSet<String>(oldList));
        System.out.println(newList);
    }

    int add(int a, int b){
        int c = a + b;
        return c;
    }
}