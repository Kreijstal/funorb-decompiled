/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    int field_j;
    private int field_h;
    private int field_b;
    private int[] field_g;
    private int[] field_k;
    int field_d;
    private int field_i;
    int field_c;
    private int field_f;
    private int field_a;
    private int field_e;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_i >= this.field_a) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_h = this.field_g[fieldTemp$0] << 15;
            if (this.field_e >= this.field_b) {
                this.field_e = this.field_b - 1;
            }
            this.field_a = (int)((double)this.field_k[this.field_e] / 65536.0 * (double)param0);
            if (this.field_a > this.field_i) {
                this.field_f = ((this.field_g[this.field_e] << 15) - this.field_h) / (this.field_a - this.field_i);
            }
        }
        this.field_h = this.field_h + this.field_f;
        this.field_i = this.field_i + 1;
        return this.field_h - this.field_f >> 15;
    }

    final void a(ec param0) {
        int var2 = 0;
        this.field_b = param0.c(true);
        this.field_k = new int[this.field_b];
        this.field_g = new int[this.field_b];
        for (var2 = 0; var2 < this.field_b; var2++) {
            this.field_k[var2] = param0.k(0);
            this.field_g[var2] = param0.k(0);
        }
    }

    fh() {
        this.field_b = 2;
        this.field_k = new int[2];
        this.field_g = new int[2];
        this.field_k[0] = 0;
        this.field_k[1] = 65535;
        this.field_g[0] = 0;
        this.field_g[1] = 65535;
    }

    final void b(ec param0) {
        this.field_d = param0.c(true);
        this.field_c = param0.h(-97);
        this.field_j = param0.h(-128);
        this.a(param0);
    }

    final void a() {
        this.field_a = 0;
        this.field_e = 0;
        this.field_f = 0;
        this.field_h = 0;
        this.field_i = 0;
    }
}
