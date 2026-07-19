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
        int fieldTemp$0 = 0;
        if (this.field_b >= this.field_e) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_k = this.field_a[fieldTemp$0] << 15;
            if (this.field_h >= this.field_g) {
                this.field_h = this.field_g - 1;
            }
            this.field_e = (int)((double)this.field_f[this.field_h] / 65536.0 * (double)param0);
            if (this.field_e > this.field_b) {
                this.field_d = ((this.field_a[this.field_h] << 15) - this.field_k) / (this.field_e - this.field_b);
            }
        }
        this.field_k = this.field_k + this.field_d;
        this.field_b = this.field_b + 1;
        return this.field_k - this.field_d >> 15;
    }

    final void a() {
        this.field_e = 0;
        this.field_h = 0;
        this.field_d = 0;
        this.field_k = 0;
        this.field_b = 0;
    }

    kl() {
        this.field_g = 2;
        this.field_f = new int[2];
        this.field_a = new int[2];
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
    }

    final void b(gi param0) {
        this.field_i = param0.f((byte) -128);
        this.field_c = param0.i(0);
        this.field_j = param0.i(0);
        this.a(param0);
    }

    final void a(gi param0) {
        int var2 = 0;
        this.field_g = param0.f((byte) -62);
        this.field_f = new int[this.field_g];
        this.field_a = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_f[var2] = param0.c((byte) -60);
            this.field_a[var2] = param0.c((byte) -60);
        }
    }
}
