package acadgild.assignments;

public class session7assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		String s = " I like Java!";
		System.out.println("The lentgth of the string is :"+s.length());
		char c = s.charAt(30);
		
		}
		catch(StringIndexOutOfBoundsException e){
			
			System.out.println("The character position is exceeding the String Length :"+e);
			
			
		}

	}

}
