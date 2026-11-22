/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int[] field_d;
    int field_c;
    int[] field_a;
    int field_b;

    tf() {
        int var1 = 0;
        te.readBits(16);
        this.field_b = te.readBit() != 0 ? te.readBits(4) + 1 : 1;
        if (te.readBit() != 0) {
          te.readBits(8);
        }
        te.readBits(2);
        if (this.field_b > 1) {
          this.field_c = te.readBits(4);
        }
        this.field_a = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          te.readBits(8);
          this.field_a[var1] = te.readBits(8);
          this.field_d[var1] = te.readBits(8);
        }
    }
}
