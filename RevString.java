import java.util.Scanner;
class RevString{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=a.nextLine();
        String s1=reverse(s);
        System.out.print(s1);
    }
	public static String reverse(String s1)
	{

		if (s1 == null || s1.equals(""))
			return s1;
        
		return reverse(s1.substring(1)) + s1.charAt(0);
	}
}