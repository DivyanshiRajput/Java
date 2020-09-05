/* Given 5 cars and their efficiencies, finding the range for the given cars.
   Used array of structures to store data, calculated range and printed output in reverse order.
   More efficiency parameters can be added accordingly in the structure. */

#include <stdio.h>
#include <stdlib.h>

struct car // structure for maintaining details of car
{
  int type; // 1 for diesel car, 2 for electric.
  float eff; // efficiency of car.
  float curr; // current fuel of car.
};

int main()
{
  int n;
  scanf ("%d", &n);
  struct car arr[n]; // array of structs used so that we can access data of any car easily

  for (int i = 0; i< n; i++)
  {
    scanf ("%d %f %f", &arr[i].type, &arr[i].eff, &arr[i].curr );
  }

  float range[n]; // array used to store range of the car
  float current;

  for (int i = 0; i<n; i++) // calculating range
  {
    if (arr[i].type == 1)
      range[i] = arr[i].eff * arr[i].curr;

    else
    {
      current = arr[i].curr*1000;
      range[i] = current/arr[i].eff;
    }
  }

  for (int i = n-1; i>= 0; i--) // printing range in reverse order
  {
    printf ("Car %d: range = %0.2f\n", i+1, range[i]);
  }

  return 0;
}
