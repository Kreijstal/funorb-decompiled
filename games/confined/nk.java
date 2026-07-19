/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private int field_a;
    private int field_c;
    private int field_g;
    private int field_f;
    private int field_h;
    private int[] field_b;
    private int[] field_e;
    int field_i;
    int field_j;
    int field_d;
    private int field_k;

    final void a(kg param0) {
        int var2 = 0;
        this.field_a = param0.c(32);
        this.field_b = new int[this.field_a];
        this.field_e = new int[this.field_a];
        for (var2 = 0; var2 < this.field_a; var2++) {
            this.field_b[var2] = param0.a((byte) 25);
            this.field_e[var2] = param0.a((byte) 25);
        }
    }

    final void b(kg param0) {
        this.field_d = param0.c(32);
        this.field_i = param0.f((byte) 57);
        this.field_j = param0.f((byte) 74);
        this.a(param0);
    }

    final void a() {
        this.field_h = 0;
        this.field_g = 0;
        this.field_c = 0;
        this.field_k = 0;
        this.field_f = 0;
    }

    nk() {
        this.field_a = 2;
        this.field_b = new int[2];
        this.field_e = new int[2];
        this.field_b[0] = 0;
        this.field_b[1] = 65535;
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_f >= this.field_h) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_k = this.field_e[fieldTemp$0] << 15;
            if (this.field_g >= this.field_a) {
                this.field_g = this.field_a - 1;
            }
            this.field_h = (int)((double)this.field_b[this.field_g] / 65536.0 * (double)param0);
            if (this.field_h > this.field_f) {
                this.field_c = ((this.field_e[this.field_g] << 15) - this.field_k) / (this.field_h - this.field_f);
            }
        }
        this.field_k = this.field_k + this.field_c;
        this.field_f = this.field_f + 1;
        return this.field_k - this.field_c >> 15;
    }
}
