//实现函数 double Power(double base, int exponent)，求base的exponent次方。
//注意：
//1.保证base和exponent不同时为0。
//2.不得使用库函数，同时不需要考虑大数问题
//3.有特殊判题，不用考虑小数点后面0的位数。
class Solution {
public:
    double Power(double base, int exponent) {
        if(exponent<0)
         base = 1/base;
       else if(!exponent)
            return 1;
        double num = base;
        for(int i = 1;i<abs(exponent);i++)
        num *= base;
    return num;
    }
};
