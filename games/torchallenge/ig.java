/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    int field_c;
    int[] field_b;
    int[] field_d;
    int field_a;

    ig() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = wg.d(16);
        this.field_c = wg.a() != 0 ? wg.d(4) + 1 : 1;
        if (wg.a() != 0) {
            discarded$8 = wg.d(8);
        }
        int discarded$12 = wg.d(2);
        if (this.field_c > 1) {
            this.field_a = wg.d(4);
        }
        this.field_d = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = wg.d(8);
            this.field_d[var1] = wg.d(8);
            this.field_b[var1] = wg.d(8);
        }
    }
}
