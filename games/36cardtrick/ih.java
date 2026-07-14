/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    private int[] field_f;
    private int field_d;
    private int field_e;
    private int field_h;
    int field_c;
    private int field_a;
    private int[] field_g;
    private int field_j;
    int field_b;
    int field_k;
    private int field_i;

    final void a(pb param0) {
        int var2 = 0;
        ((ih) this).field_d = param0.f(-127);
        ((ih) this).field_g = new int[((ih) this).field_d];
        ((ih) this).field_f = new int[((ih) this).field_d];
        for (var2 = 0; var2 < ((ih) this).field_d; var2++) {
            ((ih) this).field_g[var2] = param0.d((byte) 72);
            ((ih) this).field_f[var2] = param0.d((byte) 72);
        }
    }

    final void b(pb param0) {
        ((ih) this).field_k = param0.f(-112);
        ((ih) this).field_c = param0.e((byte) 127);
        ((ih) this).field_b = param0.e((byte) 125);
        ((ih) this).a(param0);
    }

    final int a(int param0) {
        if (((ih) this).field_a >= ((ih) this).field_i) {
            ((ih) this).field_j = ((ih) this).field_j + 1;
            ((ih) this).field_h = ((ih) this).field_f[((ih) this).field_j] << 15;
            if (((ih) this).field_j >= ((ih) this).field_d) {
                ((ih) this).field_j = ((ih) this).field_d - 1;
            }
            ((ih) this).field_i = (int)((double)((ih) this).field_g[((ih) this).field_j] / 65536.0 * (double)param0);
            if (((ih) this).field_i > ((ih) this).field_a) {
                ((ih) this).field_e = ((((ih) this).field_f[((ih) this).field_j] << 15) - ((ih) this).field_h) / (((ih) this).field_i - ((ih) this).field_a);
            }
        }
        ((ih) this).field_h = ((ih) this).field_h + ((ih) this).field_e;
        ((ih) this).field_a = ((ih) this).field_a + 1;
        return ((ih) this).field_h - ((ih) this).field_e >> 15;
    }

    final void a() {
        ((ih) this).field_i = 0;
        ((ih) this).field_j = 0;
        ((ih) this).field_e = 0;
        ((ih) this).field_h = 0;
        ((ih) this).field_a = 0;
    }

    ih() {
        ((ih) this).field_d = 2;
        ((ih) this).field_g = new int[2];
        ((ih) this).field_f = new int[2];
        ((ih) this).field_g[0] = 0;
        ((ih) this).field_g[1] = 65535;
        ((ih) this).field_f[0] = 0;
        ((ih) this).field_f[1] = 65535;
    }
}
