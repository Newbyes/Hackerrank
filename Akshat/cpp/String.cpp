#include <iostream>
#include <string>
using namespace std;

int main() {
	string a,b;
    cin>>a>>b;
    int size1 = a.size();
    int size2 = b.size();
    cout<<size1<<" "<<size2<<endl;
    string c = a+b;
    cout<<c<<endl;
    char temp= a[0];
    a[0]=b[0];
    b[0]=temp;
    cout<<a<<" "<<b;
    return 0;
}