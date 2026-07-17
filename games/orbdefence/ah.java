/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private int field_a;
    int field_b;
    private int field_i;
    private int[] field_j;
    private int field_g;
    int field_d;
    private int field_h;
    private int[] field_k;
    int field_c;
    private int field_f;
    private int field_e;

    final void a() {
        ((ah) this).field_e = 0;
        ((ah) this).field_f = 0;
        ((ah) this).field_h = 0;
        ((ah) this).field_i = 0;
        ((ah) this).field_a = 0;
    }

    final void a(mg param0) {
        ((ah) this).field_c = param0.b((byte) 90);
        ((ah) this).field_b = param0.l(0);
        ((ah) this).field_d = param0.l(0);
        ((ah) this).b(param0);
    }

    final void b(mg param0) {
        int var2 = 0;
        ((ah) this).field_g = param0.b((byte) 90);
        ((ah) this).field_j = new int[((ah) this).field_g];
        ((ah) this).field_k = new int[((ah) this).field_g];
        for (var2 = 0; var2 < ((ah) this).field_g; var2++) {
            ((ah) this).field_j[var2] = param0.j(98203176);
            ((ah) this).field_k[var2] = param0.j(98203176);
        }
    }

    final int a(int param0) {
        if (((ah) this).field_a >= ((ah) this).field_e) {
            int fieldTemp$0 = ((ah) this).field_f;
            ((ah) this).field_f = ((ah) this).field_f + 1;
            ((ah) this).field_i = ((ah) this).field_k[fieldTemp$0] << 15;
            if (((ah) this).field_f >= ((ah) this).field_g) {
                ((ah) this).field_f = ((ah) this).field_g - 1;
            }
            ((ah) this).field_e = (int)((double)((ah) this).field_j[((ah) this).field_f] / 65536.0 * (double)param0);
            if (((ah) this).field_e > ((ah) this).field_a) {
                ((ah) this).field_h = ((((ah) this).field_k[((ah) this).field_f] << 15) - ((ah) this).field_i) / (((ah) this).field_e - ((ah) this).field_a);
            }
        }
        ((ah) this).field_i = ((ah) this).field_i + ((ah) this).field_h;
        ((ah) this).field_a = ((ah) this).field_a + 1;
        return ((ah) this).field_i - ((ah) this).field_h >> 15;
    }

    ah() {
        ((ah) this).field_g = 2;
        ((ah) this).field_j = new int[2];
        ((ah) this).field_k = new int[2];
        ((ah) this).field_j[0] = 0;
        ((ah) this).field_j[1] = 65535;
        ((ah) this).field_k[0] = 0;
        ((ah) this).field_k[1] = 65535;
    }
}
