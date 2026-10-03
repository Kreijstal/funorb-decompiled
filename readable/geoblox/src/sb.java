/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static String noHighscoresText;
    static int[] crc32Table;
    static int decodedSpriteCount;
    static String loginNoDisplayNameText;
    static IndexedSprite[] field_e;
    static int field_d;

    public static void b(boolean param0) {
        field_e = null;
        loginNoDisplayNameText = null;
        if (param0) {
            decodedSpriteCount = 105;
        }
        crc32Table = null;
        noHighscoresText = null;
    }

    final static int a(boolean param0) {
        if (!param0) {
            return 104;
        }
        return (int)(1000000000L / oj.field_c);
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 46) {
          decodedSpriteCount = -60;
        }
        stackIn_7_0 = (hj.field_a >= 10) && (!hl.field_G) && (!InstrumentEnvelope.b(13));
        return stackIn_7_0;
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
