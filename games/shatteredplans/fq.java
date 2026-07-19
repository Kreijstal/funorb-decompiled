/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq {
    int field_d;
    int[] field_b;
    int[] field_a;
    int field_c;

    fq() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = fd.a(16);
        this.field_c = fd.c() != 0 ? fd.a(4) + 1 : 1;
        if (fd.c() != 0) {
            discarded$8 = fd.a(8);
        }
        int discarded$12 = fd.a(2);
        if (this.field_c > 1) {
            this.field_d = fd.a(4);
        }
        this.field_b = new int[this.field_c];
        this.field_a = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = fd.a(8);
            this.field_b[var1] = fd.a(8);
            this.field_a[var1] = fd.a(8);
        }
    }
}
