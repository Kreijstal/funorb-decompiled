/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rfa {
    static kv field_a;
    static sna field_b;

    final static int a(boolean param0, int param1) {
        param1 = (param1 >>> -354958911 & 1431655765) + (1431655765 & param1);
        if (param0) {
          return -30;
        } else {
          param1 = (858993459 & param1) + (param1 >>> 1029475586 & -214748365);
          param1 = param1 + (param1 >>> 1273209220) & 252645135;
          param1 = param1 + (param1 >>> 566074472);
          param1 = param1 + (param1 >>> 750005616);
          return param1 & 255;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -101) {
            field_b = (sna) null;
        }
    }

    final static cj a(int param0, lu param1) {
        RuntimeException var2 = null;
        rv stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 29428) {
                break L1;
              } else {
                rfa.a((byte) 60);
                break L1;
              }
            }
            stackIn_3_0 = new rv(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rfa.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (cj) ((Object) stackIn_3_0);
    }

    static {
    }
}
