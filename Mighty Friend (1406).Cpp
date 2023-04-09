#include <bits/stdc++.h>
#define ll long long
#define modulo 1000000007
#define loop(n) for (auto i = 0; i < n; i++)
#define lop(n) for (auto j = 0; j < n; j++)
using namespace std;
void solve(){
        int n,k;
        cin>>n>>k;
        vector<int> a(n);
        vector<int> to,mo;
        loop(n){
            cin>>a[i];
            if(i%2!=0){
                to.push_back(a[i]);
            }
            else {
                mo.push_back(a[i]);
            }
            
        }
        sort(to.begin(),to.end());
        sort(mo.begin(),mo.end(),greater<int>());
        for(int i =0;i<to.size();i++){
            if(to[i] < mo[i] && k>0){
                swap(to[i],mo[i]);
                k--;
            }
        }
    int t_sum = accumulate(to.begin(),to.end(),0);
    int m_sum = accumulate(mo.begin(),mo.end(),0);
    // ll t_sum, m_sum;
    // loop(to.size()) { t_sum += to[i]; }
    // loop(mo.size()) { m_sum += mo[i]; }
    if (t_sum > m_sum)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    
    
    return 0;
}
