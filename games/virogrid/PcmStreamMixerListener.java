/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStreamMixerListener extends IntrusiveNode {
    int field_g;

    abstract int onMixerTick(PcmStreamMixer param0);

    private PcmStreamMixerListener() throws Throwable {
        throw new Error();
    }

    abstract void onRemoved();
}
