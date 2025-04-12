#include <iostream>
using namespace std;

int mayorVal(int n,int nMay = 0){
//Caso base, el caso donde ya no se pueda realizar mas n = 0
if (n==0){
	return nMay;
	}
	int uDig= n % 10;
	if (uDig>nMay){
		nMay = uDig;
		}
	return mayorVal(n/10,nMay);	
	}
	
int main(){
	int num;
	cout<<"\nIngrese un numero: ";
	cin>>num;
	cout<<"El mayor numero es: "<<mayorVal(num);
	}
