/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    int field_b;
    int field_a;
    int[] field_c;
    int[] field_d;

    qc() {
        int var1 = 0;
        ml.f(16);
        this.field_b = ml.a() != 0 ? ml.f(4) + 1 : 1;
        if (ml.a() != 0) {
            ml.f(8);
        }
        ml.f(2);
        if (this.field_b > 1) {
            this.field_a = ml.f(4);
        }
        this.field_c = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            ml.f(8);
            this.field_c[var1] = ml.f(8);
            this.field_d[var1] = ml.f(8);
        }
    }
}
