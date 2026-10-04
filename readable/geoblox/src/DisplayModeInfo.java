/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeInfo {
    static int canvasRefreshCounter;
    static String quitToWebsiteText;
    int height;
    static int avatarTintColor;
    static long backwardClockCorrectionMillis;
    int width;
    static String loggingInText;
    int refreshRate;
    int bitDepth;

    final static void setConfiguredUpdateRate(byte methodGuard, int ticksPerSecond) {
        if (methodGuard != 121) {
            quitToWebsiteText = (String) null;
            ByteStorage.updatePeriodNanoseconds = 1000000000L / (long)ticksPerSecond;
            return;
        }
        ByteStorage.updatePeriodNanoseconds = 1000000000L / (long)ticksPerSecond;
    }

    public static void releaseStaticReferences(int methodGuard) {
        int guardRemainder = 12 % ((-27 - methodGuard) / 57);
        quitToWebsiteText = null;
        loggingInText = null;
    }

    final static ResourceArchive createBootstrapResourceArchive(int archiveId, byte methodGuard, boolean discardPackedGroups, boolean downloadAllGroups, int fileRetentionPolicy) {
        if (methodGuard >= -13) {
            return (ResourceArchive) null;
        }
        return IntKeyLookup.createResourceArchive(-90, archiveId, downloadAllGroups, fileRetentionPolicy, discardPackedGroups, false);
    }

    final static boolean loadAllArchiveGroups(byte methodGuard, ResourceArchive archive) {
        int guardRemainder = 0;
        RuntimeException loadFailureForContext = null;
        boolean allGroupsLoadedBeforeReturn = false;
        RuntimeException loadFailureBeforeDescription = null;
        StringBuilder loadMessagePrefix = null;
        String archiveDescription = null;
        RuntimeException caughtLoadFailure = null;
        try {
          guardRemainder = 12 % ((-57 - methodGuard) / 57);
          allGroupsLoadedBeforeReturn = archive.loadAllGroups(true);
          return allGroupsLoadedBeforeReturn;
        } catch (java.lang.RuntimeException loadFailure) {
          caughtLoadFailure = loadFailure;
          loadFailureForContext = caughtLoadFailure;
          loadFailureBeforeDescription = loadFailureForContext;
          loadMessagePrefix = new StringBuilder().append("rj.C(").append(methodGuard).append(',');
          if (archive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loadFailureBeforeDescription), ((StringBuilder) (Object) loadMessagePrefix).append(archiveDescription).append(')').toString());
        }
    }

    static {
        avatarTintColor = 5167632;
        canvasRefreshCounter = 500;
        quitToWebsiteText = "Quit to website";
        loggingInText = "Logging in...";
    }
}
