/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr {
    static String field_a;
    static int[] field_b;

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= param0) {
                  break L2;
                } else {
                  if (128 > param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (160 > param0) {
                  break L3;
                } else {
                  if (param0 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param0 != 0) {
                var6 = te.field_e;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2_ref, "mr.B(" + param0 + 44 + 2004352972 + 41);
        }
        return stackIn_18_0 != 0;
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains your Player Name, and would be easy to guess";
        field_b = new int[]{587202559, 587202559, 872415231, 1439485183, 2006555084, 2002081177, -2013265886, 2013265919, 872402005, 872380211, -16777216, 1996488704, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 587202559, 2004352972, 2004352972};
    }
}
