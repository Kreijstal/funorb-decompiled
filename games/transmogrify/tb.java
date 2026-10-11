/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static int field_a;
    static kg field_c;
    static ti field_e;
    static int[] field_d;
    static ti[] field_b;

    final static void a(kk param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        kk var8 = null;
        try {
          mf.field_c[0] = d.field_c.nextInt();
          mf.field_c[1] = d.field_c.nextInt();
          mf.field_c[3] = (int)fd.field_g;
          mf.field_c[2] = (int)(fd.field_g >> 32);
          d.field_d.field_h = 0;
          d.field_d.a(-96, mf.field_c[0]);
          d.field_d.a(-124, mf.field_c[1]);
          d.field_d.a(-105, mf.field_c[2]);
          d.field_d.a(-103, mf.field_c[3]);
          gb.a(d.field_d, true);
          d.field_d.c(param1, -159688920);
          param0.a((byte) -115, d.field_d);
          ff.field_D.field_h = 0;
          if (param3) {
            ff.field_D.f(6389, 18);
          } else {
            ff.field_D.f(6389, 16);
          }
          ff.field_D.field_h = ff.field_D.field_h + 2;
          var5_int = ff.field_D.field_h;
          ff.field_D.a(-102, cl.field_w);
          ff.field_D.b(1908720528, qb.field_k);
          var6 = 0;
          if (wd.field_g) {
            var6 = var6 | 1;
          }
          if (kc.field_D) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (null != e.field_I) {
            var6 = var6 | 16;
          }
          if (param4 < 25) {
            var8 = (kk) null;
            tb.a((kk) null, -124, true, true, 31);
          }
          ff.field_D.f(6389, var6);
          var7 = wk.a(ha.b(99), (byte) -45);
          if (var7 == null) {
            var7 = "";
          }
          ff.field_D.a(-116, var7);
          if (e.field_I != null) {
            ff.field_D.a(e.field_I, 127);
          }
          bj.a(kb.field_p, q.field_f, ff.field_D, (byte) -116, d.field_d);
          ff.field_D.b(-120, ff.field_D.field_h - var5_int);
          rb.a(-1, -377);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("tb.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (!param0) {
          return;
        }
        field_b = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          fl.field_c = param1;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          hi.a(0, var4, var2, var3, param0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "tb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
