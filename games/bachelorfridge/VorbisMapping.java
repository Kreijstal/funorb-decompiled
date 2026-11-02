/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int field_a;
    int field_c;
    int[] field_b;
    int[] field_d;

    VorbisMapping() {
        int var1 = 0;
        VorbisSample.readBits(16);
        this.field_c = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        if (VorbisSample.readBit() != 0) {
          VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.field_c > 1) {
          this.field_a = VorbisSample.readBits(4);
        }
        this.field_d = new int[this.field_c];
        this.field_b = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          VorbisSample.readBits(8);
          this.field_d[var1] = VorbisSample.readBits(8);
          this.field_b[var1] = VorbisSample.readBits(8);
        }
    }
}
