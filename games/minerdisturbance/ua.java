/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    int[] field_b;
    int field_c;
    int field_a;
    int[] field_d;

    ua() {
        int var1 = 0;
        b.readBits(16);
        this.field_a = b.readBit() != 0 ? b.readBits(4) + 1 : 1;
        if (b.readBit() != 0) {
          b.readBits(8);
        }
        b.readBits(2);
        if (this.field_a > 1) {
          this.field_c = b.readBits(4);
        }
        this.field_d = new int[this.field_a];
        this.field_b = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
          b.readBits(8);
          this.field_d[var1] = b.readBits(8);
          this.field_b[var1] = b.readBits(8);
        }
    }
}
