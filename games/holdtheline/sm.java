/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static uf field_a;
    static String field_d;
    static ah field_b;
    static si field_c;

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            var14 = new char[param0];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (~param0 >= ~var6) {
                stackOut_14_0 = new String(var14, 0, var5);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                var7 = 255 & param3[param1 + var6];
                if (var7 == 0) {
                  var6++;
                  var6++;
                  continue L1;
                } else {
                  L2: {
                    if (var7 < 128) {
                      break L2;
                    } else {
                      if (var7 >= 160) {
                        break L2;
                      } else {
                        L3: {
                          var8 = ja.field_Qb[var7 - 128];
                          if (0 != var8) {
                            break L3;
                          } else {
                            var8 = 63;
                            break L3;
                          }
                        }
                        var7 = var8;
                        break L2;
                      }
                    }
                  }
                  int incrementValue$55 = var5;
                  var5++;
                  var10[incrementValue$55] = (char)var7;
                  var6++;
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("sm.A(").append(param0).append(',').append(param1).append(',').append(-129).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<col=2>Not Attempted</col>";
        field_b = new ah();
    }
}
