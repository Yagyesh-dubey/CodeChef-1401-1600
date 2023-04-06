#include <bits/stdc++.h>
using namespace std;

int main()
{
    stack<char> st;
    string s;
    getline(cin, s);

    for (char i : s)
    {
        if (i != ' ')
            st.push(i);
        else
        {
            while (!st.empty())
            {
                cout << st.top();
                st.pop();
            }
            cout << ' ';
        }
    }

    while (!st.empty())
    {
        cout << st.top();
        st.pop();
    }

    return 0;
}
