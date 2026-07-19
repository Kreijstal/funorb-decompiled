/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static o field_d;
    static int field_c;
    static ge field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 128) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        var5 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param1 >= param0) {
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
              if (0 != param0) {
                var6 = ee.field_c;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "ua.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    static {
        field_d = new o(9, 0, 4, 1);
        field_b = new ge();
        field_a = -1;
    }
}
