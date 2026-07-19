/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    int field_g;
    private int field_h;
    private int[] field_c;
    private int field_b;
    private int field_k;
    private int field_a;
    private int field_d;
    int field_e;
    private int field_f;
    int field_j;
    private int[] field_i;

    final void a() {
        this.field_h = 0;
        this.field_a = 0;
        this.field_f = 0;
        this.field_d = 0;
        this.field_b = 0;
    }

    final void a(qc param0) {
        this.field_e = param0.c((byte) 34);
        this.field_j = param0.a((byte) -82);
        this.field_g = param0.a((byte) -52);
        this.b(param0);
    }

    final void b(qc param0) {
        int var2 = 0;
        this.field_k = param0.c((byte) 34);
        this.field_c = new int[this.field_k];
        this.field_i = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_c[var2] = param0.b(true);
            this.field_i[var2] = param0.b(true);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_b >= this.field_h) {
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_d = this.field_i[fieldTemp$0] << 15;
            if (this.field_a >= this.field_k) {
                this.field_a = this.field_k - 1;
            }
            this.field_h = (int)((double)this.field_c[this.field_a] / 65536.0 * (double)param0);
            if (this.field_h > this.field_b) {
                this.field_f = ((this.field_i[this.field_a] << 15) - this.field_d) / (this.field_h - this.field_b);
            }
        }
        this.field_d = this.field_d + this.field_f;
        this.field_b = this.field_b + 1;
        return this.field_d - this.field_f >> 15;
    }

    uc() {
        this.field_k = 2;
        this.field_c = new int[2];
        this.field_i = new int[2];
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
    }
}
