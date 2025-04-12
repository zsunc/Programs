#include <iostream>
#include <string>
using namespace std;

void estaciones(int dia, int mes, int anio){
	if ((dia>=21 && mes==3) || (mes>3 && mes<6) || (mes==6 && dia<=20)){
			cout<<"\nOTOÑO";
		}
	else if((dia>=21 && mes==6) || (mes>5 && mes<9) || (mes==9 && dia <=20)){
			cout<<"\nINVIERNO";
		}
	else if((dia>=21 && mes==9) || (mes>9 && mes<12) || (mes==12 && dia<=20)){
			cout<<"\nPRIMAVERA";
		}
	else {
		cout<< "\nVERANO";
		}
	}

int main(){
	int dia,mes,anio;
	cout<<"INGRESE EL DIA: ";
	cin>>dia;
	cout<<"INGRESE EL MES: ";
	cin>>mes;
	cout<<"INGRESE EL AÑO: ";
	cin>> anio;
	
	if(dia<1 || dia>31 || mes>12 || mes <1){
		cout<<"INGRESE UNA FECHA VALIDA";
		return 1;
		}
		cout<< "\nLA TEMPORADA ES: ";
		estaciones(dia,mes,anio);
return 0;
}
