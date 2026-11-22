/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    int[] field_b;
    int field_c;
    int[] field_d;
    int field_a;

    ia() {
        int var1 = 0;
        ph.readBits(16);
        this.field_a = ph.readBit() != 0 ? ph.readBits(4) + 1 : 1;
        if (ph.readBit() != 0) {
          ph.readBits(8);
        }
        ph.readBits(2);
        if (this.field_a > 1) {
          this.field_c = ph.readBits(4);
        }
        this.field_b = new int[this.field_a];
        this.field_d = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
          ph.readBits(8);
          this.field_b[var1] = ph.readBits(8);
          this.field_d[var1] = ph.readBits(8);
        }
    }
}
