/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    int field_g;
    private int field_h;
    private int[] field_c;
    private int field_b;
    private int field_k;
    private int field_a;
    private int field_d;
    int field_e;
    private int field_f;
    int field_j;
    private int[] field_i;

    final void a() {
        ((uc) this).field_h = 0;
        ((uc) this).field_a = 0;
        ((uc) this).field_f = 0;
        ((uc) this).field_d = 0;
        ((uc) this).field_b = 0;
    }

    final void a(qc param0) {
        ((uc) this).field_e = param0.c((byte) 34);
        ((uc) this).field_j = param0.a((byte) -82);
        ((uc) this).field_g = param0.a((byte) -52);
        ((uc) this).b(param0);
    }

    final void b(qc param0) {
        int var2 = 0;
        ((uc) this).field_k = param0.c((byte) 34);
        ((uc) this).field_c = new int[((uc) this).field_k];
        ((uc) this).field_i = new int[((uc) this).field_k];
        for (var2 = 0; var2 < ((uc) this).field_k; var2++) {
            ((uc) this).field_c[var2] = param0.b(true);
            ((uc) this).field_i[var2] = param0.b(true);
        }
    }

    final int a(int param0) {
        if (((uc) this).field_b >= ((uc) this).field_h) {
            int fieldTemp$0 = ((uc) this).field_a;
            ((uc) this).field_a = ((uc) this).field_a + 1;
            ((uc) this).field_d = ((uc) this).field_i[fieldTemp$0] << 15;
            if (((uc) this).field_a >= ((uc) this).field_k) {
                ((uc) this).field_a = ((uc) this).field_k - 1;
            }
            ((uc) this).field_h = (int)((double)((uc) this).field_c[((uc) this).field_a] / 65536.0 * (double)param0);
            if (((uc) this).field_h > ((uc) this).field_b) {
                ((uc) this).field_f = ((((uc) this).field_i[((uc) this).field_a] << 15) - ((uc) this).field_d) / (((uc) this).field_h - ((uc) this).field_b);
            }
        }
        ((uc) this).field_d = ((uc) this).field_d + ((uc) this).field_f;
        ((uc) this).field_b = ((uc) this).field_b + 1;
        return ((uc) this).field_d - ((uc) this).field_f >> 15;
    }

    uc() {
        ((uc) this).field_k = 2;
        ((uc) this).field_c = new int[2];
        ((uc) this).field_i = new int[2];
        ((uc) this).field_c[0] = 0;
        ((uc) this).field_c[1] = 65535;
        ((uc) this).field_i[0] = 0;
        ((uc) this).field_i[1] = 65535;
    }
}
