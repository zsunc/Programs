#include <iostream>
using namespace std;
class Alumno {
public:
// nmb: nombre | clf: calificacion
    string nmb;
    int clf;
    Alumno() {} 
    Alumno(string n, int c) : nmb(n), clf(c) {}
};
int main(){
	int n;
	cin >>n;
	Alumno alumnos[10];
	for (int i=0 ; i<n ; i++){
		getline(cin, alumnos[i].nmb);
		cin>> alumnos[i].clf;
		}
	int igt = 0, bro = 0; //encontrar el mas-igt:inteligente | bro: burro
		for (int i=1; i<n ; i++){
			if (alumnos[i].clf > alumnos[igt].clf){
				igt = i; }
			if (alumnos[i].clf > alumnos[bro].clf){
				bro = i; }
			}
cout << alumnos[igt].nmb << " " << alumnos[bro].nmb << "\n";
return 0;
}
