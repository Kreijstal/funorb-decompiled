/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionInstanceState {
    static long clientInstanceId;
    static Sprite sweetsForegroundSprite;
    static boolean sessionExitRequested;
    static int secondaryAchievementTrackingCounter;

    static int orInt(int left, int right) {
        return left | right;
    }

    public static void releaseSessionInstanceSprite(int methodGuard) {
        sweetsForegroundSprite = null;
        int sentinelQuotient = -53 / ((methodGuard + 21) / 42);
    }

    static {
    }
}
