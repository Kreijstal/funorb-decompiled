/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rpb {
    int field_i;
    private int field_k;
    private int field_h;
    int field_e;
    int field_j;
    private int field_d;
    private int field_b;
    private int[] field_f;
    private int[] field_a;
    private int field_c;
    private int field_g;

    final void a() {
        this.field_k = 0;
        this.field_d = 0;
        this.field_h = 0;
        this.field_b = 0;
        this.field_c = 0;
    }

    final void a(ds param0) {
        int var2 = 0;
        this.field_g = param0.e((byte) -113);
        this.field_f = new int[this.field_g];
        this.field_a = new int[this.field_g];
        for (var2 = 0; var2 < this.field_g; var2++) {
            this.field_f[var2] = param0.e(1869);
            this.field_a[var2] = param0.e(1869);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_c >= this.field_k) {
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            this.field_b = this.field_a[fieldTemp$0] << 15;
            if (this.field_d >= this.field_g) {
                this.field_d = this.field_g - 1;
            }
            this.field_k = (int)((double)this.field_f[this.field_d] / 65536.0 * (double)param0);
            if (this.field_k > this.field_c) {
                this.field_h = ((this.field_a[this.field_d] << 15) - this.field_b) / (this.field_k - this.field_c);
            }
        }
        this.field_b = this.field_b + this.field_h;
        this.field_c = this.field_c + 1;
        return this.field_b - this.field_h >> 15;
    }

    final void b(ds param0) {
        this.field_e = param0.e((byte) -110);
        this.field_i = param0.h(19);
        this.field_j = param0.h(63);
        this.a(param0);
    }

    rpb() {
        this.field_g = 2;
        this.field_f = new int[2];
        this.field_a = new int[2];
        this.field_f[0] = 0;
        this.field_f[1] = 65535;
        this.field_a[0] = 0;
        this.field_a[1] = 65535;
    }
}
