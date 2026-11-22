/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_c;
    int[] field_a;
    int[] field_b;
    int field_d;

    wc() {
        int var1 = 0;
        jp.readBits(16);
        this.field_c = jp.readBit() != 0 ? jp.readBits(4) + 1 : 1;
        if (jp.readBit() != 0) {
          jp.readBits(8);
        }
        jp.readBits(2);
        if (this.field_c > 1) {
          this.field_d = jp.readBits(4);
        }
        this.field_a = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          jp.readBits(8);
          this.field_a[var1] = jp.readBits(8);
          this.field_b[var1] = jp.readBits(8);
        }
    }
}
