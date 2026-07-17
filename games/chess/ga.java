/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static java.awt.Image field_a;
    static ag field_b;

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return kb.field_S;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rh.field_c.a(param0, param1, -2147483648, param5, param2);
        if (param3 != 22478) {
            field_a = null;
        }
        if (!(tl.field_Fb == null)) {
            tl.field_Fb.a(param5, param6, -hf.field_g + param4, param5, param4, 6);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Chess.field_G;
          if (0 < cl.field_d) {
            L1: {
              if (null != ch.field_gb) {
                rm.field_R = ch.field_gb.a((byte) 101);
                dn.a(2, (byte) -96);
                break L1;
              } else {
                rm.field_R = fn.a(0, 480, 0, 21, 640, oc.field_l);
                break L1;
              }
            }
            if (rm.field_R != null) {
              ca.a(13369344, (java.awt.Canvas) (Object) rm.field_R);
              var2 = 2;
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          } else {
            if (vi.a(-3)) {
              var2 = 0;
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
        }
        L2: {
          if (null != ch.field_gb) {
            break L2;
          } else {
            if (re.field_r) {
              qh.a(false, param0, var2);
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                if (param0 < -71) {
                  stackOut_7_0 = var3;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_5_0 = -87;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                var3 = -var3 + (var3 << 5) + ai.a((byte) -43, param1.charAt(var4));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ga.C(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ag();
    }
}
