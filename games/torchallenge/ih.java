/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends kj implements sg {
    static int[] field_O;
    private ng field_M;
    private ng field_P;
    static int field_K;
    private ng field_L;
    static int[] field_N;
    static int field_J;

    public ih() {
        super(0, 0, 476, 225, (j) null);
        this.field_M = new ng(nd.field_a, (gg) null);
        this.field_P = new ng(uk.field_Q, (gg) null);
        this.field_L = new ng(cj.field_k, (gg) null);
        cl var1 = new cl();
        this.field_M.field_q = (j) ((Object) var1);
        this.field_P.field_q = (j) ((Object) var1);
        this.field_L.field_q = (j) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_P.a((byte) 111, -var3 + this.field_p >> 1, 30, var4, -var2 + (this.field_l - 48));
        this.field_L.a((byte) 116, var4 + (-var3 + this.field_p >> 1) + var2, 30, var4, -var2 - 48 + this.field_l);
        this.field_M.a((byte) 123, this.field_p - var3 >> 1, 30, var3, -(2 * var2) + (this.field_l - 78));
        this.field_P.field_k = (gg) (this);
        this.field_M.field_k = (gg) (this);
        this.field_L.field_k = (gg) (this);
        this.field_M.field_r = am.field_c;
        this.field_L.field_r = vk.field_c;
        this.a(0, this.field_P);
        this.a(0, this.field_M);
        this.a(0, this.field_L);
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != this.field_P) {
            if (param0 == this.field_M) {
              k.a(-14956);
            } else {
              if (param0 == this.field_L) {
                hf.a((byte) -111);
              }
            }
          } else {
            nd.b((byte) 116);
          }
          if (param4) {
            field_K = -44;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("ih.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean f(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -77) {
          ih.h(-21);
        }
        stackIn_6_0 = (gj.field_c >= 10) && (li.field_K >= 13);
        return stackIn_6_0;
    }

    final static void a(int param0) {
        oa.field_g = 0;
        ha.field_d = 0;
        jj.field_d = false;
        cl.field_z = false;
        s.field_m = false;
        db.field_B = 0;
        ra.field_q = false;
        dk.field_a = 0;
        ah.field_i = false;
        ng.field_I = 0;
        ni.field_b = false;
        lc.field_r = false;
        me.field_g = 0;
        ii.field_k = null;
        we.field_j = 0;
        lj.field_b = 0;
        ec.field_b = -1;
        ed.field_c = 0;
        gh.field_m = false;
        fa.field_t = -1;
        sd.field_d = 0;
        kc.field_w = (int[][]) null;
        fh.field_d = 0;
        vi.field_a = 0;
        n.field_jb = 0;
        fc.field_o = 0;
        if (param0 <= 84) {
          field_O = (int[]) null;
        }
        rk.field_e = true;
        o.field_l = 0;
        ad.field_a = true;
        tk.field_P = false;
        bd.field_l = false;
        i.field_r = 0;
        qk.field_lb = 0;
        rj.field_d = null;
        uf.field_k = false;
        hf.field_c = 0;
        gl.field_f = false;
        pi.field_c = null;
        id.field_d = (int[][]) null;
        wj.field_a = 0;
        eb.field_n = false;
        wk.field_F = 0;
        ii.field_e = false;
        kl.field_a = false;
        ql.field_j = false;
        td.field_e = 0;
        bk.field_w = false;
        hb.field_f = 0;
        ti.field_d = 0;
        vd.field_b = true;
        kf.field_d = 0;
        ea.field_h = null;
        sf.field_c = 0;
        ql.field_n = 0;
        mj.field_b = false;
        wh.field_b = false;
        qh.d(true);
        sd.a(123);
        sd.b(116);
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        ee var6 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) 98, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_6_0 = this.a(param3, (byte) -16);
            return stackIn_6_0;
          }
          if (param0 == 99) {
            stackIn_9_0 = this.b(113, param3);
            return stackIn_9_0;
          }
          if (param2 > 9) {
            return false;
          }
          var6 = (ee) null;
          this.a(20, 'Q', (byte) 83, (ee) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ih.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ka param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        ka var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = TorChallenge.field_F ? 1 : 0;
        try {
          if (qg.field_a > param1) {
            param0 = param0 - (qg.field_a - param1);
            param1 = qg.field_a;
          }
          if (qg.field_k > param6) {
            param3 = param3 - (-param6 + qg.field_k);
            param6 = qg.field_k;
          }
          if (qg.field_c < param0 + param1) {
            param0 = -param1 + qg.field_c;
          }
          if (param2 != 4) {
            return;
          }
          if (qg.field_l < param6 + param3) {
            param3 = qg.field_l - param6;
          }
          if (param0 > 0 &&
            param3 > 0) {
            var21 = param5.c();
            var30 = qg.field_i;
            var10 = qg.field_g;
            var11 = qg.field_f;
            var29 = new int[4];
            qg.a(var29);
            param5.d();
            qg.a(var29[0], var29[1], var29[2], var29[3]);
            var13 = param6 * param5.field_u + param1;
            var14 = -param0 + param5.field_u;
            var25 = var21.field_y;
            var22 = var25;
            var15 = var22;
            for (var16 = param6; var16 < param6 + param3; var16++) {
              for (var17 = param1; param1 + param0 > var17; var17++) {
                var18 = var25[var13];
                if (var18 != 0) {
                  if (var17 > 0 &&
                    0 == var15[-1 + var13]) {
                    qg.e(var17, var16, param4, param7);
                  } else {
                    if (var16 > 0 &&
                      var15[var13 - param5.field_u] == 0) {
                      qg.e(var17, var16, param4, param7);
                    } else {
                      if (var17 < param5.field_u - 1 &&
                        var15[var13 + 1] == 0) {
                        qg.e(var17, var16, param4, param7);
                      } else {
                        if (var16 < -1 + param5.field_x &&
                          var15[param5.field_u + var13] == 0) {
                          qg.e(var17, var16, param4, param7);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.g(-param5.field_s, -param5.field_p);
            qg.a(var30, var10, var11);
            qg.b(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("ih.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_O = null;
        if (param0 != 99) {
          field_K = -128;
        }
        field_N = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = this.field_m + param1;
        int var6 = this.field_i + param0;
        oe.field_g.a(dk.field_g, 20 + var5, var6 + 20, -40 + this.field_p, this.field_l - 50, 16777215, -1, 1, 0, oe.field_g.field_x);
        super.a(param0, param1, param2, param3);
    }

    static {
        field_O = new int[8192];
        field_N = new int[]{16773632, 12095488, 12424960, 16773632};
        field_J = 0;
    }
}
