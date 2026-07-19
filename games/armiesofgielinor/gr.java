/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    private int field_h;
    int field_c;
    private int field_e;
    private int[] field_i;
    int field_k;
    private int field_g;
    private int[] field_j;
    private int field_f;
    private int field_b;
    int field_d;
    private int field_a;

    final void a(vh param0) {
        this.field_d = param0.k(0);
        this.field_k = param0.i(1);
        this.field_c = param0.i(1);
        this.b(param0);
    }

    final void a() {
        this.field_b = 0;
        this.field_h = 0;
        this.field_e = 0;
        this.field_a = 0;
        this.field_f = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_f >= this.field_b) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_a = this.field_i[fieldTemp$0] << 15;
            if (this.field_h >= this.field_g) {
                this.field_h = this.field_g - 1;
            }
            this.field_b = (int)((double)this.field_j[this.field_h] / 65536.0 * (double)param0);
            if (this.field_b > this.field_f) {
                this.field_e = ((this.field_i[this.field_h] << 15) - this.field_a) / (this.field_b - this.field_f);
            }
        }
        this.field_a = this.field_a + this.field_e;
        this.field_f = this.field_f + 1;
        return this.field_a - this.field_e >> 15;
    }

    final void b(vh param0) {
        int var2 = 0;
        this.field_g = param0.k(0);
        this.field_j = new int[this.field_g];
        this.field_i = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_j[var2] = param0.e((byte) -104);
            this.field_i[var2] = param0.e((byte) -104);
        }
    }

    gr() {
        this.field_g = 2;
        this.field_j = new int[2];
        this.field_i = new int[2];
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
    }
}
