/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends gn implements ij, dm, sh {
    static int field_X;
    private fo field_W;
    private fo field_K;
    n field_L;
    private ae field_V;
    private fo field_R;
    static String field_Q;
    static oh field_M;
    private fo field_O;
    private ae field_S;
    private fo field_U;
    private re field_T;
    private fo field_N;
    private fk field_P;

    final void a(na param0, int param1, int param2, boolean param3) {
        try {
          if (!param3) {
            this.a(true);
          }
          super.a(param0, param1, param2, param3);
          this.field_V.field_K = this.h(15);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ho.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.d(param3, param2 - 99);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param3, 114);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ho.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public ho() {
        super(0, 0, 496, 0, (kg) null);
        this.field_O = new fo("", (dn) null, 12);
        this.field_W = new fo("", (dn) null, 100);
        this.field_K = new fo("", (dn) null, 100);
        this.field_R = new fo("", (dn) null, 20);
        this.field_N = new fo("", (dn) null, 20);
        this.field_U = new fo("", (dn) null, 3);
        int var1 = 1;
        this.field_T = new re("", (dn) null, var1 != 0);
        this.field_V = new ae(pf.field_k, (dn) null);
        this.field_S = new ae(bg.field_n, (dn) null);
        this.field_O.field_C = sf.field_c;
        this.field_W.field_C = jj.field_c;
        this.field_K.field_C = f.field_t;
        this.field_R.field_C = ci.field_D;
        this.field_N.field_C = gm.field_e;
        this.field_U.field_C = hn.field_N;
        this.field_T.field_C = wg.field_a;
        this.field_O.a((byte) 78, new tm(this.field_O));
        this.field_W.a((byte) -66, new lh(this.field_W));
        this.field_K.a((byte) -59, new hd(this.field_K, this.field_W));
        this.field_R.a((byte) 91, new mm(this.field_R, this.field_O, this.field_W));
        this.field_N.a((byte) 70, new cb(this.field_N, this.field_R));
        this.field_U.a((byte) 61, new w(this.field_U));
        this.field_V.field_K = false;
        this.field_V.field_H = (kg) ((Object) new uj());
        this.field_S.field_H = (kg) ((Object) new q());
        this.field_O.field_H = (kg) ((Object) new mf(10000536));
        mf dupTemp$0 = new mf(10000536);
        this.field_K.field_H = (kg) ((Object) dupTemp$0);
        this.field_W.field_H = (kg) ((Object) dupTemp$0);
        this.field_U.field_H = (kg) ((Object) new mf(10000536));
        this.field_T.field_H = (kg) ((Object) new ul());
        ci dupTemp$1 = new ci(10000536);
        this.field_N.field_H = (kg) ((Object) dupTemp$1);
        this.field_R.field_H = (kg) ((Object) dupTemp$1);
        String var2 = sk.a(new String[]{this.i(-2), this.f((byte) 9)}, ej.field_t, 120);
        int var3 = 20;
        var3 = var3 + this.a(rm.field_c, this.field_W, 96, var3, 170);
        var3 = var3 + (5 + this.a("", 20, 170, om.field_Pb, this.field_K, var3, false));
        var3 = var3 + this.a(gj.field_a, this.field_R, -115, var3, 170);
        var3 = var3 + (5 + this.a(this.field_N, 170, qm.field_f, 120, var3, fm.field_e));
        var3 = var3 + (5 + this.a(this.field_O, 170, jm.field_c, 120, var3, kl.field_e));
        var3 = var3 + this.a(170, ba.field_P, var3, this.field_U, 107);
        rc var4 = new rc(46, var3, this.field_F - 90, 25, this.field_T, true, this.field_F - 120, 5, dh.field_d, 11579568, ke.field_e);
        this.c(var4, 10);
        var3 = var3 + var4.field_u;
        al var5 = new al(od.field_S, 0, 0, 0, 0, 16777215, -1, 0, 0, od.field_S.field_N, -1, 2147483647, true);
        this.field_P = new fk(var2, var5);
        this.field_P.field_C = "";
        this.field_P.a(0, bf.field_o, (byte) -127);
        this.field_P.a(1, bf.field_o, (byte) -127);
        this.field_P.field_s = (dn) (this);
        this.field_P.c(this.field_F - 90, 46, var3, -82);
        var3 = var3 + (this.field_P.field_u + 15);
        this.c(this.field_P, 10);
        int var6 = 4;
        int var7 = 200;
        this.field_V.a(40, var3, 4, -var7 + 496 >> 1, var7);
        this.field_S.a(40, var3 + 15, -124, 3 + var6, 60);
        this.field_S.field_s = (dn) (this);
        this.field_V.field_s = (dn) (this);
        this.c(this.field_V, 10);
        this.c(this.field_S, 10);
        this.field_L = new n((sh) (this));
        this.field_L.a(150, this.field_O.field_w + 20, -115, 60 + (this.field_O.field_t + this.field_O.field_F), -this.field_O.field_F - this.field_O.field_t + (this.field_F - 60));
        this.c(this.field_L, 10);
        this.a(55 + (var3 + var6), 0, -118, 0, 496);
    }

    public final void a(int param0, byte param1, fk param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          if (param1 != -103) {
            return;
          }
          if (param0 == 0) {
            al.a("terms.ws", (byte) 24);
            return;
          }
          if (param0 == 1) {
            al.a("privacy.ws", (byte) 24);
            return;
          }
          if (param0 != 2) {
            return;
          }
          al.a("conduct.ws", (byte) 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ho.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte param0, uc param1) {
        vm var3 = null;
        RuntimeException var3_ref = null;
        jk var4 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(-111);
          if (param0 >= -8) {
            this.field_P = (fk) null;
          }
          if (var3 == null) {
            return true;
          }
          var4 = var3.c(-26);
          if (var4 == db.field_h) {
            return false;
          }
          if (pm.field_b == var4) {
            return false;
          }
          if (an.field_a != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("ho.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 <= 109) {
          ho.a(109);
          field_M = null;
          field_Q = null;
          return;
        }
        field_M = null;
        field_Q = null;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 0) {
            return;
          }
          if (this.field_S == param1) {
            gj.a((byte) 71);
            return;
          }
          if (this.field_V != param1) {
            return;
          }
          discarded$1 = this.e((byte) 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("ho.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, String param1, int param2, na param3, int param4) {
        RuntimeException var6 = null;
        ab var7 = null;
        int var8 = 0;
        rc var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new rc(20, param2, param0 + 120, 25, param3, false, 120, 3, od.field_S, 16777215, param1);
          this.c(var9, 10);
          var7 = new ab(((uc) ((Object) param3)).a(-124));
          this.c(var7, 10);
          var8 = -35 % ((1 - param4) / 45);
          var7.a(15, var9.field_w + (var9.field_u - 15 >> 1), 122, 3 + (var9.field_F + var9.field_t), 15);
          stackIn_1_0 = var9.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("ho.O(").append(param0).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, String param3, na param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ck var9 = null;
        rc var10 = null;
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
          var10 = new rc(20, param5, 120 + param2, 25, param4, param6, 120, 3, od.field_S, 16777215, param3);
          this.c(var10, 10);
          var9 = new ck(((uc) ((Object) param4)).a(-125), param0, 126, var10.field_u + param5, 50 + param2, param1);
          var9.field_s = (dn) (this);
          this.c(var9, 10);
          stackIn_1_0 = var10.field_u + var9.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ho.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(int param0, String param1) {
        fo var3 = null;
        String var4 = null;
        try {
          var3 = this.field_O;
          var4 = param1;
          int var5 = 9 % ((param0 + 9) / 61);
          ((nn) ((Object) var3)).a(false, 32, var4);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ho.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final String f(byte param0) {
        if (param0 != 9) {
          na var3 = (na) null;
          this.a(-82, '\0', 16, (na) null);
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(boolean param0) {
        if (!param0) {
          return;
        }
        ((tm) (this.field_O.a(-117))).d((byte) -115);
    }

    private final boolean e(byte param0) {
        int var2 = 102 % ((22 - param0) / 60);
        if (!this.h(15)) {
          return false;
        }
        int var3 = -1;
        try {
          var3 = Integer.parseInt(this.field_U.field_A);
        } catch (NumberFormatException numberFormatException) {
        }
        return sj.a(var3, this.field_W.field_A, this.field_R.field_A, this, this.field_O.field_A, -1, this.field_T.field_N);
    }

    private final boolean h(int param0) {
        if (param0 != 15) {
          return true;
        }
        if (!this.a((byte) -123, this.field_O)) {
          return false;
        }
        if (!this.a((byte) -11, this.field_W)) {
          return false;
        }
        if (!this.a((byte) -92, this.field_K)) {
          return false;
        }
        if (!this.a((byte) -93, this.field_R)) {
          return false;
        }
        if (!this.a((byte) -27, this.field_N)) {
          return false;
        }
        if (this.a((byte) -105, this.field_U)) {
          return true;
        }
        return false;
    }

    private final int a(String param0, na param1, int param2, int param3, int param4) {
        rc var6 = null;
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
          var6 = new rc(20, param3, param4 + 120, 25, param1, false, 120, 3, od.field_S, 16777215, param0);
          var7 = -24 % ((param2 + 11) / 51);
          this.c(var6, 10);
          stackIn_1_0 = var6.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("ho.D(");
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
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(na param0, int param1, String param2, int param3, int param4, String param5) {
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
          if (param3 != 120) {
            ho.a(-16);
          }
          stackIn_3_0 = this.a(param2, 35, param1, param5, param0, param4, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ho.E(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final String i(int param0) {
        if (param0 != -2) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_X = 0;
        field_Q = "Cancel";
    }
}
