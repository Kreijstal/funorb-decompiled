/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_f;
    PcmStreamMixer field_g;

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onRemovedFromMixer();

    abstract void onAddedToMixer();

    PcmMixerListener() {
    }
}
