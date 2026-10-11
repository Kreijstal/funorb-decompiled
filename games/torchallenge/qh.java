/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends kj implements tl, sg {
    static int field_J;
    static int field_P;
    private ta field_Q;
    private df field_N;
    private ng field_K;
    static boolean[][][] field_O;
    static String field_L;
    static lj field_M;

    private final String a(int param0) {
        if (param0 <= 27) {
          this.field_Q = (ta) null;
        }
        return "</col></u>";
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        Object var8;
        int var9;
        ka var10;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var9 = TorChallenge.field_F ? 1 : 0;
        if (null != uk.field_N) {
          uk.field_N.d();
          qg.b();
        } else {
          uk.field_N = new ka(640, 480);
          uk.field_N.d();
        }
        if (3 != param0) {
          if (ii.field_h == null) {
            ue.b((byte) 102);
          }
          ag.a(52);
        } else {
          param0 = 0;
        }
        var2 = af.field_f[0];
        var3 = af.field_f[1];
        var5 = af.field_f[3];
        var4 = af.field_f[2];
        sf.a(uk.field_N, ng.field_L, var3, var5, var2, var4, (byte) -55);
        if (param0 != 0 &&
          param0 != 1) {
          if (param0 == 2) {
            var3Lifetime1 = ed.field_i[1];
            var5Lifetime1 = ed.field_i[3];
            var4Lifetime1 = ed.field_i[2];
            var2Lifetime1 = ed.field_i[0];
            sf.a(uk.field_N, ng.field_L, var3Lifetime1, var5Lifetime1, var2Lifetime1, var4Lifetime1, (byte) -55);
          }
        } else {
          var4Lifetime1 = ob.field_b[2];
          var3Lifetime1 = ob.field_b[1];
          var2Lifetime1 = ob.field_b[0];
          var5Lifetime1 = ob.field_b[3];
          sf.a(uk.field_N, ng.field_L, var3Lifetime1, var5Lifetime1, var2Lifetime1, var4Lifetime1, (byte) -55);
        }
        var4Lifetime2 = oj.field_e[2];
        if (!param1) {
          field_L = (String) null;
        }
        var2Lifetime2 = oj.field_e[0];
        var5Lifetime2 = oj.field_e[3];
        var3Lifetime2 = oj.field_e[1];
        var10 = new ka(1 + var4Lifetime2 / 2, var5Lifetime2);
        sf.a(var10, ph.field_h, 0, var5Lifetime2, 0, var4Lifetime2 / 2 + 1, (byte) -55);
        uk.field_N.d();
        var10.g(var2Lifetime2, var3Lifetime2);
        var10.d(var2Lifetime2 + var4Lifetime2 / 2 - 2, var3Lifetime2);
        var7 = di.field_t[vj.field_c].field_v;
        var6 = di.field_t[vj.field_c].field_q;
        var8 = null;
        di.field_t[vj.field_c].g(var2Lifetime2 + (-var6 + var4Lifetime2 / 2) / 2 + 2, (var5Lifetime2 - var7) / 2 + var3Lifetime2);
        if (0 != param0 &&
          param0 != 2) {
          if (param0 == 1) {
            var3Lifetime3 = oa.field_a[1];
            var2Lifetime3 = oa.field_a[0];
            var4Lifetime3 = oa.field_a[2];
            var5Lifetime3 = oa.field_a[3];
            sf.a(uk.field_N, ng.field_L, var3Lifetime3, var5Lifetime3, var2Lifetime3, var4Lifetime3, (byte) -55);
          }
        } else {
          var3Lifetime3 = rf.field_eb[vj.field_c][1];
          var2Lifetime3 = rf.field_eb[vj.field_c][0];
          uk.field_N.d();
          ie.field_f[vj.field_c][0].g(var2Lifetime3, var3Lifetime3);
          fd.field_h = new ka(ie.field_f[vj.field_c][1].field_q, ie.field_f[vj.field_c][1].field_v);
          ac.field_a = new ka(ie.field_f[vj.field_c][1].field_q, ie.field_f[vj.field_c][1].field_v);
          fd.field_h.d();
          ie.field_f[vj.field_c][1].a(0, 0, 0, 47211);
        }
        if (param0 == 0 ||
          2 == param0) {
          var3Lifetime4 = nh.field_db[1];
          var2Lifetime4 = nh.field_db[0];
          uk.field_N.d();
          wf.field_b.g(var2Lifetime4, var3Lifetime4);
        }
        la.field_f.a(-53);
    }

    public final void a(df param0, int param1, int param2, boolean param3) {
        int var6 = 0;
        ng var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!param3) {
            var7 = (ng) null;
            this.a((ng) null, -60, 57, -19, true);
          }
          if (0 == param1) {
            ri.a("terms.ws", (byte) -90);
          } else {
            if (param1 != 1) {
              if (param1 == 2) {
                ri.a("conduct.ws", (byte) -100);
              }
            } else {
              ri.a("privacy.ws", (byte) -79);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qh.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void d(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        CharSequence var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!param0) {
            var3 = (CharSequence) null;
            qh.a((CharSequence) null, (byte) -29);
          }
          for (var1_int = 0; var1_int < 2; var1_int++) {
            if (tg.field_r != null &&
              var1_int < tg.field_r.length &&
              tg.field_r[var1_int] != null) {
              je.a((byte) 15, tg.field_r[var1_int]);
            }
            if (tg.field_r != null &&
              tg.field_r.length > var1_int) {
              tg.field_r[var1_int] = null;
            }
            if (da.field_g != null &&
              var1_int < da.field_g.length) {
              da.field_g[var1_int] = null;
            }
            if (wh.field_d != null &&
              wh.field_d.length > var1_int) {
              wh.field_d[var1_int] = false;
            }
            if (fk.field_u != null &&
              var1_int < fk.field_u.length) {
              fk.field_u[var1_int] = 0;
            }
            if (fh.field_h != null &&
              fh.field_h.length > var1_int) {
              fh.field_h[var1_int] = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "qh.F(" + param0 + ')');
        }
    }

    final static int a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -60) {
            stackIn_4_0 = vh.a((byte) -128, true, 10, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 109;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qh.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 != -36) {
          field_O = (boolean[][][]) null;
        }
        field_O = (boolean[][][]) null;
        field_L = null;
        field_M = null;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 9) {
            qh.f((byte) -104);
          }
          if (super.a(param0, param1, (byte) 51, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_8_0 = this.a(param3, (byte) -16);
            return stackIn_8_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_12_0 = this.b(109, param3);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("qh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int[] param1, byte param2, int[] param3, int param4) {
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 != 75) {
            qh.d(false);
          }
          if (param0 < param4) {
            var5_int = (param0 + param4) / 2;
            var6 = param0;
            var7 = param3[var5_int];
            param3[var5_int] = param3[param4];
            param3[param4] = var7;
            var8 = param1[var5_int];
            param1[var5_int] = param1[param4];
            param1[param4] = var8;
            stackIn_8_0 = (var7 != 2147483647) ? 1 : 0;
            var9 = stackIn_8_0;
            for (var10 = param0; param4 > var10; var10++) {
              if (param3[var10] > (-(var9 & var10) + var7)) {
                var11 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6] = var11;
                var12 = param1[var10];
                param1[var10] = param1[var6];
                param1[var6++] = var12;
              }
            }
            param3[param4] = param3[var6];
            param3[var6] = var7;
            param1[param4] = param1[var6];
            param1[var6] = var8;
            qh.a(param0, param1, (byte) 75, param3, -1 + var6);
            qh.a(1 + var6, param1, (byte) 75, param3, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("qh.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_K == param0) {
            bj.a(120);
            this.field_Q.o(77);
          }
          if (param4) {
            this.field_N = (df) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("qh.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String c(boolean param0) {
        if (param0) {
          df var3 = (df) null;
          this.a((df) null, -29, 80, false);
        }
        return "<u=2164A2><col=2164A2>";
    }

    qh(ta param0) {
        super(0, 0, 288, 0, (j) null);
        String var7 = null;
        int var3 = 0;
        bc var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_Q = param0;
          this.field_K = new ng(be.field_a, (gg) null);
          this.field_K.field_q = (j) ((Object) new cl());
          var7 = ni.a(new String[]{this.c(false), this.a(109)}, 0, lc.field_m);
          var3 = 20;
          var4 = new bc(oe.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, oe.field_g.field_x, -1, 2147483647, true);
          this.field_N = new df(var7, var4);
          this.field_N.field_r = "";
          this.field_N.a(0, false, gh.field_z);
          this.field_N.a(1, false, gh.field_z);
          this.field_N.field_p = this.field_p - 40;
          this.field_N.field_k = (gg) (this);
          this.field_N.b(var3, 2, -40 + this.field_p, 26);
          var3 = var3 + (15 + this.field_N.field_l);
          this.a(0, this.field_N);
          var5 = 4;
          var6 = 200;
          this.field_K.a((byte) 105, 300 - var6 >> 1, 40, var6, var3);
          this.field_K.field_k = (gg) (this);
          this.a(0, this.field_K);
          this.a((byte) 106, 0, var5 + 55 + var3, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "qh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_J = 0;
        field_O = new boolean[][][]{new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}}};
        field_L = "Waiting for music";
    }
}
