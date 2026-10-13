/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSound extends AudioData {
    int loopEnd;
    int sampleRate;
    boolean pingPong;
    byte[] samples;
    int loopStart;

    PcmSound(int sampleRate, byte[] samples, int loopStart, int loopEnd) {
        this.sampleRate = sampleRate;
        this.samples = samples;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
    }

    PcmSound(int sampleRate, byte[] samples, int loopStart, int loopEnd, boolean pingPong) {
        this.sampleRate = sampleRate;
        this.samples = samples;
        this.loopStart = loopStart;
        this.loopEnd = loopEnd;
        this.pingPong = pingPong ? true : false;
    }
}
