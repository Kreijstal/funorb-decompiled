/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    private int field_g;
    int field_a;
    int field_h;
    private int[] field_i;
    int field_e;
    private int field_k;
    private int field_f;
    private int field_c;
    private int field_d;
    private int field_j;
    private int[] field_b;

    final void a() {
        ((hl) this).field_g = 0;
        ((hl) this).field_f = 0;
        ((hl) this).field_j = 0;
        ((hl) this).field_c = 0;
        ((hl) this).field_d = 0;
    }

    final int a(int param0) {
        if (((hl) this).field_d >= ((hl) this).field_g) {
            int fieldTemp$0 = ((hl) this).field_f;
            ((hl) this).field_f = ((hl) this).field_f + 1;
            ((hl) this).field_c = ((hl) this).field_i[fieldTemp$0] << 15;
            if (((hl) this).field_f >= ((hl) this).field_k) {
                ((hl) this).field_f = ((hl) this).field_k - 1;
            }
            ((hl) this).field_g = (int)((double)((hl) this).field_b[((hl) this).field_f] / 65536.0 * (double)param0);
            if (((hl) this).field_g > ((hl) this).field_d) {
                ((hl) this).field_j = ((((hl) this).field_i[((hl) this).field_f] << 15) - ((hl) this).field_c) / (((hl) this).field_g - ((hl) this).field_d);
            }
        }
        ((hl) this).field_c = ((hl) this).field_c + ((hl) this).field_j;
        ((hl) this).field_d = ((hl) this).field_d + 1;
        return ((hl) this).field_c - ((hl) this).field_j >> 15;
    }

    final void b(wi param0) {
        int var2 = 0;
        ((hl) this).field_k = param0.d((byte) -110);
        ((hl) this).field_b = new int[((hl) this).field_k];
        ((hl) this).field_i = new int[((hl) this).field_k];
        for (var2 = 0; var2 < ((hl) this).field_k; var2++) {
            ((hl) this).field_b[var2] = param0.a(-1640531527);
            ((hl) this).field_i[var2] = param0.a(-1640531527);
        }
    }

    final void a(wi param0) {
        ((hl) this).field_h = param0.d((byte) -72);
        ((hl) this).field_e = param0.j(-3);
        ((hl) this).field_a = param0.j(-3);
        ((hl) this).b(param0);
    }

    hl() {
        ((hl) this).field_k = 2;
        ((hl) this).field_b = new int[2];
        ((hl) this).field_i = new int[2];
        ((hl) this).field_b[0] = 0;
        ((hl) this).field_b[1] = 65535;
        ((hl) this).field_i[0] = 0;
        ((hl) this).field_i[1] = 65535;
    }
}
