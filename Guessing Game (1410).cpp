#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        ll n, m;
        cin >> n >> m;
        ll sum = n * m;
        if (n == 1 && m == 1)
        {
            cout << "0/1"
                 << "\n";
        }
        else if (n % 2 == 0 || m % 2 == 0)
        {
            cout << "1/2"
                 << "\n";
        }
        else
        {
            ll odd = sum / 2;
            cout << odd << "/" << sum << "\n";
        }
    }
    return 0;
}
