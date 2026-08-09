/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static nf field_b;
    static hc field_c;
    static int field_a;

    final static boolean a(boolean param0, rb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.g(119);
              if (param0) {
                break L1;
              } else {
                field_b = (nf) null;
                break L1;
              }
            }
            L2: {
              if (var2_int != 1) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("b.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != 28) {
            b.a(75, (byte) -109, false, 57);
        }
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 <= -41) {
          L0: {
            if (ml.field_p) {
              stackIn_7_0 = 1;
              break L0;
            } else {
              if (!cn.b(true)) {
                stackIn_7_0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static int a(int param0, byte param1, boolean param2, int param3) {
        if (param1 != 72) {
            b.a((byte) 89);
            return de.a((byte) 92);
        }
        return de.a((byte) 92);
    }

    static {
        field_b = new nf();
        field_a = 2;
    }
}
