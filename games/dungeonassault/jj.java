/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static cn field_b;
    static String field_d;
    static int field_c;
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 60) {
            field_b = null;
        }
        field_d = null;
        field_b = null;
    }

    final static void b(byte param0) {
        if (param0 >= -87) {
            field_b = null;
        }
        eg.a(rl.field_h, true);
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
          var12 = DungeonAssault.field_K;
          if (gf.field_j > param2) {
            param5 = param5 - (gf.field_j + -param2);
            param2 = gf.field_j;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gf.field_f <= param3) {
            break L1;
          } else {
            param4 = param4 - (gf.field_f - param3);
            param3 = gf.field_f;
            break L1;
          }
        }
        L2: {
          if (gf.field_h >= param2 + param5) {
            break L2;
          } else {
            param5 = -param2 + gf.field_h;
            break L2;
          }
        }
        L3: {
          if (param1 == -971598481) {
            break L3;
          } else {
            field_a = null;
            break L3;
          }
        }
        L4: {
          if (param4 + param3 > gf.field_e) {
            param4 = gf.field_e - param3;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param5 <= 0) {
            break L5;
          } else {
            if (0 < param4) {
              var6 = param2 - -(param3 * gf.field_i);
              var7 = -param5 + gf.field_i;
              param3 = -param4;
              L6: while (true) {
                if (param3 >= 0) {
                  return;
                } else {
                  param2 = -param5;
                  L7: while (true) {
                    if (0 <= param2) {
                      var6 = var6 + var7;
                      param3++;
                      continue L6;
                    } else {
                      var8 = gf.field_b[var6];
                      if ((65280 & var8) >> 1140191528 > param0) {
                        if ((255 & var8 >> -1141426000) <= (255 & var8 >> 1378710664)) {
                          L8: {
                            var9 = ((var8 & 16711680) >> -971598481) + -60;
                            if ((var9 ^ -1) < -256) {
                              var9 = 255;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = 65280 & (var10 >> -172272671) - (var10 >> -887877467);
                          var11 = 31 & var8 >> -886172061;
                          gf.field_b[var6] = mp.a(var11, mp.a(var9 << 1486353968, var10));
                          var6++;
                          param2++;
                          continue L7;
                        } else {
                          var6++;
                          param2++;
                          continue L7;
                        }
                      } else {
                        var6++;
                        param2++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_a = "Razor Construct";
    }
}
