#include <iostream>

using namespace std;

int main()
{
int total, pagado, cambio, vr_u, cant;
float iva ;
    cout<<"digite la cantidad del articulo x";
    cin>>cant;
    cout<<"digite el valor unitario del articulo x";
    cin>>vr_u;
total = vr_u*cant
iva = total * 0.13;
total = total + iva;
    cout<<"el valor a cancelar es: Bs. "<<total;
    cout<<"con cuento cancela el cliente?: Bs";
    cin>>pagado;
cambio = pagado–total;
    cout<<"el cambio es"; <<cambio;
return 0;
}

