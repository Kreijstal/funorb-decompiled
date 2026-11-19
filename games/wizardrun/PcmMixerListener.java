/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_i;

    abstract int update(PcmStreamMixer param0);

    abstract void onRemoved();

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
