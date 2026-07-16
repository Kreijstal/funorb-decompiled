/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    private int field_a;
    int field_h;
    int field_i;
    private int[] field_j;
    private int field_f;
    private int field_c;
    private int field_e;
    private int field_k;
    private int[] field_b;
    int field_d;
    private int field_g;

    final int a(int param0) {
        if (((qg) this).field_k >= ((qg) this).field_g) {
            int fieldTemp$0 = ((qg) this).field_f;
            ((qg) this).field_f = ((qg) this).field_f + 1;
            ((qg) this).field_a = ((qg) this).field_b[fieldTemp$0] << 15;
            if (((qg) this).field_f >= ((qg) this).field_e) {
                ((qg) this).field_f = ((qg) this).field_e - 1;
            }
            ((qg) this).field_g = (int)((double)((qg) this).field_j[((qg) this).field_f] / 65536.0 * (double)param0);
            if (((qg) this).field_g > ((qg) this).field_k) {
                ((qg) this).field_c = ((((qg) this).field_b[((qg) this).field_f] << 15) - ((qg) this).field_a) / (((qg) this).field_g - ((qg) this).field_k);
            }
        }
        ((qg) this).field_a = ((qg) this).field_a + ((qg) this).field_c;
        ((qg) this).field_k = ((qg) this).field_k + 1;
        return ((qg) this).field_a - ((qg) this).field_c >> 15;
    }

    final void a() {
        ((qg) this).field_g = 0;
        ((qg) this).field_f = 0;
        ((qg) this).field_c = 0;
        ((qg) this).field_a = 0;
        ((qg) this).field_k = 0;
    }

    final void a(ka param0) {
        int var2 = 0;
        ((qg) this).field_e = param0.f(4);
        ((qg) this).field_j = new int[((qg) this).field_e];
        ((qg) this).field_b = new int[((qg) this).field_e];
        for (var2 = 0; var2 < ((qg) this).field_e; var2++) {
            ((qg) this).field_j[var2] = param0.c((byte) 113);
            ((qg) this).field_b[var2] = param0.c((byte) 115);
        }
    }

    final void b(ka param0) {
        ((qg) this).field_h = param0.f(4);
        ((qg) this).field_d = param0.b(false);
        ((qg) this).field_i = param0.b(false);
        ((qg) this).a(param0);
    }

    qg() {
        ((qg) this).field_e = 2;
        ((qg) this).field_j = new int[2];
        ((qg) this).field_b = new int[2];
        ((qg) this).field_j[0] = 0;
        ((qg) this).field_j[1] = 65535;
        ((qg) this).field_b[0] = 0;
        ((qg) this).field_b[1] = 65535;
    }
}
