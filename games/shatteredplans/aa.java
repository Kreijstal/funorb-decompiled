/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends f implements op, bp, dl {
    private fa field_J;
    private fa field_Q;
    private lk field_K;
    private kg field_E;
    static String field_N;
    private kg field_O;
    static String field_G;
    private fa field_H;
    static String field_P;
    private fa field_L;
    private fa field_M;
    private ts field_I;
    bj field_D;
    private fa field_F;

    public final void a(int param0, int param1, int param2, ts param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 0) {
            if (param1 == 1) {
              gm.a(111, "privacy.ws");
            } else {
              if (param1 == 2) {
                gm.a(62, "conduct.ws");
              }
            }
          } else {
            gm.a(64, "terms.ws");
          }
          if (param2 != 2) {
            this.field_F = (fa) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("aa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1) {
        try {
          if (!param1) {
            String var3 = (String) null;
            aa.a((String) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "aa.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String k(int param0) {
        if (param0 != 15) {
          ts var3 = (ts) null;
          this.a(102, -126, 94, (ts) null);
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final int a(int param0, int param1, int param2, vg param3, String param4, String param5, int param6) {
        int discarded$1 = 0;
        RuntimeException var8 = null;
        ah var9 = null;
        String var10 = null;
        pg var11 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 126) {
            var10 = (String) null;
            discarded$1 = this.a(-107, 92, -35, (vg) null, (String) null, (String) null, 123);
          }
          var11 = new pg(20, param2, 120 + param1, 25, param3, false, 120, 3, gn.field_u, 16777215, param5);
          this.b((byte) -120, var11);
          var9 = new ah(((ki) ((Object) param3)).a((byte) 96), param4, 126, param2 + var11.field_n, 50 + param1, param6);
          var9.field_u = (ko) (this);
          this.b((byte) -52, var9);
          stackIn_3_0 = var9.field_n + var11.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("aa.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(boolean param0, ki param1) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        u var4 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) 103);
          if (var3 == null) {
            return true;
          }
          var4 = var3.c(-123);
          if (param0) {
            field_P = (String) null;
          }
          if (tj.field_b == var4) {
            return false;
          }
          if (var4 == pd.field_h) {
            return false;
          }
          if (un.field_i != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("aa.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final int a(String param0, int param1, vg param2, int param3, int param4) {
        pg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new pg(20, param3, 120 + param4, 25, param2, false, 120, 3, gn.field_u, 16777215, param0);
          if (param1 != 21760) {
            aa.a(-24, (byte) 20);
          }
          this.b((byte) -126, var6);
          stackIn_3_0 = var6.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("aa.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, String param1) {
        int discarded$1 = 0;
        fa var3 = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_Q;
          var4 = param1;
          ((go) ((Object) var3)).a(57, var4, false);
          if (param0 != 15270) {
            var5 = (String) null;
            discarded$1 = this.a(-31, (String) null, 115, (byte) 34, (vg) null, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("aa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_G = null;
        field_N = null;
        if (param0 != 32) {
          aa.a((byte) 69);
          field_P = null;
          return;
        }
        field_P = null;
    }

    public aa() {
        super(0, 0, 496, 0, (iq) null);
        this.field_Q = new fa("", (ko) null, 12);
        this.field_F = new fa("", (ko) null, 100);
        this.field_M = new fa("", (ko) null, 100);
        this.field_J = new fa("", (ko) null, 20);
        this.field_H = new fa("", (ko) null, 20);
        this.field_L = new fa("", (ko) null, 3);
        int var1 = 1;
        this.field_K = new lk("", (ko) null, var1 != 0);
        this.field_E = new kg(qn.field_e, (ko) null);
        this.field_O = new kg(rn.field_a, (ko) null);
        this.field_Q.field_v = ol.field_i;
        this.field_F.field_v = j.field_p;
        this.field_M.field_v = sf.field_h;
        this.field_J.field_v = wf.field_k;
        this.field_H.field_v = he.field_o;
        this.field_L.field_v = pc.field_p;
        this.field_K.field_v = ca.field_i;
        this.field_Q.a(new ec(this.field_Q), 8945);
        this.field_F.a(new mm(this.field_F), 8945);
        this.field_M.a(new mf(this.field_M, this.field_F), 8945);
        this.field_J.a(new cc(this.field_J, this.field_Q, this.field_F), 8945);
        this.field_H.a(new fj(this.field_H, this.field_J), 8945);
        this.field_L.a(new mb(this.field_L), 8945);
        this.field_E.field_y = false;
        this.field_E.field_p = (iq) ((Object) new qp());
        this.field_O.field_p = (iq) ((Object) new rq());
        this.field_Q.field_p = (iq) ((Object) new rr(10000536));
        rr dupTemp$0 = new rr(10000536);
        this.field_M.field_p = (iq) ((Object) dupTemp$0);
        this.field_F.field_p = (iq) ((Object) dupTemp$0);
        this.field_L.field_p = (iq) ((Object) new rr(10000536));
        this.field_K.field_p = (iq) ((Object) new og());
        ce dupTemp$1 = new ce(10000536);
        this.field_H.field_p = (iq) ((Object) dupTemp$1);
        this.field_J.field_p = (iq) ((Object) dupTemp$1);
        String var2 = re.a(bo.field_Y, 4371, new String[]{this.l(-63), this.k(15)});
        int var3 = 20;
        var3 = var3 + this.a(on.field_i, 21760, this.field_F, var3, 170);
        var3 = var3 + (5 + this.a(127, 170, var3, this.field_M, "", ec.field_u, 20));
        var3 = var3 + this.a(co.field_t, 21760, this.field_J, var3, 170);
        var3 = var3 + (5 + this.a(170, ab.field_a, var3, (byte) -127, this.field_H, qq.field_l));
        var3 = var3 + (this.a(170, rf.field_m, var3, (byte) -128, this.field_Q, tr.field_zb) + 5);
        var3 = var3 + this.a(vl.field_m, this.field_L, var3, (byte) -123, 170);
        pg var4 = new pg(46, var3, -90 + this.field_x, 25, this.field_K, true, -120 + this.field_x, 5, mf.field_x, 11579568, fe.field_E);
        this.b((byte) -71, var4);
        var3 = var3 + var4.field_n;
        o var5 = new o(gn.field_u, 0, 0, 0, 0, 16777215, -1, 0, 0, gn.field_u.field_J, -1, 2147483647, true);
        this.field_I = new ts(var2, var5);
        this.field_I.field_v = "";
        this.field_I.a(0, true, bk.field_c);
        this.field_I.a(1, true, bk.field_c);
        this.field_I.field_u = (ko) (this);
        this.field_I.a(46, var3, (byte) 57, -90 + this.field_x);
        var3 = var3 + (15 + this.field_I.field_n);
        this.b((byte) -66, this.field_I);
        int var6 = 4;
        int var7 = 200;
        this.field_E.a(var3, 40, (byte) 102, 496 - var7 >> 1, var7);
        this.field_O.a(15 + var3, 40, (byte) 100, var6 + 3, 60);
        this.field_O.field_u = (ko) (this);
        this.field_E.field_u = (ko) (this);
        this.b((byte) -115, this.field_E);
        this.b((byte) -119, this.field_O);
        this.field_D = new bj((dl) (this));
        this.field_D.a(this.field_Q.field_q + 20, 150, (byte) 115, 60 + (this.field_Q.field_m + this.field_Q.field_x), -60 + (-this.field_Q.field_m + this.field_x) - this.field_Q.field_x);
        this.b((byte) -120, this.field_D);
        this.a(0, var3 + 55 + var6, (byte) 122, 0, 496);
    }

    private final int a(int param0, String param1, int param2, byte param3, vg param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < -126) {
            stackIn_4_0 = this.a(127, param0, param2, param4, param1, param5, 35);
            return stackIn_4_0;
          }
          stackIn_2_0 = -57;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("aa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean d(boolean param0) {
        if (!this.m(72)) {
          return false;
        }
        int var2 = -1;
        try {
          if (param0) {
            this.a(-121);
          }
          var2 = Integer.parseInt(this.field_L.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return cg.a(this.field_F.field_s, this.field_K.field_z, this.field_Q.field_s, var2, this.field_J.field_s, this, -13037);
    }

    public final void a(int param0) {
        ((ec) (this.field_Q.a((byte) 117))).d(0);
        if (param0 != 2147483647) {
          field_P = (String) null;
        }
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_E.field_y = this.m(param3 - 46);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "aa.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_75_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        String var9;
        String var10;
        String var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var6Lifetime7;
        int var6Lifetime8;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        int var6Lifetime4Lifetime1;
        int var6Lifetime4Lifetime2;
        int var6Lifetime4Lifetime3;
        int var6Lifetime6Lifetime1;
        int var6Lifetime6Lifetime2;
        int var6Lifetime6Lifetime3;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 1 + rs.field_Cb.field_J * 3 / 4;
        var4 = -60 + qg.field_r[6];
        var5 = 40;
        if (0 == param0) {
          var6 = wk.a(-9615, wg.field_e.a(5607, vc.field_e), rs.field_Cb, new int[]{var4});
          var5 = var5 + var6 * var3;
          if (param1 != -71) {
            return -98;
          }
          stackIn_5_0 = (var5 > 294) ? var5 : 294;
          return stackIn_5_0;
        }
        if (param0 == 1) {
          var6Lifetime1 = wk.a(-9615, wg.field_e.a(5607, ck.field_g), rs.field_Cb, new int[]{var4});
          var5 = var5 + var3 * var6Lifetime1;
          if (param1 != -71) {
            return -98;
          }
          stackIn_13_0 = (var5 > 294) ? var5 : 294;
          return stackIn_13_0;
        }
        if (param0 == 2) {
          var6Lifetime2 = wk.a(param1 ^ 9672, wg.field_e.a(5607, jd.field_a), rs.field_Cb, new int[]{var4});
          var5 = var5 + var3 * var6Lifetime2;
          if (param1 != -71) {
            return -98;
          }
          stackIn_75_0 = (var5 > 294) ? var5 : 294;
          return stackIn_75_0;
        }
        if (param0 == 3) {
          return 294;
        }
        if (param0 == 4) {
          return 294;
        }
        if (param0 == 5) {
          var8 = er.field_n;
          var6Lifetime3 = wk.a(-9615, wg.field_e.a(5607, var8), rs.field_Cb, new int[]{var4 - 80});
          var5 = var5 + (var3 * (3 + 4 * var6Lifetime3) >> 2);
          var9 = ri.field_N;
          var6Lifetime3Lifetime1 = wk.a(-9615, wg.field_e.a(5607, var9), rs.field_Cb, new int[]{-80 + var4});
          var10 = rk.field_n;
          var5 = var5 + ((var6Lifetime3Lifetime1 * 4 + 3) * var3 >> 2);
          var6Lifetime3Lifetime2 = wk.a(-9615, wg.field_e.a(5607, var10), rs.field_Cb, new int[]{-80 + var4});
          var5 = var5 + var6Lifetime3Lifetime2 * var3;
          if (param1 != -71) {
            return -98;
          }
          stackIn_26_0 = (var5 > 294) ? var5 : 294;
          return stackIn_26_0;
        }
        if (param0 == 6) {
          var16 = da.field_a;
          var6Lifetime4 = wk.a(-9615, wg.field_e.a(5607, var16), rs.field_Cb, new int[]{-80 + var4});
          var17 = er.field_l;
          var5 = var5 + (var3 * (3 + 4 * var6Lifetime4) >> 2);
          var6Lifetime4Lifetime1 = wk.a(param1 ^ 9672, wg.field_e.a(param1 ^ -5538, var17), rs.field_Cb, new int[]{var4 - 80});
          var18 = fr.field_F;
          var5 = var5 + ((var6Lifetime4Lifetime1 * 4 + 3) * var3 >> 2);
          var6Lifetime4Lifetime2 = wk.a(-9615, wg.field_e.a(5607, var18), rs.field_Cb, new int[]{var4 - 80});
          var19 = ub.field_Cb;
          var5 = var5 + ((4 * var6Lifetime4Lifetime2 + 3) * var3 >> 2);
          var6Lifetime4Lifetime3 = wk.a(-9615, wg.field_e.a(5607, var19), rs.field_Cb, new int[]{-80 + var4});
          var5 = var5 + var6Lifetime4Lifetime3 * var3;
          if (param1 != -71) {
            return -98;
          }
          stackIn_68_0 = (var5 > 294) ? var5 : 294;
          return stackIn_68_0;
        }
        if (param0 == 7) {
          var15 = jl.field_N;
          var6Lifetime5 = wk.a(-9615, wg.field_e.a(5607, var15), rs.field_Cb, new int[]{-80 + var4});
          var5 = 294;
          var5 = var5 + var3 * (-3 + var6Lifetime5);
          if (param1 != -71) {
            return -98;
          }
          stackIn_61_0 = (var5 > 294) ? var5 : 294;
          return stackIn_61_0;
        }
        if (8 == param0) {
          var11 = hs.field_g;
          var6Lifetime6 = wk.a(-9615, wg.field_e.a(5607, var11), rs.field_Cb, new int[]{var4 - 40});
          var12 = sp.field_b;
          var5 = var5 + ((3 + var6Lifetime6 * 4) * var3 >> 2);
          var6Lifetime6Lifetime1 = wk.a(-9615, wg.field_e.a(5607, var12), rs.field_Cb, new int[]{var4 - 40});
          var5 = var5 + ((4 * var6Lifetime6Lifetime1 + 3) * var3 >> 2);
          var13 = jb.field_f;
          var6Lifetime6Lifetime2 = wk.a(-9615, wg.field_e.a(5607, var13), rs.field_Cb, new int[]{var4 - 40});
          var14 = ar.field_o;
          var5 = var5 + ((4 * var6Lifetime6Lifetime2 + 3) * var3 >> 2);
          var6Lifetime6Lifetime3 = wk.a(param1 ^ 9672, wg.field_e.a(5607, var14), rs.field_Cb, new int[]{-40 + var4});
          var5 = var5 + var6Lifetime6Lifetime3 * var3;
          var5 = var5 + var3;
          if (param1 != -71) {
            return -98;
          }
          stackIn_53_0 = (var5 > 294) ? var5 : 294;
          return stackIn_53_0;
        }
        if (param0 == 9) {
          var6Lifetime7 = wk.a(-9615, wg.field_e.a(5607, dm.field_a), rs.field_Cb, new int[]{var4});
          var5 = var5 + var3 * var6Lifetime7;
          if (param1 != -71) {
            return -98;
          }
          stackIn_46_0 = (var5 > 294) ? var5 : 294;
          return stackIn_46_0;
        }
        if (param0 != 10) {
          throw new RuntimeException();
        }
        var6Lifetime8 = wk.a(param1 - 9544, wg.field_e.a(5607, df.field_m), rs.field_Cb, new int[]{var4});
        var5 = var5 + var6Lifetime8 * var3;
        if (param1 != -71) {
          return -98;
        }
        stackIn_39_0 = (var5 > 294) ? var5 : 294;
        return stackIn_39_0;
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2 ^ 0, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_6_0 = this.a(param3, true);
            return stackIn_6_0;
          }
          if (param2 != 13) {
            aa.a(104, (byte) -32);
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_12_0 = this.a(param3, -96);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("aa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final int a(String param0, vg param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        hl var7 = null;
        int var8 = 0;
        pg var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new pg(20, param2, 120 + param4, 25, param1, false, 120, 3, gn.field_u, 16777215, param0);
          this.b((byte) -51, var9);
          var7 = new hl(((ki) ((Object) param1)).a((byte) 106));
          var8 = -33 / ((param3 + 88) / 35);
          this.b((byte) -116, var7);
          var7.a(var9.field_q + (-15 + var9.field_n >> 1), 15, (byte) 118, var9.field_x + (var9.field_m + 3), 15);
          stackIn_1_0 = var9.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("aa.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String l(int param0) {
        int var2 = -86 / ((param0 - 5) / 48);
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean m(int param0) {
        int var2 = -75 / ((-28 - param0) / 57);
        if (!this.a(false, this.field_Q)) {
          return false;
        }
        if (!this.a(false, this.field_F)) {
          return false;
        }
        if (!this.a(false, this.field_M)) {
          return false;
        }
        if (!this.a(false, this.field_J)) {
          return false;
        }
        if (!this.a(false, this.field_H)) {
          return false;
        }
        if (this.a(false, this.field_L)) {
          return true;
        }
        return false;
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_O == param0) {
            ol.b((byte) -120);
          } else {
            if (param0 == this.field_E) {
              discarded$1 = this.d(false);
            }
          }
          if (param1 != 6) {
            this.field_M = (fa) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("aa.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_N = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_P = "These are momentous times. Your colony is preparing to return to space once more. The now-perfected wormhole technology has revealed an array of possibilities and mighty starships shall once again seek destiny in the heavens.";
    }
}
