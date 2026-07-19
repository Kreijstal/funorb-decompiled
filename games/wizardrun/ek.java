/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    int field_k;
    private int field_c;
    private int field_g;
    private int field_i;
    private int field_a;
    private int[] field_e;
    private int field_h;
    int field_f;
    private int field_d;
    int field_b;
    private int[] field_j;

    final void a() {
        this.field_g = 0;
        this.field_i = 0;
        this.field_c = 0;
        this.field_a = 0;
        this.field_h = 0;
    }

    final void b(va param0) {
        this.field_f = param0.f(255);
        this.field_b = param0.i(255);
        this.field_k = param0.i(255);
        this.a(param0);
    }

    final void a(va param0) {
        int var2 = 0;
        this.field_d = param0.f(255);
        this.field_j = new int[this.field_d];
        this.field_e = new int[this.field_d];
        for (var2 = 0; var2 < this.field_d; var2++) {
            this.field_j[var2] = param0.j(-14477);
            this.field_e[var2] = param0.j(-14477);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_h >= this.field_g) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_a = this.field_e[fieldTemp$0] << 15;
            if (this.field_i >= this.field_d) {
                this.field_i = this.field_d - 1;
            }
            this.field_g = (int)((double)this.field_j[this.field_i] / 65536.0 * (double)param0);
            if (this.field_g > this.field_h) {
                this.field_c = ((this.field_e[this.field_i] << 15) - this.field_a) / (this.field_g - this.field_h);
            }
        }
        this.field_a = this.field_a + this.field_c;
        this.field_h = this.field_h + 1;
        return this.field_a - this.field_c >> 15;
    }

    ek() {
        this.field_d = 2;
        this.field_j = new int[2];
        this.field_e = new int[2];
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
    }
}
