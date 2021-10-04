import java.util.Scanner;

public class palindrome {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int n=s.length();
        int flag = 1;
        
        for(int i=0;i<n/2;i++){
          if(s.charAt(i)!=s.charAt(n-i-1)) {
              flag=0;
              break;
          }
        }
        if(flag==0)
        System.out.println("Not Palindrome");
        else
         System.out.println("Palindrome");
    }
}