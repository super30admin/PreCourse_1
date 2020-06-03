#include <iostream>
using namespace std;
#include "vector"


int main() {
    vector<int> arr = {1, 2, 3, 5, 6, 7, 8};
    int n= arr.size()+1;
    int total_sum = (n*(n+1))/2;
    int existing_sum = 0;
    for(int i =0; i<arr.size(); i++){
        existing_sum+=arr[i];
    }
    int res = total_sum-existing_sum;
    cout << res;

}
