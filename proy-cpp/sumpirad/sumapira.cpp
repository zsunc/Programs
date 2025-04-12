#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int lista[100];
    for (int i = 0; i < n; i++) {
        cin >> lista[i];
    }
    while (n > 1) {
        for (int i = 0; i < n - 1; i++) {
            lista[i] = lista[i] + lista[i + 1];
        }  n--;
    }
    cout << lista[0] << "\n";
    return 0;
}
