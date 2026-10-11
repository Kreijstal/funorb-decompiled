/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends vd {
    private int field_D;
    private boolean field_B;
    private int field_u;
    static bi field_v;
    private bi field_C;
    private String field_z;
    static int field_x;
    static int field_A;
    static bi field_y;
    static om field_w;

    final static void f(int param0) {
        ln.field_o = sa.field_a.e(-1);
        if (param0 >= -82) {
          return;
        }
        CharSequence var2 = (CharSequence) ((Object) ln.field_o);
        ci.field_d = ji.a(var2, true);
    }

    kb(int param0, int param1, int param2, int param3, String param4, int param5, boolean param6) {
        super(param0, param1, param2, rs.field_Cb.field_J);
        int var9 = 0;
        int var11 = 0;
        int var8_int = 0;
        int var8_intLifetime1;
        try {
          this.field_B = param6 ? true : false;
          this.field_D = param3;
          this.field_u = param5;
          this.field_z = param4;
          this.field_C = new bi(this.field_m, this.field_i);
          ra.a(-111);
          this.field_C.e();
          for (var8_int = 0; this.field_C.field_w > var8_int; var8_int++) {
            var9 = (this.field_C.field_w / 2 - var8_int) * (this.field_C.field_w / 2 - var8_int);
            gf.f(0, var8_int, this.field_C.field_z, ui.a(0, this.field_D, -80, -(256 * var9 / (this.field_C.field_w / 2 * (this.field_C.field_w / 2))) + 256));
          }
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < this.field_C.field_w) {
            gf.a(0, var11, ui.a(0, this.field_C.field_B[var11 * this.field_C.field_z], -105, 128));
            gf.a(-1 + this.field_C.field_z, var11, ui.a(0, this.field_C.field_B[-1 + this.field_C.field_z * (1 + var11)], -112, 128));
            var11++;
          }
          gf.a(1, 1, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z], -93, 128));
          gf.a(2, 1, ui.a(0, this.field_C.field_B[this.field_C.field_z + 2], -113, 192));
          gf.a(1, 2, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z * 2], -87, 192));
          gf.a(1, this.field_C.field_w - 2, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z * (-2 + this.field_C.field_w)], -90, 128));
          gf.a(2, -2 + this.field_C.field_w, ui.a(0, this.field_C.field_B[2 + (-2 + this.field_C.field_w) * this.field_C.field_z], -82, 192));
          gf.a(1, this.field_C.field_w - 3, ui.a(0, this.field_C.field_B[1 + this.field_C.field_z * (-3 + this.field_C.field_w)], -78, 192));
          gf.a(-2 + this.field_C.field_z, 1, ui.a(0, this.field_C.field_B[2 * this.field_C.field_z - 2], -99, 128));
          gf.a(-3 + this.field_C.field_z, 1, ui.a(0, this.field_C.field_B[-3 + this.field_C.field_z * 2], -85, 192));
          gf.a(this.field_C.field_z - 2, 2, ui.a(0, this.field_C.field_B[-2 + 3 * this.field_C.field_z], -124, 192));
          gf.a(this.field_C.field_z - 2, this.field_C.field_w - 2, ui.a(0, this.field_C.field_B[-2 + this.field_C.field_z * (this.field_C.field_w - 1)], -88, 128));
          gf.a(-3 + this.field_C.field_z, -2 + this.field_C.field_w, ui.a(0, this.field_C.field_B[-3 + (this.field_C.field_w - 1) * this.field_C.field_z], -83, 192));
          gf.a(-2 + this.field_C.field_z, this.field_C.field_w - 3, ui.a(0, this.field_C.field_B[-2 + (this.field_C.field_w - 2) * this.field_C.field_z], -94, 192));
          cg.i(0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, String param4) {
        String stackIn_7_0 = null;
        boolean stackIn_29_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          na.field_r = param3;
          k.field_b = param1;
          var11 = param4;
          if (param2) {
            stackIn_7_0 = lq.field_p;
          } else {
            stackIn_7_0 = jm.field_s;
          }
          var6 = stackIn_7_0;
          if (na.field_r == 0) {
            var7 = db.a(480, lq.field_k, var11, ks.field_b, 3);
            var8 = 3 + var7;
            t.field_c = new String[var8];
            pr.field_d = new int[var8];
            for (var9 = 0; var9 < var8; var9++) {
              pr.field_d[var9] = -1;
            }
            fs.field_y = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              t.field_c[var9] = ks.field_b[var9];
            }
            t.field_c[var8 - 3] = "";
            t.field_c[-2 + var8] = var6;
            pr.field_d[var8 - 2] = 0;
            fs.field_y[0] = 1;
            t.field_c[-1 + var8] = nf.field_i;
            pr.field_d[-1 + var8] = 1;
            fs.field_y[1] = 2;
          } else {
            if (1 != na.field_r) {
              throw new IllegalArgumentException();
            }
            var7 = db.a(480, lq.field_k, var11, ks.field_b, 3);
            var8 = var7 + 2;
            t.field_c = new String[var8];
            pr.field_d = new int[var8];
            for (var9 = 0; var9 < var8; var9++) {
              pr.field_d[var9] = -1;
            }
            fs.field_y = new int[1];
            for (var9 = 0; var9 < var7; var9++) {
              t.field_c[var9] = ks.field_b[var9];
            }
            t.field_c[-2 + var8] = "";
            t.field_c[var8 - 1] = nf.field_i;
            pr.field_d[-1 + var8] = 0;
            fs.field_y[0] = 2;
          }
          ns.field_nb.field_b = fs.field_y.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; t.field_c.length > var8Lifetime1; var8Lifetime1++) {
            stackIn_29_0 = !(pr.field_d[var8Lifetime1] < 0);
            var9Lifetime1 = or.a(stackIn_29_0, t.field_c[var8Lifetime1], true);
            if (pr.field_d[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + 2 * js.field_g;
            }
            if (var7Lifetime1 < var9Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          ah.field_R = -(var7Lifetime1 >> 1) + var7Lifetime1 + ol.field_e;
          ld.field_j = -(var7Lifetime1 >> 1) + ol.field_e;
          rn.field_b = (js.field_e + uo.field_g << 1) * ns.field_nb.field_b;
          for (var8Lifetime2 = 0; var8Lifetime2 < t.field_c.length; var8Lifetime2++) {
            stackIn_40_0 = rn.field_b;
            if (pr.field_d[var8Lifetime2] >= 0) {
              stackIn_41_1 = vh.field_b;
            } else {
              stackIn_41_1 = fe.field_A;
            }
            rn.field_b = stackIn_40_0 + stackIn_41_1;
          }
          vo.field_b = ri.field_O - (rn.field_b >> 1);
          ns.field_nb.a(ch.a(-15073, bb.field_b, pd.field_k), 0, param0, 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          kb.f(-97);
        }
        field_w = null;
        field_v = null;
        field_y = null;
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        if (param0 <= 54) {
          kb.f(112);
        }
        var2.h(param1, 255);
        var2.c(2, (byte) -59);
        var2.c(4, (byte) -84);
        var2.c(mr.a(0), (byte) -76);
    }

    final void a(int param0) {
        if (!this.field_s) {
          return;
        }
        int[] var8 = new int[4];
        int[] var6 = var8;
        int[] var5 = var6;
        int[] var11 = var5;
        gf.a(var8);
        gf.i(this.field_k, this.field_t, this.field_m + this.field_k, this.field_i + this.field_t);
        int var3 = rs.field_Cb.field_J;
        int var4 = -24 / ((param0 - 67) / 47);
        this.field_C.f(this.field_k, this.field_t);
        if (this.field_z != null) {
          if (this.field_B) {
            rs.field_Cb.c(this.field_z, 1 + (this.field_k + this.field_m / 2), (rs.field_Cb.field_J + rs.field_Cb.field_q) / 2 + (3 + this.field_t), this.field_u, -1);
          } else {
            rs.field_Cb.d(this.field_z, this.field_k + var3 / 2, (rs.field_Cb.field_q + rs.field_Cb.field_J) / 2 + this.field_t + 3, this.field_u, -1);
          }
        }
        gf.b(var11);
    }

    static {
    }
}
