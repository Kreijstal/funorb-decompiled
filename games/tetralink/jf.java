/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    int field_c;
    int[] field_a;
    int[] field_b;
    int field_d;

    jf() {
        int var1 = 0;
        ag.readBits(16);
        this.field_d = ag.readBit() != 0 ? ag.readBits(4) + 1 : 1;
        if (ag.readBit() != 0) {
          ag.readBits(8);
        }
        ag.readBits(2);
        if (this.field_d > 1) {
          this.field_c = ag.readBits(4);
        }
        this.field_b = new int[this.field_d];
        this.field_a = new int[this.field_d];
        for (var1 = 0; var1 < this.field_d; var1++) {
          ag.readBits(8);
          this.field_b[var1] = ag.readBits(8);
          this.field_a[var1] = ag.readBits(8);
        }
    }
}
