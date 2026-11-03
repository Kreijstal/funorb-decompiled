/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    int[] field_a;
    int field_b;
    int[] field_d;
    int field_c;

    oq() {
        int var1 = 0;
        VorbisSample.readBits(16);
        this.field_b = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        if (VorbisSample.readBit() != 0) {
          VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.field_b > 1) {
          this.field_c = VorbisSample.readBits(4);
        }
        this.field_a = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
          VorbisSample.readBits(8);
          this.field_a[var1] = VorbisSample.readBits(8);
          this.field_d[var1] = VorbisSample.readBits(8);
        }
    }
}
