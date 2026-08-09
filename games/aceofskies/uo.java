/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    int field_d;
    int[] field_c;
    int[] field_b;
    int field_a;

    uo() {
        int var1 = 0;
        t.d(16);
        this.field_a = t.b() != 0 ? t.d(4) + 1 : 1;
        if (t.b() != 0) {
            t.d(8);
        }
        t.d(2);
        if (this.field_a > 1) {
            this.field_d = t.d(4);
        }
        this.field_c = new int[this.field_a];
        this.field_b = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            t.d(8);
            this.field_c[var1] = t.d(8);
            this.field_b[var1] = t.d(8);
        }
    }
}
