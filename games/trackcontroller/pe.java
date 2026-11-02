/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    int field_b;
    int[] field_a;
    int field_c;
    int[] field_d;

    pe() {
        int var1 = 0;
        VorbisDecoder.f(16);
        this.field_c = VorbisDecoder.b() != 0 ? VorbisDecoder.f(4) + 1 : 1;
        if (VorbisDecoder.b() != 0) {
          VorbisDecoder.f(8);
        }
        VorbisDecoder.f(2);
        if (this.field_c > 1) {
          this.field_b = VorbisDecoder.f(4);
        }
        this.field_a = new int[this.field_c];
        this.field_d = new int[this.field_c];
        for (var1 = 0; var1 < this.field_c; var1++) {
          VorbisDecoder.f(8);
          this.field_a[var1] = VorbisDecoder.f(8);
          this.field_d[var1] = VorbisDecoder.f(8);
        }
    }
}
