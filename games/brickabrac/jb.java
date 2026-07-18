/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends h {
    static int field_H;
    static String field_G;
    static int[] field_I;

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        dn var7 = null;
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
              var7 = gd.field_c;
              if (var7 == null) {
                break L1;
              } else {
                if (!((jb) this).a(param0, param2, param5, 3, param1)) {
                  break L1;
                } else {
                  if (!(((jb) this).field_i instanceof em)) {
                    if (!(var7.field_i instanceof em)) {
                      break L1;
                    } else {
                      ((em) (Object) var7.field_i).a(-24178, var7, (jb) this);
                      gd.field_c = null;
                      return;
                    }
                  } else {
                    ((em) (Object) ((jb) this).field_i).a(-24178, var7, (jb) this);
                    gd.field_c = null;
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
            stackOut_7_1 = new StringBuilder().append("jb.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private jb(int param0, int param1, int param2, int param3, ub param4, uh param5, oc param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((jb) this).field_E = param6;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "jb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i() {
        field_I = null;
        field_G = null;
    }

    final static void b(int param0, int param1) {
        pi var3 = k.field_h;
        var3.e(-13413, param1);
        var3.a(-115, 3);
        var3.a(-113, 8);
        var3.b((byte) 109, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[]{2, 3, 4, 5};
        field_G = "Checking";
    }
}
