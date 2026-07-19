/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    private int field_i;
    int field_b;
    private int[] field_c;
    int field_e;
    private int field_h;
    private int field_a;
    private int field_k;
    int field_f;
    private int field_j;
    private int field_g;
    private int[] field_d;

    final void a(sb param0) {
        int var2 = 0;
        this.field_a = param0.d((byte) -54);
        this.field_c = new int[this.field_a];
        this.field_d = new int[this.field_a];
        for (var2 = 0; var2 < this.field_a; var2++) {
            this.field_c[var2] = param0.e(-12);
            this.field_d[var2] = param0.e(-23);
        }
    }

    final void a() {
        this.field_i = 0;
        this.field_j = 0;
        this.field_k = 0;
        this.field_g = 0;
        this.field_h = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_h >= this.field_i) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_g = this.field_d[fieldTemp$0] << 15;
            if (this.field_j >= this.field_a) {
                this.field_j = this.field_a - 1;
            }
            this.field_i = (int)((double)this.field_c[this.field_j] / 65536.0 * (double)param0);
            if (this.field_i > this.field_h) {
                this.field_k = ((this.field_d[this.field_j] << 15) - this.field_g) / (this.field_i - this.field_h);
            }
        }
        this.field_g = this.field_g + this.field_k;
        this.field_h = this.field_h + 1;
        return this.field_g - this.field_k >> 15;
    }

    final void b(sb param0) {
        this.field_e = param0.d((byte) -54);
        this.field_f = param0.b((byte) 57);
        this.field_b = param0.b((byte) 70);
        this.a(param0);
    }

    cj() {
        this.field_a = 2;
        this.field_c = new int[2];
        this.field_d = new int[2];
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
    }
}
