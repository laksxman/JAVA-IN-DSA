// // Write a program to create balloons. 

// #include <direct.h>
// // #include <graphics.h>
// #include <stdlib.h>
// #include <stdio.h>
// #include <conio.h>
// #include <SDL2.h>
// int main(void)
// {
// int gdriver = DETECT, gmode, errorcode;
// initgraph(gdriver,gmode,"");
// while(!kbhit())
// {
// int i,j=0;
// for(i=440,j=0;i>20,j<400;i--,j++)
// {
// int k=180+j;
// setfillstyle (SOLID_FILL,WHITE);
// fillellipse(k,i,50,90);
// fillellipse(k,i+95,5,10);
// line(k+5,i+100,k-20,i+270);
// setfillstyle (SOLID_FILL,RED);
// fillellipse(180,i,50,90);
// fillellipse(180,i+95,5,10);
// line(185,i+100,220,i+300);
// setfillstyle (SOLID_FILL,BLUE);
// fillellipse(250,i,50,90);
// fillellipse(250,i+95,5,10);
// line(250,i+100,220,i+300);
// setfillstyle (SOLID_FILL,GREEN);



// fillellipse(310,i,50,90);
// fillellipse(310,i+95,5,10);
// line(310,i+100,220,i+300);
// setfillstyle (SOLID_FILL,MAGENTA);
// fillellipse(210,i+60,50,90);
// fillellipse(210,i+155,5,10);
// line(210,i+160,220,i+300);
// setfillstyle (SOLID_FILL,YELLOW);
// fillellipse(270,i+60,50,90);
// fillellipse(270,i+155,5,10);
// line(270,i+160,220,i+300);
// delay(50);
// cleardevice();
// }
// }
// getch();
// closegraph();
// return 0;
// }