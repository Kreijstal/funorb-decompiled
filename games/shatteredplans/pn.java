/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    int field_d;
    private int field_g;
    private int field_e;
    private int[] field_c;
    int field_i;
    private int field_b;
    private int field_j;
    int field_f;
    private int[] field_k;
    private int field_a;
    private int field_h;

    final void a(ob param0) {
        int var2 = 0;
        ((pn) this).field_a = param0.j(-126);
        ((pn) this).field_k = new int[((pn) this).field_a];
        ((pn) this).field_c = new int[((pn) this).field_a];
        for (var2 = 0; var2 < ((pn) this).field_a; var2++) {
            ((pn) this).field_k[var2] = param0.f(-20976);
            ((pn) this).field_c[var2] = param0.f(-20976);
        }
    }

    final int a(int param0) {
        if (((pn) this).field_g >= ((pn) this).field_e) {
            int fieldTemp$0 = ((pn) this).field_h;
            ((pn) this).field_h = ((pn) this).field_h + 1;
            ((pn) this).field_j = ((pn) this).field_c[fieldTemp$0] << 15;
            if (((pn) this).field_h >= ((pn) this).field_a) {
                ((pn) this).field_h = ((pn) this).field_a - 1;
            }
            ((pn) this).field_e = (int)((double)((pn) this).field_k[((pn) this).field_h] / 65536.0 * (double)param0);
            if (((pn) this).field_e > ((pn) this).field_g) {
                ((pn) this).field_b = ((((pn) this).field_c[((pn) this).field_h] << 15) - ((pn) this).field_j) / (((pn) this).field_e - ((pn) this).field_g);
            }
        }
        ((pn) this).field_j = ((pn) this).field_j + ((pn) this).field_b;
        ((pn) this).field_g = ((pn) this).field_g + 1;
        return ((pn) this).field_j - ((pn) this).field_b >> 15;
    }

    pn() {
        ((pn) this).field_a = 2;
        ((pn) this).field_k = new int[2];
        ((pn) this).field_c = new int[2];
        ((pn) this).field_k[0] = 0;
        ((pn) this).field_k[1] = 65535;
        ((pn) this).field_c[0] = 0;
        ((pn) this).field_c[1] = 65535;
    }

    final void a() {
        ((pn) this).field_e = 0;
        ((pn) this).field_h = 0;
        ((pn) this).field_b = 0;
        ((pn) this).field_j = 0;
        ((pn) this).field_g = 0;
    }

    final void b(ob param0) {
        ((pn) this).field_f = param0.j(-121);
        ((pn) this).field_d = param0.a(16711680);
        ((pn) this).field_i = param0.a(16711680);
        ((pn) this).a(param0);
    }
}
