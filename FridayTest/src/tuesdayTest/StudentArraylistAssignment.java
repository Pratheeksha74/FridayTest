package tuesdayTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private String dept;
	private int marks;
	public Student(int id, String name, String dept, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}
	
}
public class StudentArraylistAssignment {

	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(1,"jungkook","cse",89));
		slist.add(new Student(2,"jimin","ise",90));
		slist.add(new Student(3,"taehyung","ece",56));
		slist.add(new Student(4,"namjoon","eee",78));
		slist.add(new Student(5,"suga","tce",67));
		
		System.out.println(slist.stream().filter(e->e.getDept().equalsIgnoreCase("cse")).count());
		
		System.out.println("=====================");
		List<Student> l1 = slist.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		l1.forEach(s->System.out.println(s));
		
		
		System.out.println("=====================");
		List<Student> l2 = slist.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
		l2.forEach(s->System.out.println(s));

	}

}
