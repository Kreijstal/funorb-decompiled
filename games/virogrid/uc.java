/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    int[] field_a;
    int[] field_c;
    int field_b;
    int field_d;

    uc() {
        int var1 = 0;
        gj.a(16);
        this.field_d = gj.b() != 0 ? gj.a(4) + 1 : 1;
        if (gj.b() != 0) {
            gj.a(8);
        }
        gj.a(2);
        if (this.field_d > 1) {
            this.field_b = gj.a(4);
        }
        this.field_c = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
            gj.a(8);
            this.field_c[var1] = gj.a(8);
            this.field_a[var1] = gj.a(8);
        }
    }
}
