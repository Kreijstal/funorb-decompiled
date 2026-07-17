/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int field_j;
    private int field_h;
    private int field_b;
    private int[] field_g;
    private int[] field_k;
    int field_d;
    private int field_i;
    int field_c;
    private int field_f;
    private int field_a;
    private int field_e;

    final int a(int param0) {
        if (((fh) this).field_i >= ((fh) this).field_a) {
            int fieldTemp$0 = ((fh) this).field_e;
            ((fh) this).field_e = ((fh) this).field_e + 1;
            ((fh) this).field_h = ((fh) this).field_g[fieldTemp$0] << 15;
            if (((fh) this).field_e >= ((fh) this).field_b) {
                ((fh) this).field_e = ((fh) this).field_b - 1;
            }
            ((fh) this).field_a = (int)((double)((fh) this).field_k[((fh) this).field_e] / 65536.0 * (double)param0);
            if (((fh) this).field_a > ((fh) this).field_i) {
                ((fh) this).field_f = ((((fh) this).field_g[((fh) this).field_e] << 15) - ((fh) this).field_h) / (((fh) this).field_a - ((fh) this).field_i);
            }
        }
        ((fh) this).field_h = ((fh) this).field_h + ((fh) this).field_f;
        ((fh) this).field_i = ((fh) this).field_i + 1;
        return ((fh) this).field_h - ((fh) this).field_f >> 15;
    }

    final void a(ec param0) {
        int var2 = 0;
        ((fh) this).field_b = param0.c(true);
        ((fh) this).field_k = new int[((fh) this).field_b];
        ((fh) this).field_g = new int[((fh) this).field_b];
        for (var2 = 0; var2 < ((fh) this).field_b; var2++) {
            ((fh) this).field_k[var2] = param0.k(0);
            ((fh) this).field_g[var2] = param0.k(0);
        }
    }

    fh() {
        ((fh) this).field_b = 2;
        ((fh) this).field_k = new int[2];
        ((fh) this).field_g = new int[2];
        ((fh) this).field_k[0] = 0;
        ((fh) this).field_k[1] = 65535;
        ((fh) this).field_g[0] = 0;
        ((fh) this).field_g[1] = 65535;
    }

    final void b(ec param0) {
        ((fh) this).field_d = param0.c(true);
        ((fh) this).field_c = param0.h(-97);
        ((fh) this).field_j = param0.h(-128);
        ((fh) this).a(param0);
    }

    final void a() {
        ((fh) this).field_a = 0;
        ((fh) this).field_e = 0;
        ((fh) this).field_f = 0;
        ((fh) this).field_h = 0;
        ((fh) this).field_i = 0;
    }
}
