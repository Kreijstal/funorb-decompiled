/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends qg {
    static ag field_B;
    static bj field_A;

    final static void j(int param0) {
    }

    final static void a(int param0, int param1, int param2) {
        ca.field_a = param2;
        ug.field_h = param0;
    }

    private wc(int param0, int param1, int param2, int param3, ci param4, pl param5, lk param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((wc) this).field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "wc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_B = null;
        if (param0 != -21693) {
            field_A = null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        qi var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = sh.field_i;
              if (var7 == null) {
                break L1;
              } else {
                if (!((wc) this).a(-77, param3, param5, param2, param4)) {
                  break L1;
                } else {
                  if (!(((wc) this).field_k instanceof wa)) {
                    if (!(var7.field_k instanceof wa)) {
                      break L1;
                    } else {
                      ((wa) (Object) var7.field_k).a((wc) this, 15254, var7);
                      sh.field_i = null;
                      return;
                    }
                  } else {
                    ((wa) (Object) ((wc) this).field_k).a((wc) this, 15254, var7);
                    sh.field_i = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7_ref;
            stackOut_7_1 = new StringBuilder().append("wc.O(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new ag();
        field_A = null;
    }
}
