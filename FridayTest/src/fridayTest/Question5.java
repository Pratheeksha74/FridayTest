package fridayTest;

public class Question5 {
	String repeatEnd(String str, int n) {
		String s = "";
		for(int i=0;i<n;i++) {
			s += str.substring(str.length()-n);
		}
		return s;
	}
	public static void main(String[] args) {
		String s = "llollollo";
		Question5 ers = new Question5();
		System.out.println(ers.repeatEnd(s, 3));

	}

}
