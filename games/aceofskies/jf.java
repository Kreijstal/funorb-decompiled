/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf implements ir {
    static hj field_a;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 == 15000) {
          v.field_a = true;
          wg.field_b = kh.a(param0 - 15076) + 15000L;
          return ob.field_d == 11 ? true : false;
        }
        gk var2 = (gk) null;
        jf.a(83, (gk) null, (gk) null);
        v.field_a = true;
        wg.field_b = kh.a(param0 - 15076) + 15000L;
        return ob.field_d == 11 ? true : false;
    }

    final static void a(int param0, gk param1, gk param2) {
        lj.field_c = nc.a(param1, param0 ^ 102, param2, jb.field_a, (boolean[]) null);
        boolean[] var5 = (boolean[]) null;
        kn.field_c = nc.a(param1, -107, param2, s.field_d, (boolean[]) null);
        if (param0 != -4) {
          return;
        }
        try {
          boolean[] var6 = (boolean[]) null;
          lp.field_g = nc.a(param1, -114, param2, iq.field_g, (boolean[]) null);
          fd.field_b = dt.a(param1, 19501, ad.field_T, param2, tt.field_d);
          uh.field_g = nc.a(param1, -76, param2, wt.field_k, ht.field_j);
          hp.field_i = nc.a(param1, -114, param2, wt.field_g, rj.field_c);
          mh.field_o = bj.a(param2, "", wg.field_c).a();
          gg.field_a = bj.a(param2, "", rg.field_C).a();
          kq.field_b = bj.a(param2, "", np.field_e).a();
          bj.a(param2, "", un.field_q).a();
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "jf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ll var8 = null;
        try {
          if (param1 != -7592) {
            field_b = (String) null;
          }
          var6_int = param2 + param3.field_p;
          var7 = param4 + param3.field_h;
          nn.a(var7, (byte) 70, var6_int, param3.field_q, param3.field_n);
          var8 = gu.field_c[1];
          if (param3 instanceof mi &&
            ((mi) (param3)).field_s) {
            var8.d(var6_int + (1 + (param3.field_q - var8.field_v >> 1)), (param3.field_n - var8.field_q >> 1) + var7 + 1, 256);
          }
          if (!param3.e(28660)) {
            return;
          }
          co.a(var7 + 2, param3.field_n - 4, param3.field_q - 4, 2 + var6_int, 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("jf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -106 % ((param2 - 0) / 46);
          var3 = null;
          var5 = null;
          if (gt.field_r != null &&
            !gt.field_r.equals(param0.getParameter("settings"))) {
            var3 = gt.field_r;
            var5 = var3;
            var5 = var3;
          }
          if (ac.field_d != null &&
            !ac.field_d.equals(param0.getParameter("session"))) {
            var5 = ac.field_d;
          }
          stackIn_7_0 = vj.a(param1, (String) (var3), (String) (var5), 122, -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jf.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -11) {
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        if (param1) {
          if (js.field_c[param0] > js.field_c[param3]) {
            return true;
          }
          if (js.field_c[param3] > js.field_c[param0]) {
            return false;
          }
          if (ai.field_a[param0] > ai.field_a[param3]) {
            return true;
          }
          if (ai.field_a[param3] > ai.field_a[param0]) {
            return false;
          }
          var4 = dd.field_c[param3] + qd.field_p[param3] + hg.field_C[param3];
          if (param2 != 67) {
            jf.a(121, false, (byte) -23, -25);
          }
          var5 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
          if (var5 > var4) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param3 >= param0);
        }
        if (ai.field_a[param3] < ai.field_a[param0]) {
          return true;
        }
        if (ai.field_a[param3] > ai.field_a[param0]) {
          return false;
        }
        if (js.field_c[param3] < js.field_c[param0]) {
          return true;
        }
        if (js.field_c[param3] > js.field_c[param0]) {
          return false;
        }
        var4Lifetime1 = dd.field_c[param3] + qd.field_p[param3] + hg.field_C[param3];
        if (param2 == 67) {
          var5Lifetime1 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param3 >= param0);
        }
        jf.a(121, false, (byte) -23, -25);
        var5Lifetime2 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
        if (var5Lifetime2 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime2) {
          return false;
        }
        if (param3 >= param0) {
          return false;
        }
        return true;
    }

    static {
        field_b = "Error connecting to server. Please try using a different server.";
    }
}
