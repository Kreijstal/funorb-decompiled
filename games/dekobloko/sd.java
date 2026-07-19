/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    private int field_b;
    private int[] field_d;
    private int[] field_c;
    private int field_k;
    private int field_f;
    private int field_j;
    int field_e;
    private int field_g;
    int field_a;
    private int field_h;
    int field_i;

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_k >= this.field_b) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_j = this.field_c[fieldTemp$0] << 15;
            if (this.field_g >= this.field_f) {
                this.field_g = this.field_f - 1;
            }
            this.field_b = (int)((double)this.field_d[this.field_g] / 65536.0 * (double)param0);
            if (this.field_b > this.field_k) {
                this.field_h = ((this.field_c[this.field_g] << 15) - this.field_j) / (this.field_b - this.field_k);
            }
        }
        this.field_j = this.field_j + this.field_h;
        this.field_k = this.field_k + 1;
        return this.field_j - this.field_h >> 15;
    }

    final void a() {
        this.field_b = 0;
        this.field_g = 0;
        this.field_h = 0;
        this.field_j = 0;
        this.field_k = 0;
    }

    final void b(wl param0) {
        this.field_a = param0.d((byte) -28);
        this.field_e = param0.i(7553);
        this.field_i = param0.i(7553);
        this.a(param0);
    }

    final void a(wl param0) {
        int var2 = 0;
        this.field_f = param0.d((byte) -69);
        this.field_d = new int[this.field_f];
        this.field_c = new int[this.field_f];
        for (var2 = 0; var2 < this.field_f; var2++) {
            this.field_d[var2] = param0.e(3);
            this.field_c[var2] = param0.e(3);
        }
    }

    sd() {
        this.field_f = 2;
        this.field_d = new int[2];
        this.field_c = new int[2];
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
    }
}
