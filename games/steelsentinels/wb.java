/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_b;
    static nn field_c;
    static String field_f;
    static String field_e;
    static byte[] field_j;
    static int[] field_h;
    static BitmapFont field_a;
    static int field_g;
    static RgbSprite field_i;
    static String field_d;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = SteelSentinels.obfuscationControl;
        if (param0 == 500) {
          if (param1 < 0) {
            return 0;
          }
          if (dn.field_Sb.length > param1) {
            return dn.field_Sb[param1] / 4;
          }
          var2 = param1;
          if (42 == var2) {
            return 500;
          }
          if (var2 == 39) {
            return 500;
          }
          if (var2 == 40) {
            return 500;
          }
          if (var2 == 35) {
            return 1000;
          }
          if (var2 == 37) {
            return 1000;
          }
          if (var2 != 41) {
            return 0;
          }
          return 2000;
        }
        wb.a(-117, 80);
        if (param1 < 0) {
          return 0;
        }
        if (dn.field_Sb.length > param1) {
          return dn.field_Sb[param1] / 4;
        }
        var2Lifetime1 = param1;
        if (42 == var2Lifetime1) {
          return 500;
        }
        if (var2Lifetime1 == 39) {
          return 500;
        }
        if (var2Lifetime1 == 40) {
          return 500;
        }
        if (var2Lifetime1 == 35) {
          return 1000;
        }
        if (var2Lifetime1 == 37) {
          return 1000;
        }
        if (var2Lifetime1 == 41) {
          return 2000;
        }
        return 0;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_h = null;
        if (param0 > 77) {
          field_c = null;
          field_d = null;
          field_f = null;
          field_j = null;
          field_a = null;
          field_i = null;
          return;
        }
        field_h = (int[]) null;
        field_c = null;
        field_d = null;
        field_f = null;
        field_j = null;
        field_a = null;
        field_i = null;
    }

    static {
        field_e = "You need to play 1 more rated game to unlock this option.";
        field_g = 1;
        field_b = "Type your age in years";
        field_h = new int[]{2, 2, 2, 1, 2, 1, 5, 10, 2, 5, 2, 2, 2, 5, 5, 5, 3, 1, 1, 2, 3, 5, 5, 10, 3, 10, 1, 1, 3, 3, 3, 3, 2, 3, 5, 5, 10, 10, 2};
        field_d = "No players";
        field_f = "SUDDEN DEATH IN <%0> SECONDS";
    }
}
