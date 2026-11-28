/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    PcmStreamMixer field_f;
    int field_e;

    abstract int onScheduledEvent(PcmStreamMixer param0);

    abstract void onAddedToMixer();

    PcmMixerListener() {
    }

    abstract void onRemovedFromMixer();
}
