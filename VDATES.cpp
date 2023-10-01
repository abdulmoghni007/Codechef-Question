#include<bits/stdc++.h>
using namespace std;
int main(){
    int testcase;
    cin>>testcase;
    while(testcase--){
        int vaccine_day,second_before,after_second;
        cin>>vaccine_day>>second_before>>after_second;
        if((vaccine_day>=second_before)&&(vaccine_day<=after_second)){
            cout<<"Take second dose now"<<endl;
        }
        else if(vaccine_day>after_second){
            cout<<"Too Late"<<endl;
        }
        
        else{
            cout<<"Too Early"<<endl;
        }
    }
}