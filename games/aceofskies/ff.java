/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String field_a;
    static long field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 8) {
            hc var2 = (hc) null;
            int discarded$0 = ff.a(-89, (String) null, (String[]) null, -11, (hc) null);
        }
    }

    final static int a(int param0, String param1, String[] param2, int param3, hc param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = AceOfSkies.field_G ? 1 : 0;
          var5 = param4.a(param1);
          if (param0 < var5) {
            break L0;
          } else {
            if (-1 == param1.indexOf("<br>")) {
              param2[0] = (String) (Object) param2;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var6 = (param0 + var5 - 1) / param0;
        param0 = var5 / var6;
        var6 = 0;
        var7 = 0;
        if (param3 == -3) {
          var8 = param1.length();
          var9 = 0;
          L1: while (true) {
            if (var9 >= var8) {
              L2: {
                if (var8 <= var7) {
                  break L2;
                } else {
                  var6++;
                  param2[var6] = param1.substring(var7, var8).trim();
                  break L2;
                }
              }
              return var6;
            } else {
              L3: {
                L4: {
                  var10 = param1.charAt(var9);
                  if (var10 == 32) {
                    break L4;
                  } else {
                    if (var10 == 45) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                var11 = param1.substring(var7, 1 + var9).trim();
                var12 = param4.a(var11);
                if (param0 > var12) {
                  break L3;
                } else {
                  var7 = 1 + var9;
                  var6++;
                  param2[var6] = var11;
                  break L3;
                }
              }
              if (var10 == 62) {
                if (param1.regionMatches(var9 + -3, "<br>", 0, 4)) {
                  var6++;
                  param2[var6] = param1.substring(var7, var9 + -3).trim();
                  var7 = var9 - -1;
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return 29;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading instruments";
    }
}
