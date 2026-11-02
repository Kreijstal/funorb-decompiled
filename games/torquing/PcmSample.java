/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int sampleRate;
    boolean field_l;
    int loopEnd;
    int loopStart;
    byte[] data;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.sampleRate = param0;
        this.data = param1;
        this.loopStart = param2;
        this.loopEnd = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.sampleRate = param0;
        this.data = param1;
        this.loopStart = param2;
        this.loopEnd = param3;
        this.field_l = param4 ? true : false;
    }
}
