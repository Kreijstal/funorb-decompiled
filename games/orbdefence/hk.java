/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int field_b;
    int[] field_d;
    int field_a;
    int[] field_c;

    hk() {
        int var1 = 0;
        nj.c(16);
        this.field_a = nj.b() != 0 ? nj.c(4) + 1 : 1;
        if (nj.b() != 0) {
            nj.c(8);
        }
        nj.c(2);
        if (this.field_a > 1) {
            this.field_b = nj.c(4);
        }
        this.field_d = new int[this.field_a];
        this.field_c = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
            nj.c(8);
            this.field_d[var1] = nj.c(8);
            this.field_c[var1] = nj.c(8);
        }
    }
}
