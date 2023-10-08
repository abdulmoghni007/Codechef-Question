#include <bits/stdc++.h>
using namespace std;

int main() {
	int testcase;
	cin>>testcase;
	while(testcase--){
	    int nsize;
	    cin>>nsize;
	    string st;
	    cin>>st;
	    for(int i=0;i<nsize;i++){
	        if(st[i]=='A'){
	            st[i]='T';
	        }
	        else if(st[i]=='T'){
	            st[i]='A';
	        }
	          else if(st[i]=='C'){
	            st[i]='G';
	        }
	          else if(st[i]=='G'){
	            st[i]='C';
	        }
	    }
	    cout<<st<<endl;
	}
	return 0;
}
