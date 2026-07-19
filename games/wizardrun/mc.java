/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    int field_c;
    int[] field_d;
    int[] field_b;
    int field_a;

    mc() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = nc.a(16);
        this.field_c = nc.c() != 0 ? nc.a(4) + 1 : 1;
        if (nc.c() != 0) {
            discarded$8 = nc.a(8);
        }
        int discarded$12 = nc.a(2);
        if (this.field_c > 1) {
            this.field_a = nc.a(4);
        }
        this.field_b = new int[this.field_c];
        this.field_d = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = nc.a(8);
            this.field_b[var1] = nc.a(8);
            this.field_d[var1] = nc.a(8);
        }
    }
}
