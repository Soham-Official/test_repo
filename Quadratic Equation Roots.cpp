class Solution {
  public:
    vector<int> quadraticRoots(int a, int b, int c) {
        vector<int>v;
        int d=sqrt(b*b-4*a*c);
        if(b*b-4*a*c<0)
        {
            v.push_back(-1);
            return v;
        }
        v.push_back((-1*b +d)/(2*a));
        v.push_back((-1*b -d)/(2*a));
        return v;
    }
};