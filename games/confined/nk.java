/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private int field_a;
    private int field_c;
    private int field_g;
    private int field_f;
    private int field_h;
    private int[] field_b;
    private int[] field_e;
    int field_i;
    int field_j;
    int field_d;
    private int field_k;

    final void a(kg param0) {
        int var2 = 0;
        ((nk) this).field_a = param0.c(32);
        ((nk) this).field_b = new int[((nk) this).field_a];
        ((nk) this).field_e = new int[((nk) this).field_a];
        for (var2 = 0; var2 < ((nk) this).field_a; var2++) {
            ((nk) this).field_b[var2] = param0.a((byte) 25);
            ((nk) this).field_e[var2] = param0.a((byte) 25);
        }
    }

    final void b(kg param0) {
        ((nk) this).field_d = param0.c(32);
        ((nk) this).field_i = param0.f((byte) 57);
        ((nk) this).field_j = param0.f((byte) 74);
        ((nk) this).a(param0);
    }

    final void a() {
        ((nk) this).field_h = 0;
        ((nk) this).field_g = 0;
        ((nk) this).field_c = 0;
        ((nk) this).field_k = 0;
        ((nk) this).field_f = 0;
    }

    nk() {
        ((nk) this).field_a = 2;
        ((nk) this).field_b = new int[2];
        ((nk) this).field_e = new int[2];
        ((nk) this).field_b[0] = 0;
        ((nk) this).field_b[1] = 65535;
        ((nk) this).field_e[0] = 0;
        ((nk) this).field_e[1] = 65535;
    }

    final int a(int param0) {
        if (((nk) this).field_f >= ((nk) this).field_h) {
            int fieldTemp$0 = ((nk) this).field_g;
            ((nk) this).field_g = ((nk) this).field_g + 1;
            ((nk) this).field_k = ((nk) this).field_e[fieldTemp$0] << 15;
            if (((nk) this).field_g >= ((nk) this).field_a) {
                ((nk) this).field_g = ((nk) this).field_a - 1;
            }
            ((nk) this).field_h = (int)((double)((nk) this).field_b[((nk) this).field_g] / 65536.0 * (double)param0);
            if (((nk) this).field_h > ((nk) this).field_f) {
                ((nk) this).field_c = ((((nk) this).field_e[((nk) this).field_g] << 15) - ((nk) this).field_k) / (((nk) this).field_h - ((nk) this).field_f);
            }
        }
        ((nk) this).field_k = ((nk) this).field_k + ((nk) this).field_c;
        ((nk) this).field_f = ((nk) this).field_f + 1;
        return ((nk) this).field_k - ((nk) this).field_c >> 15;
    }
}
