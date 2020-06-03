#include <iostream>
using namespace std;

#include "vector"
#include "map";

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        //increment when 0 decrement when 1
        //map<count, idx>
        int max = 0;
        map<int, int> m;
        m[0]=-1;
        int sum=0;
        for(int i=0; i<nums.size(); i++){
            if(nums[i]==1){
                sum--;
            }
            else if(nums[i]==0){
                sum++;
            }
            if(m.find(sum)==m.end()){
                m[sum]=i;
            }
            else if(m.find(sum)!=m.end()){
                int dist = i-m[sum];
                if(dist>max)
                    max = dist;
            }
        }

        return max;
    }
};

int main() {
    Solution s;
    vector<int>  nums = {0,1};
    return 0;
}
