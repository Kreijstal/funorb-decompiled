/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    int field_d;
    int field_e;
    static eg field_a;
    int field_c;
    int field_b;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        int var1 = 18 % ((param0 - 57) / 62);
        field_a = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        gk var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -8759) {
                break L1;
              } else {
                var3 = (gk) null;
                vc.a((gk) null, -26, (byte) 6, 3);
                break L1;
              }
            }
            L2: {
              if (kg.a(param1, (byte) 61) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("vc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static ll[] a(gk param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -7) {
              break L0;
            } else {
              vc.a((byte) -14);
              break L0;
            }
          }
          if (tn.a(param0, (byte) -127, param3, param1)) {
            return bl.b(-95);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("vc.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.field_e = param0;
        this.field_d = param2;
        this.field_b = param1;
        this.field_c = qq.a(20, co.field_i.length);
        if (param3 <= 103) {
            String var6 = (String) null;
            vc.a(24, (String) null);
        }
    }

    static {
        field_a = new eg();
    }
}
