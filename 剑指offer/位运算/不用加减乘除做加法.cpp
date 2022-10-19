class Solution {
public:
    int Add(int num1, int num2) {
        int sum1 =num1 ^num2;
        int sum2 = (num1 & num2)<<1;
        int sum  = sum1+sum2;
        return sum;
    }
};
