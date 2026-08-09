/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class igb {
    static java.awt.Canvas field_a;
    static String field_b;

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 111) {
                break L1;
              } else {
                igb.a(-66);
                break L1;
              }
            }
            stackIn_3_0 = dk.a(-125, false, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("igb.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, double param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (r.field_l != param1) {
                var3_int = 0;
                L2: while (true) {
                  if (-257 >= (var3_int ^ -1)) {
                    r.field_l = param1;
                    break L1;
                  } else {
                    L3: {
                      var4 = (int)(255.0 * Math.pow((double)var3_int / 255.0, param1));
                      stackIn_7_0 = pp.field_o;

                      stackIn_7_1 = var3_int;

                      if (255 < var4) {
                        stackIn_8_0 = (int[]) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = 255;
                        break L3;
                      } else {
                        stackIn_8_0 = (int[]) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = var4;
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
          throw rta.a((Throwable) ((Object) var3), "igb.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(llb param0, byte param1) {
        llb var4 = null;
        llb var5 = null;
        int var3 = VoidHunters.field_G;
        try {
            var4 = (llb) ((Object) param0.field_lb.d(0));
            llb var2 = var4;
            while (var4 != null) {
                var4.field_K = 0;
                var4.field_G = 0;
                var4.field_db = 0;
                var4.field_E = 0;
                var5 = (llb) ((Object) param0.field_lb.a((byte) 108));
                var5 = var5;
            }
            param0.field_K = 0;
            param0.field_db = 0;
            if (param1 >= -22) {
                field_b = (String) null;
            }
            param0.field_E = 0;
            param0.field_G = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "igb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Limited time only";
    }
}
