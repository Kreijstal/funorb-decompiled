/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    int field_g;
    private int field_b;
    private int field_k;
    private int[] field_d;
    int field_h;
    private int[] field_c;
    private int field_i;
    int field_f;
    private int field_a;
    private int field_j;
    private int field_e;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_a >= this.field_i) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_j = this.field_c[fieldTemp$0] << 15;
            if (this.field_e >= this.field_k) {
                this.field_e = this.field_k - 1;
            }
            this.field_i = (int)((double)this.field_d[this.field_e] / 65536.0 * (double)param0);
            if (this.field_i > this.field_a) {
                this.field_b = ((this.field_c[this.field_e] << 15) - this.field_j) / (this.field_i - this.field_a);
            }
        }
        this.field_j = this.field_j + this.field_b;
        this.field_a = this.field_a + 1;
        return this.field_j - this.field_b >> 15;
    }

    final void a(th param0) {
        int var2 = 0;
        this.field_k = param0.f((byte) -106);
        this.field_d = new int[this.field_k];
        this.field_c = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_d[var2] = param0.k(-76);
            this.field_c[var2] = param0.k(91);
        }
    }

    final void a() {
        this.field_i = 0;
        this.field_e = 0;
        this.field_b = 0;
        this.field_j = 0;
        this.field_a = 0;
    }

    final void b(th param0) {
        this.field_g = param0.f((byte) -77);
        this.field_h = param0.a(107);
        this.field_f = param0.a(-118);
        this.a(param0);
    }

    ve() {
        this.field_k = 2;
        this.field_d = new int[2];
        this.field_c = new int[2];
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
    }
}
