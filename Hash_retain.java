package file_handling;
import java.util.HashSet;
public class Hash_retain {
	public static void main(String a[]){
        HashSet<Character> set1 = new HashSet<Character>();
        set1.add('a');
        set1.add('b');
        set1.add('c');
        set1.add('d');
        set1.add('e');
        set1.add('f');
        set1.add('g');
        set1.add('h');
        set1.add('i');
        set1.add('j');
        set1.add('k');
        set1.add('l');
        System.out.println("Set1 "+set1);
        @SuppressWarnings("unused")
        HashSet<Character> set2 = new HashSet<Character>();
        set2.add('s');
        set2.add('a');
        set2.add('c');
        set2.add('j');
        set2.add('d');
        set2.add('m');
        System.out.println("Set2 "+set2);
        set1.retainAll(set2);
        System.out.print("Common content in  set1 & set 2:");
        System.out.print(set1);
    }
}
