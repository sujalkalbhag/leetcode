class Solution {
    public long flowerGame(int n, int m) {
        long oddX=(n+1)/2L;
        long evenX=n/2L;

        long oddY=(m+1)/2L;
        long evenY=m/2;

        return (oddX*evenY) + (evenX*oddY) ;
    }
    public static void main(String[] args){
        Solution sol =new Solution();
            int n=3;
            int m=2;

            System.out.println("Alice wiining the numbers are:" + sol.flowerGame(n,m));
        
    }
}