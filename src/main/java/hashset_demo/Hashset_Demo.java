package hashset_demo;
import java.util.HashSet;
public class Hashset_Demo {

    public static void main(String[] args) {
        
        HashSet<String>fruitsName = new HashSet<>();
        
        /*
        fruitsName.add("Mango");
        fruitsName.add("Banana");
        fruitsName.add("Jackfruit");
        */
        //কোন elements নেই, এজন্য "isEmpty"-কে true বলছে।।
               
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
        
        /*
        ArrayList / LinkedList এর মধ্যে duplicate elements থাকতে পারে, HashSet এর মধ্যে duplicate elements থাকতে পারবে না।।
        */

    }
}
