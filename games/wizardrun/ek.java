/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    int field_k;
    private int field_c;
    private int field_g;
    private int field_i;
    private int field_a;
    private int[] field_e;
    private int field_h;
    int field_f;
    private int field_d;
    int field_b;
    private int[] field_j;

    final void a() {
        ((ek) this).field_g = 0;
        ((ek) this).field_i = 0;
        ((ek) this).field_c = 0;
        ((ek) this).field_a = 0;
        ((ek) this).field_h = 0;
    }

    final void b(va param0) {
        ((ek) this).field_f = param0.f(255);
        ((ek) this).field_b = param0.i(255);
        ((ek) this).field_k = param0.i(255);
        ((ek) this).a(param0);
    }

    final void a(va param0) {
        int var2 = 0;
        ((ek) this).field_d = param0.f(255);
        ((ek) this).field_j = new int[((ek) this).field_d];
        ((ek) this).field_e = new int[((ek) this).field_d];
        for (var2 = 0; var2 < ((ek) this).field_d; var2++) {
            ((ek) this).field_j[var2] = param0.j(-14477);
            ((ek) this).field_e[var2] = param0.j(-14477);
        }
    }

    final int a(int param0) {
        if (((ek) this).field_h >= ((ek) this).field_g) {
            ((ek) this).field_i = ((ek) this).field_i + 1;
            ((ek) this).field_a = ((ek) this).field_e[((ek) this).field_i] << 15;
            if (((ek) this).field_i >= ((ek) this).field_d) {
                ((ek) this).field_i = ((ek) this).field_d - 1;
            }
            ((ek) this).field_g = (int)((double)((ek) this).field_j[((ek) this).field_i] / 65536.0 * (double)param0);
            if (((ek) this).field_g > ((ek) this).field_h) {
                ((ek) this).field_c = ((((ek) this).field_e[((ek) this).field_i] << 15) - ((ek) this).field_a) / (((ek) this).field_g - ((ek) this).field_h);
            }
        }
        ((ek) this).field_a = ((ek) this).field_a + ((ek) this).field_c;
        ((ek) this).field_h = ((ek) this).field_h + 1;
        return ((ek) this).field_a - ((ek) this).field_c >> 15;
    }

    ek() {
        ((ek) this).field_d = 2;
        ((ek) this).field_j = new int[2];
        ((ek) this).field_e = new int[2];
        ((ek) this).field_j[0] = 0;
        ((ek) this).field_j[1] = 65535;
        ((ek) this).field_e[0] = 0;
        ((ek) this).field_e[1] = 65535;
    }
}
