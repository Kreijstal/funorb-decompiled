/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends v implements pi {
    static String field_H;
    private String[] field_F;
    private rm[] field_I;
    private pn field_G;
    static go field_J;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
          return;
        }
        qi var5 = hl.field_g;
        if (null != this.field_F) {
          var5.a(tk.field_b, param2 + this.field_k, this.field_o + param1, this.field_x, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_I);
        }
    }

    final static void a(int param0, int param1, int param2, hj[] param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param3 != null &&
            param4 > 0) {
            var5_int = param3[0].field_o;
            var6 = param3[2].field_o;
            var7 = param3[1].field_o;
            param3[0].a(param2, param0);
            param3[2].a(-var6 + (param2 + param4), param0);
            tc.b(hi.field_W);
            tc.e(var5_int + param2, param0, -var6 + param4 + param2, param3[1].field_v + param0);
            if (param1 != 14191) {
              field_J = (go) null;
            }
            var8 = param2 + var5_int;
            var9 = param2 - (-param4 + var6);
            for (param2 = var8; var9 > param2; param2 = param2 + var7) {
              param3[1].a(param2, param0);
            }
            tc.a(hi.field_W);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gi.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    gi(pn param0) {
        super(0, 0, 0, 0, (dh) null);
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        vk.a(true);
        if (param0 <= 9) {
          field_J = (go) null;
        }
    }

    final static io i(int param0) {
        if (param0 >= -77) {
          gi.i(-10);
        }
        return new io(ob.d((byte) 41), tm.b(false));
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        am var4 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          this.field_D.a(param1 + 28977);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_F = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_F[var4_int] = ok.a((CharSequence) ((Object) param0[var4_int]), -6126).replace(' ', ' ');
            }
            var4 = new am(hl.field_g, 0, 1);
            this.field_I = new rm[var3_int + 1];
            if (param1 != 43) {
              return;
            }
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_I[var5] = new rm(this.field_F[var5], (tb) (this));
              this.field_I[var5].field_l = (dh) ((Object) var4);
              this.field_I[var5].field_z = bj.field_N;
              this.field_I[var5].a(0, (byte) 122, var5 * 16 + 20, 15, 80);
              this.a(true, this.field_I[var5]);
            }
            this.field_I[var3_int] = new rm(tg.field_f, (tb) (this));
            this.field_I[var3_int].field_l = (dh) ((Object) var4);
            this.field_I[var3_int].a(0, (byte) 122, 16 * (var3_int + 1) + 20, 15, 100);
            this.a(true, this.field_I[var3_int]);
            return;
          }
          this.field_F = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("gi.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.c(param0, param2 + 77);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param0, param2 + 200);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("gi.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_J = null;
        field_H = null;
        if (param0 != -26897) {
          fi var2 = (fi) null;
          gi.a((fi) null, 23, (fi) null);
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        n var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HoldTheLine.field_D;
        try {
          var6_int = 0;
          if (param2 != -4) {
            var8 = (n) null;
            this.a((n) null, -95, (byte) -39, 'B');
          }
          while (this.field_F.length > var6_int) {
            if (param1 == this.field_I[var6_int]) {
              this.field_G.a(this.field_F[var6_int], 25);
            }
            var6_int++;
          }
          if (this.field_I[this.field_F.length] == param1) {
            this.field_G.a((byte) 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("gi.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(fi param0, int param1, fi param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          var3_int = -param2.field_gb + param0.field_gb;
          if (param1 != 200) {
            gi.i(32);
          }
          if (vl.field_g == param0.field_hb) {
            var3_int -= 200;
          } else {
            if (null == param0.field_hb) {
              var3_int += 200;
            }
          }
          if (vl.field_g == param2.field_hb) {
            var3_int += 200;
          } else {
            if (null == param2.field_hb) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("gi.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_H = "Steer left";
    }
}
