/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private int field_c;
    private int[] field_f;
    int field_g;
    int field_h;
    private int field_e;
    int field_i;
    private int[] field_j;
    private int field_a;
    private int field_k;
    private int field_d;
    private int field_b;

    final void a() {
        ((vi) this).field_a = 0;
        ((vi) this).field_c = 0;
        ((vi) this).field_e = 0;
        ((vi) this).field_d = 0;
        ((vi) this).field_b = 0;
    }

    final int a(int param0) {
        if (((vi) this).field_b >= ((vi) this).field_a) {
            int fieldTemp$0 = ((vi) this).field_c;
            ((vi) this).field_c = ((vi) this).field_c + 1;
            ((vi) this).field_d = ((vi) this).field_j[fieldTemp$0] << 15;
            if (((vi) this).field_c >= ((vi) this).field_k) {
                ((vi) this).field_c = ((vi) this).field_k - 1;
            }
            ((vi) this).field_a = (int)((double)((vi) this).field_f[((vi) this).field_c] / 65536.0 * (double)param0);
            if (((vi) this).field_a > ((vi) this).field_b) {
                ((vi) this).field_e = ((((vi) this).field_j[((vi) this).field_c] << 15) - ((vi) this).field_d) / (((vi) this).field_a - ((vi) this).field_b);
            }
        }
        ((vi) this).field_d = ((vi) this).field_d + ((vi) this).field_e;
        ((vi) this).field_b = ((vi) this).field_b + 1;
        return ((vi) this).field_d - ((vi) this).field_e >> 15;
    }

    final void a(gb param0) {
        int var2 = 0;
        ((vi) this).field_k = param0.j(255);
        ((vi) this).field_f = new int[((vi) this).field_k];
        ((vi) this).field_j = new int[((vi) this).field_k];
        for (var2 = 0; var2 < ((vi) this).field_k; var2++) {
            ((vi) this).field_f[var2] = param0.i(-111);
            ((vi) this).field_j[var2] = param0.i(106);
        }
    }

    final void b(gb param0) {
        ((vi) this).field_g = param0.j(255);
        ((vi) this).field_h = param0.e(true);
        ((vi) this).field_i = param0.e(true);
        ((vi) this).a(param0);
    }

    vi() {
        ((vi) this).field_k = 2;
        ((vi) this).field_f = new int[2];
        ((vi) this).field_j = new int[2];
        ((vi) this).field_f[0] = 0;
        ((vi) this).field_f[1] = 65535;
        ((vi) this).field_j[0] = 0;
        ((vi) this).field_j[1] = 65535;
    }
}
