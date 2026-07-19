/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    private int[] field_f;
    private int field_d;
    private int field_e;
    private int field_h;
    int field_c;
    private int field_a;
    private int[] field_g;
    private int field_j;
    int field_b;
    int field_k;
    private int field_i;

    final void a(pb param0) {
        int var2 = 0;
        this.field_d = param0.f(-127);
        this.field_g = new int[this.field_d];
        this.field_f = new int[this.field_d];
        for (var2 = 0; var2 < this.field_d; var2++) {
            this.field_g[var2] = param0.d((byte) 72);
            this.field_f[var2] = param0.d((byte) 72);
        }
    }

    final void b(pb param0) {
        this.field_k = param0.f(-112);
        this.field_c = param0.e((byte) 127);
        this.field_b = param0.e((byte) 125);
        this.a(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_a >= this.field_i) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_h = this.field_f[fieldTemp$0] << 15;
            if (this.field_j >= this.field_d) {
                this.field_j = this.field_d - 1;
            }
            this.field_i = (int)((double)this.field_g[this.field_j] / 65536.0 * (double)param0);
            if (this.field_i > this.field_a) {
                this.field_e = ((this.field_f[this.field_j] << 15) - this.field_h) / (this.field_i - this.field_a);
            }
        }
        this.field_h = this.field_h + this.field_e;
        this.field_a = this.field_a + 1;
        return this.field_h - this.field_e >> 15;
    }

    final void a() {
        this.field_i = 0;
        this.field_j = 0;
        this.field_e = 0;
        this.field_h = 0;
        this.field_a = 0;
    }

    ih() {
        this.field_d = 2;
        this.field_g = new int[2];
        this.field_f = new int[2];
        this.field_g[0] = 0;
        this.field_g[1] = 65535;
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
    }
}
