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
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var14 = new char[param0];
              var13 = var14;
              var12 = var13;
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
              if (~param0 >= ~var6) {
                stackOut_16_0 = new String(var14, 0, var5);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                var7 = 255 & param3[param1 + var6];
                if (var7 == 0) {
                  var6++;
                  var6++;
                  continue L2;
                } else {
                  L3: {
                    if (var7 < 128) {
                      break L3;
                    } else {
                      if (var7 >= 160) {
                        break L3;
                      } else {
                        L4: {
                          var8 = ja.field_Qb[var7 - 128];
                          if (0 != var8) {
                            break L4;
                          } else {
                            var8 = 63;
                            break L4;
                          }
                        }
                        var7 = var8;
                        break L3;
                      }
                    }
                  }
                  int incrementValue$55 = var5;
                  var5++;
                  var10[incrementValue$55] = (char)var7;
                  var6++;
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("sm.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<col=2>Not Attempted</col>";
        field_b = new ah();
    }
}
