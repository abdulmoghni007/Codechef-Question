#include <bits/stdc++.h>
using namespace std;

int main() {
	int k;
	cin>>k;
	for(int i=0;i<k;i++){
	    int mario,gomba,distance;
	    cin>>mario>>gomba>>distance;
	    int result=gomba/mario;
	    result=distance-result;
	    if(result>=0){
	        cout<<result<<endl;
	    }
	    else{result=0;
	        cout<<result<<endl;
	    }
	}
}
