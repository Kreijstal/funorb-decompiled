/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    int field_a;
    int field_c;
    int[] field_b;
    int[] field_d;

    hg() {
        int var1 = 0;
        dv.a(16);
        this.field_c = dv.a() != 0 ? dv.a(4) + 1 : 1;
        if (dv.a() != 0) {
            dv.a(8);
        }
        dv.a(2);
        if (this.field_c > 1) {
            this.field_a = dv.a(4);
        }
        this.field_d = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            dv.a(8);
            this.field_d[var1] = dv.a(8);
            this.field_b[var1] = dv.a(8);
        }
    }
}
