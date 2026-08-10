/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static int field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -7) {
            am.a(102, 53, -113, 106, 29);
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (128 > param0) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param0) {
                break L2;
              } else {
                if (255 < param0) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (0 == param0) {
                break L3;
              } else {
                var6 = vg.field_s;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((var4 ^ -1) != (param0 ^ -1)) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            L5: {
              if (param1 >= 42) {
                break L5;
              } else {
                field_b = 89;
                break L5;
              }
            }
            stackIn_21_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "am.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        if (param0 < -97) {
          L0: {
            L1: {
              if (-11 == (pl.field_I ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-7 != pl.field_I) {
                    break L2;
                  } else {
                    if (df.field_I) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L0;
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final static ja a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1) {
            am.a('ﾘ', (byte) -57);
        }
        return nk.a(no.field_Hb[param2][param0], param1, 255, param4);
    }

    static {
    }
}
