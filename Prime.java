public class Prime {
    public static void main(String args[]){    
        int i, flag = 0;      
        int n = Integer.parseInt(args[0]);     
        if(n == 0||n == 1){  
            System.out.println(n+" is not prime number");      
        }
        else {  
            for(i=2; i*i <= n;i++){      
                if(n%i == 0){      
                    System.out.println(n+" is not prime number");      
                    flag=1;      
                    break;      
                }      
            }      
            if(flag==0)  
            {
                 System.out.println(n+" is prime number"); 
            }  
        } 
    }    
}