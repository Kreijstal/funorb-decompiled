/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp extends ch implements jn, tb {
    static String field_W;
    private fe field_Q;
    private ga field_O;
    static int field_V;
    static ee field_N;
    static dd field_T;
    private fe field_U;
    static eg field_P;
    mp field_S;
    static String field_R;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          if (this.field_U == param3) {
            mb.b(3);
            return;
          }
          if (this.field_Q != param3) {
            return;
          }
          this.i(-123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("jp.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(String param0, String param1, int param2, int param3, ei param4, int param5) {
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
          if (param5 != -17870) {
            field_R = (String) null;
          }
          stackIn_3_0 = this.a(param3, param1, param4, 35, param0, 101, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("jp.F(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        ga var3 = null;
        String var4 = null;
        try {
          if (param1 != 35) {
            field_N = (ee) null;
          }
          var3 = this.field_O;
          var4 = param0;
          ((sl) ((Object) var3)).a((byte) -124, false, var4);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_N = null;
        field_T = null;
        field_R = null;
        if (!param0) {
          field_W = null;
          field_P = null;
          return;
        }
        field_V = 80;
        field_W = null;
        field_P = null;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_Q.field_I = this.h(-23086);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jp.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_7_0 = this.a(param3, 3);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param3, 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("jp.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean a(int param0, sc param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(91);
          if (var3 == null) {
            return true;
          }
          if (param0 != 60) {
            this.field_U = (fe) null;
          }
          var4 = var3.c(-31873);
          stackIn_8_0 = (var4 == kr.field_e);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("jp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        int discarded$0 = 0;
        if (this.h(-23086)) {
          qi.a(87, this.field_O.field_m);
          if (param0 >= -104) {
            String var3 = (String) null;
            discarded$0 = this.a(-86, (String) null, (ei) null, -74, (String) null, -122, 47);
          }
          return;
        }
    }

    public jp() {
        super(0, 0, 496, 0, (fp) null);
        this.field_O = new ga("", (cc) null, 12);
        am var1 = new am(qk.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, lc.field_O.field_C, -1, 2147483647, true);
        ei var2 = new ei(ij.field_s, var1, (cc) null);
        this.field_Q = new fe(wn.field_c, (cc) null);
        this.field_U = new fe(be.field_K, (cc) null);
        this.field_O.field_p = sg.field_H;
        this.field_O.a((byte) -111, new ua(this.field_O));
        this.field_Q.field_I = false;
        this.field_Q.field_z = (fp) ((Object) new ng());
        this.field_U.field_z = (fp) ((Object) new pd());
        this.field_O.field_z = (fp) ((Object) new om(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, 20, 50, false, var3);
        this.a(true, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(ac.field_l, se.field_k, 170, var3, this.field_O, -17870));
        this.field_Q.a(var5, -var5 + 496 >> 1, 40, false, var3);
        this.field_U.a(60, 3 + var4, 40, false, var3 + 15);
        this.field_U.field_t = (cc) (this);
        this.field_Q.field_t = (cc) (this);
        this.a(true, this.field_Q);
        this.a(true, this.field_U);
        this.field_S = new mp((jn) (this));
        this.field_S.a(-60 + (-this.field_O.field_C + this.field_l) - this.field_O.field_l, this.field_O.field_C + (this.field_O.field_l + 60), 150, false, 20);
        this.a(true, this.field_S);
        this.a(496, 0, var4 + 55 + var3, false, 0);
    }

    final static dd a(int param0, byte param1, di param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vj.a(param3, param2, param0, (byte) 121)) {
            stackIn_2_0 = null;
            return (dd) (stackIn_2_0);
          }
          if (param1 <= 12) {
            jp.a(true);
          }
          stackIn_6_0 = ok.j((byte) -104);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("jp.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0) {
        if (param0 == 16777215) {
          ((ua) (this.field_O.a(95))).i(param0 - 16777197);
          return;
        }
        ei var3 = (ei) null;
        this.a((ei) null, -124, -55, 87);
        ((ua) (this.field_O.a(95))).i(param0 - 16777197);
    }

    private final boolean h(int param0) {
        if (param0 == -23086) {
          return this.a(60, this.field_O) ? true : false;
        }
        fe var3 = (fe) null;
        this.a(true, 119, 35, (fe) null, -96);
        if (!this.a(60, this.field_O)) {
          return false;
        }
        return true;
    }

    private final int a(int param0, String param1, ei param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ck var9 = null;
        n var10 = null;
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
          var10 = new n(20, param0, param6 + 120, 25, param2, false, 120, 3, lc.field_O, 16777215, param4);
          this.a(true, var10);
          var9 = new ck(((sc) ((Object) param2)).a(-75), param1, 126, param0 + var10.field_y, 25 + param6, param3);
          var9.field_t = (cc) (this);
          this.a(true, var9);
          if (param5 <= 67) {
            field_R = (String) null;
          }
          stackIn_3_0 = var10.field_y + var9.field_y;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("jp.H(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_W = "to keep fullscreen or";
        field_R = "Please remove <%0> from your ignore list first.";
    }
}
