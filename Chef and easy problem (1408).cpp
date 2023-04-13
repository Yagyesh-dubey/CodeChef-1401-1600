#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	
	while(t--){
	    int n;
	    cin>>n;
	    long long arr[n];
	    for(int i=0;i<n;i++) cin>>arr[i];
	    
	    sort(arr,arr+n);
	    
	    long long s=0;
	    for(int i=n-1;i>=0;i-=2){
	        s+=arr[i];
	    }
	    cout<<s<<"\n";
	}
	return 0;
}
