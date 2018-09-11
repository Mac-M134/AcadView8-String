import java.util.Scanner;
class Words{
    public static void main(String[] args) {  
          Scanner a=new Scanner(System.in);
          System.out.print("Enter String: ");
          String string =a.nextLine();  
         System.out.println(wordcount(string) + " words.");   
    }
        static int wordcount(String string)  
        {  
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))||((ch[0]!=' ')&&(i==0)))  
                    count++;
            }  
            return count;  
        }
}  