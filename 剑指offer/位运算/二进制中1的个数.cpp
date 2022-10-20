//输入一个整数 n ，输出该数32位二进制表示中1的个数。其中负数用补码表示。
class Solution {
public:
     int  NumberOf1(int n) {
         int flag = 0;
        for(int i = 0;i<32;i++){
            if(n&(1<<i))
            flag++;
        }
         return flag;
     }
};
