/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    private int[] field_d;
    private int field_k;
    private int field_j;
    int field_i;
    private int field_e;
    int field_b;
    private int field_c;
    private int field_h;
    private int field_g;
    private int[] field_a;
    int field_f;

    final void a(vi param0) {
        this.field_b = param0.l(32270);
        this.field_i = param0.d(8195);
        this.field_f = param0.d(8195);
        this.b(param0);
    }

    final void b(vi param0) {
        int var2 = 0;
        this.field_k = param0.l(32270);
        this.field_d = new int[this.field_k];
        this.field_a = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_d[var2] = param0.e(8);
            this.field_a[var2] = param0.e(8);
        }
    }

    final void a() {
        this.field_g = 0;
        this.field_j = 0;
        this.field_c = 0;
        this.field_h = 0;
        this.field_e = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_e >= this.field_g) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_h = this.field_a[fieldTemp$0] << 15;
            if (this.field_j >= this.field_k) {
                this.field_j = this.field_k - 1;
            }
            this.field_g = (int)((double)this.field_d[this.field_j] / 65536.0 * (double)param0);
            if (this.field_g > this.field_e) {
                this.field_c = ((this.field_a[this.field_j] << 15) - this.field_h) / (this.field_g - this.field_e);
            }
        }
        this.field_h = this.field_h + this.field_c;
        this.field_e = this.field_e + 1;
        return this.field_h - this.field_c >> 15;
    }

    ma() {
        this.field_k = 2;
        this.field_d = new int[2];
        this.field_a = new int[2];
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
    }
}
