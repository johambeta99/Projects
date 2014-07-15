import java.util.*;

public class question {
    public static void main (String[] args){
        int[] list = {0, 2, 3, 5, 1, 2, 6, 6, 6, 6, 3, 0, 0, 0, 3, 6 };

        Set<String> set = new LinkedHashSet<String>();
        
        for (int i = 0; i < list.length - 1; i++) {
            
            for (int j = i+1; j < list.length; j++) {
                
                if ((((list[i] + list[j]) % 2 == 0) && ((list[i] != 0) || (list[j] != 0))) && (!(set.contains(Integer.toString(list[i]) + "," + Integer.toString(list[j]))) && !(set.contains(Integer.toString(list[j]) + "," + Integer.toString(list[i]))))){
                    set.add(Integer.toString(list[i]) + "," + Integer.toString(list[j]));
                }
            }
        }
        
        for (Object element: set)
            System.out.println(element.toString());
    }
}