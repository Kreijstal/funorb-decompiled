/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    private int[] field_f;
    int field_c;
    private int field_b;
    private int field_d;
    private int[] field_h;
    private int field_g;
    private int field_i;
    private int field_j;
    int field_a;
    private int field_k;
    int field_e;

    final void a(fj param0) {
        this.field_c = param0.i((byte) -101);
        this.field_e = param0.c((byte) -127);
        this.field_a = param0.c((byte) -76);
        this.b(param0);
    }

    final void a() {
        this.field_k = 0;
        this.field_j = 0;
        this.field_d = 0;
        this.field_i = 0;
        this.field_g = 0;
    }

    final void b(fj param0) {
        int var2 = 0;
        this.field_b = param0.i((byte) -101);
        this.field_h = new int[this.field_b];
        this.field_f = new int[this.field_b];
        for (var2 = 0; var2 < this.field_b; var2++) {
            this.field_h[var2] = param0.i(7088);
            this.field_f[var2] = param0.i(7088);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_g >= this.field_k) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_i = this.field_f[fieldTemp$0] << 15;
            if (this.field_j >= this.field_b) {
                this.field_j = this.field_b - 1;
            }
            this.field_k = (int)((double)this.field_h[this.field_j] / 65536.0 * (double)param0);
            if (this.field_k > this.field_g) {
                this.field_d = ((this.field_f[this.field_j] << 15) - this.field_i) / (this.field_k - this.field_g);
            }
        }
        this.field_i = this.field_i + this.field_d;
        this.field_g = this.field_g + 1;
        return this.field_i - this.field_d >> 15;
    }

    td() {
        this.field_b = 2;
        this.field_h = new int[2];
        this.field_f = new int[2];
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
    }
}
