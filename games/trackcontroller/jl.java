/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    private int[] field_i;
    private int field_d;
    int field_g;
    int field_k;
    private int field_c;
    private int field_b;
    int field_a;
    private int[] field_j;
    private int field_e;
    private int field_f;
    private int field_h;

    final void a() {
        this.field_b = 0;
        this.field_e = 0;
        this.field_h = 0;
        this.field_c = 0;
        this.field_d = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_d >= this.field_b) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_c = this.field_j[fieldTemp$0] << 15;
            if (this.field_e >= this.field_f) {
                this.field_e = this.field_f - 1;
            }
            this.field_b = (int)((double)this.field_i[this.field_e] / 65536.0 * (double)param0);
            if (this.field_b > this.field_d) {
                this.field_h = ((this.field_j[this.field_e] << 15) - this.field_c) / (this.field_b - this.field_d);
            }
        }
        this.field_c = this.field_c + this.field_h;
        this.field_d = this.field_d + 1;
        return this.field_c - this.field_h >> 15;
    }

    final void b(be param0) {
        this.field_k = param0.h(16383);
        this.field_a = param0.e((byte) 113);
        this.field_g = param0.e((byte) 113);
        this.a(param0);
    }

    final void a(be param0) {
        int var2 = 0;
        this.field_f = param0.h(16383);
        this.field_i = new int[this.field_f];
        this.field_j = new int[this.field_f];
        for (var2 = 0; var2 < this.field_f; var2++) {
            this.field_i[var2] = param0.d((byte) -62);
            this.field_j[var2] = param0.d((byte) -102);
        }
    }

    jl() {
        this.field_f = 2;
        this.field_i = new int[2];
        this.field_j = new int[2];
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
    }
}
