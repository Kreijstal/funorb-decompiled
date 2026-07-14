/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    int field_k;
    private int[] field_h;
    private int field_b;
    private int field_g;
    int field_a;
    private int field_d;
    private int[] field_i;
    private int field_e;
    private int field_j;
    private int field_c;
    int field_f;

    final void b(p param0) {
        ((ll) this).field_k = param0.i(-100);
        ((ll) this).field_a = param0.e((byte) -128);
        ((ll) this).field_f = param0.e((byte) -112);
        ((ll) this).a(param0);
    }

    final void a(p param0) {
        int var2 = 0;
        ((ll) this).field_g = param0.i(-101);
        ((ll) this).field_i = new int[((ll) this).field_g];
        ((ll) this).field_h = new int[((ll) this).field_g];
        for (var2 = 0; var2 < ((ll) this).field_g; var2++) {
            ((ll) this).field_i[var2] = param0.f(674914976);
            ((ll) this).field_h[var2] = param0.f(674914976);
        }
    }

    final int a(int param0) {
        if (((ll) this).field_j >= ((ll) this).field_d) {
            ((ll) this).field_c = ((ll) this).field_c + 1;
            ((ll) this).field_b = ((ll) this).field_h[((ll) this).field_c] << 15;
            if (((ll) this).field_c >= ((ll) this).field_g) {
                ((ll) this).field_c = ((ll) this).field_g - 1;
            }
            ((ll) this).field_d = (int)((double)((ll) this).field_i[((ll) this).field_c] / 65536.0 * (double)param0);
            if (((ll) this).field_d > ((ll) this).field_j) {
                ((ll) this).field_e = ((((ll) this).field_h[((ll) this).field_c] << 15) - ((ll) this).field_b) / (((ll) this).field_d - ((ll) this).field_j);
            }
        }
        ((ll) this).field_b = ((ll) this).field_b + ((ll) this).field_e;
        ((ll) this).field_j = ((ll) this).field_j + 1;
        return ((ll) this).field_b - ((ll) this).field_e >> 15;
    }

    final void a() {
        ((ll) this).field_d = 0;
        ((ll) this).field_c = 0;
        ((ll) this).field_e = 0;
        ((ll) this).field_b = 0;
        ((ll) this).field_j = 0;
    }

    ll() {
        ((ll) this).field_g = 2;
        ((ll) this).field_i = new int[2];
        ((ll) this).field_h = new int[2];
        ((ll) this).field_i[0] = 0;
        ((ll) this).field_i[1] = 65535;
        ((ll) this).field_h[0] = 0;
        ((ll) this).field_h[1] = 65535;
    }
}
