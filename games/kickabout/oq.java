/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    int[] field_a;
    int field_b;
    int[] field_d;
    int field_c;

    oq() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = tg.e(16);
        this.field_b = tg.b() != 0 ? tg.e(4) + 1 : 1;
        if (tg.b() != 0) {
            discarded$8 = tg.e(8);
        }
        int discarded$12 = tg.e(2);
        if (this.field_b > 1) {
            this.field_c = tg.e(4);
        }
        this.field_a = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = tg.e(8);
            this.field_a[var1] = tg.e(8);
            this.field_d[var1] = tg.e(8);
        }
    }
}
