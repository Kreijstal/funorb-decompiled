/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmMixerListener extends IntrusiveNode {
    int scheduledFrameOffset;

    private PcmMixerListener() throws Throwable {
        throw new Error();
    }

    abstract int onMixerDeadline(PcmStreamMixer mixer);

    abstract void onRemovedFromMixer();
}
