package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("이 름: ");
		stringBuilder.append("박정은");
		stringBuilder.delete(1, 2);
		
		System.out.println(stringBuilder.toString());
		
	}

}
