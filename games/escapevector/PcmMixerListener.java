/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int remainingSamples;
    PcmStreamMixer owner;

    abstract void onRemoved();

    abstract int onDeadline(PcmStreamMixer mixer);

    abstract void onScheduled();

    PcmMixerListener() {
    }
}
