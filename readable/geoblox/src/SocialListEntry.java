/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListEntry extends VisualPropertyOverrides {
    String locationLabel;
    String displayName;
    static int field_gb;
    int insertionIndex;
    static String field_lb;
    static MusicScore sweetsMusicTrack;
    static String quitWarningText;

    final static void e(int param0) {
        AsyncResourceDownloader.archiveNetworkClient.failureCount = 0;
        AsyncResourceDownloader.archiveNetworkClient.failureCode = 0;
        if (param0 != -21754) {
            field_lb = (String) null;
        }
    }

    SocialListEntry() {
        super(0L, (VisualPropertyOverrides) null);
    }

    public static void f(byte param0) {
        field_lb = null;
        quitWarningText = null;
        if (param0 != -128) {
            SocialListEntry.f((byte) 1);
            sweetsMusicTrack = null;
            return;
        }
        sweetsMusicTrack = null;
    }

    static {
        field_gb = 80;
        quitWarningText = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
