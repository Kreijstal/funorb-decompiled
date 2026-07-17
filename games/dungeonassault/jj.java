/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static cn field_b;
    static String field_d;
    static int field_c;
    static String field_a;

    public static void a() {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void b() {
        int discarded$0 = 1;
        eg.a(rl.field_h);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (gf.field_j > param2) {
                param5 = param5 - (gf.field_j + -param2);
                param2 = gf.field_j;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gf.field_f <= param3) {
                break L2;
              } else {
                param4 = param4 - (gf.field_f - param3);
                param3 = gf.field_f;
                break L2;
              }
            }
            L3: {
              if (gf.field_h >= param2 + param5) {
                break L3;
              } else {
                param5 = -param2 + gf.field_h;
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
                  var6_int = param2 - -(param3 * gf.field_i);
                  var7 = -param5 + gf.field_i;
                  param3 = -param4;
                  L6: while (true) {
                    if (param3 >= 0) {
                      break L0;
                    } else {
                      param2 = -param5;
                      L7: while (true) {
                        if (0 <= param2) {
                          var6_int = var6_int + var7;
                          param3++;
                          continue L6;
                        } else {
                          L8: {
                            var8 = gf.field_b[var6_int];
                            if ((65280 & var8) >> 8 <= 64) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var6_int++;
                          param2++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var6, "jj.A(" + 64 + 44 + -971598481 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
