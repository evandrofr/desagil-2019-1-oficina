package br.pro.hashi.ensino.desagil.oficina;

public class Engine {
    public int search(int[] v, int q) {
        int l = 0;
        int r = v.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (v[m] == q) {
                return m;
            } else if (v[m] < q) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}
