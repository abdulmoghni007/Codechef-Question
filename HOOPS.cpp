#include<bits/stdc++.h>
using namespace std;
int main(){
    int testcase;
    cin>>testcase;
    while(testcase--){
        int input;
        cin>>input;
        int result=input/2;
         result=result+(input%2);
        cout<<result<<endl;
    }
}