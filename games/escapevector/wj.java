/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    int field_j;
    private int field_i;
    private int field_d;
    int field_e;
    private int field_f;
    int field_b;
    private int field_a;
    private int[] field_h;
    private int field_c;
    private int[] field_k;
    private int field_g;

    final int a(int param0) {
        if (((wj) this).field_c >= ((wj) this).field_f) {
            ((wj) this).field_a = ((wj) this).field_a + 1;
            ((wj) this).field_i = ((wj) this).field_h[((wj) this).field_a] << 15;
            if (((wj) this).field_a >= ((wj) this).field_g) {
                ((wj) this).field_a = ((wj) this).field_g - 1;
            }
            ((wj) this).field_f = (int)((double)((wj) this).field_k[((wj) this).field_a] / 65536.0 * (double)param0);
            if (((wj) this).field_f > ((wj) this).field_c) {
                ((wj) this).field_d = ((((wj) this).field_h[((wj) this).field_a] << 15) - ((wj) this).field_i) / (((wj) this).field_f - ((wj) this).field_c);
            }
        }
        ((wj) this).field_i = ((wj) this).field_i + ((wj) this).field_d;
        ((wj) this).field_c = ((wj) this).field_c + 1;
        return ((wj) this).field_i - ((wj) this).field_d >> 15;
    }

    final void a() {
        ((wj) this).field_f = 0;
        ((wj) this).field_a = 0;
        ((wj) this).field_d = 0;
        ((wj) this).field_i = 0;
        ((wj) this).field_c = 0;
    }

    final void a(n param0) {
        ((wj) this).field_e = param0.e(0);
        ((wj) this).field_j = param0.g(-5053);
        ((wj) this).field_b = param0.g(-5053);
        ((wj) this).b(param0);
    }

    final void b(n param0) {
        int var2 = 0;
        ((wj) this).field_g = param0.e(0);
        ((wj) this).field_k = new int[((wj) this).field_g];
        ((wj) this).field_h = new int[((wj) this).field_g];
        for (var2 = 0; var2 < ((wj) this).field_g; var2++) {
            ((wj) this).field_k[var2] = param0.f(1952);
            ((wj) this).field_h[var2] = param0.f(1952);
        }
    }

    wj() {
        ((wj) this).field_g = 2;
        ((wj) this).field_k = new int[2];
        ((wj) this).field_h = new int[2];
        ((wj) this).field_k[0] = 0;
        ((wj) this).field_k[1] = 65535;
        ((wj) this).field_h[0] = 0;
        ((wj) this).field_h[1] = 65535;
    }
}
