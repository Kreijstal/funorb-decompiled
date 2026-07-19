/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    int field_d;
    private int field_g;
    private int field_e;
    private int[] field_c;
    int field_i;
    private int field_b;
    private int field_j;
    int field_f;
    private int[] field_k;
    private int field_a;
    private int field_h;

    final void a(ob param0) {
        int var2 = 0;
        this.field_a = param0.j(-126);
        this.field_k = new int[this.field_a];
        this.field_c = new int[this.field_a];
        for (var2 = 0; var2 < this.field_a; var2++) {
            this.field_k[var2] = param0.f(-20976);
            this.field_c[var2] = param0.f(-20976);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_g >= this.field_e) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_j = this.field_c[fieldTemp$0] << 15;
            if (this.field_h >= this.field_a) {
                this.field_h = this.field_a - 1;
            }
            this.field_e = (int)((double)this.field_k[this.field_h] / 65536.0 * (double)param0);
            if (this.field_e > this.field_g) {
                this.field_b = ((this.field_c[this.field_h] << 15) - this.field_j) / (this.field_e - this.field_g);
            }
        }
        this.field_j = this.field_j + this.field_b;
        this.field_g = this.field_g + 1;
        return this.field_j - this.field_b >> 15;
    }

    pn() {
        this.field_a = 2;
        this.field_k = new int[2];
        this.field_c = new int[2];
        this.field_k[0] = 0;
        this.field_k[1] = 65535;
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
    }

    final void a() {
        this.field_e = 0;
        this.field_h = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.field_g = 0;
    }

    final void b(ob param0) {
        this.field_f = param0.j(-121);
        this.field_d = param0.a(16711680);
        this.field_i = param0.a(16711680);
        this.a(param0);
    }
}
