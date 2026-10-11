/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends aj implements df {
    private tc field_z;
    private String[] field_y;
    private lj[] field_C;
    static ti field_B;
    static volatile int field_w;
    static int field_x;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 17) {
            field_B = (ti) null;
          }
          for (var6_int = 0; this.field_y.length > var6_int; var6_int++) {
            if (this.field_C[var6_int] == param0) {
              this.field_z.a(false, this.field_y[var6_int]);
            }
          }
          if (this.field_C[this.field_y.length] == param0) {
            this.field_z.a((byte) -69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("dh.MA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ek var4 = null;
        int var6 = 0;
        java.net.URL var7 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          this.field_u.g(-1);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_y = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_y[var4_int] = ca.a((CharSequence) ((Object) param0[var4_int]), true).replace(' ', ' ');
            }
            var4 = new ek(vd.field_h, 0, 1);
            this.field_C = new lj[var3_int + 1];
            if (param1 != 17036) {
              var7 = (java.net.URL) null;
              dh.a((java.applet.Applet) null, (byte) -123, (java.net.URL) null);
            }
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_C[var5] = new lj(this.field_y[var5], (ma) (this));
              this.field_C[var5].field_q = (ui) ((Object) var4);
              this.field_C[var5].field_j = ae.field_c;
              this.field_C[var5].a(param1 ^ 17099, var5 * 16 + 20, 0, 80, 15);
              this.a((qg) (this.field_C[var5]), (byte) -125);
            }
            this.field_C[var3_int] = new lj(nj.field_p, (ma) (this));
            this.field_C[var3_int].field_q = (ui) ((Object) var4);
            this.field_C[var3_int].a(-127, 16 * var3_int + 16 + 20, 0, 100, 15);
            this.a((qg) (this.field_C[var3_int]), (byte) -92);
            return;
          }
          this.field_y = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("dh.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) 121, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.a(2, param1);
            return stackIn_5_0;
          }
          var5_int = 101 / ((65 - param2) / 55);
          if (99 != param0) {
            return false;
          }
          stackIn_8_0 = this.b(param1, 49);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        java.net.URL var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          while (true) {
            param9--;
            if (0 > param9) {
              if (param2 != 99) {
                var17 = (java.net.URL) null;
                dh.a((java.applet.Applet) null, (byte) -5, (java.net.URL) null);
              }
              return;
            }
            var18 = param3;
            var10 = var18;
            var11 = param5;
            var12 = param4;
            var13 = param6;
            var14 = param8;
            var15 = (16711422 & var18[var11]) >> 1;
            var10[var11] = (vg.c(var14, 33529506) >> 17) + (vg.c(16711680, var12 >> 1) + vg.c(65280, var13 >> 9) + var15);
            param4 = param4 + param1;
            param5++;
            param8 = param8 + param7;
            param6 = param6 + param0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("dh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void l(int param0) {
        if (param0 != -1) {
          return;
        }
        field_B = null;
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (md.field_j != null &&
            !md.field_j.equals(param0.getParameter("settings"))) {
            var3 = md.field_j;
            var4 = var3;
            var4 = var3;
          }
          if (mg.field_e != null &&
            !mg.field_e.equals(param0.getParameter("session"))) {
            var4 = mg.field_e;
          }
          var5 = 46 % ((param1 + 42) / 44);
          stackIn_8_0 = fd.a(-1, (String) (var4), 130, param2, (String) (var3));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dh.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) (stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    dh(tc param0) {
        super(0, 0, 0, 0, (ui) null);
        try {
          this.field_z = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param2 >>> 31;
        if (param0 != 15) {
          dh.l(125);
        }
        return (param2 + var3) / param1 - var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 121);
        if (param2 != 0) {
          return;
        }
        int var5 = -1 % ((77 - param3) / 34);
        kg var6 = vd.field_h;
        if (null != this.field_y) {
          var6.a(ae.field_d, param0 + this.field_p, this.field_n + param1, this.field_l, 20, 16777215, -1, 0, 0, var6.field_t + var6.field_y);
        }
    }

    static {
        field_w = 0;
    }
}
