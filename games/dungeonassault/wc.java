/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_c;
    int[] field_a;
    int[] field_b;
    int field_d;

    wc() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = jp.a(16);
        this.field_c = jp.b() != 0 ? jp.a(4) + 1 : 1;
        if (jp.b() != 0) {
            discarded$8 = jp.a(8);
        }
        int discarded$12 = jp.a(2);
        if (this.field_c > 1) {
            this.field_d = jp.a(4);
        }
        this.field_a = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = jp.a(8);
            this.field_a[var1] = jp.a(8);
            this.field_b[var1] = jp.a(8);
        }
    }
}
