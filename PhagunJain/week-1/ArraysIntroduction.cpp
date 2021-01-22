#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    int x[n];
    for(int i=0; i<=n; i++){
        cin>>x[i];
    }
    
    for(int i=n-1; i>=0; i--){
        cout<<x[i]<<" ";
    }
    return 0;
}

.[link to problem].(https://www.hackerrank.com/challenges/arrays-introduction/problem?h_r=next-challenge&h_v=zen)
