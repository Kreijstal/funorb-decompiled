/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int loopStart;
    int sampleRateHz;
    int loopEnd;
    boolean pingPongLoop;
    byte[] samples;

    final PcmSample a(PcmResampler param0) {
        this.samples = param0.a(99, this.samples);
        this.sampleRateHz = param0.a(-128, this.sampleRateHz);
        if (this.loopStart != this.loopEnd) {
            this.loopStart = param0.b(this.loopStart, 6);
            this.loopEnd = param0.b(this.loopEnd, 6);
            if (this.loopStart == this.loopEnd) {
                this.loopStart = this.loopStart - 1;
            }
            return (PcmSample) (this);
        }
        int dupTemp$0 = param0.b(this.loopStart, 6);
        this.loopEnd = dupTemp$0;
        this.loopStart = dupTemp$0;
        return (PcmSample) (this);
    }

    PcmSample(int sampleRateHz, byte[] samples, int loopStart, int loopEnd) {
        this.sampleRateHz = sampleRateHz;
        this.samples = samples;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
    }

    PcmSample(int sampleRateHz, byte[] samples, int loopStart, int loopEnd, boolean pingPongLoop) {
        this.sampleRateHz = sampleRateHz;
        this.samples = samples;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
        this.pingPongLoop = pingPongLoop ? true : false;
    }
}
