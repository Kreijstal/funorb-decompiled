/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    private int[] field_e;
    private int field_d;
    private int field_f;
    private int field_c;
    private int field_a;
    int field_g;
    private int field_h;
    private int field_k;
    int field_b;
    int field_j;
    private int[] field_i;

    final void a(iw param0) {
        ((fq) this).field_g = param0.h((byte) -106);
        ((fq) this).field_b = param0.k(4);
        ((fq) this).field_j = param0.k(4);
        ((fq) this).b(param0);
    }

    final void a() {
        ((fq) this).field_h = 0;
        ((fq) this).field_k = 0;
        ((fq) this).field_f = 0;
        ((fq) this).field_d = 0;
        ((fq) this).field_a = 0;
    }

    final int a(int param0) {
        if (((fq) this).field_a >= ((fq) this).field_h) {
            int fieldTemp$0 = ((fq) this).field_k;
            ((fq) this).field_k = ((fq) this).field_k + 1;
            ((fq) this).field_d = ((fq) this).field_i[fieldTemp$0] << 15;
            if (((fq) this).field_k >= ((fq) this).field_c) {
                ((fq) this).field_k = ((fq) this).field_c - 1;
            }
            ((fq) this).field_h = (int)((double)((fq) this).field_e[((fq) this).field_k] / 65536.0 * (double)param0);
            if (((fq) this).field_h > ((fq) this).field_a) {
                ((fq) this).field_f = ((((fq) this).field_i[((fq) this).field_k] << 15) - ((fq) this).field_d) / (((fq) this).field_h - ((fq) this).field_a);
            }
        }
        ((fq) this).field_d = ((fq) this).field_d + ((fq) this).field_f;
        ((fq) this).field_a = ((fq) this).field_a + 1;
        return ((fq) this).field_d - ((fq) this).field_f >> 15;
    }

    final void b(iw param0) {
        int var2 = 0;
        ((fq) this).field_c = param0.h((byte) -119);
        ((fq) this).field_e = new int[((fq) this).field_c];
        ((fq) this).field_i = new int[((fq) this).field_c];
        for (var2 = 0; var2 < ((fq) this).field_c; var2++) {
            ((fq) this).field_e[var2] = param0.a((byte) 81);
            ((fq) this).field_i[var2] = param0.a((byte) 81);
        }
    }

    fq() {
        ((fq) this).field_c = 2;
        ((fq) this).field_e = new int[2];
        ((fq) this).field_i = new int[2];
        ((fq) this).field_e[0] = 0;
        ((fq) this).field_e[1] = 65535;
        ((fq) this).field_i[0] = 0;
        ((fq) this).field_i[1] = 65535;
    }
}
