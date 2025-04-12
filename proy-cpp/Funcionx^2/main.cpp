#include <iostream>
using namespace std;
int main() {
    int x;
    while (cin >> x) {
        static int caso = 1;
        int resultado = x * x;
        cout << "Case #" << caso << ": " << resultado << "\n";
        caso++;
    }
    return 0;
}
