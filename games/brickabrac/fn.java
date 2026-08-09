/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    int[] field_a;
    int field_c;
    int field_b;
    int[] field_d;

    fn() {
        int var1 = 0;
        bk.c(16);
        this.field_b = bk.b() != 0 ? bk.c(4) + 1 : 1;
        if (bk.b() != 0) {
            bk.c(8);
        }
        bk.c(2);
        if (this.field_b > 1) {
            this.field_c = bk.c(4);
        }
        this.field_d = new int[this.field_b];
        this.field_a = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            bk.c(8);
            this.field_d[var1] = bk.c(8);
            this.field_a[var1] = bk.c(8);
        }
    }
}
