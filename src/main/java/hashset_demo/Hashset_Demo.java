package hashset_demo;
import java.util.HashSet;
public class Hashset_Demo {

    public static void main(String[] args) {
        
        HashSet<String>fruitsName = new HashSet<>();
        
        fruitsName.add("Mango");
        fruitsName.add("Banana");
        fruitsName.add("Jackfruit");
        fruitsName.add("Apple");
        fruitsName.add("Pinapple");
        fruitsName.add("Lichi");
        fruitsName.add("Guava");
               
        fruitsName.remove("Apple");  //single value remove
        System.out.println(fruitsName);
        
        /*
        ArrayList / LinkedList এর মধ্যে duplicate elements থাকতে পারে, HashSet এর মধ্যে duplicate elements থাকতে পারবে না।।
        */

    }
}
