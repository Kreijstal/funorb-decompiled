/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    int[] field_b;
    int[] field_a;
    int field_d;
    int field_c;

    oi() {
        int var1 = 0;
        hi.readBits(16);
        this.field_c = hi.readBit() != 0 ? hi.readBits(4) + 1 : 1;
        if (hi.readBit() != 0) {
          hi.readBits(8);
        }
        hi.readBits(2);
        if (this.field_c > 1) {
          this.field_d = hi.readBits(4);
        }
        this.field_a = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          hi.readBits(8);
          this.field_a[var1] = hi.readBits(8);
          this.field_b[var1] = hi.readBits(8);
        }
    }
}
