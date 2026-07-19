/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    int[] field_d;
    int[] field_c;
    int field_a;
    int field_b;

    pm() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = in.e(16);
        this.field_a = in.c() != 0 ? in.e(4) + 1 : 1;
        if (in.c() != 0) {
            discarded$8 = in.e(8);
        }
        int discarded$12 = in.e(2);
        if (this.field_a > 1) {
            this.field_b = in.e(4);
        }
        this.field_d = new int[this.field_a];
        this.field_c = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            discarded$13 = in.e(8);
            this.field_d[var1] = in.e(8);
            this.field_c[var1] = in.e(8);
        }
    }
}
