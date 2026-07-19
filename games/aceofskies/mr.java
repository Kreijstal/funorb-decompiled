/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr {
    static String field_a;
    static int[] field_b;

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2004352972) {
                break L1;
              } else {
                mr.a(23);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 >= param0) {
                  break L3;
                } else {
                  if (128 > param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (160 > param0) {
                  break L4;
                } else {
                  if (param0 <= 255) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (param0 != 0) {
                var6 = te.field_e;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var3 >= var6.length) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L5;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "mr.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    static {
        field_a = "This password contains your Player Name, and would be easy to guess";
        field_b = new int[]{587202559, 587202559, 872415231, 1439485183, 2006555084, 2002081177, -2013265886, 2013265919, 872402005, 872380211, -16777216, 1996488704, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 2004352972, 2004352972};
    }
}
