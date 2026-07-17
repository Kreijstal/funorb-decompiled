/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_h;
    static int field_e;
    static String field_f;
    static double field_c;
    static int field_b;
    static String field_j;
    static String field_d;
    static String field_g;
    static boolean[][] field_i;
    static String field_a;

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Virogrid.field_F ? 1 : 0;
        if (param1 > param8) {
          if (param1 >= param10) {
            if (param8 < param10) {
              sh.a(df.field_d, param11, param12, param15, param13, param14, param4, param1, param5, param3, param6, param9, param2, param7, param10, param8, 0);
              if (param0) {
                field_e = -85;
                return;
              } else {
                return;
              }
            } else {
              sh.a(df.field_d, param4, param13, param3, param12, param14, param11, param1, param5, param15, param6, param2, param9, param7, param8, param10, 0);
              if (param0) {
                field_e = -85;
                return;
              } else {
                return;
              }
            }
          } else {
            sh.a(df.field_d, param11, param5, param15, param13, param3, param7, param10, param12, param14, param2, param9, param6, param4, param1, param8, 0);
            if (param0) {
              field_e = -85;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param8 < param10) {
            sh.a(df.field_d, param7, param13, param14, param5, param3, param11, param10, param12, param15, param2, param6, param9, param4, param8, param1, 0);
            if (!param0) {
              return;
            } else {
              field_e = -85;
              return;
            }
          } else {
            if (param10 > param1) {
              sh.a(df.field_d, param7, param12, param14, param5, param15, param4, param8, param13, param3, param9, param6, param2, param11, param10, param1, 0);
              if (!param0) {
                return;
              } else {
                field_e = -85;
                return;
              }
            } else {
              sh.a(df.field_d, param4, param5, param3, param12, param15, param7, param8, param13, param14, param9, param2, param6, param11, param1, param10, 0);
              if (param0) {
                field_e = -85;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (eb.field_f - 640) / 2;
        int var3 = ve.field_t * ve.field_t;
        int var4 = var3 - param0 * param0;
        ao.field_Eb.a(var2 - var4 * 199 / var3, -90 + (-4 + df.field_f) + -120, 199, (byte) -67, 90);
        dm.field_r.a(var2 + 202 + 438 * var4 / var3, -124 + df.field_f, 438, (byte) -95, 0);
    }

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_a = null;
        field_f = null;
        field_g = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_j = "<%0> has won!";
        field_f = "You are playing <%0>.";
        field_d = "This is <%0>'s RuneScape clan if they have one.";
        field_c = Math.sqrt(2.0) / 2.0;
        field_a = null;
        field_g = "Accept rematch";
    }
}
