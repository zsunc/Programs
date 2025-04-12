#include <iostream>
#include <string>
using namespace std;
	class persona {
		private: 
			string nombre;
			int edad;
		public:
			persona(string nmb, int ed): nombre(nmb), edad(ed){}
	
	void mostrarInf(){
			cout<<"Nombre: "<<nombre<<", Edad: "<<edad<<endl;
			}	
	};

int main(){
	string name;
	int age;
	cout<<"\nIngrese su nombre: ";
	cin>>name;
	cout<<"\nIngrese su edad: ";
	cin>>age;
	persona persona1(name,age);
	persona1.mostrarInf();
		
return 0;	
}
