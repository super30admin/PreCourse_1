#include <iostream>
using namespace std;

#include "map"

#include "vector"

class Solution {
public:
    int subarraySum(vector<int> &nums, int k) {
        map<int, vector<int>> m;
        int count = 0;
        m[0].push_back(-1);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i];
            int diff = sum - k;
            if (m.find(diff) != m.end()) {
                count = count + m[diff].size();
            }
            m[sum].push_back(i);
        }

        return count;
    }
};
int main() {
    vector<int> nums={1,1,1};
    Solution s;
    int k=2;
    int res = s.subarraySum(nums, k);
    cout << res;
}
