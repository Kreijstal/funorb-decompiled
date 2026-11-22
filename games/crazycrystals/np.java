/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    int field_b;
    int field_a;
    int[] field_d;
    int[] field_c;

    np() {
        int var1 = 0;
        bl.readBits(16);
        this.field_b = bl.readBit() != 0 ? bl.readBits(4) + 1 : 1;
        if (bl.readBit() != 0) {
          bl.readBits(8);
        }
        bl.readBits(2);
        if (this.field_b > 1) {
          this.field_a = bl.readBits(4);
        }
        this.field_c = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          bl.readBits(8);
          this.field_c[var1] = bl.readBits(8);
          this.field_d[var1] = bl.readBits(8);
        }
    }
}
