/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    int field_j;
    private int field_e;
    int field_b;
    private int[] field_d;
    private int field_f;
    private int field_a;
    private int field_h;
    int field_i;
    private int[] field_c;
    private int field_g;
    private int field_k;

    final void b(bh param0) {
        int var2 = 0;
        this.field_f = param0.d((byte) -99);
        this.field_c = new int[this.field_f];
        this.field_d = new int[this.field_f];
        for (var2 = 0; var2 < this.field_f; var2++) {
            this.field_c[var2] = param0.e(127);
            this.field_d[var2] = param0.e(127);
        }
    }

    final void a(bh param0) {
        this.field_b = param0.d((byte) -99);
        this.field_i = param0.f(97);
        this.field_j = param0.f(-108);
        this.b(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_k >= this.field_e) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_a = this.field_d[fieldTemp$0] << 15;
            if (this.field_h >= this.field_f) {
                this.field_h = this.field_f - 1;
            }
            this.field_e = (int)((double)this.field_c[this.field_h] / 65536.0 * (double)param0);
            if (this.field_e > this.field_k) {
                this.field_g = ((this.field_d[this.field_h] << 15) - this.field_a) / (this.field_e - this.field_k);
            }
        }
        this.field_a = this.field_a + this.field_g;
        this.field_k = this.field_k + 1;
        return this.field_a - this.field_g >> 15;
    }

    final void a() {
        this.field_e = 0;
        this.field_h = 0;
        this.field_g = 0;
        this.field_a = 0;
        this.field_k = 0;
    }

    td() {
        this.field_f = 2;
        this.field_c = new int[2];
        this.field_d = new int[2];
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
    }
}
