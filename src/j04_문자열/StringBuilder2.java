package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		
		int index = 0;
		
		String names = "김ㅇㅇ님, 이ㅇㅇ님, 김ㅁㅁ님, 윤ㅁㅁ님, 강ㅇㅇ님";
		
		// 김준일/서재효/임나영/문창배/전나경
		
		StringBuilder stringBuilder = new StringBuilder();
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		stringBuilder.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		
		System.out.println(stringBuilder.toString());
		
		System.out.println();
		
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append(names);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);
		
		index = stringBuilder2.indexOf("님");
		stringBuilder2.delete(index, index + 3);		
		
		System.out.println(stringBuilder2.toString());
		
	}

}









