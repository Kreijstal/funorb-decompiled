/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private int field_a;
    int field_b;
    private int field_i;
    private int[] field_j;
    private int field_g;
    int field_d;
    private int field_h;
    private int[] field_k;
    int field_c;
    private int field_f;
    private int field_e;

    final void a() {
        this.field_e = 0;
        this.field_f = 0;
        this.field_h = 0;
        this.field_i = 0;
        this.field_a = 0;
    }

    final void a(mg param0) {
        this.field_c = param0.b((byte) 90);
        this.field_b = param0.l(0);
        this.field_d = param0.l(0);
        this.b(param0);
    }

    final void b(mg param0) {
        int var2 = 0;
        this.field_g = param0.b((byte) 90);
        this.field_j = new int[this.field_g];
        this.field_k = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_j[var2] = param0.j(98203176);
            this.field_k[var2] = param0.j(98203176);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_a >= this.field_e) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_i = this.field_k[fieldTemp$0] << 15;
            if (this.field_f >= this.field_g) {
                this.field_f = this.field_g - 1;
            }
            this.field_e = (int)((double)this.field_j[this.field_f] / 65536.0 * (double)param0);
            if (this.field_e > this.field_a) {
                this.field_h = ((this.field_k[this.field_f] << 15) - this.field_i) / (this.field_e - this.field_a);
            }
        }
        this.field_i = this.field_i + this.field_h;
        this.field_a = this.field_a + 1;
        return this.field_i - this.field_h >> 15;
    }

    ah() {
        this.field_g = 2;
        this.field_j = new int[2];
        this.field_k = new int[2];
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
        this.field_k[0] = 0;
        this.field_k[1] = 65535;
    }
}
