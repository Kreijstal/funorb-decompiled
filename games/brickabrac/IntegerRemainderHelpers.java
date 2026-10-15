/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerRemainderHelpers {
    static String friendListFullText;
    static RgbSprite lobbyGameLogoSprite;
    static RgbSprite constructionSmokeHalfSprite;
    static volatile long canvasCreatedAtMillis;
    static String acceptDrawText;

    final static int nonnegativeRemainder(int obfuscationGuard, int divisor, int value) {
        int negativeValueAdjustment = value >> 31 & -1 + divisor;
        if (obfuscationGuard == -1560508993) {
          return negativeValueAdjustment + ((value >>> 31) + value) % divisor;
        }
        friendListFullText = (String) null;
        return negativeValueAdjustment + ((value >>> 31) + value) % divisor;
    }

    public static void clearSharedReferences(byte obfuscationGuard) {
        acceptDrawText = null;
        lobbyGameLogoSprite = null;
        constructionSmokeHalfSprite = null;
        if (obfuscationGuard == -121) {
          friendListFullText = null;
          return;
        }
        IntegerRemainderHelpers.nonnegativeRemainder(-124, 122, -66);
        friendListFullText = null;
    }

    static {
        friendListFullText = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        canvasCreatedAtMillis = 0L;
        acceptDrawText = "Accept draw";
    }
}
