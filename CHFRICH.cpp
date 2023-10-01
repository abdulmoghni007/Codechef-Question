#include<bits/stdc++.h>
using namespace std;
int main(){
    int testcase;
    cin>>testcase;
    while(testcase--){
        int balance_needed,valid_balance,tolatl_count;
        cin>>balance_needed>>valid_balance>>tolatl_count;
        valid_balance=valid_balance-balance_needed;
        tolatl_count=valid_balance/tolatl_count;
        cout<<tolatl_count<<endl;
    
        
    }
}