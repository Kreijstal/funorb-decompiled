/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int field_b;
    private int[] field_h;
    private int field_c;
    int field_g;
    private int field_i;
    private int field_e;
    private int field_d;
    private int[] field_k;
    private int field_j;
    int field_f;
    private int field_a;

    final void b(dh param0) {
        int var2 = 0;
        ((fj) this).field_j = param0.a(-16384);
        ((fj) this).field_h = new int[((fj) this).field_j];
        ((fj) this).field_k = new int[((fj) this).field_j];
        for (var2 = 0; var2 < ((fj) this).field_j; var2++) {
            ((fj) this).field_h[var2] = param0.i(-25578);
            ((fj) this).field_k[var2] = param0.i(-25578);
        }
    }

    final int a(int param0) {
        if (((fj) this).field_e >= ((fj) this).field_d) {
            int fieldTemp$0 = ((fj) this).field_c;
            ((fj) this).field_c = ((fj) this).field_c + 1;
            ((fj) this).field_a = ((fj) this).field_k[fieldTemp$0] << 15;
            if (((fj) this).field_c >= ((fj) this).field_j) {
                ((fj) this).field_c = ((fj) this).field_j - 1;
            }
            ((fj) this).field_d = (int)((double)((fj) this).field_h[((fj) this).field_c] / 65536.0 * (double)param0);
            if (((fj) this).field_d > ((fj) this).field_e) {
                ((fj) this).field_i = ((((fj) this).field_k[((fj) this).field_c] << 15) - ((fj) this).field_a) / (((fj) this).field_d - ((fj) this).field_e);
            }
        }
        ((fj) this).field_a = ((fj) this).field_a + ((fj) this).field_i;
        ((fj) this).field_e = ((fj) this).field_e + 1;
        return ((fj) this).field_a - ((fj) this).field_i >> 15;
    }

    final void a(dh param0) {
        ((fj) this).field_f = param0.a(-16384);
        ((fj) this).field_g = param0.f((byte) -107);
        ((fj) this).field_b = param0.f((byte) -107);
        ((fj) this).b(param0);
    }

    final void a() {
        ((fj) this).field_d = 0;
        ((fj) this).field_c = 0;
        ((fj) this).field_i = 0;
        ((fj) this).field_a = 0;
        ((fj) this).field_e = 0;
    }

    fj() {
        ((fj) this).field_j = 2;
        ((fj) this).field_h = new int[2];
        ((fj) this).field_k = new int[2];
        ((fj) this).field_h[0] = 0;
        ((fj) this).field_h[1] = 65535;
        ((fj) this).field_k[0] = 0;
        ((fj) this).field_k[1] = 65535;
    }
}
