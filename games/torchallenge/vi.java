/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static String field_b;
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = TorChallenge.field_F ? 1 : 0;
        if (param6 < param7) {
          if (param11 > param7) {
            dl.a(param9, param14, param10, param12, param2, param3, param8, param6, param1, param0, param4, param15, qg.field_i, 1047574608, param7, param11, param5);
            field_b = null;
            return;
          } else {
            if (param11 <= param6) {
              dl.a(param4, param2, param12, param5, param3, param14, param0, param11, param8, param1, param15, param9, qg.field_i, 1047574608, param6, param7, param10);
              field_b = null;
              return;
            } else {
              dl.a(param9, param14, param10, param5, param3, param2, param0, param6, param1, param8, param15, param4, qg.field_i, 1047574608, param11, param7, param12);
              field_b = null;
              return;
            }
          }
        } else {
          if (param6 < param11) {
            dl.a(param15, param3, param5, param12, param2, param14, param8, param7, param0, param1, param4, param9, qg.field_i, 1047574608, param6, param11, param10);
            field_b = null;
            return;
          } else {
            if (param7 >= param11) {
              dl.a(param4, param2, param12, param10, param14, param3, param1, param11, param8, param0, param9, param15, qg.field_i, 1047574608, param7, param6, param5);
              field_b = null;
              return;
            } else {
              dl.a(param15, param3, param5, param10, param14, param2, param1, param7, param0, param8, param9, param4, qg.field_i, 1047574608, param11, param6, param12);
              field_b = null;
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = 0;
    }
}
