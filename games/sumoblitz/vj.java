/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    private int field_f;
    private int[] field_e;
    private int field_k;
    private int[] field_g;
    private int field_h;
    private int field_i;
    int field_a;
    private int field_c;
    int field_d;
    private int field_j;
    int field_b;

    final void a() {
        this.field_h = 0;
        this.field_f = 0;
        this.field_k = 0;
        this.field_i = 0;
        this.field_j = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_j >= this.field_h) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_i = this.field_g[fieldTemp$0] << 15;
            if (this.field_f >= this.field_c) {
                this.field_f = this.field_c - 1;
            }
            this.field_h = (int)((double)this.field_e[this.field_f] / 65536.0 * (double)param0);
            if (this.field_h > this.field_j) {
                this.field_k = ((this.field_g[this.field_f] << 15) - this.field_i) / (this.field_h - this.field_j);
            }
        }
        this.field_i = this.field_i + this.field_k;
        this.field_j = this.field_j + 1;
        return this.field_i - this.field_k >> 15;
    }

    final void b(fs param0) {
        int var2 = 0;
        this.field_c = param0.e(-31302);
        this.field_e = new int[this.field_c];
        this.field_g = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
            this.field_e[var2] = param0.a(255);
            this.field_g[var2] = param0.a(255);
        }
    }

    final void a(fs param0) {
        this.field_a = param0.e(-31302);
        this.field_b = param0.c(true);
        this.field_d = param0.c(true);
        this.b(param0);
    }

    vj() {
        this.field_c = 2;
        this.field_e = new int[2];
        this.field_g = new int[2];
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
        this.field_g[0] = 0;
        this.field_g[1] = 65535;
    }
}
