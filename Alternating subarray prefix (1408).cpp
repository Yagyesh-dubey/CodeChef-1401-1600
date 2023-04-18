#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main(){
    ll t;
    cin>>t;
    while(t--){
        ll n;
        cin>>n;
        ll arr[n];
        ll i;
        for(i=0;i<n;i++){
            cin>>arr[i];
        }
        vector<ll> dp(n);
        dp[n-1]=1;
        for(i=n-2;i>=0;i--){
            if((arr[i]*arr[i+1])>=0){
                dp[i]=1;
            }
            else{
                dp[i]=1+dp[i+1];
            }
        }
        for(i=0;i<n;i++){
            cout<<dp[i]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
