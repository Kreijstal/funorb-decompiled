/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_h;

    abstract void cancel();

    abstract int onMixerTick(PcmMixer param0);

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
