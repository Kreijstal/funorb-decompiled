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
          wf.c(120);
          return (wj) ((Object) new o());
        }
        return (wj) ((Object) new o());
    }

    final void a(int param0, pa param1) {
        try {
          if (param1.field_m != null) {
            param1.e(-122);
          }
          int var3_int = -53 % ((param0 - 9) / 32);
          param1.field_p = this.field_a;
          param1.field_m = this.field_a.field_m;
          param1.field_m.field_p = param1;
          param1.field_p.field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "wf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        if (param0 >= -90) {
          field_d = (String) null;
        }
        var1 = rh.field_f;
        synchronized (var1) {
          if (tl.field_o == tc.field_h) {
            return false;
          }
          ji.field_a = hj.field_b[tl.field_o];
          id.field_b = pf.field_d[tl.field_o];
          tl.field_o = 1 + tl.field_o & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final pa d(int param0) {
        if (param0 != -27593) {
          return (pa) null;
        }
        pa var2 = this.field_a.field_p;
        if (this.field_a != var2) {
          var2.e(123);
          return var2;
        }
        return null;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = pf.a(param0 + 18316, param2, param5, param3, param1, param4);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (vb) (stackIn_2_0);
          }
          var7 = new vb();
          var7.field_b = var8;
          var7.field_b.add((java.awt.Component) ((Object) var7));
          var7.setBounds(param0, 0, param1, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("wf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, boolean param2) {
        try {
          ah.field_c = true;
          ud.field_c = param2 ? true : false;
          ok.field_x = new bd(nb.field_a, rg.field_o, param0, jg.field_d, ud.field_c);
          nb.field_a.b(ok.field_x, (byte) -35);
          if (param1) {
            field_e = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "wf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_d = null;
        field_e = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new rc(this));
    }

    static {
        field_e = "Names cannot contain consecutive spaces";
    }
}
