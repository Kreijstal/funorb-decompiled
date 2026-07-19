/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    int[] field_b;
    int[] field_a;
    int field_d;
    int field_c;

    oi() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = hi.d(16);
        this.field_c = hi.b() != 0 ? hi.d(4) + 1 : 1;
        if (hi.b() != 0) {
            discarded$8 = hi.d(8);
        }
        int discarded$12 = hi.d(2);
        if (this.field_c > 1) {
            this.field_d = hi.d(4);
        }
        this.field_a = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = hi.d(8);
            this.field_a[var1] = hi.d(8);
            this.field_b[var1] = hi.d(8);
        }
    }
}
