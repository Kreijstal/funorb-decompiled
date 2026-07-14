/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private int[] field_f;
    int field_i;
    private int field_b;
    private int field_e;
    private int field_k;
    private int[] field_a;
    private int field_g;
    private int field_h;
    int field_c;
    private int field_d;
    int field_j;

    final int a(int param0) {
        if (((kl) this).field_b >= ((kl) this).field_e) {
            ((kl) this).field_h = ((kl) this).field_h + 1;
            ((kl) this).field_k = ((kl) this).field_a[((kl) this).field_h] << 15;
            if (((kl) this).field_h >= ((kl) this).field_g) {
                ((kl) this).field_h = ((kl) this).field_g - 1;
            }
            ((kl) this).field_e = (int)((double)((kl) this).field_f[((kl) this).field_h] / 65536.0 * (double)param0);
            if (((kl) this).field_e > ((kl) this).field_b) {
                ((kl) this).field_d = ((((kl) this).field_a[((kl) this).field_h] << 15) - ((kl) this).field_k) / (((kl) this).field_e - ((kl) this).field_b);
            }
        }
        ((kl) this).field_k = ((kl) this).field_k + ((kl) this).field_d;
        ((kl) this).field_b = ((kl) this).field_b + 1;
        return ((kl) this).field_k - ((kl) this).field_d >> 15;
    }

    final void a() {
        ((kl) this).field_e = 0;
        ((kl) this).field_h = 0;
        ((kl) this).field_d = 0;
        ((kl) this).field_k = 0;
        ((kl) this).field_b = 0;
    }

    kl() {
        ((kl) this).field_g = 2;
        ((kl) this).field_f = new int[2];
        ((kl) this).field_a = new int[2];
        ((kl) this).field_f[0] = 0;
        ((kl) this).field_f[1] = 65535;
        ((kl) this).field_a[0] = 0;
        ((kl) this).field_a[1] = 65535;
    }

    final void b(gi param0) {
        ((kl) this).field_i = param0.f((byte) -128);
        ((kl) this).field_c = param0.i(0);
        ((kl) this).field_j = param0.i(0);
        ((kl) this).a(param0);
    }

    final void a(gi param0) {
        int var2 = 0;
        ((kl) this).field_g = param0.f((byte) -62);
        ((kl) this).field_f = new int[((kl) this).field_g];
        ((kl) this).field_a = new int[((kl) this).field_g];
        for (var2 = 0; var2 < ((kl) this).field_g; var2++) {
            ((kl) this).field_f[var2] = param0.c((byte) -60);
            ((kl) this).field_a[var2] = param0.c((byte) -60);
        }
    }
}
