/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int remainingSamples;

    abstract void onRemove();

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }

    abstract int update(PcmStreamMixer param0);
}
