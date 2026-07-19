/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    int field_b;
    int[] field_c;
    int[] field_d;
    int field_a;

    pi() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = nj.a(16);
        this.field_b = nj.b() != 0 ? nj.a(4) + 1 : 1;
        if (nj.b() != 0) {
            discarded$8 = nj.a(8);
        }
        int discarded$12 = nj.a(2);
        if (this.field_b > 1) {
            this.field_a = nj.a(4);
        }
        this.field_d = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            discarded$13 = nj.a(8);
            this.field_d[var1] = nj.a(8);
            this.field_c[var1] = nj.a(8);
        }
    }
}
