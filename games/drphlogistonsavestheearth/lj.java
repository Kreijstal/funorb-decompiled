/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private int[] field_j;
    private int field_c;
    private int field_d;
    int field_e;
    private int field_i;
    private int field_a;
    private int[] field_f;
    private int field_k;
    int field_b;
    private int field_g;
    int field_h;

    final void a(od param0) {
        int var2 = 0;
        this.field_k = param0.l(31760);
        this.field_j = new int[this.field_k];
        this.field_f = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_j[var2] = param0.j(-788751192);
            this.field_f[var2] = param0.j(-788751192);
        }
    }

    final void b(od param0) {
        this.field_e = param0.l(31760);
        this.field_b = param0.h(-114);
        this.field_h = param0.h(-122);
        this.a(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_g >= this.field_c) {
            fieldTemp$0 = this.field_a;
            this.field_a = this.field_a + 1;
            this.field_d = this.field_f[fieldTemp$0] << 15;
            if (this.field_a >= this.field_k) {
                this.field_a = this.field_k - 1;
            }
            this.field_c = (int)((double)this.field_j[this.field_a] / 65536.0 * (double)param0);
            if (this.field_c > this.field_g) {
                this.field_i = ((this.field_f[this.field_a] << 15) - this.field_d) / (this.field_c - this.field_g);
            }
        }
        this.field_d = this.field_d + this.field_i;
        this.field_g = this.field_g + 1;
        return this.field_d - this.field_i >> 15;
    }

    lj() {
        this.field_k = 2;
        this.field_j = new int[2];
        this.field_f = new int[2];
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
    }

    final void a() {
        this.field_c = 0;
        this.field_a = 0;
        this.field_i = 0;
        this.field_d = 0;
        this.field_g = 0;
    }
}
