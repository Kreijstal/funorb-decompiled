/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelAvailabilitySupport {
    static String field_a;

    public static void releaseStatics(int guard) {
        if (guard != 16558) {
          return;
        }
        field_a = null;
    }

    final static boolean isAccessible(byte guard, int levelStatus) {
        if (levelStatus == 0) {
          return true;
        }
        if (guard >= 95) {
          return levelStatus != 1 ? false : true;
        }
        field_a = (String) null;
        if (levelStatus == 1) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Shield recharged";
    }
}
