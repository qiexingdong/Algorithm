//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。数据范围：两个数都满足 -10 \le n \le 1000−10≤n≤1000
class Solution {
public:
    int Add(int num1, int num2) {
        int sum1 =num1 ^num2;
        int sum2 = (num1 & num2)<<1;
        int sum  = sum1+sum2;
        return sum;
    }
};
