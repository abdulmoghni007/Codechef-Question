#include <bits/stdc++.h>
using namespace std;

int main() {
	int k;
	cin>>k;
	for(int i=0;i<k;i++){
	    int mush;
	    cin>>mush;
	    if(mush%3==0){
	        cout<<"NORMAL"<<endl;
	    }
	    else if(mush%3==1){
	        cout<<"HUGE"<<endl;
	    }
	    else{
	        cout<<"SMALL"<<endl;
	    }
	}
}
