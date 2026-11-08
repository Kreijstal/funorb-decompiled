/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStreamMixerListener extends IntrusiveNode {
    int field_o;

    abstract int onMixerTick(PcmStreamMixer param0);

    abstract void onRemoved();

    private PcmStreamMixerListener() throws Throwable {
        throw new Error();
    }
}
