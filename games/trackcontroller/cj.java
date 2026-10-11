/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends rb {
    private int field_f;
    private int field_m;
    private int field_g;
    static le field_e;
    private int field_i;
    private boolean field_l;
    private oh field_n;
    static ja field_j;
    private int field_h;
    private String field_k;
    static lj field_o;

    private final va a(oh param0, int param1, String param2, int param3) {
        va var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        va var7 = null;
        va stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new va(param3 - param0.field_G, param3 + param0.field_u, param2.length());
          var5 = var7;
          var6 = -63 % ((param1 - 45) / 59);
          this.field_b = new va[]{var7};
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("cj.N(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2, oh param3, int param4) {
        va var8 = null;
        va var9 = null;
        if (param1 == null) {
          this.field_b = null;
          return;
        }
        if (param3 == this.field_n &&
          this.field_l &&
          2 == this.field_m &&
          this.field_k != null &&
          this.field_k.equals(param1)) {
          return;
        }
        try {
          this.field_n = param3;
          this.field_l = true;
          this.field_m = 2;
          this.field_k = param1;
          if (param0 != -19121) {
            this.field_l = false;
          }
          var8 = this.a(param3, 115, param1, param2);
          var9 = var8;
          var9.field_b[0] = param4 - param3.a(param1);
          var9.field_b[param1.length()] = param4;
          id.$cfr$intArgs$a$1fdf1ca47e3f(-119, 0, param3, param1, var9);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "cj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 4) {
          return;
        }
        field_j = null;
        field_o = null;
        field_e = null;
    }

    final void a(oh param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        va stackIn_37_0;
        va stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        va stackIn_38_0 = null;
        va stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        va var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = TrackController.field_F ? 1 : 0;
        try {
          if (0 == param4) {
            param4 = param0.field_q;
          }
          if (param6 == null) {
            this.field_b = null;
            return;
          }
          if (this.field_n == param0 &&
            !this.field_l &&
            param2 == this.field_m &&
            param7 == this.field_f &&
            param4 == this.field_g &&
            param3 == this.field_h &&
            this.field_i == param5 &&
            this.field_k != null &&
            this.field_k.equals(param6)) {
            return;
          }
          this.field_k = param6;
          this.field_l = false;
          this.field_h = param3;
          this.field_i = param5;
          this.field_g = param4;
          if (param1 <= 40) {
            this.field_h = -116;
          }
          this.field_n = param0;
          this.field_m = param2;
          this.field_f = param7;
          var16 = new String[param0.b(param6, param5) + 1];
          var17 = var16;
          var10 = Math.max(1, param0.a(param6, new int[]{param5}, var17));
          if (this.field_f == 3 &&
            var10 == 1) {
            this.field_f = 1;
          }
          this.field_b = new va[var10];
          if (this.field_f == 0) {
            var11 = param0.field_G;
          } else {
            if (this.field_f != 1) {
              if (this.field_f == 2) {
                var11 = -(this.field_g * var10) - param0.field_u + this.field_h;
              } else {
                var12 = (-(var10 * this.field_g) + this.field_h) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_g = this.field_g + var12;
                var11 = param0.field_G + var12;
              }
            } else {
              var11 = param0.field_G + (-(this.field_g * var10) + this.field_h >> 1);
            }
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param0.field_G + var11;
            stackIn_37_3 = param0.field_u + var11;
            if (var13 != null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            }
            var14 = new va(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_b[0] = 0;
            if (var13 != null) {
              var14.field_b[var13.length()] = param0.a(var13);
              stackIn_42_0 = -123;
              if (param2 != 3) {
                stackIn_43_1 = 0;
              } else {
                stackIn_43_1 = this.a(param0.a(var13), var13, 5, param5);
              }
              id.$cfr$intArgs$a$1fdf1ca47e3f(stackIn_42_0, stackIn_43_1, param0, var13, var14);
            }
            var11 = var11 + param4;
            this.field_b[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("cj.Q(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        nk.field_l = param2;
        if (!param0) {
          cj.e(-89);
        }
        j.field_c = param1;
    }

    final static void a(int param0, boolean param1) {
        la var2 = ra.field_C;
        var2.c(param0, 7);
        var2.a(1, (byte) -104);
        var2.a(0, (byte) -88);
        if (param1) {
          field_e = (le) null;
        }
    }

    final static void d(int param0) {
        qj var1 = null;
        qj var2 = null;
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        try {
          var1 = new qj(540, 140);
          mb.a((byte) 124, var1);
          ig.a();
          ll.a();
          fb.field_a = 0;
          be.a((byte) -108);
          var2 = var1.b();
          if (param0 <= 81) {
            field_e = (le) null;
          }
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            ll.a(4, 4, 0, 0, 540, 140);
          }
          ha.field_E.a();
          var1.d(0, 0);
          ch.m(124);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "cj.R(" + param0 + ')');
        }
    }

    public cj() {
    }

    final void a(int param0, int param1, oh param2, int param3, String param4) {
        va var7 = null;
        va var8 = null;
        if (param0 != 1888) {
          this.field_g = -104;
        }
        if (param4 == null) {
          this.field_b = null;
          return;
        }
        if (this.field_n == param2 &&
          this.field_l &&
          this.field_m == 0 &&
          this.field_k != null &&
          this.field_k.equals(param4)) {
          return;
        }
        try {
          this.field_l = true;
          this.field_k = param4;
          this.field_m = 0;
          this.field_n = param2;
          var7 = this.a(param2, -103, param4, param1);
          var8 = var7;
          var7.field_b[0] = param3;
          var8.field_b[param4.length()] = param2.a(param4) + param3;
          id.$cfr$intArgs$a$1fdf1ca47e3f(-121, 0, param2, param4, var8);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "cj.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, oh param1, String param2, int param3, int param4) {
        va var8 = null;
        int var7 = 0;
        if (param2 == null) {
          this.field_b = null;
          return;
        }
        if (param1 == this.field_n && this.field_l && this.field_m == 1 && this.field_k != null &&
          this.field_k.equals(param2)) {
          return;
        }
        try {
          this.field_n = param1;
          if (param0 <= 73) {
            cj.a(false, -40, 22);
          }
          this.field_m = 1;
          this.field_l = true;
          var8 = this.a(param1, 117, param2, param3);
          var7 = param1.a(param2);
          var8.field_b[0] = param4 - (var7 >> 1);
          var8.field_b[param2.length()] = (var7 >> 1) + param4;
          id.$cfr$intArgs$a$1fdf1ca47e3f(-125, 0, param1, param2, var8);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "cj.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_e = new le();
        field_j = new ja();
        field_o = new lj();
    }
}
