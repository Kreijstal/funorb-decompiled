/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private int field_g;
    private int field_a;
    int field_e;
    private int[] field_d;
    int field_i;
    private int field_k;
    private int field_f;
    private int field_c;
    int field_h;
    private int field_b;
    private int[] field_j;

    final void a(uf param0) {
        this.field_h = param0.j(-122);
        this.field_e = param0.i(50);
        this.field_i = param0.i(37);
        this.b(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_c >= this.field_b) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_a = this.field_d[fieldTemp$0] << 15;
            if (this.field_k >= this.field_g) {
                this.field_k = this.field_g - 1;
            }
            this.field_b = (int)((double)this.field_j[this.field_k] / 65536.0 * (double)param0);
            if (this.field_b > this.field_c) {
                this.field_f = ((this.field_d[this.field_k] << 15) - this.field_a) / (this.field_b - this.field_c);
            }
        }
        this.field_a = this.field_a + this.field_f;
        this.field_c = this.field_c + 1;
        return this.field_a - this.field_f >> 15;
    }

    final void a() {
        this.field_b = 0;
        this.field_k = 0;
        this.field_f = 0;
        this.field_a = 0;
        this.field_c = 0;
    }

    final void b(uf param0) {
        int var2 = 0;
        this.field_g = param0.j(-122);
        this.field_j = new int[this.field_g];
        this.field_d = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_j[var2] = param0.c(false);
            this.field_d[var2] = param0.c(false);
        }
    }

    bm() {
        this.field_g = 2;
        this.field_j = new int[2];
        this.field_d = new int[2];
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
    }
}
