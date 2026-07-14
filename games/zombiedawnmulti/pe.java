/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    int field_h;
    private int[] field_c;
    private int field_i;
    private int field_j;
    int field_g;
    private int[] field_a;
    private int field_f;
    private int field_d;
    private int field_b;
    int field_e;
    private int field_k;

    final void b(k param0) {
        ((pe) this).field_e = param0.g(31365);
        ((pe) this).field_h = param0.i(-1478490344);
        ((pe) this).field_g = param0.i(-1478490344);
        ((pe) this).a(param0);
    }

    final int a(int param0) {
        if (((pe) this).field_f >= ((pe) this).field_j) {
            ((pe) this).field_d = ((pe) this).field_d + 1;
            ((pe) this).field_i = ((pe) this).field_c[((pe) this).field_d] << 15;
            if (((pe) this).field_d >= ((pe) this).field_b) {
                ((pe) this).field_d = ((pe) this).field_b - 1;
            }
            ((pe) this).field_j = (int)((double)((pe) this).field_a[((pe) this).field_d] / 65536.0 * (double)param0);
            if (((pe) this).field_j > ((pe) this).field_f) {
                ((pe) this).field_k = ((((pe) this).field_c[((pe) this).field_d] << 15) - ((pe) this).field_i) / (((pe) this).field_j - ((pe) this).field_f);
            }
        }
        ((pe) this).field_i = ((pe) this).field_i + ((pe) this).field_k;
        ((pe) this).field_f = ((pe) this).field_f + 1;
        return ((pe) this).field_i - ((pe) this).field_k >> 15;
    }

    final void a(k param0) {
        int var2 = 0;
        ((pe) this).field_b = param0.g(31365);
        ((pe) this).field_a = new int[((pe) this).field_b];
        ((pe) this).field_c = new int[((pe) this).field_b];
        for (var2 = 0; var2 < ((pe) this).field_b; var2++) {
            ((pe) this).field_a[var2] = param0.d((byte) 69);
            ((pe) this).field_c[var2] = param0.d((byte) 69);
        }
    }

    final void a() {
        ((pe) this).field_j = 0;
        ((pe) this).field_d = 0;
        ((pe) this).field_k = 0;
        ((pe) this).field_i = 0;
        ((pe) this).field_f = 0;
    }

    pe() {
        ((pe) this).field_b = 2;
        ((pe) this).field_a = new int[2];
        ((pe) this).field_c = new int[2];
        ((pe) this).field_a[0] = 0;
        ((pe) this).field_a[1] = 65535;
        ((pe) this).field_c[0] = 0;
        ((pe) this).field_c[1] = 65535;
    }
}
