/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    private int field_a;
    int field_h;
    int field_i;
    private int[] field_j;
    private int field_f;
    private int field_c;
    private int field_e;
    private int field_k;
    private int[] field_b;
    int field_d;
    private int field_g;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_k >= this.field_g) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_a = this.field_b[fieldTemp$0] << 15;
            if (this.field_f >= this.field_e) {
                this.field_f = this.field_e - 1;
            }
            this.field_g = (int)((double)this.field_j[this.field_f] / 65536.0 * (double)param0);
            if (this.field_g > this.field_k) {
                this.field_c = ((this.field_b[this.field_f] << 15) - this.field_a) / (this.field_g - this.field_k);
            }
        }
        this.field_a = this.field_a + this.field_c;
        this.field_k = this.field_k + 1;
        return this.field_a - this.field_c >> 15;
    }

    final void a() {
        this.field_g = 0;
        this.field_f = 0;
        this.field_c = 0;
        this.field_a = 0;
        this.field_k = 0;
    }

    final void a(ka param0) {
        int var2 = 0;
        this.field_e = param0.f(4);
        this.field_j = new int[this.field_e];
        this.field_b = new int[this.field_e];
        for (var2 = 0; var2 < this.field_e; var2++) {
            this.field_j[var2] = param0.c((byte) 113);
            this.field_b[var2] = param0.c((byte) 115);
        }
    }

    final void b(ka param0) {
        this.field_h = param0.f(4);
        this.field_d = param0.b(false);
        this.field_i = param0.b(false);
        this.a(param0);
    }

    qg() {
        this.field_e = 2;
        this.field_j = new int[2];
        this.field_b = new int[2];
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
        this.field_b[0] = 0;
        this.field_b[1] = 65535;
    }
}
