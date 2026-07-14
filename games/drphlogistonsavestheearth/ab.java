/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static long field_a;
    static String field_c;
    static int field_b;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    final static int a(int param0, String param1, String[] param2, rf param3, int param4) {
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
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var5 = param3.b(param1);
          if (var5 > param0) {
            break L0;
          } else {
            if ((param1.indexOf("<br>") ^ -1) == 0) {
              param2[0] = (String) (Object) param2;
              return 1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var6 = (-1 + (var5 + param0)) / param0;
          param0 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param1.length();
          if (param4 == 14074) {
            break L1;
          } else {
            field_b = -21;
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var8 > var7) {
                var6++;
                param2[var6] = param1.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param1.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param1.substring(var7, var9 + 1).trim();
              var12 = param3.b(var11);
              if (param0 <= var12) {
                var7 = var9 + 1;
                var6++;
                param2[var6] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                param2[var6] = param1.substring(var7, -3 + var9).trim();
                var7 = var9 - -1;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    final static int a(int param0) {
        int var1 = -73 % ((param0 - -67) / 51);
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_c = "You are not currently logged in to the<nbsp>game.";
    }
}
