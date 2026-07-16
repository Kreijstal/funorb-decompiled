/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    private int field_h;
    private int field_j;
    int field_f;
    private int[] field_e;
    private int[] field_c;
    private int field_d;
    private int field_k;
    int field_a;
    private int field_i;
    private int field_g;
    int field_b;

    final void b(ge param0) {
        ((ed) this).field_b = param0.g(-67);
        ((ed) this).field_f = param0.b(true);
        ((ed) this).field_a = param0.b(true);
        ((ed) this).a(param0);
    }

    final void a(ge param0) {
        int var2 = 0;
        ((ed) this).field_d = param0.g(-128);
        ((ed) this).field_e = new int[((ed) this).field_d];
        ((ed) this).field_c = new int[((ed) this).field_d];
        for (var2 = 0; var2 < ((ed) this).field_d; var2++) {
            ((ed) this).field_e[var2] = param0.d(-1034);
            ((ed) this).field_c[var2] = param0.d(-1034);
        }
    }

    final void a() {
        ((ed) this).field_j = 0;
        ((ed) this).field_h = 0;
        ((ed) this).field_k = 0;
        ((ed) this).field_g = 0;
        ((ed) this).field_i = 0;
    }

    final int a(int param0) {
        if (((ed) this).field_i >= ((ed) this).field_j) {
            int fieldTemp$0 = ((ed) this).field_h;
            ((ed) this).field_h = ((ed) this).field_h + 1;
            ((ed) this).field_g = ((ed) this).field_c[fieldTemp$0] << 15;
            if (((ed) this).field_h >= ((ed) this).field_d) {
                ((ed) this).field_h = ((ed) this).field_d - 1;
            }
            ((ed) this).field_j = (int)((double)((ed) this).field_e[((ed) this).field_h] / 65536.0 * (double)param0);
            if (((ed) this).field_j > ((ed) this).field_i) {
                ((ed) this).field_k = ((((ed) this).field_c[((ed) this).field_h] << 15) - ((ed) this).field_g) / (((ed) this).field_j - ((ed) this).field_i);
            }
        }
        ((ed) this).field_g = ((ed) this).field_g + ((ed) this).field_k;
        ((ed) this).field_i = ((ed) this).field_i + 1;
        return ((ed) this).field_g - ((ed) this).field_k >> 15;
    }

    ed() {
        ((ed) this).field_d = 2;
        ((ed) this).field_e = new int[2];
        ((ed) this).field_c = new int[2];
        ((ed) this).field_e[0] = 0;
        ((ed) this).field_e[1] = 65535;
        ((ed) this).field_c[0] = 0;
        ((ed) this).field_c[1] = 65535;
    }
}
