/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private int[] field_i;
    private int field_k;
    private int field_g;
    private int field_a;
    int field_h;
    private int field_c;
    private int[] field_e;
    int field_d;
    private int field_f;
    private int field_j;
    int field_b;

    final void a(oa param0) {
        ((lh) this).field_d = param0.d((byte) 112);
        ((lh) this).field_h = param0.c((byte) -105);
        ((lh) this).field_b = param0.c((byte) -110);
        ((lh) this).b(param0);
    }

    final int a(int param0) {
        if (((lh) this).field_f >= ((lh) this).field_a) {
            ((lh) this).field_k = ((lh) this).field_k + 1;
            ((lh) this).field_g = ((lh) this).field_i[((lh) this).field_k] << 15;
            if (((lh) this).field_k >= ((lh) this).field_c) {
                ((lh) this).field_k = ((lh) this).field_c - 1;
            }
            ((lh) this).field_a = (int)((double)((lh) this).field_e[((lh) this).field_k] / 65536.0 * (double)param0);
            if (((lh) this).field_a > ((lh) this).field_f) {
                ((lh) this).field_j = ((((lh) this).field_i[((lh) this).field_k] << 15) - ((lh) this).field_g) / (((lh) this).field_a - ((lh) this).field_f);
            }
        }
        ((lh) this).field_g = ((lh) this).field_g + ((lh) this).field_j;
        ((lh) this).field_f = ((lh) this).field_f + 1;
        return ((lh) this).field_g - ((lh) this).field_j >> 15;
    }

    final void a() {
        ((lh) this).field_a = 0;
        ((lh) this).field_k = 0;
        ((lh) this).field_j = 0;
        ((lh) this).field_g = 0;
        ((lh) this).field_f = 0;
    }

    final void b(oa param0) {
        int var2 = 0;
        ((lh) this).field_c = param0.d((byte) 93);
        ((lh) this).field_e = new int[((lh) this).field_c];
        ((lh) this).field_i = new int[((lh) this).field_c];
        for (var2 = 0; var2 < ((lh) this).field_c; var2++) {
            ((lh) this).field_e[var2] = param0.a((byte) -110);
            ((lh) this).field_i[var2] = param0.a((byte) -91);
        }
    }

    lh() {
        ((lh) this).field_c = 2;
        ((lh) this).field_e = new int[2];
        ((lh) this).field_i = new int[2];
        ((lh) this).field_e[0] = 0;
        ((lh) this).field_e[1] = 65535;
        ((lh) this).field_i[0] = 0;
        ((lh) this).field_i[1] = 65535;
    }
}
