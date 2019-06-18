/**
 * 
 */
package exercice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 610151
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); 
		List<Integer> listInt = Stream.iterate(rand.nextInt(1000),n-> rand.nextInt(1000)).limit(10).collect(Collectors.toList());
		System.out.println(listInt);
		System.out.println(secondSmallest(listInt));
	 
	}
	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		if (list==null) return null;
		T i = list.get(0);
		T j = list.get(0);
		for (T t : list) {
			j = (t.compareTo(i)>0)?i:(t.compareTo(j)>0)?t:j;
			i = (i.compareTo(t)>0)?i:t; 
		} 
		return j;
	}
}
