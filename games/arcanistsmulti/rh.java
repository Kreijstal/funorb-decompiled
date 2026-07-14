/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private int field_i;
    private int field_d;
    int field_g;
    int field_k;
    private int[] field_a;
    private int field_c;
    private int field_b;
    int field_e;
    private int field_j;
    private int[] field_h;
    private int field_f;

    final void a() {
        ((rh) this).field_i = 0;
        ((rh) this).field_d = 0;
        ((rh) this).field_f = 0;
        ((rh) this).field_j = 0;
        ((rh) this).field_b = 0;
    }

    final void b(wk param0) {
        int var2 = 0;
        ((rh) this).field_c = param0.e((byte) -115);
        ((rh) this).field_h = new int[((rh) this).field_c];
        ((rh) this).field_a = new int[((rh) this).field_c];
        for (var2 = 0; var2 < ((rh) this).field_c; var2++) {
            ((rh) this).field_h[var2] = param0.n(-98);
            ((rh) this).field_a[var2] = param0.n(-98);
        }
    }

    final void a(wk param0) {
        ((rh) this).field_g = param0.e((byte) 62);
        ((rh) this).field_k = param0.d(-10674);
        ((rh) this).field_e = param0.d(-10674);
        ((rh) this).b(param0);
    }

    final int a(int param0) {
        if (((rh) this).field_b >= ((rh) this).field_i) {
            ((rh) this).field_d = ((rh) this).field_d + 1;
            ((rh) this).field_j = ((rh) this).field_a[((rh) this).field_d] << 15;
            if (((rh) this).field_d >= ((rh) this).field_c) {
                ((rh) this).field_d = ((rh) this).field_c - 1;
            }
            ((rh) this).field_i = (int)((double)((rh) this).field_h[((rh) this).field_d] / 65536.0 * (double)param0);
            if (((rh) this).field_i > ((rh) this).field_b) {
                ((rh) this).field_f = ((((rh) this).field_a[((rh) this).field_d] << 15) - ((rh) this).field_j) / (((rh) this).field_i - ((rh) this).field_b);
            }
        }
        ((rh) this).field_j = ((rh) this).field_j + ((rh) this).field_f;
        ((rh) this).field_b = ((rh) this).field_b + 1;
        return ((rh) this).field_j - ((rh) this).field_f >> 15;
    }

    rh() {
        ((rh) this).field_c = 2;
        ((rh) this).field_h = new int[2];
        ((rh) this).field_a = new int[2];
        ((rh) this).field_h[0] = 0;
        ((rh) this).field_h[1] = 65535;
        ((rh) this).field_a[0] = 0;
        ((rh) this).field_a[1] = 65535;
    }
}
