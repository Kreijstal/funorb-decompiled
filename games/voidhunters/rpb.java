/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rpb {
    int field_i;
    private int field_k;
    private int field_h;
    int field_e;
    int field_j;
    private int field_d;
    private int field_b;
    private int[] field_f;
    private int[] field_a;
    private int field_c;
    private int field_g;

    final void a() {
        ((rpb) this).field_k = 0;
        ((rpb) this).field_d = 0;
        ((rpb) this).field_h = 0;
        ((rpb) this).field_b = 0;
        ((rpb) this).field_c = 0;
    }

    final void a(ds param0) {
        int var2 = 0;
        ((rpb) this).field_g = param0.e((byte) -113);
        ((rpb) this).field_f = new int[((rpb) this).field_g];
        ((rpb) this).field_a = new int[((rpb) this).field_g];
        for (var2 = 0; var2 < ((rpb) this).field_g; var2++) {
            ((rpb) this).field_f[var2] = param0.e(1869);
            ((rpb) this).field_a[var2] = param0.e(1869);
        }
    }

    final int a(int param0) {
        if (((rpb) this).field_c >= ((rpb) this).field_k) {
            int fieldTemp$0 = ((rpb) this).field_d;
            ((rpb) this).field_d = ((rpb) this).field_d + 1;
            ((rpb) this).field_b = ((rpb) this).field_a[fieldTemp$0] << 15;
            if (((rpb) this).field_d >= ((rpb) this).field_g) {
                ((rpb) this).field_d = ((rpb) this).field_g - 1;
            }
            ((rpb) this).field_k = (int)((double)((rpb) this).field_f[((rpb) this).field_d] / 65536.0 * (double)param0);
            if (((rpb) this).field_k > ((rpb) this).field_c) {
                ((rpb) this).field_h = ((((rpb) this).field_a[((rpb) this).field_d] << 15) - ((rpb) this).field_b) / (((rpb) this).field_k - ((rpb) this).field_c);
            }
        }
        ((rpb) this).field_b = ((rpb) this).field_b + ((rpb) this).field_h;
        ((rpb) this).field_c = ((rpb) this).field_c + 1;
        return ((rpb) this).field_b - ((rpb) this).field_h >> 15;
    }

    final void b(ds param0) {
        ((rpb) this).field_e = param0.e((byte) -110);
        ((rpb) this).field_i = param0.h(19);
        ((rpb) this).field_j = param0.h(63);
        ((rpb) this).a(param0);
    }

    rpb() {
        ((rpb) this).field_g = 2;
        ((rpb) this).field_f = new int[2];
        ((rpb) this).field_a = new int[2];
        ((rpb) this).field_f[0] = 0;
        ((rpb) this).field_f[1] = 65535;
        ((rpb) this).field_a[0] = 0;
        ((rpb) this).field_a[1] = 65535;
    }
}
