/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static fh field_b;
    static String field_d;
    static long field_a;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30063) {
            field_a = 73L;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = stellarshard.field_B;
          if (param1 < ti.field_e) {
            param3 = param3 - (ti.field_e + -param1);
            param1 = ti.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param5 >= ti.field_f) {
            break L1;
          } else {
            param4 = param4 - (-param5 + ti.field_f);
            param5 = ti.field_f;
            break L1;
          }
        }
        L2: {
          if (param1 + param3 <= ti.field_c) {
            break L2;
          } else {
            param3 = -param1 + ti.field_c;
            break L2;
          }
        }
        L3: {
          if (param5 - -param4 > ti.field_l) {
            param4 = -param5 + ti.field_l;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 >= 93) {
            break L4;
          } else {
            field_b = null;
            break L4;
          }
        }
        L5: {
          if ((param3 ^ -1) >= -1) {
            break L5;
          } else {
            if (0 >= param4) {
              break L5;
            } else {
              var6 = param1 - -(param5 * ti.field_i);
              var7 = -param3 + ti.field_i;
              param5 = -param4;
              L6: while (true) {
                if (param5 >= 0) {
                  return;
                } else {
                  param1 = -param3;
                  L7: while (true) {
                    if (param1 >= 0) {
                      var6 = var6 + var7;
                      param5++;
                      continue L6;
                    } else {
                      var8 = ti.field_a[var6];
                      if (param2 < (255 & var8 >> -980601784)) {
                        if ((var8 >> -635973080 & 255) >= (var8 & 16711680) >> -311196592) {
                          L8: {
                            var9 = (510 & var8 >> -741485937) - 60;
                            if (255 >= var9) {
                              break L8;
                            } else {
                              var9 = 255;
                              break L8;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = 65280 & (var10 >> 2075161249) + -(var10 >> -798840315);
                          var11 = (var8 & 255) >> -2050604381;
                          ti.field_a[var6] = vf.b(var11, vf.b(var10, var9 << -1230962832));
                          var6++;
                          param1++;
                          continue L7;
                        } else {
                          var6++;
                          param1++;
                          continue L7;
                        }
                      } else {
                        var6++;
                        param1++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new int[128];
    }
}
