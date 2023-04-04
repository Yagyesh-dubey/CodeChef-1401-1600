//Bella ciao
#include<iostream>
using namespace  std;
 main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long int D,d,p,q;
        cin>>D>>d>>p>>q;
        int k=(D/d);
        cout<<((k*p)*d)+(((k*q)*((k-1)*d))/2)+((D%d)*(p+(k*q)))<<endl;
    }
    return 0;
}
