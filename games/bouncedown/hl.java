/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    private int field_g;
    int field_a;
    int field_h;
    private int[] field_i;
    int field_e;
    private int field_k;
    private int field_f;
    private int field_c;
    private int field_d;
    private int field_j;
    private int[] field_b;

    final void a() {
        this.field_g = 0;
        this.field_f = 0;
        this.field_j = 0;
        this.field_c = 0;
        this.field_d = 0;
    }

    final int a(int param0) {
        int fieldTemp$0 = 0;
        if (this.field_d >= this.field_g) {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            this.field_c = this.field_i[fieldTemp$0] << 15;
            if (this.field_f >= this.field_k) {
                this.field_f = this.field_k - 1;
            }
            this.field_g = (int)((double)this.field_b[this.field_f] / 65536.0 * (double)param0);
            if (this.field_g > this.field_d) {
                this.field_j = ((this.field_i[this.field_f] << 15) - this.field_c) / (this.field_g - this.field_d);
            }
        }
        this.field_c = this.field_c + this.field_j;
        this.field_d = this.field_d + 1;
        return this.field_c - this.field_j >> 15;
    }

    final void b(wi param0) {
        int var2 = 0;
        this.field_k = param0.d((byte) -110);
        this.field_b = new int[this.field_k];
        this.field_i = new int[this.field_k];
        for (var2 = 0; var2 < this.field_k; var2++) {
            this.field_b[var2] = param0.a(-1640531527);
            this.field_i[var2] = param0.a(-1640531527);
        }
    }

    final void a(wi param0) {
        this.field_h = param0.d((byte) -72);
        this.field_e = param0.j(-3);
        this.field_a = param0.j(-3);
        this.b(param0);
    }

    hl() {
        this.field_k = 2;
        this.field_b = new int[2];
        this.field_i = new int[2];
        this.field_b[0] = 0;
        this.field_b[1] = 65535;
        this.field_i[0] = 0;
        this.field_i[1] = 65535;
    }
}
