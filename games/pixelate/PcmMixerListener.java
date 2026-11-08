/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_k;

    abstract void onMixed();

    abstract int poll(PcmStreamMixer param0);

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
