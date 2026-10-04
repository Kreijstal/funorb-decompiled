/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListEntry extends VisualPropertyOverrides {
    String locationLabel;
    String displayName;
    static int soundEffectVolume;
    int insertionIndex;
    static String connectingToUpdateServerText;
    static MusicScore sweetsMusicTrack;
    static String quitWarningText;

    final static void resetArchiveConnectionFailures(int methodGuard) {
        AsyncResourceDownloader.archiveNetworkClient.failureCount = 0;
        AsyncResourceDownloader.archiveNetworkClient.failureCode = 0;
        if (methodGuard != -21754) {
            connectingToUpdateServerText = (String) null;
        }
    }

    SocialListEntry() {
        super(0L, (VisualPropertyOverrides) null);
    }

    public static void releaseSocialEntryResources(byte methodGuard) {
        connectingToUpdateServerText = null;
        quitWarningText = null;
        if (methodGuard != -128) {
            SocialListEntry.releaseSocialEntryResources((byte) 1);
            sweetsMusicTrack = null;
            return;
        }
        sweetsMusicTrack = null;
    }

    static {
        soundEffectVolume = 80;
        quitWarningText = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
