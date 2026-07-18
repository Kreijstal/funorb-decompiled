/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wf implements Iterable {
    static String field_e;
    pa field_a;
    static int field_c;
    static String field_d;
    static rh field_b;

    final static wj c(int param0) {
        if (param0 != 0) {
            wj discarded$0 = wf.c(120);
            return (wj) (Object) new o();
        }
        return (wj) (Object) new o();
    }

    final void a(int param0, pa param1) {
        try {
            if (param1.field_m != null) {
                param1.e(-122);
            }
            int var3_int = -53 % ((param0 - 9) / 32);
            param1.field_p = ((wf) this).field_a;
            param1.field_m = ((wf) this).field_a.field_m;
            param1.field_m.field_p = param1;
            param1.field_p.field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "wf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -90) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        var1 = (Object) (Object) rh.field_f;
        synchronized (var1) {
          L1: {
            if (tl.field_o == tc.field_h) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              ji.field_a = hj.field_b[tl.field_o];
              id.field_b = pf.field_d[tl.field_o];
              tl.field_o = 1 + tl.field_o & 127;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    final pa d(int param0) {
        pa var2 = null;
        if (param0 == -27593) {
          var2 = ((wf) this).field_a.field_p;
          if (((wf) this).field_a == var2) {
            return null;
          } else {
            var2.e(123);
            return var2;
          }
        } else {
          return null;
        }
    }

    private wf() throws Throwable {
        throw new Error();
    }

    final static vb a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        vb var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        vb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var8 = pf.a(18316, 0, param5, param3, param1, 0);
            var6 = var8;
            if (var8 != null) {
              var7 = new vb();
              var7.field_b = var8;
              java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param1, param5);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (vb) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("wf.B(").append(0).append(',').append(param1).append(',').append(0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 0 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            ah.field_c = true;
            if (!param2) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_3_0 = stackOut_1_0;
              break L0;
            }
          }
          ud.field_c = stackIn_3_0 != 0;
          ok.field_x = new bd(nb.field_a, rg.field_o, param0, jg.field_d, ud.field_c);
          nb.field_a.b((qa) (Object) ok.field_x, (byte) -35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wf.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + false + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new rc((wf) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Names cannot contain consecutive spaces";
    }
}
