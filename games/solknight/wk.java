/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends java.awt.Canvas {
    static String field_a;
    static uh[] field_d;
    private java.awt.Component field_f;
    static String field_g;
    static int field_e;
    static long field_b;
    static da field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        int var1 = -56 / ((param0 - 69) / 43);
        field_d = null;
    }

    final static wg a(byte param0, String[] param1) {
        wg var2 = null;
        RuntimeException var2_ref = null;
        wg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 17) {
                break L1;
              } else {
                field_e = 88;
                break L1;
              }
            }
            var2 = new wg(false);
            var2.field_a = param1;
            stackOut_2_0 = (wg) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("wk.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    wk(java.awt.Component param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        wg discarded$3 = null;
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        String[] var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = i.field_J;
        synchronized (var1_ref) {
          L0: {
            if (si.field_B != pf.field_a) {
              L1: {
                el.field_n = lb.field_V[pf.field_a];
                if (param0 == -56) {
                  break L1;
                } else {
                  var3 = (String[]) null;
                  discarded$3 = wk.a((byte) -108, (String[]) null);
                  break L1;
                }
              }
              ta.field_d = r.field_g[pf.field_a];
              pf.field_a = pf.field_a + 1 & 127;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final static int b(int param0) {
        if (param0 != 0) {
            return 31;
        }
        return lf.field_c;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_f.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "wk.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_f.update(param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "wk.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Destroyed: <%0>%";
        field_g = "Create a free Account";
        field_e = 0;
    }
}
