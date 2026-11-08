/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_g;

    abstract void onRemoved();

    abstract int update(PcmStreamMixer param0);

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
