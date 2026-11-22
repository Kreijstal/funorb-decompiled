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
        ad.readBits(16);
        this.field_d = ad.readBit() != 0 ? ad.readBits(4) + 1 : 1;
        if (ad.readBit() != 0) {
          ad.readBits(8);
        }
        ad.readBits(2);
        if (this.field_d > 1) {
          this.field_c = ad.readBits(4);
        }
        this.field_b = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
          ad.readBits(8);
          this.field_b[var1] = ad.readBits(8);
          this.field_a[var1] = ad.readBits(8);
        }
    }
}
