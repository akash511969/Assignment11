package file_handling;
import java.util.HashMap;
import java.util.Map.Entry;
public class Hashmap {
	public static void main(String[] args) {
	HashMap<Character,Integer> hash_map= new HashMap<Character,Integer>();  
	  hash_map.put('a', 1);
	  hash_map.put('b', 2);
	  hash_map.put('c', 3);
	  hash_map.put('d', 4);
	  hash_map.put('e', 5);
	  hash_map.put('f', 6);
	  for(Entry<Character,Integer> x:hash_map.entrySet()){  
	   System.out.println(x.getKey()+"------>"+x.getValue()); 
	  }  
	 }  
}
