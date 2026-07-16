/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    private int[] field_f;
    int field_c;
    private int field_b;
    private int field_d;
    private int[] field_h;
    private int field_g;
    private int field_i;
    private int field_j;
    int field_a;
    private int field_k;
    int field_e;

    final void a(fj param0) {
        ((td) this).field_c = param0.i((byte) -101);
        ((td) this).field_e = param0.c((byte) -127);
        ((td) this).field_a = param0.c((byte) -76);
        ((td) this).b(param0);
    }

    final void a() {
        ((td) this).field_k = 0;
        ((td) this).field_j = 0;
        ((td) this).field_d = 0;
        ((td) this).field_i = 0;
        ((td) this).field_g = 0;
    }

    final void b(fj param0) {
        int var2 = 0;
        ((td) this).field_b = param0.i((byte) -101);
        ((td) this).field_h = new int[((td) this).field_b];
        ((td) this).field_f = new int[((td) this).field_b];
        for (var2 = 0; var2 < ((td) this).field_b; var2++) {
            ((td) this).field_h[var2] = param0.i(7088);
            ((td) this).field_f[var2] = param0.i(7088);
        }
    }

    final int a(int param0) {
        if (((td) this).field_g >= ((td) this).field_k) {
            int fieldTemp$0 = ((td) this).field_j;
            ((td) this).field_j = ((td) this).field_j + 1;
            ((td) this).field_i = ((td) this).field_f[fieldTemp$0] << 15;
            if (((td) this).field_j >= ((td) this).field_b) {
                ((td) this).field_j = ((td) this).field_b - 1;
            }
            ((td) this).field_k = (int)((double)((td) this).field_h[((td) this).field_j] / 65536.0 * (double)param0);
            if (((td) this).field_k > ((td) this).field_g) {
                ((td) this).field_d = ((((td) this).field_f[((td) this).field_j] << 15) - ((td) this).field_i) / (((td) this).field_k - ((td) this).field_g);
            }
        }
        ((td) this).field_i = ((td) this).field_i + ((td) this).field_d;
        ((td) this).field_g = ((td) this).field_g + 1;
        return ((td) this).field_i - ((td) this).field_d >> 15;
    }

    td() {
        ((td) this).field_b = 2;
        ((td) this).field_h = new int[2];
        ((td) this).field_f = new int[2];
        ((td) this).field_h[0] = 0;
        ((td) this).field_h[1] = 65535;
        ((td) this).field_f[0] = 0;
        ((td) this).field_f[1] = 65535;
    }
}
