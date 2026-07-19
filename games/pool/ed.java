/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    private int field_h;
    private int field_j;
    int field_f;
    private int[] field_e;
    private int[] field_c;
    private int field_d;
    private int field_k;
    int field_a;
    private int field_i;
    private int field_g;
    int field_b;

    final void b(ge param0) {
        this.field_b = param0.g(-67);
        this.field_f = param0.b(true);
        this.field_a = param0.b(true);
        this.a(param0);
    }

    final void a(ge param0) {
        int var2 = 0;
        this.field_d = param0.g(-128);
        this.field_e = new int[this.field_d];
        this.field_c = new int[this.field_d];
        for (var2 = 0; var2 < this.field_d; var2++) {
            this.field_e[var2] = param0.d(-1034);
            this.field_c[var2] = param0.d(-1034);
        }
    }

    final void a() {
        this.field_j = 0;
        this.field_h = 0;
        this.field_k = 0;
        this.field_g = 0;
        this.field_i = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_i >= this.field_j) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g = this.field_c[fieldTemp$0] << 15;
            if (this.field_h >= this.field_d) {
                this.field_h = this.field_d - 1;
            }
            this.field_j = (int)((double)this.field_e[this.field_h] / 65536.0 * (double)param0);
            if (this.field_j > this.field_i) {
                this.field_k = ((this.field_c[this.field_h] << 15) - this.field_g) / (this.field_j - this.field_i);
            }
        }
        this.field_g = this.field_g + this.field_k;
        this.field_i = this.field_i + 1;
        return this.field_g - this.field_k >> 15;
    }

    ed() {
        this.field_d = 2;
        this.field_e = new int[2];
        this.field_c = new int[2];
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
    }
}
