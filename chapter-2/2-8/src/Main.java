
public class Main {
	public static void main(String[] args) {
		StrongBox<String> p = new StrongBox<>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}
}
