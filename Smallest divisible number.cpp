    long long gcd(long long int a,long long b){
        if(a>b)
            swap(a,b);
        if(b%a==0) return a;
        else return gcd(b%a,a);
    }
    long long lcm(long long int a,long long b){
        return (a*b)/gcd(a,b);
    }
    long long getSmallestDivNum(long long n){
        long long int ans=1;
        for(int i=2;i<=n;i++)
        ans=lcm(ans,i);
        return ans;
    }