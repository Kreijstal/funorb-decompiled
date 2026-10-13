/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gp implements Iterable {
    static op field_c;
    tk field_a;
    static mh field_d;
    static int field_b;

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.charAt(0);
          if (param0 <= 28) {
            return false;
          }
          for (var3 = 1; param1.length() > var3; var3++) {
            if (param1.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gp.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -4858) {
          gp.a(-58, 65, -66, 54, -73);
          if (null != bm.field_d) {
            return true;
          }
          if (s.a(-121)) {
            return true;
          }
          if (CircleBody.field_p != null) {
            return true;
          }
          if (!jg.b(true)) {
            return false;
          }
          return true;
        }
        if (null != bm.field_d) {
          return true;
        }
        if (s.a(-121)) {
          return true;
        }
        if (CircleBody.field_p != null) {
          return true;
        }
        if (!jg.b(true)) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param2 -= 4;
        param4 += 2;
        param1 += 2;
        param0 -= 4;
        int var5 = lb.field_c * param1 + param4;
        int var6 = lb.field_c - param2;
        la.a(lb.field_l, var5, 0, 0, 0, param3, param2, param0, var6);
    }

    final void a(tk param0, byte param1) {
        try {
          if (null != param0.field_n) {
            param0.d(3);
          }
          param0.field_s = this.field_a;
          if (param1 > -112) {
            field_d = (mh) null;
          }
          param0.field_n = this.field_a.field_n;
          param0.field_n.field_s = param0;
          param0.field_s.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "gp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ae(this));
    }

    gp() {
        this.field_a = new tk();
        this.field_a.field_n = this.field_a;
        this.field_a.field_s = this.field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 2) {
          gp.a(-125, -106, -42, 126, 57);
        }
    }

    final tk a(boolean param0) {
        tk var2 = this.field_a.field_s;
        if (var2 == this.field_a) {
          return null;
        }
        var2.d(3);
        if (!param0) {
          return var2;
        }
        gp.a(-105, -93, 51, -34, -59);
        return var2;
    }

    final static void a(boolean param0, boolean param1) {
        if (gp.a(-4858)) {
          param0 = false;
        }
        oj.a(param0, (byte) 123);
        if (nf.field_V) {
          lb.b(sb.field_c.field_d.field_P, sb.field_c.field_d.field_zb, sb.field_c.field_d.field_Ib, sb.field_c.field_d.field_cb);
          sb.field_c.field_d.a(true, param0);
        }
        if (!param1) {
          si.a(7070, param0);
          return;
        }
    }

    static {
        field_c = new op();
    }
}
