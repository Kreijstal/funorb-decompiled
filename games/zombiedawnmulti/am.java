/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static int field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        ja discarded$0 = null;
        field_a = null;
        if (param0 != -7) {
            discarded$0 = am.a(102, 53, -113, 106, 29);
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (128 > param0) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
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
              L4: {
                L5: {
                  if (0 == param0) {
                    break L5;
                  } else {
                    var6 = vg.field_s;
                    var2 = var6;
                    var3 = 0;
                    L6: while (true) {
                      if (var3 >= var6.length) {
                        break L5;
                      } else {
                        var4 = var6[var3];
                        var8 = param0 ^ -1;
                        var7 = var4 ^ -1;
                        if (var5 != 0) {
                          if (var7 >= var8) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          if (var7 != var8) {
                            var3++;
                            if (var5 == 0) {
                              continue L6;
                            } else {
                              break L5;
                            }
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_18_0 = stackOut_17_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                if (param1 >= 42) {
                  break L3;
                } else {
                  break L4;
                }
              }
              field_b = 89;
              break L3;
            }
            stackOut_22_0 = 0;
            stackIn_23_0 = stackOut_22_0;
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
            return stackIn_18_0 != 0;
          } else {
            return stackIn_23_0 != 0;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 < -97) {
          if (-11 != (pl.field_I ^ -1)) {
            if (-7 == pl.field_I) {
              if (!df.field_I) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static ja a(int param0, int param1, int param2, int param3, int param4) {
        boolean discarded$2 = false;
        if (param3 != 1) {
          discarded$2 = am.a('ﾘ', (byte) -57);
          return nk.a(no.field_Hb[param2][param0], param1, 255, param4);
        } else {
          return nk.a(no.field_Hb[param2][param0], param1, 255, param4);
        }
    }

    static {
    }
}
