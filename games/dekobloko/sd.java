/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    private int field_b;
    private int[] field_d;
    private int[] field_c;
    private int field_k;
    private int field_f;
    private int field_j;
    int field_e;
    private int field_g;
    int field_a;
    private int field_h;
    int field_i;

    final int a(int param0) {
        if (((sd) this).field_k >= ((sd) this).field_b) {
            ((sd) this).field_g = ((sd) this).field_g + 1;
            ((sd) this).field_j = ((sd) this).field_c[((sd) this).field_g] << 15;
            if (((sd) this).field_g >= ((sd) this).field_f) {
                ((sd) this).field_g = ((sd) this).field_f - 1;
            }
            ((sd) this).field_b = (int)((double)((sd) this).field_d[((sd) this).field_g] / 65536.0 * (double)param0);
            if (((sd) this).field_b > ((sd) this).field_k) {
                ((sd) this).field_h = ((((sd) this).field_c[((sd) this).field_g] << 15) - ((sd) this).field_j) / (((sd) this).field_b - ((sd) this).field_k);
            }
        }
        ((sd) this).field_j = ((sd) this).field_j + ((sd) this).field_h;
        ((sd) this).field_k = ((sd) this).field_k + 1;
        return ((sd) this).field_j - ((sd) this).field_h >> 15;
    }

    final void a() {
        ((sd) this).field_b = 0;
        ((sd) this).field_g = 0;
        ((sd) this).field_h = 0;
        ((sd) this).field_j = 0;
        ((sd) this).field_k = 0;
    }

    final void b(wl param0) {
        ((sd) this).field_a = param0.d((byte) -28);
        ((sd) this).field_e = param0.i(7553);
        ((sd) this).field_i = param0.i(7553);
        ((sd) this).a(param0);
    }

    final void a(wl param0) {
        int var2 = 0;
        ((sd) this).field_f = param0.d((byte) -69);
        ((sd) this).field_d = new int[((sd) this).field_f];
        ((sd) this).field_c = new int[((sd) this).field_f];
        for (var2 = 0; var2 < ((sd) this).field_f; var2++) {
            ((sd) this).field_d[var2] = param0.e(3);
            ((sd) this).field_c[var2] = param0.e(3);
        }
    }

    sd() {
        ((sd) this).field_f = 2;
        ((sd) this).field_d = new int[2];
        ((sd) this).field_c = new int[2];
        ((sd) this).field_d[0] = 0;
        ((sd) this).field_d[1] = 65535;
        ((sd) this).field_c[0] = 0;
        ((sd) this).field_c[1] = 65535;
    }
}
