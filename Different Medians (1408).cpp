#include <bits/stdc++.h>
using namespace std;

int samadhan()
{
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            cout << i / 2 << " ";
        }
        else
        {
            cout << n - (i / 2) << " ";
        }
    }

    cout << endl;

    return 0;
}

int main()
{
    int tc;
    cin >> tc;
    while (tc--)
    {
        samadhan();
    }
    return 0;
}
