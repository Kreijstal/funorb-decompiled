/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    int field_k;
    private int[] field_h;
    private int field_b;
    private int field_g;
    int field_a;
    private int field_d;
    private int[] field_i;
    private int field_e;
    private int field_j;
    private int field_c;
    int field_f;

    final void b(p param0) {
        this.field_k = param0.i(-100);
        this.field_a = param0.e((byte) -128);
        this.field_f = param0.e((byte) -112);
        this.a(param0);
    }

    final void a(p param0) {
        int var2 = 0;
        this.field_g = param0.i(-101);
        this.field_i = new int[this.field_g];
        this.field_h = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_i[var2] = param0.f(674914976);
            this.field_h[var2] = param0.f(674914976);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_j >= this.field_d) {
            fieldTemp$0 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_b = this.field_h[fieldTemp$0] << 15;
            if (this.field_c >= this.field_g) {
                this.field_c = this.field_g - 1;
            }
            this.field_d = (int)((double)this.field_i[this.field_c] / 65536.0 * (double)param0);
            if (this.field_d > this.field_j) {
                this.field_e = ((this.field_h[this.field_c] << 15) - this.field_b) / (this.field_d - this.field_j);
            }
        }
        this.field_b = this.field_b + this.field_e;
        this.field_j = this.field_j + 1;
        return this.field_b - this.field_e >> 15;
    }

    final void a() {
        this.field_d = 0;
        this.field_c = 0;
        this.field_e = 0;
        this.field_b = 0;
        this.field_j = 0;
    }

    ll() {
        this.field_g = 2;
        this.field_i = new int[2];
        this.field_h = new int[2];
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
    }
}
