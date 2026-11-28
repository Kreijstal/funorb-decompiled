/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_k;
    PcmStreamMixer field_j;

    abstract void onAddedToMixer();

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onRemovedFromMixer();

    PcmMixerListener() {
    }
}
