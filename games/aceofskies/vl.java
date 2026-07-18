/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static vd[] field_b;
    static String field_a;
    static vd field_c;

    final static void a() {
        int discarded$90 = -32546;
        tt.b();
        if (ci.field_f == null) {
          ic.a(0);
          int discarded$91 = 1;
          to.h();
          int discarded$92 = -18535;
          bl.c();
          int discarded$93 = 0;
          if (je.a()) {
            q.field_p.g(54, 1);
            fr.a(-47, 0);
            int discarded$94 = 1;
            te.b();
            return;
          } else {
            int discarded$95 = 1;
            te.b();
            return;
          }
        } else {
          pg.a(ci.field_f, 116);
          ic.a(0);
          int discarded$96 = 1;
          to.h();
          int discarded$97 = -18535;
          bl.c();
          int discarded$98 = 0;
          if (!je.a()) {
            int discarded$99 = 1;
            te.b();
            return;
          } else {
            q.field_p.g(54, 1);
            fr.a(-47, 0);
            int discarded$100 = 1;
            te.b();
            return;
          }
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 10) {
              int discarded$2 = -43;
              stackOut_3_0 = aa.a(true, 10, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("vl.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void b() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
    }
}
