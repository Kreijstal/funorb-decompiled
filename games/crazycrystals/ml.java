/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private int field_k;
    private int field_a;
    private int field_i;
    int field_h;
    private int field_f;
    private int field_j;
    private int field_e;
    int field_d;
    int field_c;
    private int[] field_g;
    private int[] field_b;

    final void b(ng param0) {
        this.field_c = param0.h(255);
        this.field_h = param0.b((byte) 127);
        this.field_d = param0.b((byte) -7);
        this.a(param0);
    }

    final void a() {
        this.field_f = 0;
        this.field_a = 0;
        this.field_i = 0;
        this.field_k = 0;
        this.field_j = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_j >= this.field_f) {
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_k = this.field_b[fieldTemp$0] << 15;
            if (this.field_a >= this.field_e) {
                this.field_a = this.field_e - 1;
            }
            this.field_f = (int)((double)this.field_g[this.field_a] / 65536.0 * (double)param0);
            if (this.field_f > this.field_j) {
                this.field_i = ((this.field_b[this.field_a] << 15) - this.field_k) / (this.field_f - this.field_j);
            }
        }
        this.field_k = this.field_k + this.field_i;
        this.field_j = this.field_j + 1;
        return this.field_k - this.field_i >> 15;
    }

    final void a(ng param0) {
        int var2 = 0;
        this.field_e = param0.h(255);
        this.field_g = new int[this.field_e];
        this.field_b = new int[this.field_e];
        for (var2 = 0; var2 < this.field_e; var2++) {
            this.field_g[var2] = param0.c((byte) -7);
            this.field_b[var2] = param0.c((byte) -7);
        }
    }

    ml() {
        this.field_e = 2;
        this.field_g = new int[2];
        this.field_b = new int[2];
        this.field_g[0] = 0;
        this.field_g[1] = 65535;
        this.field_b[0] = 0;
        this.field_b[1] = 65535;
    }
}
