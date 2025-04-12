#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int lista[100];
    for (int i = 0; i < n; i++) {
        cin >> lista[i];
    }
    //vmin:valor minimo | vmax: valormaximo | cmax:cuenta maxima
    int vmin = lista[0];
    int vmax = lista[0];
    int cmax = 1;
    for (int i = 1; i < n; i++) {
        if (lista[i] < vmin){
            vmin = lista[i];
        }
        if (lista[i] > vmax) {
            vmax = lista[i];
            cmax = 1;
        } else if (lista[i] == vmax) {
            cmax++;
        }
    }
    cout << vmin << " " << cmax << endl;
    return 0;
}
