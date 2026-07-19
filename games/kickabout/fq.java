/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    private int[] field_e;
    private int field_d;
    private int field_f;
    private int field_c;
    private int field_a;
    int field_g;
    private int field_h;
    private int field_k;
    int field_b;
    int field_j;
    private int[] field_i;

    final void a(iw param0) {
        this.field_g = param0.h((byte) -106);
        this.field_b = param0.k(4);
        this.field_j = param0.k(4);
        this.b(param0);
    }

    final void a() {
        this.field_h = 0;
        this.field_k = 0;
        this.field_f = 0;
        this.field_d = 0;
        this.field_a = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_a >= this.field_h) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_d = this.field_i[fieldTemp$0] << 15;
            if (this.field_k >= this.field_c) {
                this.field_k = this.field_c - 1;
            }
            this.field_h = (int)((double)this.field_e[this.field_k] / 65536.0 * (double)param0);
            if (this.field_h > this.field_a) {
                this.field_f = ((this.field_i[this.field_k] << 15) - this.field_d) / (this.field_h - this.field_a);
            }
        }
        this.field_d = this.field_d + this.field_f;
        this.field_a = this.field_a + 1;
        return this.field_d - this.field_f >> 15;
    }

    final void b(iw param0) {
        int var2 = 0;
        this.field_c = param0.h((byte) -119);
        this.field_e = new int[this.field_c];
        this.field_i = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
            this.field_e[var2] = param0.a((byte) 81);
            this.field_i[var2] = param0.a((byte) 81);
        }
    }

    fq() {
        this.field_c = 2;
        this.field_e = new int[2];
        this.field_i = new int[2];
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
    }
}
