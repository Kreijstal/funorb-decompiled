/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmScheduledEvent extends IntrusiveNode {
    int time;

    abstract int a(PcmStreamMixer param0);

    abstract void a();

    private PcmScheduledEvent() throws Throwable {
        throw new Error();
    }
}
