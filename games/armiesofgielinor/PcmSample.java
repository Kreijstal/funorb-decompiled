/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends ow {
    byte[] samples;
    int sampleRate;
    int loopStart;
    int loopEnd;
    boolean loopModeFlag;

    PcmSample(int sampleRate, byte[] samples, int loopStart, int loopEnd) {
        this.sampleRate = sampleRate;
        this.samples = samples;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
    }

    PcmSample(int sampleRate, byte[] samples, int loopStart, int loopEnd, boolean loopModeFlag) {
        this.sampleRate = sampleRate;
        this.samples = samples;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
        this.loopModeFlag = loopModeFlag ? true : false;
    }
}
