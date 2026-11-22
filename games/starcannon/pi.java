/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    int field_b;
    int[] field_c;
    int[] field_d;
    int field_a;

    pi() {
        int var1 = 0;
        nj.readBits(16);
        this.field_b = nj.readBit() != 0 ? nj.readBits(4) + 1 : 1;
        if (nj.readBit() != 0) {
          nj.readBits(8);
        }
        nj.readBits(2);
        if (this.field_b > 1) {
          this.field_a = nj.readBits(4);
        }
        this.field_d = new int[this.field_b];
        this.field_c = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          nj.readBits(8);
          this.field_d[var1] = nj.readBits(8);
          this.field_c[var1] = nj.readBits(8);
        }
    }
}
