/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private int[] field_d;
    int field_b;
    private int field_g;
    private int[] field_f;
    private int field_e;
    private int field_k;
    private int field_h;
    private int field_j;
    private int field_i;
    int field_c;
    int field_a;

    final void a(rb param0) {
        int var2 = 0;
        ((wh) this).field_k = param0.g(-121);
        ((wh) this).field_d = new int[((wh) this).field_k];
        ((wh) this).field_f = new int[((wh) this).field_k];
        for (var2 = 0; var2 < ((wh) this).field_k; var2++) {
            ((wh) this).field_d[var2] = param0.i((byte) 0);
            ((wh) this).field_f[var2] = param0.i((byte) 0);
        }
    }

    final void b(rb param0) {
        ((wh) this).field_c = param0.g(-122);
        ((wh) this).field_a = param0.a((byte) 116);
        ((wh) this).field_b = param0.a((byte) 120);
        ((wh) this).a(param0);
    }

    final int a(int param0) {
        if (((wh) this).field_g >= ((wh) this).field_j) {
            ((wh) this).field_e = ((wh) this).field_e + 1;
            ((wh) this).field_i = ((wh) this).field_f[((wh) this).field_e] << 15;
            if (((wh) this).field_e >= ((wh) this).field_k) {
                ((wh) this).field_e = ((wh) this).field_k - 1;
            }
            ((wh) this).field_j = (int)((double)((wh) this).field_d[((wh) this).field_e] / 65536.0 * (double)param0);
            if (((wh) this).field_j > ((wh) this).field_g) {
                ((wh) this).field_h = ((((wh) this).field_f[((wh) this).field_e] << 15) - ((wh) this).field_i) / (((wh) this).field_j - ((wh) this).field_g);
            }
        }
        ((wh) this).field_i = ((wh) this).field_i + ((wh) this).field_h;
        ((wh) this).field_g = ((wh) this).field_g + 1;
        return ((wh) this).field_i - ((wh) this).field_h >> 15;
    }

    final void a() {
        ((wh) this).field_j = 0;
        ((wh) this).field_e = 0;
        ((wh) this).field_h = 0;
        ((wh) this).field_i = 0;
        ((wh) this).field_g = 0;
    }

    wh() {
        ((wh) this).field_k = 2;
        ((wh) this).field_d = new int[2];
        ((wh) this).field_f = new int[2];
        ((wh) this).field_d[0] = 0;
        ((wh) this).field_d[1] = 65535;
        ((wh) this).field_f[0] = 0;
        ((wh) this).field_f[1] = 65535;
    }
}
