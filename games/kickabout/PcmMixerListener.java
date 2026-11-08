/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int frameOffset;

    abstract int onTimer(PcmStreamMixer param0);

    abstract void onRemoved();

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
