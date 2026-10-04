/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientTimingSupport {
    static String noHighscoresText;
    static int[] crc32Table;
    static int decodedSpriteCount;
    static String loginNoDisplayNameText;
    static IndexedSprite[] field_e;
    static int buttonAndLogoArchiveId;

    public static void releaseStaticReferences(boolean changeDecodedSpriteCount) {
        field_e = null;
        loginNoDisplayNameText = null;
        if (changeDecodedSpriteCount) {
            decodedSpriteCount = 105;
        }
        crc32Table = null;
        noHighscoresText = null;
    }

    final static int getConfiguredUpdateRate(boolean readConfiguredRate) {
        if (!readConfiguredRate) {
            return 104;
        }
        return (int)(1000000000L / ByteStorage.updatePeriodNanoseconds);
    }

    final static boolean isClientReadyForSessionActions(int methodGuard) {
        boolean sessionActionsReady = false;
        if (methodGuard <= 46) {
          decodedSpriteCount = -60;
        }
        sessionActionsReady = (SpriteConstructionSupport.clientScreenStage >= 10) && (!ProgressBarWidget.guestSessionMode) && (!InstrumentEnvelope.isSessionConnected(13));
        return sessionActionsReady;
    }

    static {
        int crcTableIndex = 0;
        int crcPolynomialBit = 0;
        int crcTableEntry;
        noHighscoresText = "No highscores";
        crc32Table = new int[256];
        loginNoDisplayNameText = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        for (crcTableIndex = 0; crcTableIndex < 256; crcTableIndex++) {
          crcTableEntry = crcTableIndex;
          for (crcPolynomialBit = 0; 8 > crcPolynomialBit; crcPolynomialBit++) {
            if (1 != (crcTableEntry & 1)) {
              crcTableEntry = crcTableEntry >>> 1;
              continue;
            }
            crcTableEntry = -306674912 ^ crcTableEntry >>> 1;
          }
          crc32Table[crcTableIndex] = crcTableEntry;
        }
    }
}
