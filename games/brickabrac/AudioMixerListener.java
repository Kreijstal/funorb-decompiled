/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AudioMixerListener extends IntrusiveNode {
    int remainingSamples;

    abstract void onRemoved();

    private AudioMixerListener() throws Throwable {
        throw new Error();
    }

    abstract int onBoundary(AudioMixer mixer);
}
