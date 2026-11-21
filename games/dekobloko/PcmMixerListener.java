/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends HashNode {
    PcmStreamMixer pcmStreamMixerState0003;
    int integerState0698;

    abstract void onRemovedFromMixer();

    abstract void onAddedToMixer();

    PcmMixerListener() {
    }

    abstract int onMixerTick(PcmStreamMixer pcmStreamMixerArgument1);
}
