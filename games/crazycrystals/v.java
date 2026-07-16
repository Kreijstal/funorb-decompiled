/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static int field_c;
    static dl[] field_b;
    static long[] field_a;
    static int field_d;
    private int[] field_e;

    final static int a(vc param0, String param1, int param2, int param3, String[] param4) {
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
          var13 = CrazyCrystals.field_B;
          var5 = param0.a(param1);
          if (param3 < var5) {
            break L0;
          } else {
            if (param1.indexOf("<br>") != -1) {
              break L0;
            } else {
              param4[0] = (String) (Object) param4;
              return 1;
            }
          }
        }
        var6 = (-1 + (param3 + var5)) / param3;
        param3 = var5 / var6;
        if (param2 == -27815) {
          var6 = 0;
          var7 = 0;
          var8 = param1.length();
          var9 = 0;
          L1: while (true) {
            if (var9 >= var8) {
              L2: {
                if (var7 >= var8) {
                  break L2;
                } else {
                  int incrementValue$3 = var6;
                  var6++;
                  param4[incrementValue$3] = param1.substring(var7, var8).trim();
                  break L2;
                }
              }
              return var6;
            } else {
              L3: {
                L4: {
                  var10 = param1.charAt(var9);
                  if (32 == var10) {
                    break L4;
                  } else {
                    if (var10 != 45) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = param1.substring(var7, 1 + var9).trim();
                var12 = param0.a(var11);
                if (var12 >= param3) {
                  var7 = 1 + var9;
                  int incrementValue$4 = var6;
                  var6++;
                  param4[incrementValue$4] = var11;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (62 == var10) {
                if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                  int incrementValue$5 = var6;
                  var6++;
                  param4[incrementValue$5] = param1.substring(var7, -3 + var9).trim();
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
          return -21;
        }
    }

    public static void a(int param0) {
        if (param0 <= 83) {
            field_a = null;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = dg.a(param1.charAt(var4), 17176) + -var3 + (var3 << -2057727803);
        }
        if (param0 != -2057727803) {
            field_d = -119;
        }
        return var3;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = (((v) this).field_e.length >> 1102225089) + -1;
          if (param0 == 0) {
            break L0;
          } else {
            field_d = -81;
            break L0;
          }
        }
        var4 = param1 & var3;
        L1: while (true) {
          var5 = ((v) this).field_e[var4 + (var4 - -1)];
          if (-1 == var5) {
            return -1;
          } else {
            if (param1 == ((v) this).field_e[var4 - -var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L1;
            }
          }
        }
    }

    final static wj a(int param0, int param1, int param2, db param3) {
        if (param0 != 28297) {
            field_d = -9;
        }
        if (!gm.a(param3, param2, true, param1)) {
            return null;
        }
        return ql.d(-128);
    }

    v(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= param0.length - -(param0.length >> 1463843617)) {
            var2 = var2 << 1;
        }
        ((v) this).field_e = new int[var2 + var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((v) this).field_e[var3] = -1;
        }
        for (var3 = 0; param0.length > var3; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (0 != (((v) this).field_e[var4 + (var4 - -1)] ^ -1)) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((v) this).field_e[var4 + var4] = param0[var3];
            ((v) this).field_e[1 + var4 + var4] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new long[32];
        field_c = 0;
    }
}
