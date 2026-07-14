/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    private int[] field_d;
    private int field_k;
    private int field_j;
    int field_i;
    private int field_e;
    int field_b;
    private int field_c;
    private int field_h;
    private int field_g;
    private int[] field_a;
    int field_f;

    final void a(vi param0) {
        ((ma) this).field_b = param0.l(32270);
        ((ma) this).field_i = param0.d(8195);
        ((ma) this).field_f = param0.d(8195);
        ((ma) this).b(param0);
    }

    final void b(vi param0) {
        int var2 = 0;
        ((ma) this).field_k = param0.l(32270);
        ((ma) this).field_d = new int[((ma) this).field_k];
        ((ma) this).field_a = new int[((ma) this).field_k];
        for (var2 = 0; var2 < ((ma) this).field_k; var2++) {
            ((ma) this).field_d[var2] = param0.e(8);
            ((ma) this).field_a[var2] = param0.e(8);
        }
    }

    final void a() {
        ((ma) this).field_g = 0;
        ((ma) this).field_j = 0;
        ((ma) this).field_c = 0;
        ((ma) this).field_h = 0;
        ((ma) this).field_e = 0;
    }

    final int a(int param0) {
        if (((ma) this).field_e >= ((ma) this).field_g) {
            ((ma) this).field_j = ((ma) this).field_j + 1;
            ((ma) this).field_h = ((ma) this).field_a[((ma) this).field_j] << 15;
            if (((ma) this).field_j >= ((ma) this).field_k) {
                ((ma) this).field_j = ((ma) this).field_k - 1;
            }
            ((ma) this).field_g = (int)((double)((ma) this).field_d[((ma) this).field_j] / 65536.0 * (double)param0);
            if (((ma) this).field_g > ((ma) this).field_e) {
                ((ma) this).field_c = ((((ma) this).field_a[((ma) this).field_j] << 15) - ((ma) this).field_h) / (((ma) this).field_g - ((ma) this).field_e);
            }
        }
        ((ma) this).field_h = ((ma) this).field_h + ((ma) this).field_c;
        ((ma) this).field_e = ((ma) this).field_e + 1;
        return ((ma) this).field_h - ((ma) this).field_c >> 15;
    }

    ma() {
        ((ma) this).field_k = 2;
        ((ma) this).field_d = new int[2];
        ((ma) this).field_a = new int[2];
        ((ma) this).field_d[0] = 0;
        ((ma) this).field_d[1] = 65535;
        ((ma) this).field_a[0] = 0;
        ((ma) this).field_a[1] = 65535;
    }
}
