/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MonotonicTime {
    static int packetDelayMillis;
    static int[] brickHitPendingTypes;
    static String field_f;
    static String field_a;
    static int tooltipDelayTicks;
    static boolean field_c;

    public static void a(byte param0) {
        brickHitPendingTypes = null;
        field_a = null;
        if (param0 != -114) {
          return;
        }
        field_f = null;
    }

    final synchronized static long nowMillis(boolean obfuscationGuard) {
        long wallMillis = System.currentTimeMillis();
        if (!(LogoRenderHelpers.lastWallMillis <= wallMillis)) {
          MultiplayerExitScreen.wallRollbackMillis = MultiplayerExitScreen.wallRollbackMillis + (LogoRenderHelpers.lastWallMillis - wallMillis);
        }
        LogoRenderHelpers.lastWallMillis = wallMillis;
        if (obfuscationGuard) {
          MonotonicTime.nowMillis(false);
        }
        return MultiplayerExitScreen.wallRollbackMillis + wallMillis;
    }

    static {
        packetDelayMillis = 0;
        brickHitPendingTypes = new int[29];
        field_f = "Play free version";
        tooltipDelayTicks = 50;
        brickHitPendingTypes[22] = 23;
        brickHitPendingTypes[13] = 0;
        brickHitPendingTypes[11] = 0;
        brickHitPendingTypes[12] = 0;
        brickHitPendingTypes[24] = 0;
        brickHitPendingTypes[15] = 0;
        brickHitPendingTypes[14] = 0;
        brickHitPendingTypes[19] = 0;
        brickHitPendingTypes[8] = 0;
        brickHitPendingTypes[9] = 0;
        brickHitPendingTypes[4] = 0;
        brickHitPendingTypes[16] = 0;
        brickHitPendingTypes[10] = 0;
        brickHitPendingTypes[6] = 0;
        brickHitPendingTypes[0] = 0;
        brickHitPendingTypes[1] = 1;
        brickHitPendingTypes[2] = 0;
        brickHitPendingTypes[25] = 25;
        brickHitPendingTypes[20] = 0;
        brickHitPendingTypes[3] = 0;
        brickHitPendingTypes[7] = 0;
        brickHitPendingTypes[5] = 0;
        brickHitPendingTypes[17] = 0;
        brickHitPendingTypes[18] = 0;
        brickHitPendingTypes[21] = 22;
        brickHitPendingTypes[23] = 0;
        brickHitPendingTypes[28] = 28;
        brickHitPendingTypes[27] = 0;
        brickHitPendingTypes[26] = 26;
        field_a = "Neat!";
    }
}
