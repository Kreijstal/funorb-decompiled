/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TimedPcmListener extends IntrusiveNode {
    int framesUntilCallback;

    private TimedPcmListener() throws Throwable {
        throw new Error();
    }

    abstract void onRemoved();

    abstract int onCallback(PcmStreamMixer mixer);
}
