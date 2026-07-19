/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    int field_j;
    private int field_i;
    private int field_d;
    int field_e;
    private int field_f;
    int field_b;
    private int field_a;
    private int[] field_h;
    private int field_c;
    private int[] field_k;
    private int field_g;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_c >= this.field_f) {
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_i = this.field_h[fieldTemp$0] << 15;
            if (this.field_a >= this.field_g) {
                this.field_a = this.field_g - 1;
            }
            this.field_f = (int)((double)this.field_k[this.field_a] / 65536.0 * (double)param0);
            if (this.field_f > this.field_c) {
                this.field_d = ((this.field_h[this.field_a] << 15) - this.field_i) / (this.field_f - this.field_c);
            }
        }
        this.field_i = this.field_i + this.field_d;
        this.field_c = this.field_c + 1;
        return this.field_i - this.field_d >> 15;
    }

    final void a() {
        this.field_f = 0;
        this.field_a = 0;
        this.field_d = 0;
        this.field_i = 0;
        this.field_c = 0;
    }

    final void a(n param0) {
        this.field_e = param0.e(0);
        this.field_j = param0.g(-5053);
        this.field_b = param0.g(-5053);
        this.b(param0);
    }

    final void b(n param0) {
        int var2 = 0;
        this.field_g = param0.e(0);
        this.field_k = new int[this.field_g];
        this.field_h = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_k[var2] = param0.f(1952);
            this.field_h[var2] = param0.f(1952);
        }
    }

    wj() {
        this.field_g = 2;
        this.field_k = new int[2];
        this.field_h = new int[2];
        this.field_k[0] = 0;
        this.field_k[1] = 65535;
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
    }
}
