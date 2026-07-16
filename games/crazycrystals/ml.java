/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private int field_k;
    private int field_a;
    private int field_i;
    int field_h;
    private int field_f;
    private int field_j;
    private int field_e;
    int field_d;
    int field_c;
    private int[] field_g;
    private int[] field_b;

    final void b(ng param0) {
        ((ml) this).field_c = param0.h(255);
        ((ml) this).field_h = param0.b((byte) 127);
        ((ml) this).field_d = param0.b((byte) -7);
        ((ml) this).a(param0);
    }

    final void a() {
        ((ml) this).field_f = 0;
        ((ml) this).field_a = 0;
        ((ml) this).field_i = 0;
        ((ml) this).field_k = 0;
        ((ml) this).field_j = 0;
    }

    final int a(int param0) {
        if (((ml) this).field_j >= ((ml) this).field_f) {
            int fieldTemp$0 = ((ml) this).field_a;
            ((ml) this).field_a = ((ml) this).field_a + 1;
            ((ml) this).field_k = ((ml) this).field_b[fieldTemp$0] << 15;
            if (((ml) this).field_a >= ((ml) this).field_e) {
                ((ml) this).field_a = ((ml) this).field_e - 1;
            }
            ((ml) this).field_f = (int)((double)((ml) this).field_g[((ml) this).field_a] / 65536.0 * (double)param0);
            if (((ml) this).field_f > ((ml) this).field_j) {
                ((ml) this).field_i = ((((ml) this).field_b[((ml) this).field_a] << 15) - ((ml) this).field_k) / (((ml) this).field_f - ((ml) this).field_j);
            }
        }
        ((ml) this).field_k = ((ml) this).field_k + ((ml) this).field_i;
        ((ml) this).field_j = ((ml) this).field_j + 1;
        return ((ml) this).field_k - ((ml) this).field_i >> 15;
    }

    final void a(ng param0) {
        int var2 = 0;
        ((ml) this).field_e = param0.h(255);
        ((ml) this).field_g = new int[((ml) this).field_e];
        ((ml) this).field_b = new int[((ml) this).field_e];
        for (var2 = 0; var2 < ((ml) this).field_e; var2++) {
            ((ml) this).field_g[var2] = param0.c((byte) -7);
            ((ml) this).field_b[var2] = param0.c((byte) -7);
        }
    }

    ml() {
        ((ml) this).field_e = 2;
        ((ml) this).field_g = new int[2];
        ((ml) this).field_b = new int[2];
        ((ml) this).field_g[0] = 0;
        ((ml) this).field_g[1] = 65535;
        ((ml) this).field_b[0] = 0;
        ((ml) this).field_b[1] = 65535;
    }
}
