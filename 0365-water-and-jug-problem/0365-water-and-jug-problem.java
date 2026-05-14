class Solution {
    public int gcd(int x, int y){
        while(y!=0){
            int z=y;
            y=x%y;
            x=z;
        }
        return x;
    }
    public boolean canMeasureWater(int x, int y, int target) {
        if(target==0 || target>x+y){
            return false;
        }
        return target%gcd(x,y)==0;
        
    }
}