/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    private int[] field_d;
    int field_h;
    private int[] field_k;
    private int field_f;
    private int field_c;
    private int field_b;
    private int field_j;
    int field_g;
    private int field_a;
    int field_e;
    private int field_i;

    final void a() {
        this.field_b = 0;
        this.field_c = 0;
        this.field_f = 0;
        this.field_j = 0;
        this.field_a = 0;
    }

    final void b(ed param0) {
        this.field_e = param0.h(-11);
        this.field_h = param0.b(true);
        this.field_g = param0.b(true);
        this.a(param0);
    }

    final void a(ed param0) {
        int var2 = 0;
        this.field_i = param0.h(-11);
        this.field_k = new int[this.field_i];
        this.field_d = new int[this.field_i];
        for (var2 = 0; var2 < this.field_i; var2++) {
            this.field_k[var2] = param0.a((byte) -11);
            this.field_d[var2] = param0.a((byte) -11);
        }
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_a >= this.field_b) {
            fieldTemp$0 = this.field_c;
            this.field_c = this.field_c + 1;
            this.field_j = this.field_d[fieldTemp$0] << 15;
            if (this.field_c >= this.field_i) {
                this.field_c = this.field_i - 1;
            }
            this.field_b = (int)((double)this.field_k[this.field_c] / 65536.0 * (double)param0);
            if (this.field_b > this.field_a) {
                this.field_f = ((this.field_d[this.field_c] << 15) - this.field_j) / (this.field_b - this.field_a);
            }
        }
        this.field_j = this.field_j + this.field_f;
        this.field_a = this.field_a + 1;
        return this.field_j - this.field_f >> 15;
    }

    pr() {
        this.field_i = 2;
        this.field_k = new int[2];
        this.field_d = new int[2];
        this.field_k[0] = 0;
        this.field_k[1] = 65535;
        this.field_d[0] = 0;
        this.field_d[1] = 65535;
    }
}
