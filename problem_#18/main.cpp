#include <iostream>
using namespace std;

#include "vector"
#include "map"

class Solution {
public:
    int longestPalindrome(string s) {
        int res =0;
        map<char, int> m;
        for(int i=0;i<s.size(); i++){
            if(m.find(s[i])==m.end()){
                m[s[i]]=1;
            }
            else{
                m[s[i]]++;
            }
        }

        for(auto it=m.begin(); it!=m.end(); it++){
            int val = it->second;
            if(val%2==0){
                res+=val;
            }
            else{
                res+=(val-1);
            }
        }

        for(auto it=m.begin(); it!=m.end(); it++){
            int val = it->second;
            if(val%2==1){
                res+=1;
                break;
            }
        }

        return res;
    }
};

int main() {
    Solution S;
    string s = "abccccdd";
    S.longestPalindrome(s);
    return 0;
}
