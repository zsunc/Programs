#include <iostream>
using namespace std;
int factorialnum(int n){
	if (n == 0 || n == 1){
		return 1;
		}
	return n * factorialnum(n-1);
	}
int main(){
		int num;
		cout<<"\nIngrese un numero para el factorial: ";
		cin>>num;
		cout<<"El factorial del "<<num<<" es: "<<factorialnum(num);
		return 0; 
}
