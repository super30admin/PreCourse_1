#include <iostream>
using namespace std;

#include "map"
#include "vector"
class Solution {
public:
    int rob_helper(vector<int>& nums, int st, int end, map<int, int>&memo){
        if(st==end)
            return nums[st];

        if(st+1==end){
            if(nums[st+1]>nums[st])
                return nums[st+1];
            else
                return nums[st];
        }

        if(memo.find(end)!=memo.end())
            return memo[end];

        int val1 = rob_helper(nums, st, end-1, memo);
        int val2 = rob_helper(nums, st, end-2, memo);

        if(val1 > (val2+nums[end])){
            memo[end]=val1;
            return memo[end];
        }

        memo[end] = val2+nums[end];
        return memo[end];

    }
    int rob(vector<int>& nums) {
        if(nums.size()==0)
            return 0;
        map<int, int> memo;
        int st=0;
        int end = nums.size()-1;
        return rob_helper(nums, st, end,memo);
    }
};

int main() {
    Solution s;
    vector<int> arr ={1,2,3,4};
    s.rob(arr);
    return 0;
}
