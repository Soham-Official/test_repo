public class Pattern1 {
    public static void main(String args[]){ 
        int n = Integer.parseInt(args[0]); 
        int fact = 1;
        float sum = 0;
        for(int i = 1; i <= n; i++){
            fact = fact*i;
            sum += (float)i / fact;
        }
        System.out.println(sum);
    }  
}