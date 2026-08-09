/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    int[] field_c;
    int field_d;
    int field_b;
    int[] field_a;

    ld() {
        int var1 = 0;
        ig.e(16);
        this.field_b = ig.a() != 0 ? ig.e(4) + 1 : 1;
        if (ig.a() != 0) {
            ig.e(8);
        }
        ig.e(2);
        if (this.field_b > 1) {
            this.field_d = ig.e(4);
        }
        this.field_c = new int[this.field_b];
        this.field_a = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            ig.e(8);
            this.field_c[var1] = ig.e(8);
            this.field_a[var1] = ig.e(8);
        }
    }
}
