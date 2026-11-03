/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static boolean field_a;
    static int field_f;
    static int field_b;
    static String field_e;
    static int field_d;
    static int field_c;
    static int field_g;

    final static int a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        sc.field_d = null;
        if (param0 != -124) {
          return 3;
        }
        AchievementsScreen.field_q = 0;
        KiteBackground.field_o = null;
        var2 = ArchiveIndex.field_s;
        ArchiveIndex.field_s = pd.field_Eb;
        Match.field_h.field_h = Match.field_h.field_h + 1;
        pd.field_Eb = var2;
        if (param1 == 51) {
          Match.field_h.field_m = 2;
          if (2 <= Match.field_h.field_h &&
            param1 == 51) {
            return 2;
          }
          if (Match.field_h.field_h >= 2 &&
            50 == param1) {
            return 5;
          }
        } else {
          if (50 != param1) {
            Match.field_h.field_m = 1;
            if (2 <= Match.field_h.field_h &&
              param1 == 51) {
              return 2;
            }
            if (Match.field_h.field_h >= 2 &&
              50 == param1) {
              return 5;
            }
            if (Match.field_h.field_h >= 4) {
              return 1;
            }
            return -1;
          }
          Match.field_h.field_m = 5;
          if (2 > Match.field_h.field_h) {
            if (Match.field_h.field_h >= 2 &&
              50 == param1) {
              return 5;
            }
          } else {
            if (param1 == 51) {
              return 2;
            }
            if (Match.field_h.field_h < 2) {
              if (Match.field_h.field_h >= 4) {
                return 1;
              }
              return -1;
            }
            if (50 == param1) {
              return 5;
            }
          }
        }
        if (Match.field_h.field_h < 4) {
          return -1;
        }
        return 1;
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          ce.a(true);
        }
    }

    static {
        field_f = 256;
        field_e = "Let's Go Fly a Kite";
        field_d = 0;
    }
}
