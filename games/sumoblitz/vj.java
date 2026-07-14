/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    private int field_f;
    private int[] field_e;
    private int field_k;
    private int[] field_g;
    private int field_h;
    private int field_i;
    int field_a;
    private int field_c;
    int field_d;
    private int field_j;
    int field_b;

    final void a() {
        ((vj) this).field_h = 0;
        ((vj) this).field_f = 0;
        ((vj) this).field_k = 0;
        ((vj) this).field_i = 0;
        ((vj) this).field_j = 0;
    }

    final int a(int param0) {
        if (((vj) this).field_j >= ((vj) this).field_h) {
            ((vj) this).field_f = ((vj) this).field_f + 1;
            ((vj) this).field_i = ((vj) this).field_g[((vj) this).field_f] << 15;
            if (((vj) this).field_f >= ((vj) this).field_c) {
                ((vj) this).field_f = ((vj) this).field_c - 1;
            }
            ((vj) this).field_h = (int)((double)((vj) this).field_e[((vj) this).field_f] / 65536.0 * (double)param0);
            if (((vj) this).field_h > ((vj) this).field_j) {
                ((vj) this).field_k = ((((vj) this).field_g[((vj) this).field_f] << 15) - ((vj) this).field_i) / (((vj) this).field_h - ((vj) this).field_j);
            }
        }
        ((vj) this).field_i = ((vj) this).field_i + ((vj) this).field_k;
        ((vj) this).field_j = ((vj) this).field_j + 1;
        return ((vj) this).field_i - ((vj) this).field_k >> 15;
    }

    final void b(fs param0) {
        int var2 = 0;
        ((vj) this).field_c = param0.e(-31302);
        ((vj) this).field_e = new int[((vj) this).field_c];
        ((vj) this).field_g = new int[((vj) this).field_c];
        for (var2 = 0; var2 < ((vj) this).field_c; var2++) {
            ((vj) this).field_e[var2] = param0.a(255);
            ((vj) this).field_g[var2] = param0.a(255);
        }
    }

    final void a(fs param0) {
        ((vj) this).field_a = param0.e(-31302);
        ((vj) this).field_b = param0.c(true);
        ((vj) this).field_d = param0.c(true);
        ((vj) this).b(param0);
    }

    vj() {
        ((vj) this).field_c = 2;
        ((vj) this).field_e = new int[2];
        ((vj) this).field_g = new int[2];
        ((vj) this).field_e[0] = 0;
        ((vj) this).field_e[1] = 65535;
        ((vj) this).field_g[0] = 0;
        ((vj) this).field_g[1] = 65535;
    }
}
