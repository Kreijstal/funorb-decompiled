/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    PcmStreamMixer field_n;
    int field_m;

    abstract void onAddedToMixer();

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onRemovedFromMixer();

    PcmMixerListener() {
    }
}
