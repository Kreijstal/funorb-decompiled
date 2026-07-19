/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    int field_k;
    private int field_e;
    private int field_h;
    private int field_j;
    private int field_g;
    int field_a;
    private int[] field_f;
    private int[] field_d;
    private int field_b;
    int field_i;
    private int field_c;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_g >= this.field_h) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_j = this.field_f[fieldTemp$0] << 15;
            if (this.field_e >= this.field_c) {
                this.field_e = this.field_c - 1;
            }
            this.field_h = (int)((double)this.field_d[this.field_e] / 65536.0 * (double)param0);
            if (this.field_h > this.field_g) {
                this.field_b = ((this.field_f[this.field_e] << 15) - this.field_j) / (this.field_h - this.field_g);
            }
        }
        this.field_j = this.field_j + this.field_b;
        this.field_g = this.field_g + 1;
        return this.field_j - this.field_b >> 15;
    }

    final void b(wq param0) {
        this.field_k = param0.l(255);
        this.field_a = param0.e(255);
        this.field_i = param0.e(255);
        this.a(param0);
    }

    final void a() {
        this.field_h = 0;
        this.field_e = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.field_g = 0;
    }

    final void a(wq param0) {
        int var2 = 0;
        this.field_c = param0.l(255);
        this.field_d = new int[this.field_c];
        this.field_f = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
            this.field_d[var2] = param0.i(65280);
            this.field_f[var2] = param0.i(65280);
        }
    }

    wa() {
        this.field_c = 2;
        this.field_d = new int[2];
        this.field_f = new int[2];
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
    }
}
