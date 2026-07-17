/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    int field_e;
    private int field_h;
    private int field_g;
    private int field_i;
    private int[] field_f;
    private int field_k;
    int field_a;
    private int[] field_j;
    int field_c;
    private int field_b;
    private int field_d;

    final int a(int param0) {
        if (((se) this).field_i >= ((se) this).field_g) {
            int fieldTemp$0 = ((se) this).field_h;
            ((se) this).field_h = ((se) this).field_h + 1;
            ((se) this).field_k = ((se) this).field_j[fieldTemp$0] << 15;
            if (((se) this).field_h >= ((se) this).field_b) {
                ((se) this).field_h = ((se) this).field_b - 1;
            }
            ((se) this).field_g = (int)((double)((se) this).field_f[((se) this).field_h] / 65536.0 * (double)param0);
            if (((se) this).field_g > ((se) this).field_i) {
                ((se) this).field_d = ((((se) this).field_j[((se) this).field_h] << 15) - ((se) this).field_k) / (((se) this).field_g - ((se) this).field_i);
            }
        }
        ((se) this).field_k = ((se) this).field_k + ((se) this).field_d;
        ((se) this).field_i = ((se) this).field_i + 1;
        return ((se) this).field_k - ((se) this).field_d >> 15;
    }

    final void b(wf param0) {
        ((se) this).field_a = param0.d(true);
        ((se) this).field_e = param0.d((byte) 19);
        ((se) this).field_c = param0.d((byte) 19);
        ((se) this).a(param0);
    }

    final void a() {
        ((se) this).field_g = 0;
        ((se) this).field_h = 0;
        ((se) this).field_d = 0;
        ((se) this).field_k = 0;
        ((se) this).field_i = 0;
    }

    final void a(wf param0) {
        int var2 = 0;
        ((se) this).field_b = param0.d(true);
        ((se) this).field_f = new int[((se) this).field_b];
        ((se) this).field_j = new int[((se) this).field_b];
        for (var2 = 0; var2 < ((se) this).field_b; var2++) {
            ((se) this).field_f[var2] = param0.b(-1698573656);
            ((se) this).field_j[var2] = param0.b(-1698573656);
        }
    }

    se() {
        ((se) this).field_b = 2;
        ((se) this).field_f = new int[2];
        ((se) this).field_j = new int[2];
        ((se) this).field_f[0] = 0;
        ((se) this).field_f[1] = 65535;
        ((se) this).field_j[0] = 0;
        ((se) this).field_j[1] = 65535;
    }
}
