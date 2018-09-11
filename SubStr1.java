import java.util.Scanner;
class SubStr1{ 
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str =a.nextLine();
        System.out.print("Enter String2: ");
        String str1=a.nextLine();
        int count = 0, i= 0;        
        while ((i = str.indexOf(str1, i))!=-1){
            count++;
            i++;            
        }        
        System.out.println("Total occurence: " + count);
    }
}