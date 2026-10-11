/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_a;
    static String[] field_c;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 < 7) {
          field_b = (String) null;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[][] var13 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = fleas.field_A ? 1 : 0;
        try {
          if (param2 >= 0 &&
            param1 >= 0) {
            var3_int = param1 * se.field_a.length / ia.field_m[fleas.field_E].length;
            var13 = ia.field_m[param2][param1].field_c;
            nl.field_c[param2][param1].d(0, 0);
            for (var5 = 39; var5 >= 0; var5--) {
              for (var6 = 20; var6 >= 0; var6--) {
                var7 = var13[var5][var6];
                if (var7 == 2) {
                  de.a((byte) 88, var5, var3_int, var6);
                } else {
                  if (var7 == 7) {
                    de.a((byte) 88, var5, var3_int, var6);
                  } else {
                    if (var7 == 18) {
                      lg.a(-4, var6, var3_int, var5);
                    }
                  }
                }
                if (var7 != 0) {
                  aj.field_t[var7].d(-4 + var5 * 16, -4 + 16 * var6);
                }
              }
            }
            for (var5Lifetime1 = 39; var5Lifetime1 >= 0; var5Lifetime1--) {
              for (var6Lifetime1 = 20; var6Lifetime1 >= 0; var6Lifetime1--) {
                var7Lifetime1 = var13[var5Lifetime1][var6Lifetime1];
                if (var7Lifetime1 == 2) {
                  de.a((byte) 88, var5Lifetime1, var3_int, var6Lifetime1);
                } else {
                  if (var7Lifetime1 == 7) {
                    de.a((byte) 88, var5Lifetime1, var3_int, var6Lifetime1);
                  } else {
                    if (var7Lifetime1 != 0) {
                      aj.field_t[36 + var7Lifetime1].d(var5Lifetime1 * 16 - 4, 16 * var6Lifetime1 - 4);
                    }
                  }
                }
              }
            }
            var5Lifetime2 = 39;
            var8 = 77 / ((-51 - param0) / 52);
            while (var5Lifetime2 >= 0) {
              for (var6Lifetime2 = 20; var6Lifetime2 >= 0; var6Lifetime2--) {
                var7Lifetime2 = var13[var5Lifetime2][var6Lifetime2];
                if (var7Lifetime2 == 17 ||
                  31 == var7Lifetime2) {
                  aj.field_t[36 + var7Lifetime2].d(-4 + var5Lifetime2 * 16, 16 * var6Lifetime2 - 4);
                }
              }
              var5Lifetime2--;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "oe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0) {
        if (ok.field_w) {
          if (param0 != 19007) {
            oe.a(-82);
            return null;
          }
          return null;
        }
        if (oh.field_db > c.field_S) {
          if (param0 != 19007) {
            oe.a(-82);
            return null;
          }
          return null;
        }
        if (c.field_S < oh.field_db + fj.field_b) {
          return gf.field_b;
        }
        if (param0 != 19007) {
          oe.a(-82);
          return null;
        }
        return null;
    }

    static {
        field_b = "<%0>Fans:<%1> these blow any fleas in direct horizontal line away from the fan until they hit an obstacle, at which point the fan holds them there. Placing a wall in the jet of air will block the fan and let the fleas fall.";
        field_a = 0;
    }
}
