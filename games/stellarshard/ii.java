/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ig {
    static int field_J;
    private int field_I;
    static String field_G;
    static String field_F;
    private w field_H;

    final void a(int param0, byte param1, int param2, int param3) {
        pb var15 = null;
        pb var18 = null;
        pb var12 = null;
        pb var21 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = stellarshard.field_B;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        int var5 = param3 + this.field_w + (this.field_p >> 1);
        int var6 = (this.field_t >> 1) + (param2 + this.field_k);
        cg var8 = this.field_H.b(-28036);
        if (eh.field_c == var8) {
          var15 = ah.field_p[0];
          var9 = var15.field_w << 1;
          var10 = var15.field_x << 1;
          if (ta.field_s == null) {
            ta.field_s = new pb(var9, var10);
            hj.a(ta.field_s, 1);
            var15.b(112, 144, var15.field_w << 4, var15.field_x << 4, -this.field_I << 10, 4096);
            id.b((byte) -58);
            ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
            return;
          }
          if (var9 > ta.field_s.field_v) {
            ta.field_s = new pb(var9, var10);
            hj.a(ta.field_s, 1);
            var15.b(112, 144, var15.field_w << 4, var15.field_x << 4, -this.field_I << 10, 4096);
            id.b((byte) -58);
            ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
            return;
          }
          if (ta.field_s.field_y >= var10) {
            hj.a(ta.field_s, 1);
            ti.d();
            var15.b(112, 144, var15.field_w << 4, var15.field_x << 4, -this.field_I << 10, 4096);
            id.b((byte) -58);
            ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
            return;
          }
          ta.field_s = new pb(var9, var10);
          hj.a(ta.field_s, 1);
          var15.b(112, 144, var15.field_w << 4, var15.field_x << 4, -this.field_I << 10, 4096);
          id.b((byte) -58);
          ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
          return;
        }
        if (var8 == vk.field_d) {
          var18 = ah.field_p[0];
          var9Lifetime1 = var18.field_w << 1;
          var10Lifetime1 = var18.field_x << 1;
          if (ta.field_s == null) {
            ta.field_s = new pb(var9Lifetime1, var10Lifetime1);
            hj.a(ta.field_s, 1);
            var18.b(112, 144, var18.field_w << 4, var18.field_x << 4, -this.field_I << 10, 4096);
            id.b((byte) -58);
            ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
            return;
          }
          if (var9Lifetime1 > ta.field_s.field_v) {
            ta.field_s = new pb(var9Lifetime1, var10Lifetime1);
            hj.a(ta.field_s, 1);
            var18.b(112, 144, var18.field_w << 4, var18.field_x << 4, -this.field_I << 10, 4096);
            id.b((byte) -58);
            ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
            return;
          }
          if (ta.field_s.field_y >= var10Lifetime1) {
            hj.a(ta.field_s, 1);
            ti.d();
            var18.b(112, 144, var18.field_w << 4, var18.field_x << 4, -this.field_I << 10, 4096);
            id.b((byte) -58);
            ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
            return;
          }
          ta.field_s = new pb(var9Lifetime1, var10Lifetime1);
          hj.a(ta.field_s, 1);
          var18.b(112, 144, var18.field_w << 4, var18.field_x << 4, -this.field_I << 10, 4096);
          id.b((byte) -58);
          ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
          return;
        }
        if (var8 == qj.field_c) {
          var12 = ah.field_p[2];
          var12.d(-(var12.field_v >> 1) + var5, -(var12.field_y >> 1) + var6, 256);
          return;
        }
        if (var8 == lg.field_c) {
          var21 = ah.field_p[1];
          var21.d(var5 - (var21.field_v >> 1), -(var21.field_y >> 1) + var6, 256);
          return;
        }
    }

    public static void a(byte param0) {
        field_F = null;
        if (param0 != 25) {
          field_G = (String) null;
          field_G = null;
          return;
        }
        field_G = null;
    }

    final static void a(u param0, int param1, byte param2) {
        ha var3 = null;
        try {
          if (param2 <= 11) {
            field_F = (String) null;
          }
          var3 = pg.field_fb;
          var3.f(param1, 950);
          var3.a(false, param0.field_q);
          var3.c(param0.field_n, -115);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ii.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable decompiledCaughtException = null;
        Object var1_ref = null;
        var1_ref = sf.field_c;
        synchronized (var1_ref) {
          fb.field_n = ib.field_g;
          if (param0 != 256) {
            return;
          }
          ac.field_e = ac.field_e + 1;
          ni.field_e = pg.field_gb;
          eb.field_a = ak.field_e;
          qc.field_a = hi.field_a;
          hi.field_a = false;
          gh.field_c = tg.field_b;
          di.field_b = oc.field_b;
          oc.field_e = wl.field_R;
          tg.field_b = 0;
        }
    }

    final boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        rj var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2147483648) {
            var4 = (rj) null;
            this.a(43, false, 76, (rj) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ii.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        try {
          this.field_I = this.field_I + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ii.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (param0 != 3690) {
          return (String) null;
        }
        if (!this.field_q) {
          return null;
        }
        return this.field_H.c(-22773);
    }

    ii(w param0) {
        try {
          this.field_H = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_F = null;
    }
}
