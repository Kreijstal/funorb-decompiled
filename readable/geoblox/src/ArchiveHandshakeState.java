/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveHandshakeState {
    static String tutorialCompleteMessage;
    static BufferedSocket archiveHandshakeSocket;
    static int heapCapacityEstimateMiB;
    private static String unusedDiagnosticPrefix;

    public static void releaseArchiveHandshakeResources(boolean methodGuard) {
        if (methodGuard) {
            tutorialCompleteMessage = (String) null;
            archiveHandshakeSocket = null;
            tutorialCompleteMessage = null;
            return;
        }
        archiveHandshakeSocket = null;
        tutorialCompleteMessage = null;
    }

    static {
        unusedDiagnosticPrefix = "li.A(";
        tutorialCompleteMessage = "You clearly have a knack for this! It's time for the real deal. Remember: try to prevent the geoblox from reaching the edge of the rotating play area, but don't panic - relax and enjoy the game!<br>If you want to learn more about bonuses, special geoblox, or how to make geoblox fall faster, go to the Instructions page, found on the pause menu (press <img=4> to pause). Press <img=2> to continue.";
        heapCapacityEstimateMiB = 64;
    }
}
