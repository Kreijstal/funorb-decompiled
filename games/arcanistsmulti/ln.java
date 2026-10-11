/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends df implements pj, vb, ro {
    static String field_L;
    static String field_R;
    private bi field_K;
    static int field_J;
    static int[] field_M;
    static String field_T;
    static cn field_U;
    private bi field_P;
    li field_G;
    private bi field_D;
    private ej field_S;
    static String field_Q;
    private ag field_O;
    private ag field_C;
    static byte[][] field_I;
    private bi field_H;
    private bi field_N;
    private bk field_F;
    private bi field_E;

    private final boolean a(int param0, el param1) {
        pd var3 = null;
        RuntimeException var3_ref = null;
        eh var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 43) {
            this.field_F = (bk) null;
          }
          var3 = param1.a(0);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(-83);
          if (var4 == ra.field_k) {
            return false;
          }
          if (var4 == da.field_f) {
            return false;
          }
          if (cg.field_Wb != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ln.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_I = (byte[][]) null;
        int var1 = -76 / ((68 - param0) / 58);
        field_U = null;
        field_L = null;
        field_T = null;
        field_Q = null;
        field_R = null;
        field_M = null;
    }

    private final boolean h(int param0) {
        if (param0 != 0) {
          this.field_D = (bi) null;
          if (!this.a(118, (el) (this.field_K))) {
            return false;
          }
          if (!this.a(param0 + 91, (el) (this.field_N))) {
            return false;
          }
          if (!this.a(99, (el) (this.field_D))) {
            return false;
          }
          if (!this.a(72, (el) (this.field_P))) {
            return false;
          }
          if (!this.a(94, (el) (this.field_E))) {
            return false;
          }
          if (this.a(80, (el) (this.field_H))) {
            return true;
          }
          return false;
        }
        if (!this.a(118, (el) (this.field_K))) {
          return false;
        }
        if (!this.a(param0 + 91, (el) (this.field_N))) {
          return false;
        }
        if (!this.a(99, (el) (this.field_D))) {
          return false;
        }
        if (!this.a(72, (el) (this.field_P))) {
          return false;
        }
        if (!this.a(94, (el) (this.field_E))) {
          return false;
        }
        if (this.a(80, (el) (this.field_H))) {
          return true;
        }
        return false;
    }

    private final int a(int param0, qm param1, String param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = 34 % ((41 - param3) / 45);
          stackIn_1_0 = this.a(param2, param1, 25, 35, param4, param5, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ln.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String g(byte param0) {
        if (param0 != 34) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(String param0, int param1) {
        bi var3 = null;
        String var4 = null;
        try {
          var3 = this.field_K;
          if (param1 != 90) {
            field_T = (String) null;
          }
          var4 = param0;
          ((rn) ((Object) var3)).a(false, var4, false);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ln.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public ln() {
        super(0, 0, 496, 0, (pf) null);
        this.field_K = new bi("", (wc) null, 12);
        this.field_N = new bi("", (wc) null, 100);
        this.field_D = new bi("", (wc) null, 100);
        this.field_P = new bi("", (wc) null, 20);
        this.field_E = new bi("", (wc) null, 20);
        this.field_H = new bi("", (wc) null, 3);
        int var1 = 1;
        this.field_F = new bk("", (wc) null, var1 != 0);
        this.field_C = new ag(wm.field_G, (wc) null);
        this.field_O = new ag(kn.field_rb, (wc) null);
        this.field_K.field_q = eh.field_b;
        this.field_N.field_q = jk.field_s;
        this.field_D.field_q = dn.field_Fb;
        this.field_P.field_q = ao.field_c;
        this.field_E.field_q = nk.field_j;
        this.field_H.field_q = lc.field_k;
        this.field_F.field_q = ce.field_l;
        this.field_K.a(new dg(this.field_K), (byte) 18);
        this.field_N.a(new ki(this.field_N), (byte) -127);
        this.field_D.a(new ja(this.field_D, this.field_N), (byte) -128);
        this.field_P.a(new ui(this.field_P, this.field_K, this.field_N), (byte) -127);
        this.field_E.a(new mn(this.field_E, this.field_P), (byte) -128);
        this.field_H.a(new lo(this.field_H), (byte) 39);
        this.field_C.field_B = false;
        this.field_C.field_r = (pf) ((Object) new mm());
        this.field_O.field_r = (pf) ((Object) new gm());
        this.field_K.field_r = (pf) ((Object) new ib(10000536));
        ib dupTemp$0 = new ib(10000536);
        this.field_D.field_r = (pf) ((Object) dupTemp$0);
        this.field_N.field_r = (pf) ((Object) dupTemp$0);
        this.field_H.field_r = (pf) ((Object) new ib(10000536));
        this.field_F.field_r = (pf) ((Object) new ii());
        tc dupTemp$1 = new tc(10000536);
        this.field_E.field_r = (pf) ((Object) dupTemp$1);
        this.field_P.field_r = (pf) ((Object) dupTemp$1);
        String var2 = tj.a(-23, new String[]{this.g((byte) 34), this.e(false)}, fn.field_d);
        int var3 = 20;
        var3 = var3 + this.a(this.field_N, bk.field_K, var3, 170, 109);
        var3 = var3 + (5 + this.a("", this.field_D, 25, 20, 170, dn.field_Gb, var3));
        var3 = var3 + this.a(this.field_P, eh.field_a, var3, 170, 126);
        var3 = var3 + (5 + this.a(var3, this.field_E, rm.field_p, 99, 170, le.field_A));
        var3 = var3 + (5 + this.a(var3, this.field_K, bj.field_kb, -67, 170, ch.field_h));
        var3 = var3 + this.a(ka.field_n, this.field_H, (byte) -71, 170, var3);
        ke var4 = new ke(46, var3, this.field_v - 90, 25, this.field_F, true, this.field_v - 120, 5, vc.field_e, 11579568, rj.field_c);
        this.c(-114, var4);
        var3 = var3 + var4.field_k;
        jm var5 = new jm(ia.field_c, 0, 0, 0, 0, 16777215, -1, 0, 0, ia.field_c.field_C, -1, 2147483647, true);
        this.field_S = new ej(var2, var5);
        this.field_S.field_q = "";
        this.field_S.a(0, 0, mm.field_s);
        this.field_S.a(1, 0, mm.field_s);
        this.field_S.field_o = (wc) (this);
        this.field_S.a(46, (byte) -4, this.field_v - 90, var3);
        var3 = var3 + (this.field_S.field_k + 15);
        this.c(-66, this.field_S);
        int var6 = 4;
        int var7 = 200;
        this.field_C.a(40, var3, var7, -var7 + 496 >> 1, -87);
        this.field_O.a(40, 15 + var3, 60, 3 + var6, -100);
        this.field_O.field_o = (wc) (this);
        this.field_C.field_o = (wc) (this);
        this.c(-85, this.field_C);
        this.c(-96, this.field_O);
        this.field_G = new li((ro) (this));
        this.field_G.a(150, this.field_K.field_j + 20, -60 + (this.field_v + (-this.field_K.field_n - this.field_K.field_v)), 60 + (this.field_K.field_n + this.field_K.field_v), -127);
        this.c(-99, this.field_G);
        this.a(var3 - (-55 - var6), 0, 496, 0, -107);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_M = (int[]) null;
          }
          if (this.field_O == param4) {
            ba.a(110);
            return;
          }
          if (this.field_C != param4) {
            return;
          }
          discarded$1 = this.a(-48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ln.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean a(int param0) {
        if (!this.h(0)) {
          return false;
        }
        int var2 = -73 / ((72 - param0) / 40);
        int var3 = -1;
        try {
          var3 = Integer.parseInt(this.field_H.field_g);
        } catch (NumberFormatException numberFormatException) {
        }
        return bb.a(this.field_P.field_g, this.field_K.field_g, var3, this, -30001, this.field_N.field_g, this.field_F.field_z);
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -121, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.field_O = (ag) null;
          }
          if (param3 == 98) {
            stackIn_7_0 = this.a(param0, 9555);
            return stackIn_7_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(2, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ln.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_C.field_B = this.h(0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ln.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, ej param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (0 != param3) {
            if (1 == param3) {
              uh.a(126, "privacy.ws");
            } else {
              if (param3 == 2) {
                uh.a(127, "conduct.ws");
              }
            }
          } else {
            uh.a(param2 + 1734, "terms.ws");
          }
          if (param2 == -1607) {
            return;
          }
          this.field_P = (bi) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ln.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String e(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int a(String param0, qm param1, int param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        sc var9 = null;
        ke var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new ke(20, param6, 120 + param4, param2, param1, false, 120, 3, ia.field_c, 16777215, param5);
          this.c(-75, var10);
          var9 = new sc(((el) ((Object) param1)).a(0), param0, 126, param6 + var10.field_k, param4 + 50, param3);
          var9.field_o = (wc) (this);
          this.c(-127, var9);
          stackIn_1_0 = var9.field_k + var10.field_k;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ln.H(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 != -7) {
          return;
        }
        ((dg) (this.field_K.a(0))).e(126);
    }

    private final int a(String param0, qm param1, byte param2, int param3, int param4) {
        RuntimeException var6 = null;
        mk var7 = null;
        ke var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new ke(20, param4, param3 + 120, 25, param1, false, 120, 3, ia.field_c, 16777215, param0);
          if (param2 != -71) {
            stackIn_2_0 = 93;
            return stackIn_2_0;
          }
          this.c(param2 ^ 13, var8);
          var7 = new mk(((el) ((Object) param1)).a(0));
          this.c(-94, var7);
          var7.a(15, var8.field_j + (-15 + var8.field_k >> 1), 15, 3 + var8.field_v + var8.field_n, param2 - 48);
          stackIn_4_0 = var8.field_k;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ln.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(qm param0, String param1, int param2, int param3, int param4) {
        String discarded$1 = null;
        ke var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 97) {
            discarded$1 = this.g((byte) -39);
          }
          var6 = new ke(20, param2, param3 + 120, 25, param0, false, 120, 3, ia.field_c, 16777215, param1);
          this.c(-66, var6);
          stackIn_3_0 = var6.field_k;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("ln.L(");
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
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_R = "Accept";
        field_T = "Add friend";
        field_J = -1;
        field_L = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
