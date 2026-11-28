/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_j;

    abstract int onScheduledEvent(PcmStreamMixer param0);

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }

    abstract void onRemovedFromMixer();
}
