#include <iostream>
#include<bits/stdc++.h>
#define M 1000000007
#define ll long long
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-- > 0){
	    ll n; cin>>n;
	    ll arr[n];
	    for(int i=0; i<n;i++) cin>>arr[i];
	    ll l=0, r=1, cnt=0;
	    while(r<n){
	        ll d = arr[r]-arr[l];
	        if(d > 0){
	            cnt = cnt > d ? cnt : d;
	        }else{
	            l=r;
	        }
	        r++;
	    }
	    if(cnt==0) cout<<"UNFIT\n";
	    else cout<<cnt<<endl;
	}
	return 0;
}
