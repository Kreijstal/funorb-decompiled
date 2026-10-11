/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends kj implements tl, sg, tb {
    private ng field_Z;
    private rf field_K;
    static int[] field_T;
    static k field_O;
    li field_L;
    private rf field_X;
    static String[][] field_bb;
    static int[][][] field_M;
    private rf field_Q;
    private df field_U;
    static int field_ab;
    private ng field_V;
    private rf field_S;
    static ka[] field_J;
    private rf field_P;
    private hc field_W;
    private rf field_cb;
    static String field_Y;
    static ka field_R;

    private final String i(int param0) {
        if (param0 != -19224) {
          String var3 = (String) null;
          this.a((String) null, 117);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(df param0, int param1, int param2, boolean param3) {
        String discarded$1 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != 0) {
            if (param1 == 1) {
              ri.a("privacy.ws", (byte) -89);
            } else {
              if (param1 == 2) {
                ri.a("conduct.ws", (byte) -63);
              }
            }
          } else {
            ri.a("terms.ws", (byte) -124);
          }
          if (!param3) {
            discarded$1 = this.i(-16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("dg.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean l(int param0) {
        if (!this.g((byte) -84)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_S.field_v);
        } catch (NumberFormatException numberFormatException) {
        }
        return eb.a(this.field_Q.field_v, this.field_W.field_D, this.field_X.field_v, 193, this, var2, this.field_cb.field_v);
    }

    final static qj a(int param0, lj param1, int param2, lj param3, byte param4) {
        RuntimeException var5 = null;
        qj stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        qj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 69) {
            stackIn_2_0 = (qj) null;
            return stackIn_2_0;
          }
          if (lk.a(param4 ^ 229, param1, param0, param2)) {
            stackIn_7_0 = gb.a(param4 ^ -28934, param3.c(param0, param2, param4 - 69));
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (qj) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("dg.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 >= -55) {
          return;
        }
        field_bb = (String[][]) null;
        field_J = null;
        field_Y = null;
        field_T = null;
        field_M = (int[][][]) null;
        field_R = null;
        field_O = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9) {
        if (!(ub.field_n < 0)) {
          return;
        }
        ub.field_n = param4;
        if (param8 != -72) {
          dg.a(-29, 81, -13, -54, 74, -112, 103, -2, (byte) -114, 60);
        }
        int var10 = qk.a(param3, param0, param6, param2, -65, param7, param1, param9);
        int var11 = bj.a(param9, false, param7, param6, param0);
        if (var11 < 0) {
          var11 = 128;
        }
        ki.field_d.b(param4, var10, var11);
        nj.field_g = var10;
        lh.field_s = param5;
    }

    private final int a(boolean param0, ee param1, int param2, String param3, int param4, String param5) {
        RuntimeException var7 = null;
        lj var8 = null;
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
          if (param0) {
            var8 = (lj) null;
            dg.a(88, (lj) null, -8, (lj) null, (byte) -28);
          }
          stackIn_3_0 = this.a(35, 125, param5, param2, param1, param4, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("dg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) 109, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_7_0 = this.a(param3, (byte) -16);
            return stackIn_7_0;
          }
          if (99 == param0) {
            stackIn_11_0 = this.b(124, param3);
            return stackIn_11_0;
          }
          if (param2 > 9) {
            return false;
          }
          field_J = (ka[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 == this.field_V) {
            fd.a(-2068);
          } else {
            if (param0 == this.field_Z) {
              discarded$1 = this.l(-1);
            }
          }
          if (param4) {
            field_Y = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("dg.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, ee param1, String param2, int param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        tk var7 = null;
        String var8 = null;
        bg var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new bg(20, param0, param3 + 120, 25, param1, false, 120, 3, oe.field_g, 16777215, param2);
          this.a(0, var9);
          var7 = new tk(((uh) ((Object) param1)).a(-127));
          if (param4 < 122) {
            var8 = (String) null;
            discarded$1 = this.a(false, (ee) null, -75, (String) null, 70, (String) null);
          }
          this.a(0, var7);
          var7.a((byte) 108, var9.field_p + var9.field_m + 3, 15, 15, (-15 + var9.field_l >> 1) + var9.field_i);
          stackIn_3_0 = var9.field_l;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("dg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static hb[] j(int param0) {
        if (param0 != 1) {
          return (hb[]) null;
        }
        return new hb[]{sd.field_e, ee.field_x, ki.field_b};
    }

    private final String f(byte param0) {
        String discarded$0 = null;
        if (param0 != 125) {
          discarded$0 = this.f((byte) 63);
        }
        return "</col></u>";
    }

    private final boolean g(byte param0) {
        int var2;
        var2 = -32 / ((param0 - 52) / 57);
        if (this.a(-105, (uh) (this.field_Q)) &&
          this.a(-98, (uh) (this.field_cb)) &&
          this.a(-121, (uh) (this.field_P)) &&
          this.a(-115, (uh) (this.field_X)) &&
          this.a(-98, (uh) (this.field_K))) {
          if (this.a(-106, (uh) (this.field_S))) {
            return true;
          }
          return false;
        }
        return false;
    }

    public final void a(String param0, int param1) {
        String var4 = null;
        rf var3 = this.field_Q;
        if (param1 > -84) {
          return;
        }
        try {
          var4 = param0;
          ((dj) ((Object) var3)).a(var4, false, (byte) -21);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dg.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(byte param0, int param1, String param2, int param3, ee param4) {
        bg var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new bg(20, param1, 120 + param3, 25, param4, false, 120, 3, oe.field_g, 16777215, param2);
          this.a(0, var6);
          var7 = 97 / ((param0 - 91) / 35);
          stackIn_1_0 = var6.field_l;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("dg.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final boolean a(int param0, uh param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        rj var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(-105);
          if (var3 == null) {
            return true;
          }
          if (param0 > -81) {
            return true;
          }
          var4 = var3.b(-98);
          if (lk.field_c == var4) {
            return false;
          }
          if (bl.field_S == var4) {
            return false;
          }
          if (var4 != mh.field_b) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("dg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void a(int param0) {
        if (param0 != -23128) {
          return;
        }
        ((i) (this.field_Q.a(-116))).f(0);
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        try {
          super.a(param0, param1, (byte) -104, param3);
          this.field_Z.field_F = this.g((byte) -122);
          if (param2 >= -97) {
            this.field_Z = (ng) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dg.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public dg() {
        super(0, 0, 496, 0, (j) null);
        this.field_Q = new rf("", (gg) null, 12);
        this.field_cb = new rf("", (gg) null, 100);
        this.field_P = new rf("", (gg) null, 100);
        this.field_X = new rf("", (gg) null, 20);
        this.field_K = new rf("", (gg) null, 20);
        this.field_S = new rf("", (gg) null, 3);
        int var1 = 1;
        this.field_W = new hc("", (gg) null, var1 != 0);
        this.field_Z = new ng(id.field_c, (gg) null);
        this.field_V = new ng(uk.field_Q, (gg) null);
        this.field_Q.field_r = ci.field_o;
        this.field_cb.field_r = ak.field_c;
        this.field_P.field_r = pd.field_d;
        this.field_X.field_r = vl.field_c;
        this.field_K.field_r = bi.field_c;
        this.field_S.field_r = ak.field_d;
        this.field_W.field_r = qa.field_c;
        this.field_Q.a(-27997, new i(this.field_Q));
        this.field_cb.a(-27997, new il(this.field_cb));
        this.field_P.a(-27997, new kc(this.field_P, this.field_cb));
        this.field_X.a(-27997, new bh(this.field_X, this.field_Q, this.field_cb));
        this.field_K.a(-27997, new gf(this.field_K, this.field_X));
        this.field_S.a(-27997, new ci(this.field_S));
        this.field_Z.field_F = false;
        this.field_Z.field_q = (j) ((Object) new cl());
        this.field_V.field_q = (j) ((Object) new me());
        this.field_Q.field_q = (j) ((Object) new fk(10000536));
        fk dupTemp$0 = new fk(10000536);
        this.field_P.field_q = (j) ((Object) dupTemp$0);
        this.field_cb.field_q = (j) ((Object) dupTemp$0);
        this.field_S.field_q = (j) ((Object) new fk(10000536));
        this.field_W.field_q = (j) ((Object) new hf());
        ij dupTemp$1 = new ij(10000536);
        this.field_K.field_q = (j) ((Object) dupTemp$1);
        this.field_X.field_q = (j) ((Object) dupTemp$1);
        String var2 = ni.a(new String[]{this.i(-19224), this.f((byte) 125)}, 0, vh.field_g);
        int var3 = 20;
        var3 = var3 + this.a((byte) -110, var3, gl.field_j, 170, this.field_cb);
        var3 = var3 + (5 + this.a(20, 60, "", var3, this.field_P, 170, ad.field_f));
        var3 = var3 + this.a((byte) 127, var3, bd.field_n, 170, this.field_X);
        var3 = var3 + (5 + this.a(false, this.field_K, var3, ri.field_k, 170, ua.field_b));
        var3 = var3 + (this.a(false, this.field_Q, var3, pa.field_t, 170, te.field_a) + 5);
        var3 = var3 + this.a(var3, this.field_S, ab.field_m, 170, 124);
        bg var4 = new bg(46, var3, this.field_p - 90, 25, this.field_W, true, this.field_p - 120, 5, ug.field_f, 11579568, ti.field_a);
        this.a(0, var4);
        var3 = var3 + var4.field_l;
        bc var5 = new bc(oe.field_g, 0, 0, 0, 0, 16777215, -1, 0, 0, oe.field_g.field_x, -1, 2147483647, true);
        this.field_U = new df(var2, var5);
        this.field_U.field_r = "";
        this.field_U.a(0, false, gh.field_z);
        this.field_U.a(1, false, gh.field_z);
        this.field_U.field_k = (gg) (this);
        this.field_U.b(var3, 2, this.field_p - 90, 46);
        var3 = var3 + (15 + this.field_U.field_l);
        this.a(0, this.field_U);
        int var6 = 4;
        int var7 = 200;
        this.field_Z.a((byte) 115, -var7 + 496 >> 1, 40, var7, var3);
        this.field_V.a((byte) 112, 3 + var6, 40, 60, 15 + var3);
        this.field_V.field_k = (gg) (this);
        this.field_Z.field_k = (gg) (this);
        this.a(0, this.field_Z);
        this.a(0, this.field_V);
        this.field_L = new li((tb) (this));
        this.field_L.a((byte) 119, this.field_Q.field_m + (this.field_Q.field_p + 60), 150, -this.field_Q.field_p + (this.field_p + (-this.field_Q.field_m - 60)), this.field_Q.field_i + 20);
        this.a(0, this.field_L);
        this.a((byte) 122, 0, var3 - (-55 - var6), 496, 0);
    }

    final static void k(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          oc.c();
          fd.field_g = 11;
          ch.field_b = new int[260];
          if (param0 != -50) {
            return;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            ch.field_b[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < ch.field_b.length) {
            ch.field_b[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "dg.BA(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, String param2, int param3, ee param4, int param5, String param6) {
        RuntimeException var8 = null;
        dh var9 = null;
        bg var10 = null;
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
          if (param1 < 19) {
            stackIn_2_0 = 73;
            return stackIn_2_0;
          }
          var10 = new bg(20, param3, 120 + param5, 25, param4, false, 120, 3, oe.field_g, 16777215, param6);
          this.a(0, var10);
          var9 = new dh(((uh) ((Object) param4)).a(-114), param2, 126, var10.field_l + param3, param5 + 50, param0);
          var9.field_k = (gg) (this);
          this.a(0, var9);
          stackIn_4_0 = var10.field_l + var9.field_l;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("dg.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (null == fa.field_q) {
          fa.field_q = new ka(1, 1);
        }
        fa.field_q.field_v = qg.field_f;
        fa.field_q.field_x = qg.field_f;
        if (!param1) {
          field_M = (int[][][]) null;
        }
        ka fieldTemp$0 = fa.field_q;
        fa.field_q.field_q = qg.field_g;
        fieldTemp$0.field_u = qg.field_g;
        fa.field_q.field_y = qg.field_i;
        qg.a(pf.field_g);
        qg.f(0, 0, qg.field_g, qg.field_f);
        fa.field_q.e(0, 0, param0);
        qg.b(pf.field_g);
    }

    static {
        field_T = new int[]{-1, 0, 1, 2, 3, 4, 5, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 7, 8, 9};
        field_M = new int[][][]{new int[][]{new int[]{-175, 100, 1}, new int[]{395, 100, -1}}, new int[][]{new int[]{-75, 55, -1}, new int[]{465, 55, 1}}, new int[][]{new int[]{-75, 90, -1}, new int[]{430, 90, 1}}};
        field_bb = new String[][]{new String[]{"In a monastery..."}, new String[]{"Three young trainee monks listen to their master.", "To complete their training,"}, new String[]{"each must ascend six towers.", "The towers are guarded"}, new String[]{"by mythical creatures,", "and three master monks", "who must be fought in turn."}, new String[]{"And so, our three young heroes set out on their journey..."}};
        field_Y = "Suggested names: ";
        field_O = new k(1, 2, 2, 0);
    }
}
