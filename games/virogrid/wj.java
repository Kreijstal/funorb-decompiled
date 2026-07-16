/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    private int field_c;
    private int field_b;
    private int field_i;
    int field_f;
    private int field_a;
    int field_h;
    private int field_k;
    int field_j;
    private int[] field_d;
    private int field_e;
    private int[] field_g;

    final void a() {
        ((wj) this).field_e = 0;
        ((wj) this).field_k = 0;
        ((wj) this).field_c = 0;
        ((wj) this).field_a = 0;
        ((wj) this).field_b = 0;
    }

    final void a(jc param0) {
        ((wj) this).field_h = param0.g(11132);
        ((wj) this).field_j = param0.d((byte) 105);
        ((wj) this).field_f = param0.d((byte) 104);
        ((wj) this).b(param0);
    }

    final void b(jc param0) {
        int var2 = 0;
        ((wj) this).field_i = param0.g(11132);
        ((wj) this).field_g = new int[((wj) this).field_i];
        ((wj) this).field_d = new int[((wj) this).field_i];
        for (var2 = 0; var2 < ((wj) this).field_i; var2++) {
            ((wj) this).field_g[var2] = param0.c((byte) 110);
            ((wj) this).field_d[var2] = param0.c((byte) -90);
        }
    }

    final int a(int param0) {
        if (((wj) this).field_b >= ((wj) this).field_e) {
            int fieldTemp$0 = ((wj) this).field_k;
            ((wj) this).field_k = ((wj) this).field_k + 1;
            ((wj) this).field_a = ((wj) this).field_d[fieldTemp$0] << 15;
            if (((wj) this).field_k >= ((wj) this).field_i) {
                ((wj) this).field_k = ((wj) this).field_i - 1;
            }
            ((wj) this).field_e = (int)((double)((wj) this).field_g[((wj) this).field_k] / 65536.0 * (double)param0);
            if (((wj) this).field_e > ((wj) this).field_b) {
                ((wj) this).field_c = ((((wj) this).field_d[((wj) this).field_k] << 15) - ((wj) this).field_a) / (((wj) this).field_e - ((wj) this).field_b);
            }
        }
        ((wj) this).field_a = ((wj) this).field_a + ((wj) this).field_c;
        ((wj) this).field_b = ((wj) this).field_b + 1;
        return ((wj) this).field_a - ((wj) this).field_c >> 15;
    }

    wj() {
        ((wj) this).field_i = 2;
        ((wj) this).field_g = new int[2];
        ((wj) this).field_d = new int[2];
        ((wj) this).field_g[0] = 0;
        ((wj) this).field_g[1] = 65535;
        ((wj) this).field_d[0] = 0;
        ((wj) this).field_d[1] = 65535;
    }
}
