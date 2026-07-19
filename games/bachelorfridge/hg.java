/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    int field_a;
    int field_c;
    int[] field_b;
    int[] field_d;

    hg() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = dv.a(16);
        this.field_c = dv.a() != 0 ? dv.a(4) + 1 : 1;
        if (dv.a() != 0) {
            discarded$8 = dv.a(8);
        }
        int discarded$12 = dv.a(2);
        if (this.field_c > 1) {
            this.field_a = dv.a(4);
        }
        this.field_d = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = dv.a(8);
            this.field_d[var1] = dv.a(8);
            this.field_b[var1] = dv.a(8);
        }
    }
}
