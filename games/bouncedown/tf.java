/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int[] field_d;
    int field_c;
    int[] field_a;
    int field_b;

    tf() {
        int var1 = 0;
        te.d(16);
        this.field_b = te.b() != 0 ? te.d(4) + 1 : 1;
        if (te.b() != 0) {
            te.d(8);
        }
        te.d(2);
        if (this.field_b > 1) {
            this.field_c = te.d(4);
        }
        this.field_a = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            te.d(8);
            this.field_a[var1] = te.d(8);
            this.field_d[var1] = te.d(8);
        }
    }
}
