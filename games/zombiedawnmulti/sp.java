/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends mp {
    private int field_j;
    private int field_m;
    static boolean field_h;
    private boolean field_o;
    private fm field_f;
    static int field_g;
    private int field_n;
    private int field_k;
    private int field_l;
    private String field_i;

    private final td a(fm param0, String param1, int param2, int param3) {
        td var5 = null;
        RuntimeException var5_ref = null;
        td var6 = null;
        td stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            this.field_j = -34;
          }
          var6 = new td(param2 - param0.field_C, param2 + param0.field_r, param1.length());
          var5 = var6;
          this.field_e = new td[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("sp.L(");
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
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, String param3, fm param4) {
        td var8 = null;
        td var9 = null;
        if (param3 == null) {
          this.field_e = null;
          return;
        }
        if (this.field_f == param4 && this.field_o && this.field_m == 2 && this.field_i != null &&
          this.field_i.equals(param3)) {
          return;
        }
        try {
          this.field_m = 2;
          this.field_o = param2 ? true : false;
          this.field_i = param3;
          this.field_f = param4;
          var8 = this.a(param4, param3, param1, 1);
          var9 = var8;
          var9.field_e[0] = -param4.a(param3) + param0;
          var9.field_e[param3.length()] = param0;
          qd.a(param4, 0, param3, 109, var9);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sp.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, fm param2, String param3, int param4) {
        td var8 = null;
        td var9 = null;
        if (param3 == null) {
          this.field_e = null;
          return;
        }
        if (param2 == this.field_f && this.field_o && this.field_m == 0 && this.field_i != null &&
          this.field_i.equals(param3)) {
          return;
        }
        try {
          this.field_o = true;
          this.field_m = 0;
          this.field_i = param3;
          int var7 = -125 / ((-24 - param1) / 46);
          this.field_f = param2;
          var8 = this.a(param2, param3, param4, 1);
          var9 = var8;
          var8.field_e[0] = param0;
          var9.field_e[param3.length()] = param0 + param2.a(param3);
          qd.a(param2, 0, param3, 116, var9);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sp.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void c(int param0) {
        nb.field_a.h(param0 ^ -123);
        if (pj.field_I == null) {
          pj.field_I = new ta(nb.field_a, pm.field_P);
        }
        if (param0 != 0) {
          java.awt.Frame var2 = (java.awt.Frame) null;
          sp.a((go) null, -50, (java.awt.Frame) null);
        }
        nb.field_a.b(param0 + 3016, pj.field_I);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6, fm param7) {
        td stackIn_37_0;
        td stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        td stackIn_38_0 = null;
        td stackIn_38_1 = null;
        int stackIn_38_4 = 0;
        fm stackIn_42_0 = null;
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
        td var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param4 > -16) {
            return;
          }
          if (param3 == 0) {
            param3 = param7.field_w;
          }
          if (param0 == null) {
            this.field_e = null;
            return;
          }
          if (param7 == this.field_f &&
            !this.field_o &&
            this.field_m == param1 &&
            this.field_j == param5 &&
            this.field_n == param3 &&
            param2 == this.field_l &&
            param6 == this.field_k &&
            null != this.field_i &&
            this.field_i.equals(param0)) {
            return;
          }
          this.field_l = param2;
          this.field_j = param5;
          this.field_k = param6;
          this.field_f = param7;
          this.field_i = param0;
          this.field_n = param3;
          this.field_o = false;
          this.field_m = param1;
          var16 = new String[param7.b(param0, param6) + 1];
          var17 = var16;
          var10 = Math.max(1, param7.a(param0, new int[]{param6}, var17));
          if (this.field_j == 3 &&
            var10 == 1) {
            this.field_j = 1;
          }
          this.field_e = new td[var10];
          if (this.field_j == 0) {
            var11 = param7.field_C;
          } else {
            if (this.field_j != 1) {
              if (2 != this.field_j) {
                var12 = (-(this.field_n * var10) + this.field_l) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_n = this.field_n + var12;
                var11 = param7.field_C + var12;
              } else {
                var11 = -(this.field_n * var10) - param7.field_r + this.field_l;
              }
            } else {
              var11 = param7.field_C + (this.field_l - var10 * this.field_n >> 1);
            }
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_37_0 = null;
            stackIn_37_1 = null;
            stackIn_37_2 = -param7.field_C + var11;
            stackIn_37_3 = var11 + param7.field_r;
            if (var13 != null) {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = var13.length();
            } else {
              stackIn_38_0 = null;
              stackIn_38_1 = null;
              stackIn_38_4 = 0;
            }
            var14 = new td(stackIn_37_2, stackIn_37_3, stackIn_38_4);
            var14.field_e[0] = 0;
            if (var13 != null) {
              var14.field_e[var13.length()] = param7.a(var13);
              stackIn_42_0 = (fm) (param7);
              if (param1 != 3) {
                stackIn_43_1 = 0;
              } else {
                stackIn_43_1 = this.a(var13, 0, param7.a(var13), param6);
              }
              qd.a(stackIn_42_0, stackIn_43_1, var13, 120, var14);
            }
            this.field_e[var12Lifetime1] = var14;
            var11 = var11 + param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("sp.O(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final void a(fm param0, String param1, int param2, byte param3, int param4) {
        td var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_e = null;
          return;
        }
        if (this.field_f == param0 && this.field_o && this.field_m == 1 && this.field_i != null &&
          this.field_i.equals(param1)) {
          return;
        }
        try {
          this.field_m = 1;
          this.field_f = param0;
          this.field_o = true;
          if (param3 != 65) {
            this.field_o = false;
          }
          var8 = this.a(param0, param1, param2, 1);
          var7 = param0.a(param1);
          var8.field_e[0] = param4 - (var7 >> 1);
          var8.field_e[param1.length()] = param4 + (var7 >> 1);
          qd.a(param0, 0, param1, param3 ^ 61, var8);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sp.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(go param0, int param1, java.awt.Frame param2) {
        di var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(param2, true);
            while (0 == var3.field_f) {
              vd.a(false, 10L);
            }
            if (1 != var3.field_f) {
              vd.a(false, 100L);
              continue;
            }
            break;
          }
          if (param1 != 1) {
            return;
          }
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("sp.N(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public sp() {
    }

    static {
        field_h = true;
    }
}
