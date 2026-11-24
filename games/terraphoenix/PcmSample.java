/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int field_j;
    int field_m;
    int field_l;
    byte[] field_k;
    boolean field_i;

    final PcmSample resample(PcmResampler param0) {
        this.field_k = param0.resampleBytes((byte) 109, this.field_k);
        this.field_l = param0.scaleRate(this.field_l, true);
        if (this.field_j != this.field_m) {
          this.field_j = param0.scalePosition((byte) 46, this.field_j);
          this.field_m = param0.scalePosition((byte) 46, this.field_m);
          if (this.field_j == this.field_m) {
            this.field_j = this.field_j - 1;
          }
          return this;
        }
        int dupTemp$0 = param0.scalePosition((byte) 46, this.field_j);
        this.field_m = dupTemp$0;
        this.field_j = dupTemp$0;
        return this;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_l = param0;
        this.field_k = param1;
        this.field_j = param2;
        this.field_m = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_l = param0;
        this.field_k = param1;
        this.field_j = param2;
        this.field_m = param3;
        this.field_i = param4 ? true : false;
    }
}
