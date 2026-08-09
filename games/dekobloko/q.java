/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    int field_c;
    int[] field_a;
    int field_b;
    int[] field_d;

    q() {
        int var1 = 0;
        va.c(16);
        this.field_b = va.b() != 0 ? va.c(4) + 1 : 1;
        if (va.b() != 0) {
            va.c(8);
        }
        va.c(2);
        if (this.field_b > 1) {
            this.field_c = va.c(4);
        }
        this.field_a = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            va.c(8);
            this.field_a[var1] = va.c(8);
            this.field_d[var1] = va.c(8);
        }
    }
}
