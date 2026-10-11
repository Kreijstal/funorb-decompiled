/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    String field_c;
    fa field_a;
    String field_b;
    int field_e;
    static long[] field_f;
    static String field_h;
    String field_g;
    static int field_d;

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 87) {
            stackIn_2_0 = 48;
            return stackIn_2_0;
          }
          if (param1) {
            stackIn_7_0 = qk.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = da.field_h.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          var3_int = 0;
          var4 = jh.field_m;
          while (var3_int < rb.field_d.length) {
            var5 = f.field_a[var3_int];
            if (var5 < 0) {
              var4 = var4 + jm.field_b;
            } else {
              var6 = bb.$cfr$intArgs$a$62abead39cee(87, true, rb.field_d[var3_int]);
              var7 = -(var6 >> 1) + nd.field_r;
              var4 = var4 + hi.field_ab;
              if (gb.a(var7 - se.field_j, var4, param2, (byte) 76, param1, var6 + (se.field_j << 1), (dc.field_b << 1) + lm.field_d)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (hi.field_ab + ((dc.field_b << 1) + lm.field_d));
            }
            var3_int++;
          }
          if (param0 > -24) {
            field_h = (String) null;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "bb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != -1) {
          bb.a(97, 79, 46);
        }
    }

    final static void a(fa param0, int param1, int param2, vg param3) {
        try {
          uf.field_e = uc.j((byte) -127) * param2 / 1000;
          ee.a((byte) 51, param0);
          qe.a(-28664, param0);
          if (param1 >= -60) {
            bb.a(2);
          }
          ik.a(param0, (byte) 100);
          cg.f((byte) -75);
          vc.a(true);
          kf.field_f = 0 - uf.field_e;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "bb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        jg.field_kb.field_i = 0;
        if (param0 != 3287) {
          vg var2 = (vg) null;
          bb.a((fa) null, 113, -67, (vg) null);
        }
        jg.field_kb.field_l = 0;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (param0 < 105) {
            bb.b(96);
          }
          if (null != va.field_g &&
            !va.field_g.equals(param2.getParameter("settings"))) {
            var3 = va.field_g;
            var4 = var3;
            var4 = var3;
          }
          if (null != hb.field_o &&
            !hb.field_o.equals(param2.getParameter("session"))) {
            var4 = hb.field_o;
          }
          stackIn_10_0 = wl.a(param1, (String) (var4), (String) (var3), false, -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("bb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private bb() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "MHX-3";
        field_f = new long[32];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 87) {
            stackIn_2_0 = 48;
            return stackIn_2_0;
          }
          if (param1) {
            stackIn_7_0 = qk.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = da.field_h.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }
}
