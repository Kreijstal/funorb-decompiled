/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int field_j;
    boolean field_n;
    int field_k;
    byte[] field_l;
    int field_m;

    final PcmSample resample(PcmResampler param0) {
        this.field_l = param0.resampleBytes(this.field_l, -108);
        this.field_k = param0.scaleRate(this.field_k, 14698);
        if (this.field_m != this.field_j) {
          this.field_m = param0.scalePosition(this.field_m, 18308);
          this.field_j = param0.scalePosition(this.field_j, 18308);
          if (this.field_m == this.field_j) {
            this.field_m = this.field_m - 1;
          }
          return this;
        }
        int dupTemp$0 = param0.scalePosition(this.field_m, 18308);
        this.field_j = dupTemp$0;
        this.field_m = dupTemp$0;
        return this;
    }

    PcmSample(int param0, int param1) {
        this.field_k = param0;
        this.field_l = new byte[param1];
        this.field_m = 0;
        this.field_j = param1;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_k = param0;
        this.field_l = param1;
        this.field_m = param2;
        this.field_j = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_k = param0;
        this.field_l = param1;
        this.field_m = param2;
        this.field_j = param3;
        this.field_n = param4 ? true : false;
    }
}
