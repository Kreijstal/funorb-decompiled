/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    private int[] field_d;
    int field_h;
    private int[] field_k;
    private int field_f;
    private int field_c;
    private int field_b;
    private int field_j;
    int field_g;
    private int field_a;
    int field_e;
    private int field_i;

    final void a() {
        ((pr) this).field_b = 0;
        ((pr) this).field_c = 0;
        ((pr) this).field_f = 0;
        ((pr) this).field_j = 0;
        ((pr) this).field_a = 0;
    }

    final void b(ed param0) {
        ((pr) this).field_e = param0.h(-11);
        ((pr) this).field_h = param0.b(true);
        ((pr) this).field_g = param0.b(true);
        ((pr) this).a(param0);
    }

    final void a(ed param0) {
        int var2 = 0;
        ((pr) this).field_i = param0.h(-11);
        ((pr) this).field_k = new int[((pr) this).field_i];
        ((pr) this).field_d = new int[((pr) this).field_i];
        for (var2 = 0; var2 < ((pr) this).field_i; var2++) {
            ((pr) this).field_k[var2] = param0.a((byte) -11);
            ((pr) this).field_d[var2] = param0.a((byte) -11);
        }
    }

    final int a(int param0) {
        if (((pr) this).field_a >= ((pr) this).field_b) {
            ((pr) this).field_c = ((pr) this).field_c + 1;
            ((pr) this).field_j = ((pr) this).field_d[((pr) this).field_c] << 15;
            if (((pr) this).field_c >= ((pr) this).field_i) {
                ((pr) this).field_c = ((pr) this).field_i - 1;
            }
            ((pr) this).field_b = (int)((double)((pr) this).field_k[((pr) this).field_c] / 65536.0 * (double)param0);
            if (((pr) this).field_b > ((pr) this).field_a) {
                ((pr) this).field_f = ((((pr) this).field_d[((pr) this).field_c] << 15) - ((pr) this).field_j) / (((pr) this).field_b - ((pr) this).field_a);
            }
        }
        ((pr) this).field_j = ((pr) this).field_j + ((pr) this).field_f;
        ((pr) this).field_a = ((pr) this).field_a + 1;
        return ((pr) this).field_j - ((pr) this).field_f >> 15;
    }

    pr() {
        ((pr) this).field_i = 2;
        ((pr) this).field_k = new int[2];
        ((pr) this).field_d = new int[2];
        ((pr) this).field_k[0] = 0;
        ((pr) this).field_k[1] = 65535;
        ((pr) this).field_d[0] = 0;
        ((pr) this).field_d[1] = 65535;
    }
}
