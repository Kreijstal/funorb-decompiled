/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends wj implements qu, vh, ur {
    private mr field_E;
    static ut[][][] field_C;
    static ut field_H;
    private wi field_Q;
    private wi field_F;
    private mr field_K;
    static vl field_I;
    static String field_P;
    static int field_G;
    static String field_M;
    private lb field_R;
    private mr field_N;
    static tv field_D;
    private mr field_S;
    private mr field_T;
    private mr field_J;
    private qk field_O;
    fr field_L;

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_Q.field_y = this.k(-123);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ae.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ut a(boolean param0, byte param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var9 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        ut stackIn_6_2 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        ut stackIn_9_2 = null;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        ut stackIn_12_2 = null;
        ut var5;
        int var6;
        int[] var7_ref_int__;
        int var8;
        int[] var8_ref_int__;
        ut var9_ref_ut;
        int var11;
        int var12;
        ut var13;
        ut var14;
        ut var15;
        ut var16;
        ut var17;
        ut var18;
        ut var19;
        int[] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[] var25;
        var11 = Kickabout.field_G;
        var6 = 0;
        if (param3 == -1) {
          var17 = nm.a(param4, -74, ll.field_m);
          var5 = var17;
          iw.a(param1 + 13, var17);
        } else {
          if (param3 != -2) {
            stackIn_5_0 = param4;
            stackIn_5_1 = param1 - 62;
            if (param0) {
              stackIn_6_2 = gu.field_zb;
            } else {
              stackIn_6_2 = uv.field_m;
            }
            var14 = nm.a(stackIn_5_0, stackIn_5_1, stackIn_6_2);
            stackIn_8_0 = param4;
            stackIn_8_1 = -95;
            if (param0) {
              stackIn_9_2 = (ut) (field_H);
            } else {
              stackIn_9_2 = uj.field_B;
            }
            var16 = nm.a(stackIn_8_0, stackIn_8_1, stackIn_9_2);
            stackIn_11_0 = param4;
            stackIn_11_1 = -113;
            if (!param0) {
              stackIn_12_2 = mf.field_Cb;
            } else {
              stackIn_12_2 = fv.field_b;
            }
            var9_ref_ut = nm.a(stackIn_11_0, stackIn_11_1, stackIn_12_2);
            var15 = new ut(param3, var14.field_v);
            var5 = var15;
            iw.a(-116, var15);
            var9_ref_ut.d(var15.field_o - var9_ref_ut.field_o, 0);
            for (var10 = var14.field_o; var10 < var15.field_o - var9_ref_ut.field_o; var10 = var10 + var16.field_o) {
              var16.d(var10, 0);
            }
            var6 = 1;
            var14.d(0, 0);
          } else {
            var13 = nm.a(param4, -85, lb.field_L);
            var5 = var13;
            iw.a(98, var13);
          }
        }
        pt.a(-3 + on.field_g, -22914, 3, on.field_f - 3, 3);
        if (param2 == 0 &&
          var6 == 0) {
          var25 = new int[64];
          var22 = var25;
          var7_ref_int__ = var22;
          var12 = 0;
          var8 = var12;
          while (var12 < var25.length) {
            var7_ref_int__[var12] = 263172 * var12;
            var12++;
          }
          nh.a(10, 6, on.field_g - 10, 6, 6, 8, var25);
          nh.a(10, 8, on.field_g - 10, 8, 6, 8, var25);
        } else if (1 == param2) {
          iw.a(109, var5);
          var5.c(0, 0, 60);
          ta.e(param1 + 174);
          var24 = new int[64];
          var21 = var24;
          var7_ref_int__ = var21;
          for (var8 = 0; var24.length > var8; var8++) {
            var7_ref_int__[var8] = 197379 * var8;
          }
          nh.a(4, 6, on.field_g - 4, 6, 8, -40 + var24.length, var24);
        } else if (2 == param2) {
          ta.e(param1 ^ -69);
          ta.e(123);
          var19 = var5;
          var18 = new ut(var5.field_o, var5.field_v);
          var5 = var18;
          iw.a(-45, var18);
          eo.a(var19, 0, 0, 230);
          pt.a(-3 + on.field_g, -22914, 3, on.field_f - 3, 3);
          var23 = new int[64];
          var20 = var23;
          var8_ref_int__ = var20;
          for (var9 = 0; var9 < var23.length; var9++) {
            var8_ref_int__[var9] = 197379 * var9;
          }
          nh.a(4, 6, on.field_g, 6, 8, -40 + var23.length, var23);
        } else {
          if (3 == param2) {
            nh.a(var5, 0.0, 0.0, 0.7);
          }
        }
        ta.e(117);
        if (param3 != -1) {
          if (param3 == -2) {
            ap.field_l.c(0, 0, 16);
          } else {
            if (!param0) {
              tt.field_e.c(0, 0, 16);
              pt.a(on.field_g - cg.field_K.field_o, -22914, 0, on.field_f, 0);
              for (var7 = tt.field_e.field_o; on.field_g - cg.field_K.field_o > var7; var7 = var7 + ah.field_l.field_o) {
                ah.field_l.c(var7, 0, 16);
              }
              ta.e(124);
              cg.field_K.c(var5.field_o - cg.field_K.field_o, 0, 16);
            }
          }
        } else {
          kh.field_r.c(0, 0, 16);
        }
        if (param1 != -52) {
          field_D = (tv) null;
        }
        ta.e(117);
        return var5;
    }

    private final int a(int param0, String param1, int param2, int param3, fd param4) {
        cg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 21621) {
            this.field_Q = (wi) null;
          }
          var6 = new cg(20, param3, param0 + 120, 25, param4, false, 120, 3, gf.field_a, 16777215, param1);
          this.a(-54, var6);
          stackIn_3_0 = var6.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("ae.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public ae() {
        super(0, 0, 496, 0, (gj) null);
        this.field_E = new mr("", (jv) null, 12);
        this.field_S = new mr("", (jv) null, 100);
        this.field_K = new mr("", (jv) null, 100);
        this.field_T = new mr("", (jv) null, 20);
        this.field_N = new mr("", (jv) null, 20);
        this.field_J = new mr("", (jv) null, 3);
        int var1 = 1;
        this.field_O = new qk("", (jv) null, var1 != 0);
        this.field_Q = new wi(ph.field_c, (jv) null);
        this.field_F = new wi(vb.field_e, (jv) null);
        this.field_E.field_u = sr.field_b;
        this.field_S.field_u = gi.field_Bb;
        this.field_K.field_u = aw.field_G;
        this.field_T.field_u = od.field_o;
        this.field_N.field_u = hd.field_Z;
        this.field_J.field_u = lu.field_r;
        this.field_O.field_u = le.field_b;
        this.field_E.a(6, new bv(this.field_E));
        this.field_S.a(6, new qo(this.field_S));
        this.field_K.a(6, new mh(this.field_K, this.field_S));
        this.field_T.a(6, new lo(this.field_T, this.field_E, this.field_S));
        this.field_N.a(6, new ge(this.field_N, this.field_T));
        this.field_J.a(6, new fo(this.field_J));
        this.field_Q.field_y = false;
        this.field_Q.field_r = (gj) ((Object) new op());
        this.field_F.field_r = (gj) ((Object) new cr());
        this.field_E.field_r = (gj) ((Object) new ri(10000536));
        ri dupTemp$0 = new ri(10000536);
        this.field_K.field_r = (gj) ((Object) dupTemp$0);
        this.field_S.field_r = (gj) ((Object) dupTemp$0);
        this.field_J.field_r = (gj) ((Object) new ri(10000536));
        this.field_O.field_r = (gj) ((Object) new mn());
        rp dupTemp$1 = new rp(10000536);
        this.field_N.field_r = (gj) ((Object) dupTemp$1);
        this.field_T.field_r = (gj) ((Object) dupTemp$1);
        String var2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, mf.field_Ab, new String[]{this.b(true), this.l(6)});
        int var3 = 20;
        var3 = var3 + this.a(170, si.field_i, 21621, var3, this.field_S);
        var3 = var3 + (5 + this.a(20, true, ah.field_n, this.field_K, 170, "", var3));
        var3 = var3 + this.a(170, at.field_Ib, 21621, var3, this.field_T);
        var3 = var3 + (this.a(this.field_N, fa.field_h, 35, 170, var3, ev.field_A) + 5);
        var3 = var3 + (this.a(this.field_E, ua.field_f, 35, 170, var3, jk.field_i) + 5);
        var3 = var3 + this.a(var3, pl.field_a, 170, this.field_J, (byte) 117);
        cg var4 = new cg(46, var3, -90 + this.field_n, 25, this.field_O, true, this.field_n - 120, 5, qo.field_k, 11579568, pn.field_v);
        this.a(-35, var4);
        var3 = var3 + var4.field_i;
        qv var5 = new qv(gf.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, gf.field_a.field_G, -1, 2147483647, true);
        this.field_R = new lb(var2, var5);
        this.field_R.field_u = "";
        this.field_R.a(fa.field_e, 0, 12082);
        this.field_R.a(fa.field_e, 1, 12082);
        this.field_R.field_k = (jv) (this);
        this.field_R.c(-1, this.field_n - 90, 46, var3);
        var3 = var3 + (15 + this.field_R.field_i);
        this.a(-45, this.field_R);
        int var6 = 4;
        int var7 = 200;
        this.field_Q.a(40, 1, -var7 + 496 >> 1, var7, var3);
        this.field_F.a(40, 1, 3 + var6, 60, var3 + 15);
        this.field_F.field_k = (jv) (this);
        this.field_Q.field_k = (jv) (this);
        this.a(-106, this.field_Q);
        this.a(-29, this.field_F);
        this.field_L = new fr((ur) (this));
        this.field_L.a(150, 1, 60 + this.field_E.field_n + this.field_E.field_t, this.field_n - this.field_E.field_t + (-this.field_E.field_n - 60), this.field_E.field_g + 20);
        this.a(-56, this.field_L);
        this.a(var6 + (55 + var3), 1, 0, 496, 0);
    }

    private final int a(int param0, boolean param1, String param2, fd param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ju var9 = null;
        cg var10 = null;
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
          var10 = new cg(20, param6, 120 + param4, 25, param3, false, 120, 3, gf.field_a, 16777215, param2);
          if (!param1) {
            stackIn_2_0 = -97;
            return stackIn_2_0;
          }
          this.a(-84, var10);
          var9 = new ju(((cw) ((Object) param3)).a((byte) -128), param5, 126, var10.field_i + param6, 50 + param4, param0);
          var9.field_k = (jv) (this);
          this.a(-42, var9);
          stackIn_4_0 = var10.field_i + var9.field_i;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ae.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(int param0) {
        if (param0 != -1) {
          return;
        }
        ((bv) (this.field_E.a((byte) -110))).c((byte) 92);
    }

    public final void a(lb param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Kickabout.field_G;
        try {
          if (param2 != 0) {
            if (1 != param2) {
              if (2 == param2) {
                rb.a((byte) -51, "conduct.ws");
              }
            } else {
              rb.a((byte) -51, "privacy.ws");
            }
          } else {
            rb.a((byte) -51, "terms.ws");
          }
          if (param3 < 7) {
            discarded$1 = this.k(-42);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ae.VA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_C = (ut[][][]) null;
        field_D = null;
        field_P = null;
        field_H = null;
        int var1 = 0 / ((param0 + 32) / 50);
    }

    private final boolean k(int param0) {
        if (this.a((cw) (this.field_E), 120) &&
          this.a((cw) (this.field_S), 120) &&
          this.a((cw) (this.field_K), 120) &&
          this.a((cw) (this.field_T), 120) &&
          this.a((cw) (this.field_N), 120) &&
          this.a((cw) (this.field_J), 120)) {
          if (param0 >= -108) {
            ae.a((byte) 127);
          }
          return true;
        }
        return false;
    }

    final static void m(int param0) {
        int var2 = Kickabout.field_G;
        if (0 < ns.field_a) {
          ns.field_a = ns.field_a - 1;
        } else {
          if (fj.field_a > 0) {
            fj.field_a = fj.field_a - 1;
          } else {
            if (0 < ee.field_b) {
              ee.field_b = ee.field_b - 1;
            }
          }
        }
        if (param0 != -19417) {
          field_I = (vl) null;
        }
        if (!(ns.field_a <= 0)) {
          pa.b((byte) 82);
        }
        if (fj.field_a > 0) {
          dw.a(param0 + 19335, fj.field_a);
        }
        if (!(ee.field_b <= 0)) {
          dw.a(125, ee.field_b);
        }
    }

    private final boolean h(byte param0) {
        int discarded$0 = 0;
        if (param0 >= -82) {
          String var4 = (String) null;
          discarded$0 = this.a(-122, true, (String) null, (fd) null, 3, (String) null, -84);
        }
        if (!this.k(-112)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_J.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        return gp.a((byte) 117, this.field_S.field_q, this.field_O.field_A, this.field_E.field_q, this, var2, this.field_T.field_q);
    }

    private final int a(fd param0, String param1, int param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
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
          if (param2 != 35) {
            ae.m(-40);
          }
          stackIn_3_0 = this.a(35, true, param1, param0, param3, param5, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ae.BB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 < 64) {
            ae.a((byte) -10);
          }
          if (this.field_F != param1) {
            if (param1 == this.field_Q) {
              discarded$1 = this.h((byte) -104);
            }
          } else {
            jk.a((byte) -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ae.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String l(int param0) {
        if (param0 != 6) {
          this.field_J = (mr) null;
        }
        return "</col></u>";
    }

    private final String b(boolean param0) {
        if (!param0) {
          field_M = (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, String param1, int param2, fd param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        cg var7 = null;
        gb var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 94 / ((10 - param4) / 49);
          var7 = new cg(20, param0, param2 + 120, 25, param3, false, 120, 3, gf.field_a, 16777215, param1);
          this.a(-111, var7);
          var8 = new gb(((cw) ((Object) param3)).a((byte) -117));
          this.a(-48, var8);
          var8.a(15, 1, 3 + (var7.field_n + var7.field_t), 15, var7.field_g + (var7.field_i - 15 >> 1));
          stackIn_1_0 = var7.field_i;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("ae.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -126, param2, param3)) {
            return true;
          }
          if (param1 >= -60) {
            return false;
          }
          if (param3 == 98) {
            stackIn_9_0 = this.a(param2, (byte) -100);
            return stackIn_9_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_13_0 = this.b(param2, (byte) 123);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ae.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(cw param0, int param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv var4 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a((byte) -126);
          if (param1 != 120) {
            field_P = (String) null;
          }
          if (var3 == null) {
            return true;
          }
          var4 = var3.c(param1 ^ -24367);
          if (var4 == jt.field_Bb) {
            return false;
          }
          if (mn.field_c == var4) {
            return false;
          }
          if (var4 != os.field_l) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ae.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        int discarded$1 = 0;
        mr var3 = null;
        String var4 = null;
        String var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_E;
          var4 = param0;
          ((ga) ((Object) var3)).a(var4, (byte) -17, false);
          if (param1 != 15) {
            var5 = (String) null;
            discarded$1 = this.a(24, false, (String) null, (fd) null, 103, (String) null, 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("ae.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_P = "<%0> (og)";
        field_M = "This player's stats are maxed out.<br>He no longer earns experience";
        field_I = new vl("usename");
    }
}
