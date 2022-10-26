//输入一个链表的头节点，按链表从尾到头的顺序返回每个节点的值（用数组返回）。

//如输入{1,2,3}的链表如下图:

//返回一个数组为[3,2,1]

//0 <= 链表长度 <= 10000



/**
*  struct ListNode {
*        int val;//数据域
*        struct ListNode *next;//指针域
*        ListNode(int x) :val(x), next(NULL){} //初始化列表
*  };
*/
class Solution {
  public:
    void recursion(ListNode* head,vector<int>& v) {
        if(head != NULL){
            recursion(head->next,v);
            v.push_back(head->val);
        }

    }
    vector<int> printListFromTailToHead(ListNode* head) {
        vector<int> v;
        recursion( head, v);
        return v;
    }
};
