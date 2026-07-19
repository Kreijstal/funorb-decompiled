/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    private int[] field_h;
    int field_d;
    private int field_k;
    private int field_e;
    private int[] field_c;
    private int field_j;
    private int field_a;
    int field_i;
    private int field_g;
    int field_b;
    private int field_f;

    final void a(ni param0) {
        int var2 = 0;
        this.field_g = param0.e(false);
        this.field_c = new int[this.field_g];
        this.field_h = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_c[var2] = param0.d((byte) -128);
            this.field_h[var2] = param0.d((byte) 79);
        }
    }

    final void a() {
        this.field_j = 0;
        this.field_a = 0;
        this.field_e = 0;
        this.field_k = 0;
        this.field_f = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_f >= this.field_j) {
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_k = this.field_h[fieldTemp$0] << 15;
            if (this.field_a >= this.field_g) {
                this.field_a = this.field_g - 1;
            }
            this.field_j = (int)((double)this.field_c[this.field_a] / 65536.0 * (double)param0);
            if (this.field_j > this.field_f) {
                this.field_e = ((this.field_h[this.field_a] << 15) - this.field_k) / (this.field_j - this.field_f);
            }
        }
        this.field_k = this.field_k + this.field_e;
        this.field_f = this.field_f + 1;
        return this.field_k - this.field_e >> 15;
    }

    final void b(ni param0) {
        this.field_d = param0.e(false);
        this.field_i = param0.c((byte) -102);
        this.field_b = param0.c((byte) -11);
        this.a(param0);
    }

    i() {
        this.field_g = 2;
        this.field_c = new int[2];
        this.field_h = new int[2];
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
    }
}
