//一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

//数据范围：数组长度 2\le n \le 10002≤n≤1000，数组中每个数的大小 0 < val \le 10000000<val≤1000000
//要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)

//提示：输出时按非降序排列。
class Solution {
  public:
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型vector
     * @return int整型vector
     */
    vector<int> FindNumsAppearOnce(vector<int>& array) {
        // write code here
        unordered_map<int, int> hm;
        vector<int> vec;
        for (int i = 0; i < array.size(); i++) {
            hm[array[i]]++;
        }
        for (int i = 0; i < array.size(); i++) {
            if (hm[array[i]] == 1)
            vec.push_back(array[i]);
            }
            sort(vec.begin(),vec.end());
            return vec;
    }
};
