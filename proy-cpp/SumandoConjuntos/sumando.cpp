#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N; //cnjt: conjunto
    int cnjt1[100], cnjt2[100], result[100];
    for (int i = 0; i < N; ++i) {
        cin >> cnjt1[i];
        }
    for (int i = 0; i < N; i++) {
        cin >> cnjt2[i];
        }
    for (int i = 0; i < N; i++) {
        result[i] = cnjt1[i] + cnjt2[i];
    }
    for (int i = 0; i < N; i++) {
        cout << result[i] << (i == N - 1 ? "" : " \n");
    }
    return 0;
}
