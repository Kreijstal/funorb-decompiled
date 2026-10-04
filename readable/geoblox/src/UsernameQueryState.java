/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameQueryState {
    static boolean introAnimationRunning;
    static UsernameAvailabilityQuery pendingAccountUsernameResult;
    static volatile boolean canvasRedrawRequested;

    public static void clearAccountUsernameResult(boolean methodGuard) {
        if (!methodGuard) {
            UsernameQueryState.clearAccountUsernameResult(false);
            pendingAccountUsernameResult = null;
            return;
        }
        pendingAccountUsernameResult = null;
    }

    final static void handleSessionFlagReset(int methodGuard) {
        if (methodGuard == 11560) {
            TextHotspotBounds.loginResponseFlagEightSet = false;
            LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
            return;
        }
        introAnimationRunning = false;
        TextHotspotBounds.loginResponseFlagEightSet = false;
        LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
    }

    static {
        introAnimationRunning = true;
        canvasRedrawRequested = true;
    }
}
