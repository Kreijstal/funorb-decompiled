/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    private int[] field_j;
    private int field_e;
    private int field_d;
    int field_k;
    int field_g;
    private int field_c;
    private int field_a;
    private int field_h;
    int field_b;
    private int[] field_i;
    private int field_f;

    final void b(lu param0) {
        ((kd) this).field_k = param0.b(16711935);
        ((kd) this).field_b = param0.f(125);
        ((kd) this).field_g = param0.f(50);
        ((kd) this).a(param0);
    }

    final int a(int param0) {
        if (((kd) this).field_h >= ((kd) this).field_e) {
            ((kd) this).field_f = ((kd) this).field_f + 1;
            ((kd) this).field_a = ((kd) this).field_j[((kd) this).field_f] << 15;
            if (((kd) this).field_f >= ((kd) this).field_c) {
                ((kd) this).field_f = ((kd) this).field_c - 1;
            }
            ((kd) this).field_e = (int)((double)((kd) this).field_i[((kd) this).field_f] / 65536.0 * (double)param0);
            if (((kd) this).field_e > ((kd) this).field_h) {
                ((kd) this).field_d = ((((kd) this).field_j[((kd) this).field_f] << 15) - ((kd) this).field_a) / (((kd) this).field_e - ((kd) this).field_h);
            }
        }
        ((kd) this).field_a = ((kd) this).field_a + ((kd) this).field_d;
        ((kd) this).field_h = ((kd) this).field_h + 1;
        return ((kd) this).field_a - ((kd) this).field_d >> 15;
    }

    final void a(lu param0) {
        int var2 = 0;
        ((kd) this).field_c = param0.b(16711935);
        ((kd) this).field_i = new int[((kd) this).field_c];
        ((kd) this).field_j = new int[((kd) this).field_c];
        for (var2 = 0; var2 < ((kd) this).field_c; var2++) {
            ((kd) this).field_i[var2] = param0.e((byte) 126);
            ((kd) this).field_j[var2] = param0.e((byte) 120);
        }
    }

    final void a() {
        ((kd) this).field_e = 0;
        ((kd) this).field_f = 0;
        ((kd) this).field_d = 0;
        ((kd) this).field_a = 0;
        ((kd) this).field_h = 0;
    }

    kd() {
        ((kd) this).field_c = 2;
        ((kd) this).field_i = new int[2];
        ((kd) this).field_j = new int[2];
        ((kd) this).field_i[0] = 0;
        ((kd) this).field_i[1] = 65535;
        ((kd) this).field_j[0] = 0;
        ((kd) this).field_j[1] = 65535;
    }
}
