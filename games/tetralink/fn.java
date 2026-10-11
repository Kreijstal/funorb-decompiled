/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends gn implements sh, dm {
    static int field_R;
    private ae field_T;
    private ae field_S;
    static String field_P;
    private fo field_N;
    static boolean field_K;
    n field_L;
    static String field_M;
    static int field_O;
    static int field_Q;

    final static void h(int param0) {
        bc var2 = null;
        co var1 = (co) (pb.field_c.c(false));
        if (var1 == null) {
          mk.a(false);
          return;
        }
        if (param0 == -1) {
          var2 = kb.field_q;
          var2.f(107);
          var2.f(40);
          var2.f(-110);
          var2.f(-119);
          var1.b(false);
          return;
        }
    }

    public final void a(boolean param0) {
        if (param0) {
          ((tm) (this.field_N.a(-108))).d((byte) -99);
          return;
        }
        this.field_L = (n) null;
        ((tm) (this.field_N.a(-108))).d((byte) -99);
    }

    public static void e(byte param0) {
        int var1 = 30 / ((param0 + 14) / 54);
        field_M = null;
        field_P = null;
    }

    private final boolean a(uc param0, boolean param1) {
        vm var3 = null;
        RuntimeException var3_ref = null;
        jk var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a(-105);
          if (var3 == null) {
            return true;
          }
          if (!param1) {
            return true;
          }
          var4 = var3.c(-112);
          stackIn_9_0 = (pf.field_a == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("fn.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public fn() {
        super(0, 0, 496, 0, (kg) null);
        this.field_N = new fo("", (dn) null, 12);
        al var1 = new al(dh.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, od.field_S.field_N, -1, 2147483647, true);
        na var2 = new na(fj.field_m, var1, (dn) null);
        this.field_T = new ae(sc.field_b, (dn) null);
        this.field_S = new ae(rj.field_c, (dn) null);
        this.field_N.field_C = sf.field_c;
        this.field_N.a((byte) -59, new tm(this.field_N));
        this.field_T.field_K = false;
        this.field_T.field_H = (kg) ((Object) new uj());
        this.field_S.field_H = (kg) ((Object) new q());
        this.field_N.field_H = (kg) ((Object) new mf(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(50, var3, -118, 20, 270);
        int var5 = 200;
        this.c(var2, 10);
        var3 += 50;
        var3 = var3 + (this.a(170, var3, kl.field_e, this.field_N, jm.field_c, (byte) 96) + 5);
        this.field_T.a(40, var3, -112, 496 - var5 >> 1, var5);
        this.field_S.a(40, var3 + 15, -118, 3 + var4, 60);
        this.field_S.field_s = (dn) (this);
        this.field_T.field_s = (dn) (this);
        this.c(this.field_T, 10);
        this.c(this.field_S, 10);
        this.field_L = new n((sh) (this));
        this.field_L.a(150, 20, 14, this.field_N.field_t - (-this.field_N.field_F - 60), -this.field_N.field_F + (this.field_F - (this.field_N.field_t + 60)));
        this.c(this.field_L, 10);
        this.a(var4 + (var3 + 55), 0, -123, 0, 496);
    }

    private final int a(int param0, int param1, String param2, na param3, String param4, byte param5) {
        RuntimeException var7 = null;
        String var8 = null;
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
          if (param5 <= 56) {
            var8 = (String) null;
            fn.a(62, (ah) null, (String) null, (String) null);
          }
          stackIn_3_0 = this.a(126, param0, param4, param1, 35, param3, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("fn.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 == this.field_S) {
            fi.t(11);
          } else {
            if (param1 == this.field_T) {
              this.a(-7721);
            }
          }
          if (param0 < 0) {
            return;
          }
          this.field_T = (ae) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("fn.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, int param1, String param2, int param3, int param4, na param5, String param6) {
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
          var10 = new rc(20, param3, param1 + 120, 25, param5, false, 120, 3, od.field_S, 16777215, param6);
          this.c(var10, 10);
          var9 = new ck(((uc) ((Object) param5)).a(param0 - 245), param2, param0, var10.field_u + param3, 25 + param1, param4);
          var9.field_s = (dn) (this);
          this.c(var9, 10);
          stackIn_1_0 = var10.field_u + var9.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("fn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, String param1) {
        fo var4 = null;
        String var5 = null;
        try {
          int var3_int = -104 / ((-9 - param0) / 61);
          var4 = this.field_N;
          var5 = param1;
          ((nn) ((Object) var4)).a(false, 122, var5);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fn.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, ve param2, jb param3, jb param4, boolean param5, int param6, int param7, ve param8, ve param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          jj.a(param6, param4, param3, 2);
          gd.a(param16, false, param13, param1, param14);
          rk.a(param0, -33, param11);
          if (!param5) {
            field_O = 3;
          }
          kf.a(-4968, param7, param15, param8, param2, param17);
          ti.a(param10, 1, param18, param9);
          gj.a(70, param19, param20, param12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("fn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param9 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_T.field_K = this.f((byte) -33);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fn.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0) {
        boolean discarded$0 = false;
        if (!this.f((byte) -33)) {
          return;
        }
        ll.a(-3, this.field_N.field_A);
        if (param0 != -7721) {
          uc var3 = (uc) null;
          discarded$0 = this.a((uc) null, true);
        }
    }

    private final boolean f(byte param0) {
        if (!this.a(this.field_N, true)) {
          return false;
        }
        if (param0 != -33) {
          return true;
        }
        return true;
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
          if (98 == param0) {
            stackIn_6_0 = this.d(param3, param2 - 123);
            return stackIn_6_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.b(param3, 112);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(int param0, ah param1, String param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            fn.e((byte) 47);
          }
          if (!param1.c(105)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param3 + " - " + param1.b(22300) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fn.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_P = "<%0> is offering an unrated rematch.";
        field_M = "Set up new unrated game";
        field_O = 500;
    }
}
