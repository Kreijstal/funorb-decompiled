/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    int[] field_a;
    int field_d;
    int field_c;
    int[] field_b;

    oh() {
        int var1 = 0;
        ad.d(16);
        this.field_d = ad.a() != 0 ? ad.d(4) + 1 : 1;
        if (ad.a() != 0) {
            ad.d(8);
        }
        ad.d(2);
        if (this.field_d > 1) {
            this.field_c = ad.d(4);
        }
        this.field_b = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
            ad.d(8);
            this.field_b[var1] = ad.d(8);
            this.field_a[var1] = ad.d(8);
        }
    }
}
