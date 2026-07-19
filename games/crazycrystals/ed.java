/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends om {
    static String[] field_y;
    static int field_z;

    public static void f(byte param0) {
        field_y = null;
        if (param0 != 87) {
            ed.f((byte) 29);
        }
    }

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        RuntimeException runtimeException = null;
        oj var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = ok.field_e;
              if (var7 == null) {
                break L1;
              } else {
                if (this.a(param0, param2, false, param1, param3)) {
                  if (!(this.field_l instanceof sk)) {
                    if (var7.field_l instanceof sk) {
                      ((sk) ((Object) var7.field_l)).a((ed) (this), -27167, var7);
                      ok.field_e = null;
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    ((sk) ((Object) this.field_l)).a((ed) (this), -27167, var7);
                    ok.field_e = null;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ed.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ')');
        }
    }

    private ed(int param0, int param1, int param2, int param3, wo param4, bi param5, qm param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_w = param6;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ed.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, sc param2) {
        md var3 = null;
        try {
            var3 = tp.field_f;
            var3.d(8, param1);
            var3.a(true, param2.field_f);
            int var4 = -40 / ((param0 - 4) / 43);
            var3.c(-161478600, param2.field_k);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ed.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_z = 0;
    }
}
