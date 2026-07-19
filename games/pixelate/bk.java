/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    private int[] field_j;
    private int field_i;
    int field_a;
    private int field_f;
    private int field_d;
    private int[] field_e;
    private int field_h;
    private int field_b;
    int field_c;
    int field_g;
    private int field_k;

    final void a() {
        this.field_k = 0;
        this.field_h = 0;
        this.field_b = 0;
        this.field_d = 0;
        this.field_f = 0;
    }

    final void a(we param0) {
        this.field_a = param0.f(255);
        this.field_c = param0.k(0);
        this.field_g = param0.k(0);
        this.b(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_f >= this.field_k) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_d = this.field_j[fieldTemp$0] << 15;
            if (this.field_h >= this.field_i) {
                this.field_h = this.field_i - 1;
            }
            this.field_k = (int)((double)this.field_e[this.field_h] / 65536.0 * (double)param0);
            if (this.field_k > this.field_f) {
                this.field_b = ((this.field_j[this.field_h] << 15) - this.field_d) / (this.field_k - this.field_f);
            }
        }
        this.field_d = this.field_d + this.field_b;
        this.field_f = this.field_f + 1;
        return this.field_d - this.field_b >> 15;
    }

    final void b(we param0) {
        int var2 = 0;
        this.field_i = param0.f(255);
        this.field_e = new int[this.field_i];
        this.field_j = new int[this.field_i];
        for (var2 = 0; var2 < this.field_i; var2++) {
            this.field_e[var2] = param0.a((byte) -120);
            this.field_j[var2] = param0.a((byte) -125);
        }
    }

    bk() {
        this.field_i = 2;
        this.field_e = new int[2];
        this.field_j = new int[2];
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
    }
}
