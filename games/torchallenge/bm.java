/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private int field_g;
    private int field_a;
    int field_e;
    private int[] field_d;
    int field_i;
    private int field_k;
    private int field_f;
    private int field_c;
    int field_h;
    private int field_b;
    private int[] field_j;

    final void a(uf param0) {
        ((bm) this).field_h = param0.j(-122);
        ((bm) this).field_e = param0.i(50);
        ((bm) this).field_i = param0.i(37);
        ((bm) this).b(param0);
    }

    final int a(int param0) {
        if (((bm) this).field_c >= ((bm) this).field_b) {
            int fieldTemp$0 = ((bm) this).field_k;
            ((bm) this).field_k = ((bm) this).field_k + 1;
            ((bm) this).field_a = ((bm) this).field_d[fieldTemp$0] << 15;
            if (((bm) this).field_k >= ((bm) this).field_g) {
                ((bm) this).field_k = ((bm) this).field_g - 1;
            }
            ((bm) this).field_b = (int)((double)((bm) this).field_j[((bm) this).field_k] / 65536.0 * (double)param0);
            if (((bm) this).field_b > ((bm) this).field_c) {
                ((bm) this).field_f = ((((bm) this).field_d[((bm) this).field_k] << 15) - ((bm) this).field_a) / (((bm) this).field_b - ((bm) this).field_c);
            }
        }
        ((bm) this).field_a = ((bm) this).field_a + ((bm) this).field_f;
        ((bm) this).field_c = ((bm) this).field_c + 1;
        return ((bm) this).field_a - ((bm) this).field_f >> 15;
    }

    final void a() {
        ((bm) this).field_b = 0;
        ((bm) this).field_k = 0;
        ((bm) this).field_f = 0;
        ((bm) this).field_a = 0;
        ((bm) this).field_c = 0;
    }

    final void b(uf param0) {
        int var2 = 0;
        ((bm) this).field_g = param0.j(-122);
        ((bm) this).field_j = new int[((bm) this).field_g];
        ((bm) this).field_d = new int[((bm) this).field_g];
        for (var2 = 0; var2 < ((bm) this).field_g; var2++) {
            ((bm) this).field_j[var2] = param0.c(false);
            ((bm) this).field_d[var2] = param0.c(false);
        }
    }

    bm() {
        ((bm) this).field_g = 2;
        ((bm) this).field_j = new int[2];
        ((bm) this).field_d = new int[2];
        ((bm) this).field_j[0] = 0;
        ((bm) this).field_j[1] = 65535;
        ((bm) this).field_d[0] = 0;
        ((bm) this).field_d[1] = 65535;
    }
}
