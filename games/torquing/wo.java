/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wo implements Iterator {
    private lj field_a;
    static tm field_d;
    private ta field_c;
    private ta field_b;

    final static void a(byte param0, int param1, int[] param2) {
        int var3_int = 0;
        try {
          var3_int = fo.a(param2[param1], (byte) -18, param2[param1 + 1]);
          var3_int = fo.a(param2[param1 + 2], (byte) -128, var3_int);
          param2[param1] = param2[param1] / var3_int;
          param2[1 + param1] = param2[1 + param1] / var3_int;
          if (param0 != 49) {
            wo.a(-112, 3, 4, -83, true, -82);
          }
          param2[2 + param1] = param2[2 + param1] / var3_int;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "wo.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 == param2) {
          qo.a(param5, param4, param3, (byte) -95, param1);
          return;
        }
        if (param0 < 110) {
          wo.a(-31);
        }
        if (param1 - param4 < kn.field_e) {
          a.a(param5, param1, param4, (byte) 123, param3, param2);
          return;
        }
        if (qg.field_z < param1 + param4) {
          a.a(param5, param1, param4, (byte) 123, param3, param2);
          return;
        }
        if (j.field_q > -param2 + param3) {
          a.a(param5, param1, param4, (byte) 123, param3, param2);
          return;
        }
        if (qk.field_p < param3 + param2) {
          a.a(param5, param1, param4, (byte) 123, param3, param2);
          return;
        }
        wh.a(param5, -1817, param4, param1, param2, param3);
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          wo.a(-30, 57, -96, -102, false, -105);
        }
    }

    public final void remove() {
        if (null == this.field_b) {
          throw new IllegalStateException();
        }
        this.field_b.h(0);
        this.field_b = null;
    }

    public final boolean hasNext() {
        return this.field_a.field_a != this.field_c;
    }

    final static void a(int param0) {
        if (!ff.field_a) {
          throw new IllegalStateException();
        }
        if (null != gn.field_m) {
          gn.field_m.b(true);
        }
        String var1 = kf.a(17241);
        un.field_k = new pe(var1, (String) null, true, false, false);
        dc.field_a.a(hb.field_x, (byte) 82);
        hb.field_x.c(un.field_k, 33);
        if (param0 > 22) {
          hb.field_x.j(0);
          return;
        }
        field_d = (tm) null;
        hb.field_x.j(0);
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (var1 == this.field_a.field_a) {
          var1 = null;
          this.field_c = null;
        } else {
          this.field_c = ((ta) (var1)).field_p;
        }
        this.field_b = (ta) (var1);
        return var1;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          incrementValue$0 = param5;
          param5++;
          di.a(param0, (byte) -118, param1, qd.field_a[incrementValue$0], param3);
          if (!param4) {
            return;
          }
          incrementValue$1 = param2;
          param2--;
          di.a(param0, (byte) -122, param1, qd.field_a[incrementValue$1], param3);
          for (var6_int = param5; param2 >= var6_int; var6_int++) {
            var7 = qd.field_a[var6_int];
            var7[param3] = param1;
            var7[param0] = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "wo.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    wo(lj param0) {
        this.field_b = null;
        try {
          this.field_a = param0;
          this.field_c = this.field_a.field_a.field_p;
          this.field_b = null;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "wo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new tm();
    }
}
