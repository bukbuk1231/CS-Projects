#include <iostream>
#include "Rectangle.h"
using namespace std;

int main()
{
  Rectangle rect(3,4);
  Rectangle rect2(5,6);
  cout << "Rect area: " << rect.area() << endl;
  cout << "Rect2 area: " << rect2.area() << endl;
  return 0;


}