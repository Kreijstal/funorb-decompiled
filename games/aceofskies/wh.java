/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private int[] field_d;
    int field_b;
    private int field_g;
    private int[] field_f;
    private int field_e;
    private int field_k;
    private int field_h;
    private int field_j;
    private int field_i;
    int field_c;
    int field_a;

    final void a(rb param0) {
        int var2 = 0;
        this.field_k = param0.g(-121);
        this.field_d = new int[this.field_k];
        this.field_f = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_d[var2] = param0.i((byte) 0);
            this.field_f[var2] = param0.i((byte) 0);
        }
    }

    final void b(rb param0) {
        this.field_c = param0.g(-122);
        this.field_a = param0.a((byte) 116);
        this.field_b = param0.a((byte) 120);
        this.a(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_g >= this.field_j) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_i = this.field_f[fieldTemp$0] << 15;
            if (this.field_e >= this.field_k) {
                this.field_e = this.field_k - 1;
            }
            this.field_j = (int)((double)this.field_d[this.field_e] / 65536.0 * (double)param0);
            if (this.field_j > this.field_g) {
                this.field_h = ((this.field_f[this.field_e] << 15) - this.field_i) / (this.field_j - this.field_g);
            }
        }
        this.field_i = this.field_i + this.field_h;
        this.field_g = this.field_g + 1;
        return this.field_i - this.field_h >> 15;
    }

    final void a() {
        this.field_j = 0;
        this.field_e = 0;
        this.field_h = 0;
        this.field_i = 0;
        this.field_g = 0;
    }

    wh() {
        this.field_k = 2;
        this.field_d = new int[2];
        this.field_f = new int[2];
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
    }
}
