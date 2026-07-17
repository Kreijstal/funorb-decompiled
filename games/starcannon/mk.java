/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private int[] field_a;
    private int field_k;
    int field_b;
    private int field_f;
    private int field_d;
    private int field_j;
    private int field_h;
    int field_g;
    int field_i;
    private int field_c;
    private int[] field_e;

    final void a(rb param0) {
        ((mk) this).field_i = param0.j(7909);
        ((mk) this).field_g = param0.f((byte) -125);
        ((mk) this).field_b = param0.f((byte) -93);
        ((mk) this).b(param0);
    }

    final void a() {
        ((mk) this).field_f = 0;
        ((mk) this).field_k = 0;
        ((mk) this).field_j = 0;
        ((mk) this).field_d = 0;
        ((mk) this).field_h = 0;
    }

    final int a(int param0) {
        if (((mk) this).field_h >= ((mk) this).field_f) {
            int fieldTemp$0 = ((mk) this).field_k;
            ((mk) this).field_k = ((mk) this).field_k + 1;
            ((mk) this).field_d = ((mk) this).field_e[fieldTemp$0] << 15;
            if (((mk) this).field_k >= ((mk) this).field_c) {
                ((mk) this).field_k = ((mk) this).field_c - 1;
            }
            ((mk) this).field_f = (int)((double)((mk) this).field_a[((mk) this).field_k] / 65536.0 * (double)param0);
            if (((mk) this).field_f > ((mk) this).field_h) {
                ((mk) this).field_j = ((((mk) this).field_e[((mk) this).field_k] << 15) - ((mk) this).field_d) / (((mk) this).field_f - ((mk) this).field_h);
            }
        }
        ((mk) this).field_d = ((mk) this).field_d + ((mk) this).field_j;
        ((mk) this).field_h = ((mk) this).field_h + 1;
        return ((mk) this).field_d - ((mk) this).field_j >> 15;
    }

    final void b(rb param0) {
        int var2 = 0;
        ((mk) this).field_c = param0.j(7909);
        ((mk) this).field_a = new int[((mk) this).field_c];
        ((mk) this).field_e = new int[((mk) this).field_c];
        for (var2 = 0; var2 < ((mk) this).field_c; var2++) {
            ((mk) this).field_a[var2] = param0.i(-1174051992);
            ((mk) this).field_e[var2] = param0.i(-1174051992);
        }
    }

    mk() {
        ((mk) this).field_c = 2;
        ((mk) this).field_a = new int[2];
        ((mk) this).field_e = new int[2];
        ((mk) this).field_a[0] = 0;
        ((mk) this).field_a[1] = 65535;
        ((mk) this).field_e[0] = 0;
        ((mk) this).field_e[1] = 65535;
    }
}
