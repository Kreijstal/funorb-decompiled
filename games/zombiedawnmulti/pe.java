/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    int field_h;
    private int[] field_c;
    private int field_i;
    private int field_j;
    int field_g;
    private int[] field_a;
    private int field_f;
    private int field_d;
    private int field_b;
    int field_e;
    private int field_k;

    final void b(k param0) {
        this.field_e = param0.g(31365);
        this.field_h = param0.i(-1478490344);
        this.field_g = param0.i(-1478490344);
        this.a(param0);
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_f >= this.field_j) {
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            this.field_i = this.field_c[fieldTemp$0] << 15;
            if (this.field_d >= this.field_b) {
                this.field_d = this.field_b - 1;
            }
            this.field_j = (int)((double)this.field_a[this.field_d] / 65536.0 * (double)param0);
            if (this.field_j > this.field_f) {
                this.field_k = ((this.field_c[this.field_d] << 15) - this.field_i) / (this.field_j - this.field_f);
            }
        }
        this.field_i = this.field_i + this.field_k;
        this.field_f = this.field_f + 1;
        return this.field_i - this.field_k >> 15;
    }

    final void a(k param0) {
        int var2 = 0;
        this.field_b = param0.g(31365);
        this.field_a = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var2 = 0; var2 < this.field_b; var2++) {
            this.field_a[var2] = param0.d((byte) 69);
            this.field_c[var2] = param0.d((byte) 69);
        }
    }

    final void a() {
        this.field_j = 0;
        this.field_d = 0;
        this.field_k = 0;
        this.field_i = 0;
        this.field_f = 0;
    }

    pe() {
        this.field_b = 2;
        this.field_a = new int[2];
        this.field_c = new int[2];
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
        this.field_c[0] = 0;
        this.field_c[1] = 65535;
    }
}
