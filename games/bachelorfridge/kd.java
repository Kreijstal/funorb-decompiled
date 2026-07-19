/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    private int[] field_j;
    private int field_e;
    private int field_d;
    int field_k;
    int field_g;
    private int field_c;
    private int field_a;
    private int field_h;
    int field_b;
    private int[] field_i;
    private int field_f;

    final void b(lu param0) {
        this.field_k = param0.b(16711935);
        this.field_b = param0.f(125);
        this.field_g = param0.f(50);
        this.a(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_h >= this.field_e) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_a = this.field_j[fieldTemp$0] << 15;
            if (this.field_f >= this.field_c) {
                this.field_f = this.field_c - 1;
            }
            this.field_e = (int)((double)this.field_i[this.field_f] / 65536.0 * (double)param0);
            if (this.field_e > this.field_h) {
                this.field_d = ((this.field_j[this.field_f] << 15) - this.field_a) / (this.field_e - this.field_h);
            }
        }
        this.field_a = this.field_a + this.field_d;
        this.field_h = this.field_h + 1;
        return this.field_a - this.field_d >> 15;
    }

    final void a(lu param0) {
        int var2 = 0;
        this.field_c = param0.b(16711935);
        this.field_i = new int[this.field_c];
        this.field_j = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
            this.field_i[var2] = param0.e((byte) 126);
            this.field_j[var2] = param0.e((byte) 120);
        }
    }

    final void a() {
        this.field_e = 0;
        this.field_f = 0;
        this.field_d = 0;
        this.field_a = 0;
        this.field_h = 0;
    }

    kd() {
        this.field_c = 2;
        this.field_i = new int[2];
        this.field_j = new int[2];
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
    }
}
