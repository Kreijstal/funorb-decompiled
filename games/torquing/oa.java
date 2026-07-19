/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    int field_d;
    int[] field_a;
    int field_b;
    int[] field_c;

    oa() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = ho.c(16);
        this.field_d = ho.a() != 0 ? ho.c(4) + 1 : 1;
        if (ho.a() != 0) {
            discarded$8 = ho.c(8);
        }
        int discarded$12 = ho.c(2);
        if (this.field_d > 1) {
            this.field_b = ho.c(4);
        }
        this.field_c = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
            discarded$13 = ho.c(8);
            this.field_c[var1] = ho.c(8);
            this.field_a[var1] = ho.c(8);
        }
    }
}
