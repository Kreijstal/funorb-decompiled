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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (wg) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("wk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        String[] var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
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
                  wk.a((byte) -108, (String[]) null);
                  break L1;
                }
              }
              ta.field_d = r.field_g[pf.field_a];
              pf.field_a = pf.field_a + 1 & 127;
              stackIn_7_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
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
