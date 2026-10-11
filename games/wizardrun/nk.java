/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends pe implements ng, qd, ha {
    private pl field_V;
    private p field_O;
    private p field_F;
    private p field_H;
    wj field_J;
    static String field_Q;
    static bh field_U;
    private p field_S;
    private ef field_E;
    private p field_G;
    static String field_R;
    private ff field_L;
    private pl field_I;
    static String field_M;
    static String field_K;
    private p field_P;
    static int field_T;
    static mg field_N;

    public final void a(int param0) {
        if (param0 != 2147483647) {
          return;
        }
        ((jg) (this.field_G.a((byte) -114))).g(113);
    }

    public final void a(String param0, byte param1) {
        p var3 = null;
        String var4 = null;
        try {
          var3 = this.field_G;
          var4 = param0;
          if (param1 <= 61) {
            pl var5 = (pl) null;
            this.a(122, (pl) null, -97, 3, -8);
          }
          ((og) ((Object) var3)).a(-1, false, var4);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "nk.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean h(byte param0) {
        if (!this.g(-50)) {
          return false;
        }
        int var2 = -1;
        if (param0 <= 16) {
          return true;
        }
        try {
          var2 = Integer.parseInt(this.field_P.field_k);
        } catch (NumberFormatException numberFormatException) {
        }
        return ih.a(this.field_G.field_k, this.field_E.field_z, this, 0, var2, this.field_S.field_k, this.field_F.field_k);
    }

    private final boolean g(int param0) {
        if (param0 != -50) {
          return true;
        }
        if (!this.a((byte) 95, (wa) (this.field_G))) {
          return false;
        }
        if (!this.a((byte) 118, (wa) (this.field_F))) {
          return false;
        }
        if (!this.a((byte) 92, (wa) (this.field_H))) {
          return false;
        }
        if (!this.a((byte) 111, (wa) (this.field_S))) {
          return false;
        }
        if (!this.a((byte) 119, (wa) (this.field_O))) {
          return false;
        }
        if (this.a((byte) 105, (wa) (this.field_P))) {
          return true;
        }
        return false;
    }

    private final String d(boolean param0) {
        if (param0) {
          this.field_F = (p) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(byte param0, ub param1, String param2, int param3, int param4, String param5) {
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
          if (param0 != 4) {
            this.field_F = (p) null;
          }
          stackIn_3_0 = this.a(35, param2, param1, 7501, param3, param4, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("nk.WA(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(int param0, ub param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        kc var7 = null;
        ik var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_U = (bh) null;
          }
          var8 = new ik(20, param4, 120 + param0, 25, param1, false, 120, 3, gh.field_b, 16777215, param3);
          this.a((ub) (var8), (byte) 39);
          var7 = new kc(((wa) ((Object) param1)).a((byte) 120));
          this.a((ub) (var7), (byte) 28);
          var7.a(119, var8.field_l + (var8.field_n - 15 >> 1), 15, 15, 3 + var8.field_o + var8.field_r);
          stackIn_3_0 = var8.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("nk.IA(").append(param0).append(',');
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
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != this.field_I) {
            if (param1 == this.field_V) {
              discarded$1 = this.h((byte) 107);
            }
          } else {
            pg.a((byte) -97);
          }
          if (param0 == -18905) {
            return;
          }
          this.field_I = (pl) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("nk.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, String param1, ub param2, int param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        l var9 = null;
        ik var10 = null;
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
          var10 = new ik(20, param5, 120 + param4, 25, param2, false, 120, 3, gh.field_b, 16777215, param1);
          this.a((ub) (var10), (byte) 39);
          var9 = new l(((wa) ((Object) param2)).a((byte) 109), param6, 126, param5 + var10.field_n, param4 + 50, param0);
          if (param3 != 7501) {
            this.field_P = (p) null;
          }
          var9.field_s = (ce) (this);
          this.a((ub) (var9), (byte) 39);
          stackIn_3_0 = var9.field_n + var10.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nk.FA(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, int param2, ub param3, String param4) {
        ik var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = -4;
            return stackIn_2_0;
          }
          var6 = new ik(20, param0, param2 + 120, 25, param3, false, 120, 3, gh.field_b, 16777215, param4);
          this.a((ub) (var6), (byte) 62);
          stackIn_4_0 = var6.field_n;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("nk.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_R = null;
        field_K = null;
        field_M = null;
        field_N = null;
        field_Q = null;
        field_U = null;
        if (param0 != -1) {
          field_N = (mg) null;
        }
    }

    public nk() {
        super(0, 0, 496, 0, (bf) null);
        this.field_G = new p("", (ce) null, 12);
        this.field_F = new p("", (ce) null, 100);
        this.field_H = new p("", (ce) null, 100);
        this.field_S = new p("", (ce) null, 20);
        this.field_O = new p("", (ce) null, 20);
        this.field_P = new p("", (ce) null, 3);
        int var1 = 1;
        this.field_E = new ef("", (ce) null, var1 != 0);
        this.field_V = new pl(w.field_d, (ce) null);
        this.field_I = new pl(v.field_c, (ce) null);
        this.field_G.field_p = cd.field_a;
        this.field_F.field_p = fb.field_c;
        this.field_H.field_p = ec.field_e;
        this.field_S.field_p = u.field_v;
        this.field_O.field_p = ph.field_s;
        this.field_P.field_p = jj.field_c;
        this.field_E.field_p = pc.field_o;
        this.field_G.a(0, new jg(this.field_G));
        this.field_F.a(0, new sj(this.field_F));
        this.field_H.a(0, new hc(this.field_H, this.field_F));
        this.field_S.a(0, new rh(this.field_S, this.field_G, this.field_F));
        this.field_O.a(0, new fe(this.field_O, this.field_S));
        this.field_P.a(0, new qf(this.field_P));
        this.field_V.field_B = false;
        this.field_V.field_w = (bf) ((Object) new jl());
        this.field_I.field_w = (bf) ((Object) new tk());
        this.field_G.field_w = (bf) ((Object) new qb(10000536));
        qb dupTemp$0 = new qb(10000536);
        this.field_H.field_w = (bf) ((Object) dupTemp$0);
        this.field_F.field_w = (bf) ((Object) dupTemp$0);
        this.field_P.field_w = (bf) ((Object) new qb(10000536));
        this.field_E.field_w = (bf) ((Object) new cc());
        ke dupTemp$1 = new ke(10000536);
        this.field_O.field_w = (bf) ((Object) dupTemp$1);
        this.field_S.field_w = (bf) ((Object) dupTemp$1);
        String var2 = di.a(new String[]{this.d(false), this.g((byte) 2)}, (byte) 76, qj.field_b);
        int var3 = 20;
        var3 = var3 + this.a(var3, true, 170, this.field_F, ii.field_d);
        var3 = var3 + (5 + this.a(20, ve.field_b, this.field_H, 7501, 170, var3, ""));
        var3 = var3 + this.a(var3, true, 170, this.field_S, qk.field_d);
        var3 = var3 + (this.a((byte) 4, this.field_O, df.field_i, 170, var3, ik.field_H) + 5);
        var3 = var3 + (5 + this.a((byte) 4, this.field_G, re.field_E, 170, var3, d.field_b));
        var3 = var3 + this.a(170, this.field_P, true, sb.field_a, var3);
        ik var4 = new ik(46, var3, -90 + this.field_r, 25, this.field_E, true, -120 + this.field_r, 5, e.field_b, 11579568, fb.field_e);
        this.a((ub) (var4), (byte) 58);
        var3 = var3 + var4.field_n;
        ll var5 = new ll(gh.field_b, 0, 0, 0, 0, 16777215, -1, 0, 0, gh.field_b.field_M, -1, 2147483647, true);
        this.field_L = new ff(var2, var5);
        this.field_L.field_p = "";
        this.field_L.a(1, field_R, 0);
        this.field_L.a(1, field_R, 1);
        this.field_L.field_s = (ce) (this);
        this.field_L.a(var3, (byte) 61, this.field_r - 90, 46);
        var3 = var3 + (this.field_L.field_n + 15);
        this.a((ub) (this.field_L), (byte) 98);
        int var6 = 4;
        int var7 = 200;
        this.field_V.a(110, var3, 40, var7, 496 - var7 >> 1);
        this.field_I.a(125, 15 + var3, 40, 60, 3 + var6);
        this.field_I.field_s = (ce) (this);
        this.field_V.field_s = (ce) (this);
        this.a((ub) (this.field_V), (byte) 108);
        this.a((ub) (this.field_I), (byte) 121);
        this.field_J = new wj((ha) (this));
        this.field_J.a(118, 20 + this.field_G.field_l, 150, -this.field_G.field_r + (-this.field_G.field_o + this.field_r - 60), this.field_G.field_r + this.field_G.field_o + 60);
        this.a((ub) (this.field_J), (byte) 34);
        this.a(115, 0, 55 + (var3 + var6), 496, 0);
    }

    private final boolean a(byte param0, wa param1) {
        dk var3 = null;
        RuntimeException var3_ref = null;
        ok var4 = null;
        String var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) -106);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(true);
          if (hg.field_c == var4) {
            return false;
          }
          if (nf.field_c == var4) {
            return false;
          }
          if (param0 < 59) {
            var5 = (String) null;
            this.a((String) null, (byte) -6);
          }
          if (va.field_o != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("nk.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void a(int param0, ff param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          if (param0 != 0) {
            if (1 == param0) {
              fa.a("privacy.ws", 12);
            } else {
              if (param0 == 2) {
                fa.a("conduct.ws", 12);
              }
            }
          } else {
            fa.a("terms.ws", 12);
          }
          var5_int = -16 % ((36 - param3) / 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("nk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(byte param0) {
        if (param0 < 1) {
          return (String) null;
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) -106, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.a((byte) -117, param3);
            return stackIn_5_0;
          }
          if (param1 == 99) {
            stackIn_8_0 = this.b(param3, 1);
            return stackIn_8_0;
          }
          if (param2 < -96) {
            return false;
          }
          field_N = (mg) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_V.field_B = this.g(param0 - 10000586);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "nk.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_R = "Open in popup window";
        field_Q = "Names can only contain letters, numbers, spaces and underscores";
        field_U = new bh(12, 0, 1, 0);
        field_K = "Resume Game";
    }
}
