#include <iostream>
#include <cstdio>
using namespace std;

int main() 
{
    int i;
    long l;
    char c;
    float f;
    double d;    
    scanf("%d %ld %c %f %lf", &i, &l, &c, &f, &d);
    printf("%d\n", i);
    printf("%ld\n", l);
    printf("%c\n", c);
    printf("%f\n", f);
    printf("%lf", d);
    return 0;
}