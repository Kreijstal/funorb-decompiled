/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends jl implements bp {
    private kg field_X;
    static String field_Y;

    public static void p(int param0) {
        field_Y = null;
        if (param0 != 0) {
          field_Y = (String) null;
        }
    }

    bo(tc param0, ih param1) {
        super(param0, 200, 150);
        Object var3 = null;
        vg var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (eo.field_Z != param1) {
            if (param1 != bg.field_f) {
              if (param1 == pe.field_E) {
                this.field_n = this.field_n + 30;
                var3 = sc.field_p;
              }
            } else {
              var3 = lp.field_z;
              this.field_n = this.field_n + 10;
              if (cb.c((byte) 58)) {
                this.field_n = this.field_n + 20;
                var3 = rm.field_c;
              }
            }
          } else {
            var3 = ne.field_n;
          }
          var4 = new vg((String) (var3), (ko) null);
          var4.field_q = 50;
          var4.field_x = this.field_x;
          var4.field_m = 0;
          var4.field_n = 80;
          var4.field_p = (iq) ((Object) new o(mf.field_x, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b((byte) -49, var4);
          this.field_X = this.a((ko) (this), nf.field_i, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bo.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void r(int param0) {
        sl.a(param0 ^ param0, of.field_b);
    }

    final static boolean q(int param0) {
        int var1 = -98 / ((param0 + 33) / 63);
        return !wh.field_a.b(14) ? true : false;
    }

    private final kg a(ko param0, String param1, int param2) {
        kg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        kg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new kg(param1, param0);
          var4.field_p = (iq) ((Object) new qp());
          var5 = -6 + this.field_n;
          this.field_n = this.field_n + 38;
          if (param2 != 0) {
            bo.p(-92);
          }
          var4.a(var5, 30, (byte) 126, 15, this.field_x - 14 - 16);
          this.b((byte) -50, var4);
          this.d((byte) 90);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("bo.AB(");
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
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(boolean param0) {
        if (!param0) {
          return;
        }
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.c(1, (byte) -76);
        var2.c(param1, (byte) -97);
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == this.field_X) {
            this.f(true);
          }
          if (param1 == 6) {
            return;
          }
          this.f(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("bo.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static vm a(int[] param0, byte param1, qr param2, qr param3, qr param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        vm[] var8 = null;
        int var9 = 0;
        dp var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        vm stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        vm stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = param0.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new vm[var5_int];
          var9 = 49;
          try {
            if (param1 >= -106) {
              stackIn_4_0 = (vm) null;
              return stackIn_4_0;
            }
            for (var10_int = 0; var5_int > var10_int; var10_int++) {
              var11 = dh.field_c.a((byte) 47, param0[var10_int]);
              var6[var10_int] = var11.f(80);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_10_0 = null;
            return (vm) (stackIn_10_0);
          }
          stackIn_12_0 = new vm(0L, param3, param4, param2, var8, param0, var6, var14);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("bo.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_Y = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
