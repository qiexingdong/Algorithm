- [求闰年](#求闰年)
### 求闰年
* 能被4整除且不能被100整除、能被400整除
### 字典和
* 从小到大排序
### 质数
* 在大于1的自然数中，除了1和它本身外不再有其他因数的自然数
### 万能头文件
* #include <bits/stdc++.h>
### stack和queue的常见用法
* stack : top()获取栈顶元素，push()入栈，pop()出栈，size()栈内元素个数，empty()判空
* queue : front()获取队列第一个元素，back()获取队列最后一个元素，push()入队，pop()出队，size()队列内元素个数，empty()判空
### algorithm头文件常用api
* sort()默认是升序排序，但也可以通过一些手段变为降序排序。

方法一：传入第三个参数–比较函数，greater\<type>()；

方法二：我们也可以使用自定义的比较函数，函数的返回值为bool类型， 例如

``` c++
bool cmp(int num1, int num2) {
    return num1 > num2;     // 可以简单理解为 > 降序排列;  <  升序排列
}
```
``` c++
#include<iostream>
#include<algorithm>

using namespace std;

bool cmp(int num1, int num2) {
    return num1 > num2;     // 可以简单理解为 >： 降序排列;  < ： 升序排列
}

int main() {
    int a[10] = {9, 6, 3, 8, 5, 2, 7, 4, 1, 0};
    sort(a, a + 10, cmp);  // 使用自定义排序函数

```
