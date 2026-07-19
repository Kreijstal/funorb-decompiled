/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    int field_b;
    private int[] field_h;
    private int field_c;
    int field_g;
    private int field_i;
    private int field_e;
    private int field_d;
    private int[] field_k;
    private int field_j;
    int field_f;
    private int field_a;

    final void b(dh param0) {
        int var2 = 0;
        this.field_j = param0.a(-16384);
        this.field_h = new int[this.field_j];
        this.field_k = new int[this.field_j];
        for (var2 = 0; var2 < this.field_j; var2++) {
            this.field_h[var2] = param0.i(-25578);
            this.field_k[var2] = param0.i(-25578);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_e >= this.field_d) {
            fieldTemp$0 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_a = this.field_k[fieldTemp$0] << 15;
            if (this.field_c >= this.field_j) {
                this.field_c = this.field_j - 1;
            }
            this.field_d = (int)((double)this.field_h[this.field_c] / 65536.0 * (double)param0);
            if (this.field_d > this.field_e) {
                this.field_i = ((this.field_k[this.field_c] << 15) - this.field_a) / (this.field_d - this.field_e);
            }
        }
        this.field_a = this.field_a + this.field_i;
        this.field_e = this.field_e + 1;
        return this.field_a - this.field_i >> 15;
    }

    final void a(dh param0) {
        this.field_f = param0.a(-16384);
        this.field_g = param0.f((byte) -107);
        this.field_b = param0.f((byte) -107);
        this.b(param0);
    }

    final void a() {
        this.field_d = 0;
        this.field_c = 0;
        this.field_i = 0;
        this.field_a = 0;
        this.field_e = 0;
    }

    fj() {
        this.field_j = 2;
        this.field_h = new int[2];
        this.field_k = new int[2];
        this.field_h[0] = 0;
        this.field_h[1] = 65535;
        this.field_k[0] = 0;
        this.field_k[1] = 65535;
    }
}
