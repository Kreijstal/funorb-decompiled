/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ee extends rk {
    static int field_p;
    static int field_r;
    static o field_q;

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        java.awt.Component var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.removeMouseListener(tc.field_m);
              param0.removeMouseMotionListener(tc.field_m);
              param0.removeFocusListener(tc.field_m);
              ve.field_d = 0;
              if (param1 == 6769) {
                break L1;
              } else {
                var3 = (java.awt.Component) null;
                ee.a((java.awt.Component) null, -20);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ee.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != -21880) {
            java.awt.Component var2 = (java.awt.Component) null;
            ee.a((java.awt.Component) null, 97);
        }
    }

    ee() {
    }

    static {
        field_p = 104;
        field_r = -1;
    }
}
