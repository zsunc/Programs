#include <iostream>
using namespace std;
int cuadrado(int n){
	int cuadrDn;
	cuadrDn = n * n;
	return cuadrDn;
	}

int cubo(int m){
	int cuboDm;
	cuboDm = m * m * m;
	return cuboDm;
}

int main(){
	int x,y;
	cout<<"\nINGRESE UN PRIMER NUMERO ";
	cin>>x;
	cout<<"\nINGRESE UN SEGUNDO NUMERO ";
	cin>>y;
	cout<<"\nEL CUADRADO DEL PRIMER NUMERO ES "<<cuadrado(x)<<" Y EL CUBO DEL SEGUNDO NUMERO ES "<<cubo(y);
	return 0;
	}

