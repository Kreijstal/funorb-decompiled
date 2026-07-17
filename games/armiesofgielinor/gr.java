/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    private int field_h;
    int field_c;
    private int field_e;
    private int[] field_i;
    int field_k;
    private int field_g;
    private int[] field_j;
    private int field_f;
    private int field_b;
    int field_d;
    private int field_a;

    final void a(vh param0) {
        ((gr) this).field_d = param0.k(0);
        ((gr) this).field_k = param0.i(1);
        ((gr) this).field_c = param0.i(1);
        ((gr) this).b(param0);
    }

    final void a() {
        ((gr) this).field_b = 0;
        ((gr) this).field_h = 0;
        ((gr) this).field_e = 0;
        ((gr) this).field_a = 0;
        ((gr) this).field_f = 0;
    }

    final int a(int param0) {
        if (((gr) this).field_f >= ((gr) this).field_b) {
            int fieldTemp$0 = ((gr) this).field_h;
            ((gr) this).field_h = ((gr) this).field_h + 1;
            ((gr) this).field_a = ((gr) this).field_i[fieldTemp$0] << 15;
            if (((gr) this).field_h >= ((gr) this).field_g) {
                ((gr) this).field_h = ((gr) this).field_g - 1;
            }
            ((gr) this).field_b = (int)((double)((gr) this).field_j[((gr) this).field_h] / 65536.0 * (double)param0);
            if (((gr) this).field_b > ((gr) this).field_f) {
                ((gr) this).field_e = ((((gr) this).field_i[((gr) this).field_h] << 15) - ((gr) this).field_a) / (((gr) this).field_b - ((gr) this).field_f);
            }
        }
        ((gr) this).field_a = ((gr) this).field_a + ((gr) this).field_e;
        ((gr) this).field_f = ((gr) this).field_f + 1;
        return ((gr) this).field_a - ((gr) this).field_e >> 15;
    }

    final void b(vh param0) {
        int var2 = 0;
        ((gr) this).field_g = param0.k(0);
        ((gr) this).field_j = new int[((gr) this).field_g];
        ((gr) this).field_i = new int[((gr) this).field_g];
        for (var2 = 0; var2 < ((gr) this).field_g; var2++) {
            ((gr) this).field_j[var2] = param0.e((byte) -104);
            ((gr) this).field_i[var2] = param0.e((byte) -104);
        }
    }

    gr() {
        ((gr) this).field_g = 2;
        ((gr) this).field_j = new int[2];
        ((gr) this).field_i = new int[2];
        ((gr) this).field_j[0] = 0;
        ((gr) this).field_j[1] = 65535;
        ((gr) this).field_i[0] = 0;
        ((gr) this).field_i[1] = 65535;
    }
}
