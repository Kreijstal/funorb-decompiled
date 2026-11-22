/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    int field_b;
    int field_a;
    int[] field_c;
    int[] field_d;

    qc() {
        int var1 = 0;
        ml.readBits(16);
        this.field_b = ml.readBit() != 0 ? ml.readBits(4) + 1 : 1;
        if (ml.readBit() != 0) {
          ml.readBits(8);
        }
        ml.readBits(2);
        if (this.field_b > 1) {
          this.field_a = ml.readBits(4);
        }
        this.field_c = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          ml.readBits(8);
          this.field_c[var1] = ml.readBits(8);
          this.field_d[var1] = ml.readBits(8);
        }
    }
}
