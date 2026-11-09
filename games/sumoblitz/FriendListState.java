/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FriendListState {
    static SpriteData ghostSpriteData;
    static String thisPasswordContainsYourText;
    static IntrusiveDeque friends;
    static SpriteData[] teleporterSpriteData;

    public static void releaseStatics(int param0) {
        thisPasswordContainsYourText = null;
        if (param0 > 1) {
          teleporterSpriteData = null;
          friends = null;
          ghostSpriteData = null;
          return;
        }
        ghostSpriteData = (SpriteData) null;
        teleporterSpriteData = null;
        friends = null;
        ghostSpriteData = null;
    }

    final static int glFormatComponents(int format, byte guard) {
        if (guard >= -22) {
          return -76;
        }
        if (format == 6406) {
          return 1;
        }
        if (6409 == format) {
          return 1;
        }
        if (format == 32841) {
          return 1;
        }
        if (6410 == format) {
          return 2;
        }
        if (6407 == format) {
          return 3;
        }
        if (format != 6408) {
          throw new IllegalArgumentException("");
        }
        return 4;
    }

    static {
        thisPasswordContainsYourText = "This password contains your email address, and would be easy to guess";
    }
}
