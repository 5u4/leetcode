package ComplementOfBase10Integer;

class Solution {
    public int bitwiseComplement(int N) {
        int x = 1;
        while (x < N)
            x = (x << 1) | 1;
        return x ^ N;
    }
}
