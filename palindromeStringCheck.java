class Palindrome
{
   public static void main(String args[])
   {
      String s, news="";

      s = args[0];

      int length = s.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
         news = news + s.charcAt(i);

      if (s.equals(news))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");

   }
}
