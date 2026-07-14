/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends kd {
    static String[] field_i;
    int field_h;
    static int field_l;
    static int field_j;
    int field_k;

    final static void a(cd param0, db param1, int param2, int param3, byte param4, int param5, int param6, char param7) {
        param1.d(param6, param3);
        int var8 = 118 % ((param4 - 3) / 50);
        param0.a(param7, param1.field_p / 2 + param6, param3 + (param5 + param1.field_u) / 2, param2);
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 39) {
          L0: {
            L1: {
              if (ti.field_L == null) {
                break L1;
              } else {
                if (ti.field_L.e(false) == null) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 84 % ((16 - param0) / 36);
    }

    final static int a(String[] args, le param1, byte param2, String param3, int param4) {
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
          var13 = Lexicominos.field_L ? 1 : 0;
          var5 = param1.b(param3);
          if (param4 < var5) {
            break L0;
          } else {
            if (-1 == param3.indexOf("<br>")) {
              args[0] = (String) (Object) args;
              return 1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var6 = (-1 + (param4 + var5)) / param4;
          param4 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param3.length();
          if (param2 == 91) {
            break L1;
          } else {
            field_i = null;
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var8 > var7) {
                var6++;
                args[var6] = param3.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param3.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 == 45) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              var11 = param3.substring(var7, 1 + var9).trim();
              var12 = param1.b(var11);
              if (var12 >= param4) {
                var6++;
                args[var6] = var11;
                var7 = 1 + var9;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                args[var6] = param3.substring(var7, -3 + var9).trim();
                var7 = 1 + var9;
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

    private cg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_j = 0;
    }
}
