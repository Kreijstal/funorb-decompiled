/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static int field_a;
    static String field_c;
    static String field_d;
    static int[] field_b;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = OrbDefence.field_D ? 1 : 0;
          if (ul.field_i <= param4) {
            break L0;
          } else {
            param0 = param0 - (-param4 + ul.field_i);
            param4 = ul.field_i;
            break L0;
          }
        }
        L1: {
          if (ul.field_e >= param0 + param4) {
            break L1;
          } else {
            param0 = ul.field_e + -param4;
            break L1;
          }
        }
        L2: {
          if (param3 >= ul.field_d) {
            break L2;
          } else {
            param5 = param5 - (-param3 + ul.field_d);
            param3 = ul.field_d;
            break L2;
          }
        }
        L3: {
          if (param3 - -param5 > ul.field_a) {
            param5 = -param3 + ul.field_a;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-1 <= (param0 ^ -1)) {
            break L4;
          } else {
            if ((param5 ^ -1) >= -1) {
              break L4;
            } else {
              if (param1 >= 77) {
                var6 = param3 * ul.field_f + param4;
                var7 = ul.field_f + -param0;
                param3 = -param5;
                L5: while (true) {
                  if (0 <= param3) {
                    return;
                  } else {
                    param4 = -param0;
                    L6: while (true) {
                      if ((param4 ^ -1) <= -1) {
                        var6 = var6 + var7;
                        param3++;
                        continue L5;
                      } else {
                        var8 = ul.field_b[var6];
                        if ((var8 >> -38368440 & 255) > param2) {
                          if ((16711680 & var8) >> 1407952816 <= (255 & var8 >> 845100680)) {
                            L7: {
                              var9 = -60 + ((16711680 & var8) >> 2079752207);
                              if (-256 > (var9 ^ -1)) {
                                var9 = 255;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var10 = var8 & 65280;
                            var10 = 65280 & (var10 >> 1115715617) - (var10 >> 572847461);
                            var11 = (255 & var8) >> 141290819;
                            ul.field_b[var6] = ge.a(ge.a(var10, var9 << -2020863344), var11);
                            var6++;
                            param4++;
                            continue L6;
                          } else {
                            var6++;
                            param4++;
                            continue L6;
                          }
                        } else {
                          var6++;
                          param4++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 85) {
            ld.a(8, -18, 124, -3, 46, 45);
        }
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        int var4 = -108 / ((-53 - param2) / 51);
        int var3 = 0;
        while (param1 > 0) {
            var3 = var3 << -1594980095 | 1 & param0;
            param1--;
            param0 = param0 >>> 1;
        }
        return var3;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Quit to website";
        field_c = "Waiting for instruments";
    }
}
