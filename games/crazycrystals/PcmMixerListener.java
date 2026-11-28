/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_f;

    abstract void onRemovedFromMixer();

    abstract int onScheduledEvent(PcmStreamMixer param0);

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
