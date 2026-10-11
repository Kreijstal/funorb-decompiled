/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ch implements jb, tb {
    private fe field_P;
    static boolean field_T;
    static String field_N;
    static vh field_Q;
    private fq field_V;
    static String field_O;
    static String field_W;
    static di field_R;
    static String field_U;
    private mh field_S;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_P == param3) {
            nm.a((byte) 41);
            this.field_V.k(17);
          }
          if (param0) {
            return;
          }
          field_W = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("sd.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        rl.field_e = 0;
        dq.field_h = null;
        mq.field_c = null;
        var2 = na.field_a;
        na.field_a = wn.field_h;
        if (param1 == 51) {
          sq.field_c.field_a = 2;
        } else {
          if (param1 != 50) {
            sq.field_c.field_a = 1;
          } else {
            sq.field_c.field_a = 5;
          }
        }
        wn.field_h = var2;
        sq.field_c.field_e = sq.field_c.field_e + 1;
        if (sq.field_c.field_e >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (sq.field_c.field_e >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (param0) {
          sd.a(true, 78);
        }
        if (sq.field_c.field_e >= 4) {
          return 1;
        }
        return -1;
    }

    private final String h(byte param0) {
        if (param0 != 44) {
          mh var3 = (mh) null;
          this.a(-53, (mh) null, 58, -28);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_W = null;
        field_O = null;
        field_N = null;
        int var1 = 6 % ((param0 - 67) / 52);
        field_Q = null;
        field_R = null;
        field_U = null;
    }

    sd(fq param0) {
        super(0, 0, 288, 0, (fp) null);
        String var7 = null;
        int var3 = 0;
        am var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_V = param0;
          this.field_P = new fe(fg.field_c, (cc) null);
          this.field_P.field_z = (fp) ((Object) new ng());
          var7 = nr.a(new String[]{this.h((byte) 44), this.g((byte) 99)}, -1, hb.field_g);
          var3 = 20;
          var4 = new am(lc.field_O, 0, 0, 0, 0, 16777215, -1, 3, 0, lc.field_O.field_C, -1, 2147483647, true);
          this.field_S = new mh(var7, var4);
          this.field_S.field_p = "";
          this.field_S.a((byte) 68, cn.field_b, 0);
          this.field_S.a((byte) 66, cn.field_b, 1);
          this.field_S.field_l = -40 + this.field_l;
          this.field_S.field_t = (cc) (this);
          this.field_S.b(26, var3, this.field_l - 40, -119);
          var3 = var3 + (15 + this.field_S.field_y);
          this.a(true, this.field_S);
          var5 = 4;
          var6 = 200;
          this.field_P.a(var6, 300 - var6 >> 1, 40, false, var3);
          this.field_P.field_t = (cc) (this);
          this.a(true, this.field_P);
          this.a(300, 0, 55 + (var3 + var5), false, 0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, mh param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          if (param2 != -12147) {
            sd.a(true, -93);
          }
          if (0 == param3) {
            ci.a("terms.ws", -128);
            return;
          }
          if (1 == param3) {
            ci.a("privacy.ws", -127);
            return;
          }
          if (param3 != 2) {
            return;
          }
          ci.a("conduct.ws", -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("sd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(byte param0) {
        int var2 = 117 % ((26 - param0) / 55);
        return "</col></u>";
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
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
          if (param1 == 98) {
            stackIn_6_0 = this.a(param3, 3);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param3, 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("sd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_U = "<%0> has been removed.";
        field_O = "<%0> is <%2>!";
        field_W = "Orb points: ";
        field_N = "Offensive account name";
    }
}
