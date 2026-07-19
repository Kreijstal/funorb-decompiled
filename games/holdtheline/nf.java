/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    int field_d;
    int field_b;
    int[] field_c;
    int[] field_a;

    nf() {
        int discarded$8 = 0;
        int var1 = 0;
        int discarded$13 = 0;
        int discarded$7 = sn.f(16);
        this.field_d = sn.b() != 0 ? sn.f(4) + 1 : 1;
        if (sn.b() != 0) {
            discarded$8 = sn.f(8);
        }
        int discarded$12 = sn.f(2);
        if (this.field_d > 1) {
            this.field_b = sn.f(4);
        }
        this.field_a = new int[this.field_d];
        this.field_c = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
            discarded$13 = sn.f(8);
            this.field_a[var1] = sn.f(8);
            this.field_c[var1] = sn.f(8);
        }
    }
}
