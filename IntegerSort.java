class Int_sort
{
    public static void main(String args[ ])
    {
        int a[]=new int[args.length];
        int j,temp,i;
        for(i=0;i<args.length;i++)
        {
            a[i]=Integer.valueOf(args[i]);
        }
        for(i=0;i<args.length;i++)            
        {
            for(j=0;j<args.length-i-1;j++)
                {
                    if(a[j]>a[j+1])
                        {
                            temp=a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                            }
                }

        }
        System.out.println("Sorted array elements are: ");
        for(i=0;i<args.length;i++)
        {
            System.out.print(a[i]+" ");        
        }
    }
}
