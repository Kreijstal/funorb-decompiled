/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    private int field_i;
    private int field_g;
    int field_j;
    int field_d;
    private int field_e;
    private int[] field_c;
    private int field_b;
    private int field_k;
    private int field_a;
    int field_f;
    private int[] field_h;

    final void a() {
        ((dg) this).field_k = 0;
        ((dg) this).field_i = 0;
        ((dg) this).field_e = 0;
        ((dg) this).field_b = 0;
        ((dg) this).field_g = 0;
    }

    final int a(int param0) {
        if (((dg) this).field_g >= ((dg) this).field_k) {
            int fieldTemp$0 = ((dg) this).field_i;
            ((dg) this).field_i = ((dg) this).field_i + 1;
            ((dg) this).field_b = ((dg) this).field_h[fieldTemp$0] << 15;
            if (((dg) this).field_i >= ((dg) this).field_a) {
                ((dg) this).field_i = ((dg) this).field_a - 1;
            }
            ((dg) this).field_k = (int)((double)((dg) this).field_c[((dg) this).field_i] / 65536.0 * (double)param0);
            if (((dg) this).field_k > ((dg) this).field_g) {
                ((dg) this).field_e = ((((dg) this).field_h[((dg) this).field_i] << 15) - ((dg) this).field_b) / (((dg) this).field_k - ((dg) this).field_g);
            }
        }
        ((dg) this).field_b = ((dg) this).field_b + ((dg) this).field_e;
        ((dg) this).field_g = ((dg) this).field_g + 1;
        return ((dg) this).field_b - ((dg) this).field_e >> 15;
    }

    final void a(gk param0) {
        int var2 = 0;
        ((dg) this).field_a = param0.a((byte) 114);
        ((dg) this).field_c = new int[((dg) this).field_a];
        ((dg) this).field_h = new int[((dg) this).field_a];
        for (var2 = 0; var2 < ((dg) this).field_a; var2++) {
            ((dg) this).field_c[var2] = param0.j(17277);
            ((dg) this).field_h[var2] = param0.j(17277);
        }
    }

    final void b(gk param0) {
        ((dg) this).field_f = param0.a((byte) 114);
        ((dg) this).field_j = param0.e(4);
        ((dg) this).field_d = param0.e(127);
        ((dg) this).a(param0);
    }

    dg() {
        ((dg) this).field_a = 2;
        ((dg) this).field_c = new int[2];
        ((dg) this).field_h = new int[2];
        ((dg) this).field_c[0] = 0;
        ((dg) this).field_c[1] = 65535;
        ((dg) this).field_h[0] = 0;
        ((dg) this).field_h[1] = 65535;
    }
}
