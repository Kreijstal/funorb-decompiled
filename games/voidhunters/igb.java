/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class igb {
    static java.awt.Canvas field_a;
    static String field_b;

    final static String a(CharSequence param0) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = dk.a(-125, false, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("igb.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 119 + 41);
        }
        return stackIn_1_0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, double param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (r.field_l != param1) {
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= 256) {
                    r.field_l = param1;
                    break L1;
                  } else {
                    L3: {
                      var4 = (int)(255.0 * Math.pow((double)var3_int / 255.0, param1));
                      stackOut_5_0 = pp.field_o;
                      stackOut_5_1 = var3_int;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (255 < var4) {
                        stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = 255;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        break L3;
                      } else {
                        stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = var4;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L3;
                      }
                    }
                    stackIn_8_0[stackIn_8_1] = stackIn_8_2;
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param0) {
              break L0;
            } else {
              igb.a(false, 0.7064342118398381);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "igb.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a(llb param0, byte param1) {
        llb var4 = null;
        llb var5 = null;
        int var3 = VoidHunters.field_G;
        try {
            var4 = (llb) (Object) param0.field_lb.d(0);
            llb var2 = var4;
            while (var4 != null) {
                var4.field_K = 0;
                var4.field_G = 0;
                var4.field_db = 0;
                var4.field_E = 0;
                var5 = (llb) (Object) param0.field_lb.a((byte) 108);
                var5 = var5;
            }
            param0.field_K = 0;
            param0.field_db = 0;
            if (param1 >= -22) {
                field_b = null;
            }
            param0.field_E = 0;
            param0.field_G = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "igb.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Limited time only";
    }
}
