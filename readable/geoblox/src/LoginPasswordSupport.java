/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginPasswordSupport {
    static String currentLoginPassword;
    static Sprite[] blackOrbImplosionFrames;
    static int[] rankedEntryKeyTwo;
    static int[] thirdVertexTransformedZ;

    final static void requestLoginUiActionFour(int methodGuard) {
        if (methodGuard != -23738) {
            return;
        }
        MidiNote.setPendingLoginUiAction(4, false);
    }

    public static void releaseLoginPasswordResources(int methodGuard) {
        thirdVertexTransformedZ = null;
        if (methodGuard != -17525) {
            return;
        }
        rankedEntryKeyTwo = null;
        blackOrbImplosionFrames = null;
        currentLoginPassword = null;
    }

    static {
        thirdVertexTransformedZ = new int[8192];
    }
}
