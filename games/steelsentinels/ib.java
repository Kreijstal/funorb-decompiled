/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static int field_b;
    static String field_a;

    final static int a(tc param0, int param1, int param2, kf param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = SteelSentinels.field_G;
          if (param3 == null) {
            break L0;
          } else {
            if (param3.field_z == null) {
              break L0;
            } else {
              if (param0 == null) {
                break L0;
              } else {
                if (param3.field_C == param0.field_y) {
                  var4 = param0.field_q.length;
                  var5 = param3.field_z[param2].length / var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var5 <= var6) {
                      L2: {
                        if (param1 == 7047) {
                          break L2;
                        } else {
                          ib.a(40, -26, false, 35, 96, 13, -66);
                          break L2;
                        }
                      }
                      return -1;
                    } else {
                      if ((param3.field_D[param2][var6] ^ -1L) == (param0.field_D ^ -1L)) {
                        if (wl.a(-85, param3.field_x[param2][var6])) {
                          var7 = 0;
                          L3: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param0.field_q[var7] == param3.field_z[param2][var7 + var6 * var4]) {
                                var6 = var6;
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        String var8 = null;
        int var7 = -28 % ((-18 - param4) / 48);
        if ((field_b ^ -1) == -3) {
            var8 = ug.field_L;
        } else {
            var8 = qi.field_g;
        }
        ka.a(param2, param1, param6, param0, var8, param5, 127, param3);
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 86 % ((-49 - param0) / 56);
    }

    final static boolean a(int param0) {
        int var1 = 76 / ((0 - param0) / 33);
        return 2 <= cb.field_l ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "You do not have a suitable number of players for the current options.";
    }
}
