/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int field_g;
    PcmStreamMixer field_h;

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onAddedToMixer();

    PcmMixerListener() {
    }

    abstract void onRemovedFromMixer();
}
