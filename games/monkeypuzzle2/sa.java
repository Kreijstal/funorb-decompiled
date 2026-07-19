/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    int field_c;
    int[] field_b;
    int[] field_a;
    int field_d;

    sa() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = sf.f(16);
        this.field_c = sf.b() != 0 ? sf.f(4) + 1 : 1;
        if (sf.b() != 0) {
            discarded$8 = sf.f(8);
        }
        int discarded$12 = sf.f(2);
        if (this.field_c > 1) {
            this.field_d = sf.f(4);
        }
        this.field_a = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = sf.f(8);
            this.field_a[var1] = sf.f(8);
            this.field_b[var1] = sf.f(8);
        }
    }
}
