
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n,k;
	    cin>>n>>k;
	    int arr[n];
	    int mx = 0;
	    int mn = 1e9;
	    for(int i=0;i<n;i++){
	        cin>>arr[i];
	        mn = min(mn,arr[i]);
	        mx = max(mx,arr[i]);
	    }
	    cout << ((n == 1 || mx + mn <= k) ? "YES" : "NO") << endl;
	}
	return 0;
}
