/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    int[] field_a;
    int[] field_c;
    int field_b;
    int field_d;

    uc() {
        int var1 = 0;
        gj.readBits(16);
        this.field_d = gj.readBit() != 0 ? gj.readBits(4) + 1 : 1;
        if (gj.readBit() != 0) {
          gj.readBits(8);
        }
        gj.readBits(2);
        if (this.field_d > 1) {
          this.field_b = gj.readBits(4);
        }
        this.field_c = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
          gj.readBits(8);
          this.field_c[var1] = gj.readBits(8);
          this.field_a[var1] = gj.readBits(8);
        }
    }
}
