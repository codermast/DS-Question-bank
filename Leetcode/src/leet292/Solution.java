package leet292;

public class Solution {
    public boolean canWinNim(int n) {
        if(n <= 3){
            return true;
        }
        if(n == 4){
            return false;
        }

        int i = n % 4;
        return i != 0;
    }
}
