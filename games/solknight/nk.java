/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    int field_d;
    int[] field_a;
    int[] field_c;
    int field_b;

    nk() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = sl.d(16);
        this.field_b = sl.a() != 0 ? sl.d(4) + 1 : 1;
        if (sl.a() != 0) {
            discarded$8 = sl.d(8);
        }
        int discarded$12 = sl.d(2);
        if (this.field_b > 1) {
            this.field_d = sl.d(4);
        }
        this.field_a = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = sl.d(8);
            this.field_a[var1] = sl.d(8);
            this.field_c[var1] = sl.d(8);
        }
    }
}
