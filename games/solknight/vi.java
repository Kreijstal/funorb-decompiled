/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private int field_c;
    private int[] field_f;
    int field_g;
    int field_h;
    private int field_e;
    int field_i;
    private int[] field_j;
    private int field_a;
    private int field_k;
    private int field_d;
    private int field_b;

    final void a() {
        this.field_a = 0;
        this.field_c = 0;
        this.field_e = 0;
        this.field_d = 0;
        this.field_b = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_b >= this.field_a) {
            fieldTemp$0 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_d = this.field_j[fieldTemp$0] << 15;
            if (this.field_c >= this.field_k) {
                this.field_c = this.field_k - 1;
            }
            this.field_a = (int)((double)this.field_f[this.field_c] / 65536.0 * (double)param0);
            if (this.field_a > this.field_b) {
                this.field_e = ((this.field_j[this.field_c] << 15) - this.field_d) / (this.field_a - this.field_b);
            }
        }
        this.field_d = this.field_d + this.field_e;
        this.field_b = this.field_b + 1;
        return this.field_d - this.field_e >> 15;
    }

    final void a(gb param0) {
        int var2 = 0;
        this.field_k = param0.j(255);
        this.field_f = new int[this.field_k];
        this.field_j = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_f[var2] = param0.i(-111);
            this.field_j[var2] = param0.i(106);
        }
    }

    final void b(gb param0) {
        this.field_g = param0.j(255);
        this.field_h = param0.e(true);
        this.field_i = param0.e(true);
        this.a(param0);
    }

    vi() {
        this.field_k = 2;
        this.field_f = new int[2];
        this.field_j = new int[2];
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
    }
}
