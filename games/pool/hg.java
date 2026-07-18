/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String field_b;
    static vh field_c;
    static int field_a;

    final static void a(String param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("hg.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        o.field_C.c(param1, param3);
        if (param2) {
          L0: {
            var4 = uf.field_X % o.field_C.field_z * 2;
            if (var4 < o.field_C.field_z) {
              break L0;
            } else {
              var4 = o.field_C.field_z + (-var4 + o.field_C.field_z);
              break L0;
            }
          }
          if (10 > var4) {
            var4 = 10;
            wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
            return;
          } else {
            if (-40 + o.field_C.field_z >= var4) {
              wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
              return;
            } else {
              var4 = -40 + o.field_C.field_z;
              wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static java.awt.Container a() {
        if (!(null == op.field_e)) {
            return (java.awt.Container) (Object) op.field_e;
        }
        return (java.awt.Container) (Object) hk.d(95);
    }

    public static void b() {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try again";
    }
}
