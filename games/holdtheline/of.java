/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    final static boolean a(int param0) {
        if (param0 != -969) {
            return true;
        }
        if (pj.b((byte) 87)) {
            return false;
        }
        if (0 >= fc.field_a) {
            return false;
        }
        return true;
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var3_int = param0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                stackIn_8_0 = var3_int;
                break L0;
              } else {
                L2: {
                  if (param1.charAt(var5) != param2) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("of.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    static {
    }
}
