/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private int[] field_j;
    private int field_c;
    private int field_d;
    int field_e;
    private int field_i;
    private int field_a;
    private int[] field_f;
    private int field_k;
    int field_b;
    private int field_g;
    int field_h;

    final void a(od param0) {
        int var2 = 0;
        ((lj) this).field_k = param0.l(31760);
        ((lj) this).field_j = new int[((lj) this).field_k];
        ((lj) this).field_f = new int[((lj) this).field_k];
        for (var2 = 0; var2 < ((lj) this).field_k; var2++) {
            ((lj) this).field_j[var2] = param0.j(-788751192);
            ((lj) this).field_f[var2] = param0.j(-788751192);
        }
    }

    final void b(od param0) {
        ((lj) this).field_e = param0.l(31760);
        ((lj) this).field_b = param0.h(-114);
        ((lj) this).field_h = param0.h(-122);
        ((lj) this).a(param0);
    }

    final int a(int param0) {
        if (((lj) this).field_g >= ((lj) this).field_c) {
            int fieldTemp$0 = ((lj) this).field_a;
            ((lj) this).field_a = ((lj) this).field_a + 1;
            ((lj) this).field_d = ((lj) this).field_f[fieldTemp$0] << 15;
            if (((lj) this).field_a >= ((lj) this).field_k) {
                ((lj) this).field_a = ((lj) this).field_k - 1;
            }
            ((lj) this).field_c = (int)((double)((lj) this).field_j[((lj) this).field_a] / 65536.0 * (double)param0);
            if (((lj) this).field_c > ((lj) this).field_g) {
                ((lj) this).field_i = ((((lj) this).field_f[((lj) this).field_a] << 15) - ((lj) this).field_d) / (((lj) this).field_c - ((lj) this).field_g);
            }
        }
        ((lj) this).field_d = ((lj) this).field_d + ((lj) this).field_i;
        ((lj) this).field_g = ((lj) this).field_g + 1;
        return ((lj) this).field_d - ((lj) this).field_i >> 15;
    }

    lj() {
        ((lj) this).field_k = 2;
        ((lj) this).field_j = new int[2];
        ((lj) this).field_f = new int[2];
        ((lj) this).field_j[0] = 0;
        ((lj) this).field_j[1] = 65535;
        ((lj) this).field_f[0] = 0;
        ((lj) this).field_f[1] = 65535;
    }

    final void a() {
        ((lj) this).field_c = 0;
        ((lj) this).field_a = 0;
        ((lj) this).field_i = 0;
        ((lj) this).field_d = 0;
        ((lj) this).field_g = 0;
    }
}
