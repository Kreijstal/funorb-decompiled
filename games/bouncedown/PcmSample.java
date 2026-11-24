/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int field_i;
    int field_l;
    byte[] field_h;
    boolean field_j;
    int field_k;

    final PcmSample resample(PcmResampler param0) {
        this.field_h = param0.resampleBytes(this.field_h, true);
        this.field_k = param0.scaleRate(false, this.field_k);
        if (this.field_i != this.field_l) {
          this.field_i = param0.scalePosition(this.field_i, 6);
          this.field_l = param0.scalePosition(this.field_l, 6);
          if (this.field_i == this.field_l) {
            this.field_i = this.field_i - 1;
          }
          return this;
        }
        int dupTemp$0 = param0.scalePosition(this.field_i, 6);
        this.field_l = dupTemp$0;
        this.field_i = dupTemp$0;
        return this;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_k = param0;
        this.field_h = param1;
        this.field_i = param2;
        this.field_l = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_k = param0;
        this.field_h = param1;
        this.field_i = param2;
        this.field_l = param3;
        this.field_j = param4 ? true : false;
    }
}
