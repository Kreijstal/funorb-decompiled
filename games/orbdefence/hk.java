/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int field_b;
    int[] field_d;
    int field_a;
    int[] field_c;

    hk() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = nj.c(16);
        this.field_a = nj.b() != 0 ? nj.c(4) + 1 : 1;
        if (nj.b() != 0) {
            discarded$8 = nj.c(8);
        }
        int discarded$12 = nj.c(2);
        if (this.field_a > 1) {
            this.field_b = nj.c(4);
        }
        this.field_d = new int[this.field_a];
        this.field_c = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            discarded$13 = nj.c(8);
            this.field_d[var1] = nj.c(8);
            this.field_c[var1] = nj.c(8);
        }
    }
}
