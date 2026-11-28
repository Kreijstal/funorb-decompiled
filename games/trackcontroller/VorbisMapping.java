/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VorbisMapping {
    int field_b;
    int[] field_a;
    int field_c;
    int[] field_d;

    VorbisMapping() {
        int var1 = 0;
        VorbisDecoder.readBits(16);
        this.field_c = VorbisDecoder.readBit() != 0 ? VorbisDecoder.readBits(4) + 1 : 1;
        if (VorbisDecoder.readBit() != 0) {
          VorbisDecoder.readBits(8);
        }
        VorbisDecoder.readBits(2);
        if (this.field_c > 1) {
          this.field_b = VorbisDecoder.readBits(4);
        }
        this.field_a = new int[this.field_c];
        this.field_d = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          VorbisDecoder.readBits(8);
          this.field_a[var1] = VorbisDecoder.readBits(8);
          this.field_d[var1] = VorbisDecoder.readBits(8);
        }
    }
}
