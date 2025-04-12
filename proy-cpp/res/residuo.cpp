#include <iostream>
using namespace std;
int main(){
	int x,y;
	cout<<"\nINGRESE UN NUMERO PARA OBTENER EL ULTIMO DIGITO: ";
	cin>>x;
	y = x % 10;
	cout<<"\nEL NUMERO ES: "<<y;
	return 0;
}
