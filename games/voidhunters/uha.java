/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha {
    int[] field_c;
    int[] field_d;
    int field_a;
    int field_b;

    uha() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = fca.c(16);
        this.field_a = fca.c() != 0 ? fca.c(4) + 1 : 1;
        if (fca.c() != 0) {
            discarded$8 = fca.c(8);
        }
        int discarded$12 = fca.c(2);
        if (this.field_a > 1) {
            this.field_b = fca.c(4);
        }
        this.field_c = new int[this.field_a];
        this.field_d = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            discarded$13 = fca.c(8);
            this.field_c[var1] = fca.c(8);
            this.field_d[var1] = fca.c(8);
        }
    }
}
