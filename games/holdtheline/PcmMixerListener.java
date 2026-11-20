/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int samplesUntilCallback;

    abstract void onRemove();

    abstract int onTimer(PcmStreamMixer param0);

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
