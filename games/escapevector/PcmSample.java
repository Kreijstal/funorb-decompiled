/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractPcmSample {
    int loopEnd;
    boolean pingPongLoop;
    int loopStart;
    int sampleRate;
    byte[] samples;

    final PcmSample resample(PcmResampler resampler) {
        this.samples = resampler.resample(-128, this.samples);
        this.sampleRate = resampler.scaleSampleRate(this.sampleRate, (byte) -87);
        if (this.loopStart != this.loopEnd) {
          this.loopStart = resampler.scalePosition(false, this.loopStart);
          this.loopEnd = resampler.scalePosition(false, this.loopEnd);
          if (this.loopStart == this.loopEnd) {
            this.loopStart = this.loopStart - 1;
          }
          return this;
        }
        int dupTemp$0 = resampler.scalePosition(false, this.loopStart);
        this.loopEnd = dupTemp$0;
        this.loopStart = dupTemp$0;
        return this;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.sampleRate = param0;
        this.samples = param1;
        this.loopStart = param2;
        this.loopEnd = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.sampleRate = param0;
        this.samples = param1;
        this.loopStart = param2;
        this.loopEnd = param3;
        this.pingPongLoop = param4 ? true : false;
    }
}
