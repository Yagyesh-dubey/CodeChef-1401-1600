#include <bits/stdc++.h>
using namespace std;
#define ll long long int

int main() 
{
	ll t,n,m,i,j,k;
	cin >> t;
	while(t--)
	{
	    cin >> n >> m;
	    vector<string>s1(n,""),s2(n,"");
	    for(i=0;i<n;i++)
	    {
	       // string s1,s2;
	        cin >> s1[i] >> s2[i];
	    }
	    for(i=0;i<n;i++)
	    {
	        if(s1[i]=="wrong")
	            continue;
	        for(j=0;j<m;j++)
	        {
	            if(s2[i][j]=='0')
	                break;
	        }
	        if(j<m)
	        {
	            cout << "INVALID\n";
	            break;
	        }
	    }
	    if(i<n)
	        continue;
	    for(i=0;i<n;i++)
	    {
	        if(s1[i]=="correct")
	            continue;
	        for(j=0;j<m;j++)
	        {
	            if(s2[i][j]=='0')
	                break;
	        }
	        if(j==m)
	        {
	            cout << "WEAK\n";
	            break;
	        }
	    }
	    if(i==n)
	        cout << "FINE\n";
	}
	return 0;
}
