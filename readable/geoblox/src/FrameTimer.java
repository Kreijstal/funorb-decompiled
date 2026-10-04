/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameTimer {
    static int[] rankedEntryRatioThirdComponents;
    static String receivedRecordPrimaryName;

    static long andLong(long left, long right) {
        return left & right;
    }

    public static void releaseSharedResources(int methodGuard) {
        receivedRecordPrimaryName = null;
        if (methodGuard > -59) {
            return;
        }
        rankedEntryRatioThirdComponents = null;
    }

    final int awaitAndCountTicks(byte methodGuard, long tickPeriodNanos) {
        long sleepMillis = this.measureSleepMillis((byte) -49);
        if ((0L < sleepMillis)) {
            ByteTextDecodingSupport.sleepMillis(0, sleepMillis);
        }
        if (methodGuard == -6) {
            return this.advanceTicks(true, tickPeriodNanos);
        }
        return -30;
    }

    abstract void resetForResume(int methodGuard);

    abstract long measureSleepMillis(byte methodGuard);

    abstract int advanceTicks(boolean methodGuard, long tickPeriodNanos);

    static {
    }
}
