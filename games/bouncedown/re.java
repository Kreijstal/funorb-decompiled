/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static tg field_a;

    final static boolean a(int param0, ii param1) {
        RuntimeException var2 = null;
        ii var3 = null;
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
              if (param0 > 24) {
                break L1;
              } else {
                var3 = (ii) null;
                re.a(-18, (ii) null);
                break L1;
              }
            }
            L2: {
              if (1 != param1.f(7, 1)) {
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

            stackIn_8_1 = new StringBuilder().append("re.C(").append(param0).append(',');

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
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(byte param0, ke param1, int param2) {
        try {
            if (param0 != 109) {
                field_a = (tg) null;
            }
            uk.field_d.a(1, param1);
            qh.a(param1, param2, -22762);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "re.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
