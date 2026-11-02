/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckHelpers {
    static String playerOneLabel;
    static int secondPreviousPacketOpcode;
    static RgbSprite[] activePowerUpSprites;

    final static void resetPendingReflectionChecks(byte obfuscationGuard) {
        ResourceArchive.pendingReflectionChecks = new NodeDeque();
        if (obfuscationGuard != -46) {
          ReflectionCheckHelpers.clearSharedReferences(12);
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        playerOneLabel = null;
        if (obfuscationGuard != -8495) {
          ReflectionCheckHelpers.resetPendingReflectionChecks((byte) -45);
          activePowerUpSprites = null;
          return;
        }
        activePowerUpSprites = null;
    }

    static {
        secondPreviousPacketOpcode = -1;
        playerOneLabel = "Player One";
    }
}
