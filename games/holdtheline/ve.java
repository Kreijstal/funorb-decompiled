/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    int field_g;
    private int field_b;
    private int field_k;
    private int[] field_d;
    int field_h;
    private int[] field_c;
    private int field_i;
    int field_f;
    private int field_a;
    private int field_j;
    private int field_e;

    final int a(int param0) {
        if (((ve) this).field_a >= ((ve) this).field_i) {
            ((ve) this).field_e = ((ve) this).field_e + 1;
            ((ve) this).field_j = ((ve) this).field_c[((ve) this).field_e] << 15;
            if (((ve) this).field_e >= ((ve) this).field_k) {
                ((ve) this).field_e = ((ve) this).field_k - 1;
            }
            ((ve) this).field_i = (int)((double)((ve) this).field_d[((ve) this).field_e] / 65536.0 * (double)param0);
            if (((ve) this).field_i > ((ve) this).field_a) {
                ((ve) this).field_b = ((((ve) this).field_c[((ve) this).field_e] << 15) - ((ve) this).field_j) / (((ve) this).field_i - ((ve) this).field_a);
            }
        }
        ((ve) this).field_j = ((ve) this).field_j + ((ve) this).field_b;
        ((ve) this).field_a = ((ve) this).field_a + 1;
        return ((ve) this).field_j - ((ve) this).field_b >> 15;
    }

    final void a(th param0) {
        int var2 = 0;
        ((ve) this).field_k = param0.f((byte) -106);
        ((ve) this).field_d = new int[((ve) this).field_k];
        ((ve) this).field_c = new int[((ve) this).field_k];
        for (var2 = 0; var2 < ((ve) this).field_k; var2++) {
            ((ve) this).field_d[var2] = param0.k(-76);
            ((ve) this).field_c[var2] = param0.k(91);
        }
    }

    final void a() {
        ((ve) this).field_i = 0;
        ((ve) this).field_e = 0;
        ((ve) this).field_b = 0;
        ((ve) this).field_j = 0;
        ((ve) this).field_a = 0;
    }

    final void b(th param0) {
        ((ve) this).field_g = param0.f((byte) -77);
        ((ve) this).field_h = param0.a(107);
        ((ve) this).field_f = param0.a(-118);
        ((ve) this).a(param0);
    }

    ve() {
        ((ve) this).field_k = 2;
        ((ve) this).field_d = new int[2];
        ((ve) this).field_c = new int[2];
        ((ve) this).field_d[0] = 0;
        ((ve) this).field_d[1] = 65535;
        ((ve) this).field_c[0] = 0;
        ((ve) this).field_c[1] = 65535;
    }
}
