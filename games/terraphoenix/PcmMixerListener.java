/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_h;

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onRemovedFromMixer();

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }
}
