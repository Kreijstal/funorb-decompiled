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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0) {
              break L0;
            } else {
              field_b = 8L;
              break L0;
            }
          }
          param1.b((byte) 111);
          var2 = (om) (Object) rq.field_a.d(-76);
          L1: while (true) {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                if (!var2.a(param1, true)) {
                  break L2;
                } else {
                  var2 = (om) (Object) rq.field_a.a((byte) 116);
                  continue L1;
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
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("ic.A(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
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
