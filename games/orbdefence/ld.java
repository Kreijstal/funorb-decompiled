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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_i <= param4) {
                break L1;
              } else {
                param0 = param0 - (-param4 + ul.field_i);
                param4 = ul.field_i;
                break L1;
              }
            }
            L2: {
              if (ul.field_e >= param0 + param4) {
                break L2;
              } else {
                param0 = ul.field_e + -param4;
                break L2;
              }
            }
            L3: {
              if (param3 >= ul.field_d) {
                break L3;
              } else {
                param5 = param5 - (-param3 + ul.field_d);
                param3 = ul.field_d;
                break L3;
              }
            }
            L4: {
              if (param3 - -param5 > ul.field_a) {
                param5 = -param3 + ul.field_a;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 <= 0) {
                break L5;
              } else {
                if (param5 <= 0) {
                  break L5;
                } else {
                  if (param1 >= 77) {
                    var6_int = param3 * ul.field_f + param4;
                    var7 = ul.field_f + -param0;
                    param3 = -param5;
                    L6: while (true) {
                      if (0 <= param3) {
                        break L0;
                      } else {
                        param4 = -param0;
                        L7: while (true) {
                          if (param4 >= 0) {
                            var6_int = var6_int + var7;
                            param3++;
                            continue L6;
                          } else {
                            L8: {
                              var8 = ul.field_b[var6_int];
                              if ((var8 >> 8 & 255) <= 64) {
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var6_int++;
                            param4++;
                            continue L7;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var6, "ld.C(" + param0 + ',' + param1 + ',' + 64 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(byte param0) {
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4 = -108;
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param0;
                param1--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ld.B(" + param0 + ',' + param1 + ',' + -125 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(boolean param0) {
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
