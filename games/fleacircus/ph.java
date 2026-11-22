/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    int field_b;
    int[] field_d;
    int[] field_c;
    int field_a;

    ph() {
        int var1 = 0;
        hk.readBits(16);
        this.field_b = hk.readBit() != 0 ? hk.readBits(4) + 1 : 1;
        if (hk.readBit() != 0) {
          hk.readBits(8);
        }
        hk.readBits(2);
        if (this.field_b > 1) {
          this.field_a = hk.readBits(4);
        }
        this.field_d = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          hk.readBits(8);
          this.field_d[var1] = hk.readBits(8);
          this.field_c[var1] = hk.readBits(8);
        }
    }
}
