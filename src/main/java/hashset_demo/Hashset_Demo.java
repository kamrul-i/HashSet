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
        
        System.out.println(fruitsName);
        System.out.println("HashSet size : "+fruitsName.size());
        
        /*
        ArrayList / LinkedList এর মধ্যে duplicate elements থাকতে পারে, HashSet এর মধ্যে duplicate elements থাকতে পারবে না।।
        */

    }
}
