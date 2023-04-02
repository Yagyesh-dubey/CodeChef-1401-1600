//code

#include <bits/stdc++.h>
using namespace std;
#define int long long 
signed main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int x;
	    cin>>x;
	    int arr[x];
	    for(int i=0;i<x;i++){
	        cin>>arr[i];
	    }
	    int gcd = 0;
	    for(int i=0;i<x;i++){
	        gcd = __gcd(gcd,arr[i]);
	    }
	    for(int i=0;i<x;i++){
	        cout<<arr[i]/gcd<<" ";
	    }
	    cout<<endl;
	}
	return 0;
}
