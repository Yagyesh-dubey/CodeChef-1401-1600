#include <iostream>
using namespace std;

int main() {
    int a[7] = {0, 5,10,15,20, 25,30};
    int T;
    cin >> T;
    while(T--)
    {
        int N,x,y, flag = 0, tax = 0;
        cin >> N;
       x  = N/250000;
       if(x > 6){
           x = 6;
       }
       for(int i =1; i<=x; i++){
           tax = tax  + 2500*flag;
           flag  = flag + 5;
       }
       y = N - 250000*x;
       tax = tax + (y/100)*a[x];
       cout << N-tax << endl;
    }
	return 0;
}
