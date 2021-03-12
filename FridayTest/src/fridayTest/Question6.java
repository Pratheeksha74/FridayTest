package fridayTest;

public class Question6 {
	public String repeatFront(String str,int n) {
		String s = "";
		while(n!=0) {
			for(int i=0;i<n;i++) {
				s += str.charAt(i);
			}
			n--;
		}
		return s;
	}
	public static void main(String[] args) {
		Question6 sp = new Question6();
		String s = "Choccolate";
		String str = sp.repeatFront(s,4);
		System.out.println(str);

	}

}
