/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends qg {
    static ag field_B;
    static bj field_A;

    final static void j(int param0) {
        if (param0 != -9636) {
            wc.a(-106, -89, 43);
        }
    }

    final static void a(int param0, int param1, int param2) {
        ca.field_a = param2;
        ug.field_h = param0;
        if (param1 != -16923) {
            field_B = (ag) null;
        }
    }

    private wc(int param0, int param1, int param2, int param3, ci param4, pl param5, lk param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "wc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(int param0) {
        field_B = null;
        if (param0 != -21693) {
            field_A = (bj) null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        qi var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = sh.field_i;
              if (var7 == null) {
                break L1;
              } else {
                if (!this.a(-77, param3, param5, param2, param4)) {
                  break L1;
                } else {
                  if (!(this.field_k instanceof wa)) {
                    if (!(var7.field_k instanceof wa)) {
                      break L1;
                    } else {
                      ((wa) ((Object) var7.field_k)).a((wc) (this), 15254, var7);
                      sh.field_i = null;
                      return;
                    }
                  } else {
                    ((wa) ((Object) this.field_k)).a((wc) (this), 15254, var7);
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
            stackIn_9_0 = (RuntimeException) (var7_ref);

            stackIn_9_1 = new StringBuilder().append("wc.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_B = new ag();
        field_A = null;
    }
}
