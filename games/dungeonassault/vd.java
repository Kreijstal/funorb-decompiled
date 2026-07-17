/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_c;
    static String field_d;
    static int field_a;
    static String field_b;

    public static void a() {
        int var1 = 0;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6_int = wh.field_g.field_d;
              if (2 == param3) {
                param0 = param0 - var6_int;
                param4 = param4 + var6_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jh.c();
              if (2 != param1) {
                break L2;
              } else {
                param0 = param0 - var6_int;
                break L2;
              }
            }
            L3: {
              gf.e(param4, param5, param4 + param0, 8 + param5);
              var7 = 0;
              if (param2 == -14561) {
                break L3;
              } else {
                vd.a(-78, 112, -21, -44, 75, -60);
                break L3;
              }
            }
            L4: while (true) {
              if (~param0 >= ~var7) {
                L5: {
                  jh.b();
                  if (param3 == 2) {
                    wh.field_g.j(-var6_int + param4, param5);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param1 != 2) {
                    break L6;
                  } else {
                    wh.field_g.h(param0 + param4, param5);
                    break L6;
                  }
                }
                L7: {
                  if (param3 != 1) {
                    break L7;
                  } else {
                    var7 = 0;
                    L8: while (true) {
                      if (8 <= var7) {
                        break L7;
                      } else {
                        qe.b(param4 - -var7, param5, 8, 0, -(24 * var7) + 192);
                        var7++;
                        continue L8;
                      }
                    }
                  }
                }
                L9: {
                  if (param1 == 1) {
                    var7 = 0;
                    L10: while (true) {
                      if (var7 >= 8) {
                        break L9;
                      } else {
                        qe.b(param0 + (param4 - (1 - -var7)), param5, 8, 0, 192 - 24 * var7);
                        var7++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                break L0;
              } else {
                bk.field_e.b(var7 + param4, param5);
                var7 = var7 + bk.field_e.field_d;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var6, "vd.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "ACHIEVEMENTS";
        field_a = 94;
        field_d = "End Game";
        field_b = "<col=8B1717>Disarm</col>";
    }
}
