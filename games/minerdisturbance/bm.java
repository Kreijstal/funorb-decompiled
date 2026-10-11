/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends nf {
    private int field_s;
    private we field_m;
    private int field_p;
    private int field_j;
    private String field_n;
    private boolean field_t;
    private int field_l;
    static ag field_o;
    private int field_i;
    static String field_k;
    static String field_r;
    static String field_q;

    final static java.applet.Applet c(int param0) {
        if (param0 >= -73) {
          return (java.applet.Applet) null;
        }
        if (of.field_b != null) {
          return of.field_b;
        }
        return (java.applet.Applet) ((Object) j.field_h);
    }

    final void a(int param0, int param1, we param2, String param3, int param4, byte param5, int param6, int param7) {
        mg stackIn_37_0;
        mg stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        mg stackIn_38_0 = null;
        mg stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        we stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_42_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = MinerDisturbance.field_ab;
        try {
          if (param6 == 0) {
            param6 = param2.field_G;
          }
          if (param3 == null) {
            this.field_f = null;
            return;
          }
          if (param2 == this.field_m &&
            !this.field_t &&
            this.field_l == param7 &&
            param0 == this.field_j &&
            this.field_i == param6 &&
            this.field_p == param1 &&
            this.field_s == param4 &&
            this.field_n != null &&
            this.field_n.equals(param3)) {
            return;
          }
          this.field_l = param7;
          this.field_n = param3;
          this.field_s = param4;
          this.field_t = false;
          this.field_p = param1;
          this.field_i = param6;
          if (param5 <= 61) {
            field_r = (String) null;
          }
          this.field_j = param0;
          this.field_m = param2;
          var16 = new String[param2.a(param3, param4) + 1];
          var17 = var16;
          var10 = Math.max(1, param2.a(param3, new int[]{param4}, var17));
          if (this.field_j == 3 &&
            var10 == 1) {
            this.field_j = 1;
          }
          this.field_f = new mg[var10];
          if (this.field_j != 0) {
            if (this.field_j == 1) {
              var11 = param2.field_I + (this.field_p - this.field_i * var10 >> 1);
            } else {
              if (this.field_j == 2) {
                var11 = this.field_p - param2.field_E - this.field_i * var10;
              } else {
                var12 = (-(this.field_i * var10) + this.field_p) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_i = this.field_i + var12;
                var11 = var12 + param2.field_I;
              }
            }
          } else {
            var11 = param2.field_I;
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param2.field_I + var11;
            stackIn_37_3 = param2.field_E + var11;
            if (var13 == null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            }
            var14 = new mg(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_d[0] = 0;
            if (var13 != null) {
              var14.field_d[var13.length()] = param2.a(var13);
              stackIn_41_0 = (we) (param2);
              stackIn_41_1 = var13;
              if (param7 == 3) {
                stackIn_42_2 = this.a(101, var13, param2.a(var13), param4);
              } else {
                stackIn_42_2 = 0;
              }
              pf.a(stackIn_41_0, stackIn_41_1, stackIn_42_2, -19453, var14);
            }
            var11 = var11 + param6;
            this.field_f[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_47_0 = var9;
          stackIn_47_1 = new StringBuilder().append("bm.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param3 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final mg a(int param0, String param1, byte param2, we param3) {
        mg var5 = null;
        RuntimeException var5_ref = null;
        mg var6 = null;
        mg stackIn_2_0 = null;
        mg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new mg(param0 - param3.field_I, param0 + param3.field_E, param1.length());
          var5 = var6;
          this.field_f = new mg[]{var6};
          if (param2 >= 18) {
            stackIn_4_0 = var5;
            return stackIn_4_0;
          }
          stackIn_2_0 = (mg) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("bm.F(").append(param0).append(',');
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
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2, we param3, int param4) {
        mg var8 = null;
        mg var9 = null;
        if (param2 == null) {
          this.field_f = null;
          return;
        }
        if (param3 == this.field_m && this.field_t && this.field_l == 2 && this.field_n != null &&
          this.field_n.equals(param2)) {
          return;
        }
        try {
          this.field_l = 2;
          this.field_n = param2;
          this.field_t = true;
          this.field_m = param3;
          var8 = this.a(param4, param2, (byte) 51, param3);
          var9 = var8;
          var9.field_d[0] = param1 - param3.a(param2);
          var9.field_d[param2.length()] = param1;
          pf.a(param3, param2, param0, -19453, var9);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
          field_o = (ag) null;
        }
        field_r = null;
        field_q = null;
        field_k = null;
        field_o = null;
    }

    final void a(int param0, we param1, String param2, int param3, int param4) {
        mg var7 = null;
        mg var8 = null;
        if (param2 == null) {
          this.field_f = null;
          return;
        }
        if (param1 == this.field_m && this.field_t && this.field_l == 0 && this.field_n != null &&
          this.field_n.equals(param2)) {
          return;
        }
        try {
          this.field_m = param1;
          this.field_n = param2;
          this.field_l = 0;
          this.field_t = true;
          var7 = this.a(param4, param2, (byte) 19, param1);
          var8 = var7;
          if (param3 <= 62) {
            this.field_n = (String) null;
          }
          var7.field_d[0] = param0;
          var8.field_d[param2.length()] = param1.a(param2) + param0;
          pf.a(param1, param2, 0, -19453, var8);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public bm() {
    }

    final void a(String param0, int param1, int param2, we param3, int param4) {
        mg var8 = null;
        int var7 = 0;
        if (param0 == null) {
          this.field_f = null;
          return;
        }
        if (param3 == this.field_m &&
          this.field_t &&
          this.field_l == 1 &&
          null != this.field_n &&
          this.field_n.equals(param0)) {
          return;
        }
        try {
          this.field_t = true;
          this.field_m = param3;
          this.field_l = 1;
          var8 = this.a(param2, param0, (byte) 87, param3);
          var7 = param3.a(param0);
          var8.field_d[0] = param4 - (var7 >> 1);
          if (param1 != 27994) {
            this.field_l = 113;
          }
          var8.field_d[param0.length()] = param4 + (var7 >> 1);
          pf.a(param3, param0, 0, -19453, var8);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_o = new ag();
        field_k = "Change display name";
        field_r = "Player";
    }
}
