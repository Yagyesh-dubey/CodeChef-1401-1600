#include <bits/stdc++.h>
using namespace std;
#define ll long long int

int main() 
{
	ll t,n,i,j,k;
	cin >> t;
	while(t--)
	{
	    cin >> n >> k;
	    vector<ll>v(n,0ll);
	    ll c=0ll;
	    for(i=0;i<n;i++)
	    {
	        cin >> v[i];
	        if(v[i]%2==0)
	            ++c;
	    }
	    if(k>c)
	        cout << "NO\n";
	    else if(k==0 && c==n)
	        cout << "NO\n";
	    else
	        cout << "YES\n";
	}
	return 0;
}
