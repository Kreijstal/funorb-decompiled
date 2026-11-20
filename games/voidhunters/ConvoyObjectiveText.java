/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConvoyObjectiveText {
    static String stopEnemyConvoyText;
    static String cancelUnratedRematchText;

    final static void checkObfuscationGuard(byte param0) {
        int var1 = -44 % ((param0 + 41) / 58);
    }

    public static void clearSharedReferences(byte param0) {
        cancelUnratedRematchText = null;
        stopEnemyConvoyText = null;
        int var1 = -55 % ((67 - param0) / 55);
    }

    static {
        stopEnemyConvoyText = "Stop the enemy convoy";
        cancelUnratedRematchText = "Cancel unrated rematch";
    }
}
