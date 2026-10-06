/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int loopStart;
    int sampleRateHz;
    int loopEnd;
    boolean pingPongLoop;
    byte[] samples;

    final PcmSample resampleInPlace(PcmResampler resampler) {
        this.samples = resampler.resampleBytes(99, this.samples);
        this.sampleRateHz = resampler.scaleSampleRate(-128, this.sampleRateHz);
        if (this.loopStart != this.loopEnd) {
            this.loopStart = resampler.scaleSamplePosition(this.loopStart, 6);
            this.loopEnd = resampler.scaleSamplePosition(this.loopEnd, 6);
            if (this.loopStart == this.loopEnd) {
                this.loopStart = this.loopStart - 1;
            }
            return this;
        }
        int scaledSharedLoopPosition = resampler.scaleSamplePosition(this.loopStart, 6);
        this.loopEnd = scaledSharedLoopPosition;
        this.loopStart = scaledSharedLoopPosition;
        return this;
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
