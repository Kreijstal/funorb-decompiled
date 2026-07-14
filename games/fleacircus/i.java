/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private int[] field_h;
    int field_d;
    private int field_k;
    private int field_e;
    private int[] field_c;
    private int field_j;
    private int field_a;
    int field_i;
    private int field_g;
    int field_b;
    private int field_f;

    final void a(ni param0) {
        int var2 = 0;
        ((i) this).field_g = param0.e(false);
        ((i) this).field_c = new int[((i) this).field_g];
        ((i) this).field_h = new int[((i) this).field_g];
        for (var2 = 0; var2 < ((i) this).field_g; var2++) {
            ((i) this).field_c[var2] = param0.d((byte) -128);
            ((i) this).field_h[var2] = param0.d((byte) 79);
        }
    }

    final void a() {
        ((i) this).field_j = 0;
        ((i) this).field_a = 0;
        ((i) this).field_e = 0;
        ((i) this).field_k = 0;
        ((i) this).field_f = 0;
    }

    final int a(int param0) {
        if (((i) this).field_f >= ((i) this).field_j) {
            ((i) this).field_a = ((i) this).field_a + 1;
            ((i) this).field_k = ((i) this).field_h[((i) this).field_a] << 15;
            if (((i) this).field_a >= ((i) this).field_g) {
                ((i) this).field_a = ((i) this).field_g - 1;
            }
            ((i) this).field_j = (int)((double)((i) this).field_c[((i) this).field_a] / 65536.0 * (double)param0);
            if (((i) this).field_j > ((i) this).field_f) {
                ((i) this).field_e = ((((i) this).field_h[((i) this).field_a] << 15) - ((i) this).field_k) / (((i) this).field_j - ((i) this).field_f);
            }
        }
        ((i) this).field_k = ((i) this).field_k + ((i) this).field_e;
        ((i) this).field_f = ((i) this).field_f + 1;
        return ((i) this).field_k - ((i) this).field_e >> 15;
    }

    final void b(ni param0) {
        ((i) this).field_d = param0.e(false);
        ((i) this).field_i = param0.c((byte) -102);
        ((i) this).field_b = param0.c((byte) -11);
        ((i) this).a(param0);
    }

    i() {
        ((i) this).field_g = 2;
        ((i) this).field_c = new int[2];
        ((i) this).field_h = new int[2];
        ((i) this).field_c[0] = 0;
        ((i) this).field_c[1] = 65535;
        ((i) this).field_h[0] = 0;
        ((i) this).field_h[1] = 65535;
    }
}
