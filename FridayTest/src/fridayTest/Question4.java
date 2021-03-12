package fridayTest;

public class Question4 {
	public String mixString(String s1, String s2) {
		String s = "";
		int n = s1.length();
		int m = s2.length();
		int j = Math.max(n, m);
		for(int i=0;i<j;i++) {
			if(i<s1.length()) {
				s += s1.substring(i,i+1);
			}
			if(i<s2.length()) {
				s += s2.substring(i,i+1);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Question4 q = new Question4();
		System.out.println(q.mixString("Hi", "There"));

	}

}
