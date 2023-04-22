#include <bits/stdc++.h>
using namespace std;
#define ll long long int


int main() 
{
	ll t,n,i,j,k;
	cin >> t;
	while(t--)
	{
	    cin >> n;
	    if(n&1)
	        cout << "YES\n";
	    else{
	        cout << "NO\n";
	        continue;
	    }
	    for(i=1;i<=((n+1)/2);i++)
	    {
	        string ans="",ones="";
	        for(j=0;j<n;j++)
	            ans+='0';
	        for(j=1;j<=(n/2);j++)
	            ones+='1';
	        ans.replace(i%n,n/2,ones);
	        cout << ans << "\n";
	    }
	    for(;i<=n;i++)
	    {
	        string ans="",fnt_ones="",bck_ones="";
	        for(j=0;j<n;j++)
	            ans+='0';
	        for(j=1;j<=(i-((n+1)/2));j++)
	            fnt_ones+='1';
	        for(j=1;j<=(n/2)-fnt_ones.length();j++)
	            bck_ones+='1';
	        ans.replace(i%n,bck_ones.length(),bck_ones);
	        ans.replace(0,fnt_ones.length(),fnt_ones);
	        cout << ans << "\n";
	    }
	}
	return 0;
}
