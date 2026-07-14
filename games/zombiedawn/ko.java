/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    int field_d;
    int field_g;
    private int field_a;
    private int field_j;
    private int[] field_c;
    private int field_k;
    private int field_i;
    private int field_f;
    private int field_b;
    private int[] field_h;
    int field_e;

    final void b(de param0) {
        ((ko) this).field_e = param0.d((byte) -120);
        ((ko) this).field_d = param0.c(-105);
        ((ko) this).field_g = param0.c(-58);
        ((ko) this).a(param0);
    }

    final void a() {
        ((ko) this).field_i = 0;
        ((ko) this).field_f = 0;
        ((ko) this).field_b = 0;
        ((ko) this).field_j = 0;
        ((ko) this).field_a = 0;
    }

    final int a(int param0) {
        if (((ko) this).field_a >= ((ko) this).field_i) {
            ((ko) this).field_f = ((ko) this).field_f + 1;
            ((ko) this).field_j = ((ko) this).field_c[((ko) this).field_f] << 15;
            if (((ko) this).field_f >= ((ko) this).field_k) {
                ((ko) this).field_f = ((ko) this).field_k - 1;
            }
            ((ko) this).field_i = (int)((double)((ko) this).field_h[((ko) this).field_f] / 65536.0 * (double)param0);
            if (((ko) this).field_i > ((ko) this).field_a) {
                ((ko) this).field_b = ((((ko) this).field_c[((ko) this).field_f] << 15) - ((ko) this).field_j) / (((ko) this).field_i - ((ko) this).field_a);
            }
        }
        ((ko) this).field_j = ((ko) this).field_j + ((ko) this).field_b;
        ((ko) this).field_a = ((ko) this).field_a + 1;
        return ((ko) this).field_j - ((ko) this).field_b >> 15;
    }

    final void a(de param0) {
        int var2 = 0;
        ((ko) this).field_k = param0.d((byte) -120);
        ((ko) this).field_h = new int[((ko) this).field_k];
        ((ko) this).field_c = new int[((ko) this).field_k];
        for (var2 = 0; var2 < ((ko) this).field_k; var2++) {
            ((ko) this).field_h[var2] = param0.f(2);
            ((ko) this).field_c[var2] = param0.f(2);
        }
    }

    ko() {
        ((ko) this).field_k = 2;
        ((ko) this).field_h = new int[2];
        ((ko) this).field_c = new int[2];
        ((ko) this).field_h[0] = 0;
        ((ko) this).field_h[1] = 65535;
        ((ko) this).field_c[0] = 0;
        ((ko) this).field_c[1] = 65535;
    }
}
