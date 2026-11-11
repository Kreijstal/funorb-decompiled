/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixerListener extends IntrusiveNode {
    int field_f;

    abstract int onFrameReached(PcmStreamMixer param0);

    abstract void onRemoved();

    private MixerListener() throws Throwable {
        throw new Error();
    }
}
