/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends aj implements hl, df, tc {
    static ti field_K;
    private vc field_C;
    private lj field_G;
    private vc field_x;
    private vc field_J;
    private le field_z;
    private bf field_w;
    private vc field_y;
    private vc field_F;
    dh field_D;
    static boolean field_I;
    private lj field_A;
    private vc field_E;

    public wl() {
        super(0, 0, 496, 0, (ui) null);
        this.field_J = new vc("", (ma) null, 12);
        this.field_y = new vc("", (ma) null, 100);
        this.field_E = new vc("", (ma) null, 100);
        this.field_F = new vc("", (ma) null, 20);
        this.field_x = new vc("", (ma) null, 20);
        this.field_C = new vc("", (ma) null, 3);
        int var1 = 1;
        this.field_w = new bf("", (ma) null, var1 != 0);
        this.field_G = new lj(da.field_A, (ma) null);
        this.field_A = new lj(el.field_a, (ma) null);
        this.field_J.field_j = mf.field_a;
        this.field_y.field_j = aa.field_c;
        this.field_E.field_j = sd.field_V;
        this.field_F.field_j = fa.field_g;
        this.field_x.field_j = gb.field_b;
        this.field_C.field_j = wj.field_l;
        this.field_w.field_j = ia.field_l;
        this.field_J.a(-86, new li(this.field_J));
        this.field_y.a(120, new vh(this.field_y));
        this.field_E.a(-91, new va(this.field_E, this.field_y));
        this.field_F.a(100, new bg(this.field_F, this.field_J, this.field_y));
        this.field_x.a(97, new cg(this.field_x, this.field_F));
        this.field_C.a(-104, new md(this.field_C));
        this.field_G.field_t = false;
        this.field_G.field_q = (ui) ((Object) new qa());
        this.field_A.field_q = (ui) ((Object) new ek());
        this.field_J.field_q = (ui) ((Object) new ni(10000536));
        ni dupTemp$0 = new ni(10000536);
        this.field_E.field_q = (ui) ((Object) dupTemp$0);
        this.field_y.field_q = (ui) ((Object) dupTemp$0);
        this.field_C.field_q = (ui) ((Object) new ni(10000536));
        this.field_w.field_q = (ui) ((Object) new kd());
        nc dupTemp$1 = new nc(10000536);
        this.field_x.field_q = (ui) ((Object) dupTemp$1);
        this.field_F.field_q = (ui) ((Object) dupTemp$1);
        String var2 = ij.a(gk.field_g, new String[]{this.m(-122), this.n(106)}, (byte) -72);
        int var3 = 20;
        var3 = var3 + this.a(170, 74, rg.field_I, this.field_y, var3);
        var3 = var3 + (this.a(66, this.field_E, 20, "", 170, pf.field_i, var3) + 5);
        var3 = var3 + this.a(170, 101, ee.field_y, this.field_F, var3);
        var3 = var3 + (5 + this.a(this.field_x, 170, 35, kl.field_d, var3, di.field_a));
        var3 = var3 + (5 + this.a(this.field_J, 170, 35, bi.field_O, var3, rd.field_b));
        var3 = var3 + this.a(170, 818340513, qe.field_A, var3, this.field_C);
        oc var4 = new oc(46, var3, -90 + this.field_l, 25, this.field_w, true, -120 + this.field_l, 5, al.field_i, 11579568, uh.field_o);
        this.a((qg) (var4), (byte) -105);
        var3 = var3 + var4.field_h;
        h var5 = new h(vd.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, vd.field_h.field_y, -1, 2147483647, true);
        this.field_z = new le(var2, var5);
        this.field_z.field_j = "";
        this.field_z.a(mk.field_E, 0, 0);
        this.field_z.a(mk.field_E, 0, 1);
        this.field_z.field_m = (ma) (this);
        this.field_z.a(46, -90 + this.field_l, -1, var3);
        var3 = var3 + (this.field_z.field_h + 15);
        this.a((qg) (this.field_z), (byte) -88);
        int var6 = 4;
        int var7 = 200;
        this.field_G.a(-83, var3, -var7 + 496 >> 1, var7, 40);
        this.field_A.a(-107, 15 + var3, 3 + var6, 60, 40);
        this.field_A.field_m = (ma) (this);
        this.field_G.field_m = (ma) (this);
        this.a((qg) (this.field_G), (byte) -119);
        this.a((qg) (this.field_A), (byte) -125);
        this.field_D = new dh((tc) (this));
        this.field_D.a(124, this.field_J.field_n + 20, this.field_J.field_p + this.field_J.field_l + 60, -this.field_J.field_p + (this.field_l + (-this.field_J.field_l - 60)), 150);
        this.a((qg) (this.field_D), (byte) -97);
        this.a(39, 0, 0, 496, 55 + (var3 + var6));
    }

    public final void a(boolean param0, String param1) {
        vc var3 = null;
        String var4 = null;
        try {
          var3 = this.field_J;
          var4 = param1;
          ((rg) ((Object) var3)).a(var4, param0, 1);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "wl.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0) {
        ((li) (this.field_J.a((byte) 125))).g(93);
        if (param0 != -69) {
          this.field_C = (vc) null;
        }
    }

    public final void a(int param0, int param1, int param2, le param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 2818) {
            return;
          }
          if (0 == param2) {
            mh.a(11207, "terms.ws");
            return;
          }
          if (param2 == 1) {
            mh.a(11207, "privacy.ws");
            return;
          }
          if (param2 != 2) {
            return;
          }
          mh.a(param1 + 8389, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wl.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1) {
        if (param0) {
          wl.a(false, -117);
          if (param1 == -1) {
            return true;
          }
          return 0 != (hc.field_t & 1 << param1) ? true : false;
        }
        if (param1 == -1) {
          return true;
        }
        return 0 != (hc.field_t & 1 << param1) ? true : false;
    }

    private final int a(int param0, int param1, String param2, int param3, qg param4) {
        RuntimeException var6 = null;
        ve var7 = null;
        oc var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new oc(20, param3, param0 + 120, 25, param4, false, 120, 3, vd.field_h, 16777215, param2);
          this.a((qg) (var8), (byte) -124);
          if (param1 != 818340513) {
            stackIn_2_0 = -55;
            return stackIn_2_0;
          }
          var7 = new ve(((ie) ((Object) param4)).a((byte) 87));
          this.a((qg) (var7), (byte) -103);
          var7.a(91, (-15 + var8.field_h >> 1) + var8.field_n, var8.field_l + var8.field_p + 3, 15, 15);
          stackIn_4_0 = var8.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("wl.EA(").append(param0).append(',').append(param1).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String n(int param0) {
        if (param0 < 0) {
          wl.a(true, 45);
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String m(int param0) {
        int var2 = -34 / ((-77 - param0) / 42);
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, qg param3, int param4) {
        oc var6 = null;
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
          var6 = new oc(20, param4, 120 + param0, 25, param3, false, 120, 3, vd.field_h, 16777215, param2);
          if (param1 <= 12) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          this.a((qg) (var6), (byte) -121);
          stackIn_4_0 = var6.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("wl.QA(").append(param0).append(',').append(param1).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) -99, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.a(2, param1);
            return stackIn_5_0;
          }
          if (param0 == 99) {
            stackIn_9_0 = this.b(param1, 63);
            return stackIn_9_0;
          }
          var5_int = 47 % ((65 - param2) / 55);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wl.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte param0, ie param1) {
        wa var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) 85);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(27835);
          var5 = -88 % ((52 - param0) / 45);
          if (ec.field_d == var4) {
            return false;
          }
          if (var4 == ek.field_a) {
            return false;
          }
          if (var4 != bc.field_a) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wl.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17) {
            field_K = (ti) null;
          }
          if (param0 == this.field_A) {
            kc.a((byte) -127);
            return;
          }
          if (param0 != this.field_G) {
            return;
          }
          discarded$1 = this.l(2188);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("wl.MA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, qg param1, int param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ob var9 = null;
        oc var10 = null;
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
          if (param0 < 60) {
            stackIn_2_0 = -93;
            return stackIn_2_0;
          }
          var10 = new oc(20, param6, param4 + 120, 25, param1, false, 120, 3, vd.field_h, 16777215, param5);
          this.a((qg) (var10), (byte) -113);
          var9 = new ob(((ie) ((Object) param1)).a((byte) -101), param3, 126, var10.field_h + param6, param4 + 50, param2);
          var9.field_m = (ma) (this);
          this.a((qg) (var9), (byte) -89);
          stackIn_4_0 = var9.field_h + var10.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("wl.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 == 170) {
          td.a(param2 - 280, param0, (String) null, param1);
          return;
        }
        field_I = false;
        td.a(param2 - 280, param0, (String) null, param1);
    }

    private final boolean l(int param0) {
        if (!this.o(15)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_C.field_k);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 == 2188) {
          return ej.a(this, this.field_y.field_k, this.field_F.field_k, this.field_w.field_y, false, this.field_J.field_k, var2);
        }
        qg var4 = (qg) null;
        int discarded$0 = this.a(80, -87, (String) null, (qg) null, -6);
        return ej.a(this, this.field_y.field_k, this.field_F.field_k, this.field_w.field_y, false, this.field_J.field_k, var2);
    }

    public static void d(byte param0) {
        int var1 = 54 / ((-76 - param0) / 38);
        field_K = null;
    }

    private final boolean o(int param0) {
        if (param0 != 15) {
          this.field_z = (le) null;
          if (!this.a((byte) 118, (ie) (this.field_J))) {
            return false;
          }
          if (!this.a((byte) 98, (ie) (this.field_y))) {
            return false;
          }
          if (!this.a((byte) 104, (ie) (this.field_E))) {
            return false;
          }
          if (!this.a((byte) 123, (ie) (this.field_F))) {
            return false;
          }
          if (!this.a((byte) 0, (ie) (this.field_x))) {
            return false;
          }
          if (this.a((byte) 114, (ie) (this.field_C))) {
            return true;
          }
          return false;
        }
        if (!this.a((byte) 118, (ie) (this.field_J))) {
          return false;
        }
        if (!this.a((byte) 98, (ie) (this.field_y))) {
          return false;
        }
        if (!this.a((byte) 104, (ie) (this.field_E))) {
          return false;
        }
        if (!this.a((byte) 123, (ie) (this.field_F))) {
          return false;
        }
        if (!this.a((byte) 0, (ie) (this.field_x))) {
          return false;
        }
        if (this.a((byte) 114, (ie) (this.field_C))) {
          return true;
        }
        return false;
    }

    private final int a(qg param0, int param1, int param2, String param3, int param4, String param5) {
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
            this.field_A = (lj) null;
          }
          stackIn_3_0 = this.a(80, param0, 35, param5, param1, param3, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("wl.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_G.field_t = this.o(15);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "wl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void p(int param0) {
        if (param0 < 101) {
          field_K = (ti) null;
        }
    }

    static {
    }
}
