/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int field_b;
    int[] field_d;
    int field_a;
    int[] field_c;

    hk() {
        int var1 = 0;
        nj.readBits(16);
        this.field_a = nj.readBit() != 0 ? nj.readBits(4) + 1 : 1;
        if (nj.readBit() != 0) {
          nj.readBits(8);
        }
        nj.readBits(2);
        if (this.field_a > 1) {
          this.field_b = nj.readBits(4);
        }
        this.field_d = new int[this.field_a];
        this.field_c = new int[this.field_a];
        for (var1 = 0; var1 < this.field_a; var1++) {
          nj.readBits(8);
          this.field_d[var1] = nj.readBits(8);
          this.field_c[var1] = nj.readBits(8);
        }
    }
}
