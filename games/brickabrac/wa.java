/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    int field_k;
    private int field_e;
    private int field_h;
    private int field_j;
    private int field_g;
    int field_a;
    private int[] field_f;
    private int[] field_d;
    private int field_b;
    int field_i;
    private int field_c;

    final int a(int param0) {
        if (((wa) this).field_g >= ((wa) this).field_h) {
            ((wa) this).field_e = ((wa) this).field_e + 1;
            ((wa) this).field_j = ((wa) this).field_f[((wa) this).field_e] << 15;
            if (((wa) this).field_e >= ((wa) this).field_c) {
                ((wa) this).field_e = ((wa) this).field_c - 1;
            }
            ((wa) this).field_h = (int)((double)((wa) this).field_d[((wa) this).field_e] / 65536.0 * (double)param0);
            if (((wa) this).field_h > ((wa) this).field_g) {
                ((wa) this).field_b = ((((wa) this).field_f[((wa) this).field_e] << 15) - ((wa) this).field_j) / (((wa) this).field_h - ((wa) this).field_g);
            }
        }
        ((wa) this).field_j = ((wa) this).field_j + ((wa) this).field_b;
        ((wa) this).field_g = ((wa) this).field_g + 1;
        return ((wa) this).field_j - ((wa) this).field_b >> 15;
    }

    final void b(wq param0) {
        ((wa) this).field_k = param0.l(255);
        ((wa) this).field_a = param0.e(255);
        ((wa) this).field_i = param0.e(255);
        ((wa) this).a(param0);
    }

    final void a() {
        ((wa) this).field_h = 0;
        ((wa) this).field_e = 0;
        ((wa) this).field_b = 0;
        ((wa) this).field_j = 0;
        ((wa) this).field_g = 0;
    }

    final void a(wq param0) {
        int var2 = 0;
        ((wa) this).field_c = param0.l(255);
        ((wa) this).field_d = new int[((wa) this).field_c];
        ((wa) this).field_f = new int[((wa) this).field_c];
        for (var2 = 0; var2 < ((wa) this).field_c; var2++) {
            ((wa) this).field_d[var2] = param0.i(65280);
            ((wa) this).field_f[var2] = param0.i(65280);
        }
    }

    wa() {
        ((wa) this).field_c = 2;
        ((wa) this).field_d = new int[2];
        ((wa) this).field_f = new int[2];
        ((wa) this).field_d[0] = 0;
        ((wa) this).field_d[1] = 65535;
        ((wa) this).field_f[0] = 0;
        ((wa) this).field_f[1] = 65535;
    }
}
