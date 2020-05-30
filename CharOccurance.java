package string.revised;

public class CharOccurance {

	public static void main(String[] args) {

		String name = "hii i am asif";
		char ch = 'i';
		int count = 0;

		for(int i=0;i<name.length();i++){
			
			if(name.charAt(i)==ch){
				count++;
			}
		}
		System.out.println(count);
	}

}
