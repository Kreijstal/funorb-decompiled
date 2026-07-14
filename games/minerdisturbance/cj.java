/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    private int field_i;
    int field_b;
    private int[] field_c;
    int field_e;
    private int field_h;
    private int field_a;
    private int field_k;
    int field_f;
    private int field_j;
    private int field_g;
    private int[] field_d;

    final void a(sb param0) {
        int var2 = 0;
        ((cj) this).field_a = param0.d((byte) -54);
        ((cj) this).field_c = new int[((cj) this).field_a];
        ((cj) this).field_d = new int[((cj) this).field_a];
        for (var2 = 0; var2 < ((cj) this).field_a; var2++) {
            ((cj) this).field_c[var2] = param0.e(-12);
            ((cj) this).field_d[var2] = param0.e(-23);
        }
    }

    final void a() {
        ((cj) this).field_i = 0;
        ((cj) this).field_j = 0;
        ((cj) this).field_k = 0;
        ((cj) this).field_g = 0;
        ((cj) this).field_h = 0;
    }

    final int a(int param0) {
        if (((cj) this).field_h >= ((cj) this).field_i) {
            ((cj) this).field_j = ((cj) this).field_j + 1;
            ((cj) this).field_g = ((cj) this).field_d[((cj) this).field_j] << 15;
            if (((cj) this).field_j >= ((cj) this).field_a) {
                ((cj) this).field_j = ((cj) this).field_a - 1;
            }
            ((cj) this).field_i = (int)((double)((cj) this).field_c[((cj) this).field_j] / 65536.0 * (double)param0);
            if (((cj) this).field_i > ((cj) this).field_h) {
                ((cj) this).field_k = ((((cj) this).field_d[((cj) this).field_j] << 15) - ((cj) this).field_g) / (((cj) this).field_i - ((cj) this).field_h);
            }
        }
        ((cj) this).field_g = ((cj) this).field_g + ((cj) this).field_k;
        ((cj) this).field_h = ((cj) this).field_h + 1;
        return ((cj) this).field_g - ((cj) this).field_k >> 15;
    }

    final void b(sb param0) {
        ((cj) this).field_e = param0.d((byte) -54);
        ((cj) this).field_f = param0.b((byte) 57);
        ((cj) this).field_b = param0.b((byte) 70);
        ((cj) this).a(param0);
    }

    cj() {
        ((cj) this).field_a = 2;
        ((cj) this).field_c = new int[2];
        ((cj) this).field_d = new int[2];
        ((cj) this).field_c[0] = 0;
        ((cj) this).field_c[1] = 65535;
        ((cj) this).field_d[0] = 0;
        ((cj) this).field_d[1] = 65535;
    }
}
