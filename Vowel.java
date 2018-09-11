import java.util.Scanner;
class Vowel
{        
      public static void main(String args[]){
          Scanner a=new Scanner(System.in);
          System.out.print("Enter String: ");
          String s=a.nextLine();          
          String s1="";
          char ch;           
          for(int i=0; i<s.length(); i++){
              ch=s.charAt(i);
              if(!isvowel(ch)){
                  s1+=ch;
              }
          }           
          System.out.println("String after removing vowels: " + s1);
      }
      public static boolean isvowel(char ch){
          switch(ch){
            case 'A': case 'E': case 'I': case 'O': case 'U':
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;           
          }
      }
}