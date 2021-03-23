package tuesdayTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringAssignemnt {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("tree");
		list.add("plant");
		list.add("orange");
		list.add("elephant");
		list.add("tom");
		System.out.println(list.stream().filter(e->e.length() > 5).count());
		System.out.println("========================================");
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("========================================");
		list.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
		System.out.println("========================================");
		List<String> al = list.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		al.forEach(s->System.out.println(s));
	}

}
