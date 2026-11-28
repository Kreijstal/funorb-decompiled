/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_l;
    PcmStreamMixer field_k;

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onRemovedFromMixer();

    PcmMixerListener() {
    }

    abstract void onAddedToMixer();
}
