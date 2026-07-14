/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    private int field_f;
    private int field_h;
    private int field_c;
    int field_e;
    private int[] field_d;
    int field_a;
    private int field_k;
    private int[] field_g;
    private int field_j;
    int field_i;
    private int field_b;

    final void a(uia param0) {
        int var2 = 0;
        ((co) this).field_f = param0.h(255);
        ((co) this).field_d = new int[((co) this).field_f];
        ((co) this).field_g = new int[((co) this).field_f];
        for (var2 = 0; var2 < ((co) this).field_f; var2++) {
            ((co) this).field_d[var2] = param0.d(122);
            ((co) this).field_g[var2] = param0.d(124);
        }
    }

    final void b(uia param0) {
        ((co) this).field_a = param0.h(255);
        ((co) this).field_e = param0.e(119);
        ((co) this).field_i = param0.e(110);
        ((co) this).a(param0);
    }

    final void a() {
        ((co) this).field_h = 0;
        ((co) this).field_c = 0;
        ((co) this).field_b = 0;
        ((co) this).field_k = 0;
        ((co) this).field_j = 0;
    }

    final int a(int param0) {
        if (((co) this).field_j >= ((co) this).field_h) {
            ((co) this).field_c = ((co) this).field_c + 1;
            ((co) this).field_k = ((co) this).field_g[((co) this).field_c] << 15;
            if (((co) this).field_c >= ((co) this).field_f) {
                ((co) this).field_c = ((co) this).field_f - 1;
            }
            ((co) this).field_h = (int)((double)((co) this).field_d[((co) this).field_c] / 65536.0 * (double)param0);
            if (((co) this).field_h > ((co) this).field_j) {
                ((co) this).field_b = ((((co) this).field_g[((co) this).field_c] << 15) - ((co) this).field_k) / (((co) this).field_h - ((co) this).field_j);
            }
        }
        ((co) this).field_k = ((co) this).field_k + ((co) this).field_b;
        ((co) this).field_j = ((co) this).field_j + 1;
        return ((co) this).field_k - ((co) this).field_b >> 15;
    }

    co() {
        ((co) this).field_f = 2;
        ((co) this).field_d = new int[2];
        ((co) this).field_g = new int[2];
        ((co) this).field_d[0] = 0;
        ((co) this).field_d[1] = 65535;
        ((co) this).field_g[0] = 0;
        ((co) this).field_g[1] = 65535;
    }
}
