/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_h;

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }

    abstract void onRemovedFromMixer();

    abstract int onScheduledEvent(PcmStreamMixer param0);
}
