package week5.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
	public static void main(String[] args) {
		String input="babub";
		char[] v = input.toCharArray();
		Set<Character> name=new HashSet<Character>();
		
		
		for (int i = 0; i < v.length; i++) {
			name.add(input.charAt(i));	
			
		
		}
		System.out.println(name);
		name.remove('b');
		System.out.println(name);
		
//		System.out.println(v);
//		Set<Character> name=new HashSet<Character>();
//		name.add('b');
//		name.add('a');
//		name.add('b');
//		name.add('u');
//		name.add('b');
//		name.remove('b');
//		System.out.println(name);
		
	}

}
