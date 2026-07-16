/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    private int[] field_j;
    private int field_i;
    int field_a;
    private int field_f;
    private int field_d;
    private int[] field_e;
    private int field_h;
    private int field_b;
    int field_c;
    int field_g;
    private int field_k;

    final void a() {
        ((bk) this).field_k = 0;
        ((bk) this).field_h = 0;
        ((bk) this).field_b = 0;
        ((bk) this).field_d = 0;
        ((bk) this).field_f = 0;
    }

    final void a(we param0) {
        ((bk) this).field_a = param0.f(255);
        ((bk) this).field_c = param0.k(0);
        ((bk) this).field_g = param0.k(0);
        ((bk) this).b(param0);
    }

    final int a(int param0) {
        if (((bk) this).field_f >= ((bk) this).field_k) {
            int fieldTemp$0 = ((bk) this).field_h;
            ((bk) this).field_h = ((bk) this).field_h + 1;
            ((bk) this).field_d = ((bk) this).field_j[fieldTemp$0] << 15;
            if (((bk) this).field_h >= ((bk) this).field_i) {
                ((bk) this).field_h = ((bk) this).field_i - 1;
            }
            ((bk) this).field_k = (int)((double)((bk) this).field_e[((bk) this).field_h] / 65536.0 * (double)param0);
            if (((bk) this).field_k > ((bk) this).field_f) {
                ((bk) this).field_b = ((((bk) this).field_j[((bk) this).field_h] << 15) - ((bk) this).field_d) / (((bk) this).field_k - ((bk) this).field_f);
            }
        }
        ((bk) this).field_d = ((bk) this).field_d + ((bk) this).field_b;
        ((bk) this).field_f = ((bk) this).field_f + 1;
        return ((bk) this).field_d - ((bk) this).field_b >> 15;
    }

    final void b(we param0) {
        int var2 = 0;
        ((bk) this).field_i = param0.f(255);
        ((bk) this).field_e = new int[((bk) this).field_i];
        ((bk) this).field_j = new int[((bk) this).field_i];
        for (var2 = 0; var2 < ((bk) this).field_i; var2++) {
            ((bk) this).field_e[var2] = param0.a((byte) -120);
            ((bk) this).field_j[var2] = param0.a((byte) -125);
        }
    }

    bk() {
        ((bk) this).field_i = 2;
        ((bk) this).field_e = new int[2];
        ((bk) this).field_j = new int[2];
        ((bk) this).field_e[0] = 0;
        ((bk) this).field_e[1] = 65535;
        ((bk) this).field_j[0] = 0;
        ((bk) this).field_j[1] = 65535;
    }
}
