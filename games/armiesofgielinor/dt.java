/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static int field_a;
    static boolean[] field_d;
    static String field_c;
    static java.security.SecureRandom field_b;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -1) {
            dt.a(5);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param2 < 0) {
            return false;
        }
        if (param2 > 11) {
            return false;
        }
        if (1 > param3) {
            return false;
        }
        if (param3 > bn.a((byte) -84, param2, param0)) {
            return false;
        }
        return true;
    }

    final static void a(java.awt.Canvas param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            int discarded$14 = 35;
            fj.a((java.awt.Component) (Object) param0);
            int discarded$15 = -37;
            dc.a((java.awt.Component) (Object) param0);
            if (om.field_I == null) {
              break L0;
            } else {
              om.field_I.a((java.awt.Component) (Object) param0, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("dt.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + 23678 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Quit to website";
    }
}
