/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private int field_i;
    private int field_d;
    int field_g;
    int field_k;
    private int[] field_a;
    private int field_c;
    private int field_b;
    int field_e;
    private int field_j;
    private int[] field_h;
    private int field_f;

    final void a() {
        this.field_i = 0;
        this.field_d = 0;
        this.field_f = 0;
        this.field_j = 0;
        this.field_b = 0;
    }

    final void b(wk param0) {
        int var2 = 0;
        this.field_c = param0.e((byte) -115);
        this.field_h = new int[this.field_c];
        this.field_a = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
            this.field_h[var2] = param0.n(-98);
            this.field_a[var2] = param0.n(-98);
        }
    }

    final void a(wk param0) {
        this.field_g = param0.e((byte) 62);
        this.field_k = param0.d(-10674);
        this.field_e = param0.d(-10674);
        this.b(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_b >= this.field_i) {
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            this.field_j = this.field_a[fieldTemp$0] << 15;
            if (this.field_d >= this.field_c) {
                this.field_d = this.field_c - 1;
            }
            this.field_i = (int)((double)this.field_h[this.field_d] / 65536.0 * (double)param0);
            if (this.field_i > this.field_b) {
                this.field_f = ((this.field_a[this.field_d] << 15) - this.field_j) / (this.field_i - this.field_b);
            }
        }
        this.field_j = this.field_j + this.field_f;
        this.field_b = this.field_b + 1;
        return this.field_j - this.field_f >> 15;
    }

    rh() {
        this.field_c = 2;
        this.field_h = new int[2];
        this.field_a = new int[2];
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
    }
}
