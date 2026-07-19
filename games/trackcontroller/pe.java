/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    int field_b;
    int[] field_a;
    int field_c;
    int[] field_d;

    pe() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = ml.f(16);
        this.field_c = ml.b() != 0 ? ml.f(4) + 1 : 1;
        if (ml.b() != 0) {
            discarded$8 = ml.f(8);
        }
        int discarded$12 = ml.f(2);
        if (this.field_c > 1) {
            this.field_b = ml.f(4);
        }
        this.field_a = new int[this.field_c];
        this.field_d = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
            discarded$13 = ml.f(8);
            this.field_a[var1] = ml.f(8);
            this.field_d[var1] = ml.f(8);
        }
    }
}
