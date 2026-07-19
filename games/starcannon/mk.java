/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private int[] field_a;
    private int field_k;
    int field_b;
    private int field_f;
    private int field_d;
    private int field_j;
    private int field_h;
    int field_g;
    int field_i;
    private int field_c;
    private int[] field_e;

    final void a(rb param0) {
        this.field_i = param0.j(7909);
        this.field_g = param0.f((byte) -125);
        this.field_b = param0.f((byte) -93);
        this.b(param0);
    }

    final void a() {
        this.field_f = 0;
        this.field_k = 0;
        this.field_j = 0;
        this.field_d = 0;
        this.field_h = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_h >= this.field_f) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_d = this.field_e[fieldTemp$0] << 15;
            if (this.field_k >= this.field_c) {
                this.field_k = this.field_c - 1;
            }
            this.field_f = (int)((double)this.field_a[this.field_k] / 65536.0 * (double)param0);
            if (this.field_f > this.field_h) {
                this.field_j = ((this.field_e[this.field_k] << 15) - this.field_d) / (this.field_f - this.field_h);
            }
        }
        this.field_d = this.field_d + this.field_j;
        this.field_h = this.field_h + 1;
        return this.field_d - this.field_j >> 15;
    }

    final void b(rb param0) {
        int var2 = 0;
        this.field_c = param0.j(7909);
        this.field_a = new int[this.field_c];
        this.field_e = new int[this.field_c];
        for (var2 = 0; var2 < this.field_c; var2++) {
            this.field_a[var2] = param0.i(-1174051992);
            this.field_e[var2] = param0.i(-1174051992);
        }
    }

    mk() {
        this.field_c = 2;
        this.field_a = new int[2];
        this.field_e = new int[2];
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
        this.field_e[0] = 0;
        this.field_e[1] = 65535;
    }
}
