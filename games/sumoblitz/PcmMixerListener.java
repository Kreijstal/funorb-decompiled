/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int delaySamples;

    abstract void release();

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }

    abstract int onScheduledMix(PcmStreamMixer param0);
}
