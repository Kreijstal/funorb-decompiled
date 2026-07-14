/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    int field_j;
    private int field_e;
    int field_b;
    private int[] field_d;
    private int field_f;
    private int field_a;
    private int field_h;
    int field_i;
    private int[] field_c;
    private int field_g;
    private int field_k;

    final void b(bh param0) {
        int var2 = 0;
        ((td) this).field_f = param0.d((byte) -99);
        ((td) this).field_c = new int[((td) this).field_f];
        ((td) this).field_d = new int[((td) this).field_f];
        for (var2 = 0; var2 < ((td) this).field_f; var2++) {
            ((td) this).field_c[var2] = param0.e(127);
            ((td) this).field_d[var2] = param0.e(127);
        }
    }

    final void a(bh param0) {
        ((td) this).field_b = param0.d((byte) -99);
        ((td) this).field_i = param0.f(97);
        ((td) this).field_j = param0.f(-108);
        ((td) this).b(param0);
    }

    final int a(int param0) {
        if (((td) this).field_k >= ((td) this).field_e) {
            ((td) this).field_h = ((td) this).field_h + 1;
            ((td) this).field_a = ((td) this).field_d[((td) this).field_h] << 15;
            if (((td) this).field_h >= ((td) this).field_f) {
                ((td) this).field_h = ((td) this).field_f - 1;
            }
            ((td) this).field_e = (int)((double)((td) this).field_c[((td) this).field_h] / 65536.0 * (double)param0);
            if (((td) this).field_e > ((td) this).field_k) {
                ((td) this).field_g = ((((td) this).field_d[((td) this).field_h] << 15) - ((td) this).field_a) / (((td) this).field_e - ((td) this).field_k);
            }
        }
        ((td) this).field_a = ((td) this).field_a + ((td) this).field_g;
        ((td) this).field_k = ((td) this).field_k + 1;
        return ((td) this).field_a - ((td) this).field_g >> 15;
    }

    final void a() {
        ((td) this).field_e = 0;
        ((td) this).field_h = 0;
        ((td) this).field_g = 0;
        ((td) this).field_a = 0;
        ((td) this).field_k = 0;
    }

    td() {
        ((td) this).field_f = 2;
        ((td) this).field_c = new int[2];
        ((td) this).field_d = new int[2];
        ((td) this).field_c[0] = 0;
        ((td) this).field_c[1] = 65535;
        ((td) this).field_d[0] = 0;
        ((td) this).field_d[1] = 65535;
    }
}
