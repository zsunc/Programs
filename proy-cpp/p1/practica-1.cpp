#include <iostream>
using namespace std;
int main(){
int n;
int numMayor=0;
cout<<"INGRESE UN NUMERO: "<<"\n";
cin>> n;
while(n>0){
	int ultimodigito = n % 10;
	if(ultimodigito > numMayor){
		numMayor = ultimodigito;
		}
			n = n/10;
	}
	cout<<"EL NUMERO MAYOR ES EL "<<numMayor;
	return 0;
}
