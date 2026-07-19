/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    int field_e;
    private int field_h;
    private int field_g;
    private int field_i;
    private int[] field_f;
    private int field_k;
    int field_a;
    private int[] field_j;
    int field_c;
    private int field_b;
    private int field_d;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_i >= this.field_g) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_k = this.field_j[fieldTemp$0] << 15;
            if (this.field_h >= this.field_b) {
                this.field_h = this.field_b - 1;
            }
            this.field_g = (int)((double)this.field_f[this.field_h] / 65536.0 * (double)param0);
            if (this.field_g > this.field_i) {
                this.field_d = ((this.field_j[this.field_h] << 15) - this.field_k) / (this.field_g - this.field_i);
            }
        }
        this.field_k = this.field_k + this.field_d;
        this.field_i = this.field_i + 1;
        return this.field_k - this.field_d >> 15;
    }

    final void b(wf param0) {
        this.field_a = param0.d(true);
        this.field_e = param0.d((byte) 19);
        this.field_c = param0.d((byte) 19);
        this.a(param0);
    }

    final void a() {
        this.field_g = 0;
        this.field_h = 0;
        this.field_d = 0;
        this.field_k = 0;
        this.field_i = 0;
    }

    final void a(wf param0) {
        int var2 = 0;
        this.field_b = param0.d(true);
        this.field_f = new int[this.field_b];
        this.field_j = new int[this.field_b];
        for (var2 = 0; var2 < this.field_b; var2++) {
            this.field_f[var2] = param0.b(-1698573656);
            this.field_j[var2] = param0.b(-1698573656);
        }
    }

    se() {
        this.field_b = 2;
        this.field_f = new int[2];
        this.field_j = new int[2];
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
        this.field_j[0] = 0;
        this.field_j[1] = 65535;
    }
}
