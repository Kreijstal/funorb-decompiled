/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static uf field_a;
    static String field_d;
    static ah field_b;
    static si field_c;

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int incrementValue$5 = 0;
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
            L1: {
              var12 = new char[param0];
              var11 = var12;
              var10 = var11;
              var4 = var10;
              if (param2 == -129) {
                break L1;
              } else {
                sm.a((byte) -10);
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (param0 <= var6) {
                stackOut_14_0 = new String(var12, 0, var5);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L3: {
                  var7 = 255 & param3[param1 + var6];
                  if (var7 == 0) {
                    break L3;
                  } else {
                    L4: {
                      if (-129 < (var7 ^ -1)) {
                        break L4;
                      } else {
                        if (-161 >= (var7 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            var8 = ja.field_Qb[var7 - 128];
                            if (0 != var8) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    incrementValue$5 = var5;
                    var5++;
                    var10[incrementValue$5] = (char)var7;
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4_ref);
            stackOut_16_1 = new StringBuilder().append("sm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 != 72) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_d = "<col=2>Not Attempted</col>";
        field_b = new ah();
    }
}
