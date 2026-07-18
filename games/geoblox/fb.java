/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends hf {
    int field_g;
    int field_k;
    int field_i;
    static nd field_j;
    int field_n;
    static int[] field_m;
    static boolean field_l;
    int field_f;
    fb field_h;

    public static void b(boolean param0) {
        field_m = null;
        field_j = null;
    }

    final static boolean a(char param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (!pf.a(-123, param0)) {
                var2_int = -88;
                var6 = hd.field_D;
                var4 = 0;
                L1: while (true) {
                  if (var6.length <= var4) {
                    var7 = nh.field_b;
                    var8 = 0;
                    var4 = var8;
                    L2: while (true) {
                      if (var8 >= var7.length) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        var5 = var7[var8];
                        if (var5 != param0) {
                          var8++;
                          continue L2;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        }
                      }
                    }
                  } else {
                    var5 = var6[var4];
                    if (param0 == var5) {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "fb.B(" + param0 + ',' + -47 + ')');
        }
        return stackIn_20_0 != 0;
    }

    fb(int param0, int param1, int param2, int param3, int param4) {
        ((fb) this).field_f = param3;
        ((fb) this).field_k = param1;
        ((fb) this).field_n = param4;
        ((fb) this).field_g = param0;
        ((fb) this).field_i = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new nd();
        field_l = true;
    }
}
