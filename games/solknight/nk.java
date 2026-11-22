/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    int field_d;
    int[] field_a;
    int[] field_c;
    int field_b;

    nk() {
        int var1 = 0;
        sl.readBits(16);
        this.field_b = sl.readBit() != 0 ? sl.readBits(4) + 1 : 1;
        if (sl.readBit() != 0) {
          sl.readBits(8);
        }
        sl.readBits(2);
        if (this.field_b > 1) {
          this.field_d = sl.readBits(4);
        }
        this.field_a = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          sl.readBits(8);
          this.field_a[var1] = sl.readBits(8);
          this.field_c[var1] = sl.readBits(8);
        }
    }
}
