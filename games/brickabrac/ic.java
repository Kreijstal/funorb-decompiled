/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static long field_b;
    static mf field_a;
    static fj field_c;

    final static void a(boolean param0, om param1) {
        om var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
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
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          param1.b((byte) 111);
          var2 = (om) (Object) rq.field_a.d(-76);
          L0: while (true) {
            L1: {
              if (var2 == null) {
                break L1;
              } else {
                if (!var2.a(param1, true)) {
                  break L1;
                } else {
                  var2 = (om) (Object) rq.field_a.a((byte) 116);
                  continue L0;
                }
              }
            }
            if (var2 == null) {
              rq.field_a.a((nm) (Object) param1, (byte) 3);
              return;
            } else {
              il.a((nm) (Object) param1, -90, (nm) (Object) var2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("ic.A(").append(1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
    }

    final static void a() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (gp.field_c != null) {
          var1 = (Object) (Object) gp.field_c;
          synchronized (var1) {
            L0: {
              gp.field_c = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
    }
}
