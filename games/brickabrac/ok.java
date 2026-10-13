/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_a;
    static int field_c;
    static String[] field_b;
    static RgbSprite field_g;
    static String field_e;
    static int field_f;
    static mh field_d;

    final static void a(int param0) {
        if (!LevelPackSelectScreen.field_s) {
          throw new IllegalStateException();
        }
        ci.field_t = true;
        RankingsScreen.a((byte) -78, false);
        AchievementIcon.field_j = param0;
    }

    public static void b(int param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 > -2) {
          ok.a(false);
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          ok.a(true);
          if (null == jj.field_a) {
            return false;
          }
          if (jj.field_a.a((byte) -32)) {
            return true;
          }
          return false;
        }
        if (null == jj.field_a) {
          return false;
        }
        if (jj.field_a.a((byte) -32)) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Log in";
        field_b = new String[24];
        field_e = "Updates will sent to the email address you've given";
        field_c = 0;
    }
}
