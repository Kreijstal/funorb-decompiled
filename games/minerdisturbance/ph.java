/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static wh field_a;
    static java.math.BigInteger field_g;
    static int field_f;
    static ea[] field_e;
    static int field_d;
    static int field_c;
    static int field_b;

    public static void a() {
        field_e = null;
        field_g = null;
        field_a = null;
    }

    final static String a(byte param0, int param1, byte[] param2, int param3) {
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
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 > 13) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            var14 = new char[param1];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (param1 <= var6) {
                stackOut_17_0 = new String(var14, 0, var5);
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  var7 = param2[var6 + param3] & 255;
                  if (0 == var7) {
                    var6++;
                    break L3;
                  } else {
                    L4: {
                      if (var7 < 128) {
                        break L4;
                      } else {
                        if (var7 < 160) {
                          L5: {
                            var8 = tk.field_e[var7 + -128];
                            if (var8 != 0) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    int incrementValue$17 = var5;
                    var5++;
                    var10[incrementValue$17] = (char)var7;
                    var6++;
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
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("ph.B(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new java.math.BigInteger("65537");
        field_c = 0;
    }
}
