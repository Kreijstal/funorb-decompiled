/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends gs {
    int loopEnd;
    int loopStart;
    byte[] samples;
    int sampleRate;
    boolean pingPongLoop;

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
