/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    private int field_i;
    private int field_g;
    int field_j;
    int field_d;
    private int field_e;
    private int[] field_c;
    private int field_b;
    private int field_k;
    private int field_a;
    int field_f;
    private int[] field_h;

    final void a() {
        this.field_k = 0;
        this.field_i = 0;
        this.field_e = 0;
        this.field_b = 0;
        this.field_g = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_g >= this.field_k) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_b = this.field_h[fieldTemp$0] << 15;
            if (this.field_i >= this.field_a) {
                this.field_i = this.field_a - 1;
            }
            this.field_k = (int)((double)this.field_c[this.field_i] / 65536.0 * (double)param0);
            if (this.field_k > this.field_g) {
                this.field_e = ((this.field_h[this.field_i] << 15) - this.field_b) / (this.field_k - this.field_g);
            }
        }
        this.field_b = this.field_b + this.field_e;
        this.field_g = this.field_g + 1;
        return this.field_b - this.field_e >> 15;
    }

    final void a(gk param0) {
        int var2 = 0;
        this.field_a = param0.a((byte) 114);
        this.field_c = new int[this.field_a];
        this.field_h = new int[this.field_a];
        for (var2 = 0; var2 < this.field_a; var2++) {
            this.field_c[var2] = param0.j(17277);
            this.field_h[var2] = param0.j(17277);
        }
    }

    final void b(gk param0) {
        this.field_f = param0.a((byte) 114);
        this.field_j = param0.e(4);
        this.field_d = param0.e(127);
        this.a(param0);
    }

    dg() {
        this.field_a = 2;
        this.field_c = new int[2];
        this.field_h = new int[2];
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
    }
}
