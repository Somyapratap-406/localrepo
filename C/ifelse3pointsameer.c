#include<stdio.h>
int main()
{
    float x1,x2,x3,y1,y2,y3;
    printf("enter first points");
    scanf("%d %d",&x1,&y1);
    printf("enter second points");
    scanf("%d %d",&x2,&y2);
    printf("enter third points");
    scanf("%d %d",&x3,&y3);
    double a=(y2-y1)/(x2-x1);
    double b=(y3-y2)/(x3-x2);
    if(a==b)
    printf("points lies in a straight line");
    else
    printf("points not lies in a straight line");
    return 0;
}

