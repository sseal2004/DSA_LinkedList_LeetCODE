class Solution {
    public boolean isHappy(int n) {
      //LinkList Cycle
      int fast =n;
      int slow=n; 
      do{
        slow=findSquare(slow);//move one step ahead
        fast=findSquare(findSquare(fast));//move 2 step ahead
      } while(fast!=slow);
      if(slow==1)return true;
       return false;
    }
    private int findSquare(int n){
        int ans =0;
        while(n>0){
            int rem= n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
}