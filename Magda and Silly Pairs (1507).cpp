#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    vector<int> evengents,oddgents,evenlady,oddlady;
	    for(int i=0;i<n;i++){
	        int temp;
	        cin>>temp;
	        if(temp&1)
	            oddgents.push_back(temp);
	        else
	            evengents.push_back(temp);
	    }
	    
	    for(int i=0;i<n;i++){
	        int temp;
	        cin>>temp;
	        if(temp&1)
	            oddlady.push_back(temp);
	        else
	            evenlady.push_back(temp);
	    }
	    
	    int odds=0;
	    ll res=0;
	    int lim=min(oddlady.size(),oddgents.size());
	    for(int i=0;i<lim;i++){
	       // cout<<oddgents[i]<<" "<<oddlady[i]<<endl;
	        res+=(oddgents[i] + oddlady[i])/2;
	        odds=i+1;
	    }
	    if(odds==oddlady.size()){
	        for(int i=odds;i<oddgents.size();i++){
	            evengents.push_back(oddgents[i]);
	        }
	    }else{
	        for(int i=odds;i<oddlady.size();i++){
	            evenlady.push_back(oddlady[i]);
	        }
	    }
	    for(int i=0;i<n-lim;i++){
	       // cout<<evengents[i]<<" "<<evenlady[i]<<endl;
	        res+=(evengents[i] + evenlady[i])/2;
	    }
	    cout<<res<<endl;
	}
	
	return 0;
}
