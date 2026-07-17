/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static String field_c;
    static int field_b;
    static int field_d;
    static String field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3 = param0 >>> 31;
        if (param1 <= 118) {
            return 121;
        }
        return -var3 + (var3 + param0) / param2;
    }

    public static void a() {
        field_c = null;
        field_a = null;
    }

    final static boolean a(int param0, char param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              var2_int = 70 / ((0 - param0) / 60);
              if (!kn.a(param1, (byte) -69)) {
                var7 = va.field_e;
                var3 = var7;
                var4 = 0;
                L1: while (true) {
                  if (var7.length <= var4) {
                    var3 = li.field_f;
                    var4 = 0;
                    L2: while (true) {
                      if (var4 >= var3.length) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        var5 = var3[var4];
                        if (var5 != param1) {
                          var4++;
                          continue L2;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        }
                      }
                    }
                  } else {
                    var5 = var7[var4];
                    if (param1 != var5) {
                      var4++;
                      continue L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "bn.B(" + param0 + 44 + param1 + 41);
        }
        return stackIn_20_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please enter your date of birth to enable chat:";
        field_a = "Logging in...";
    }
}
