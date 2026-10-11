/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends ne {
    private int field_m;
    static String field_l;
    private fa field_k;
    static String field_h;
    private String field_j;
    static volatile boolean field_e;
    static int field_g;
    private int field_r;
    private int field_i;
    private int field_n;
    private boolean field_p;
    static String[] field_o;
    static int field_f;
    private int field_q;

    public static void a(int param0) {
        field_l = null;
        field_o = null;
        field_h = null;
        if (param0 >= -89) {
          rh var2 = (rh) null;
          j.a((rh) null, (rh) null, -107, (rh) null);
        }
    }

    final static int a(int param0, int param1, String param2, String param3, byte param4, String param5, boolean param6) {
        ad var7 = null;
        RuntimeException var7_ref = null;
        ad var8 = null;
        int var9 = 0;
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
          var7 = new ad(param5);
          var8 = new ad(param3);
          var9 = -9 / ((param4 + 67) / 33);
          stackIn_1_0 = ak.a(param1, 15021, param6, var7, param0, param2, var8);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("j.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, String param3, fa param4) {
        pi var7 = null;
        pi var8 = null;
        if (param3 == null) {
          this.field_c = null;
          return;
        }
        if (param4 == this.field_k &&
          this.field_p &&
          this.field_n == 2 &&
          null != this.field_j &&
          this.field_j.equals(param3)) {
          return;
        }
        try {
          this.field_n = 2;
          this.field_k = param4;
          this.field_p = true;
          this.field_j = param3;
          var7 = this.a(param3, (byte) -74, param1, param4);
          var8 = var7;
          var8.field_d[param2] = param0 - param4.b(param3);
          var7.field_d[param3.length()] = param0;
          cd.a(param3, param4, var8, param2 + 30988, 0);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "j.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(rh param0, rh param1, int param2, rh param3) {
        dd var17 = null;
        bi[] var5 = null;
        bi[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        bi[] var14 = null;
        int var11_int = 0;
        dd var15 = null;
        dd var18 = null;
        dd var11 = null;
        dd var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = fleas.field_A ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        uh.field_m = of.a("frame_top", "commonui", param0, 101);
        ki.field_c = of.a("frame_bottom", "commonui", param0, 85);
        if (param2 != 31760) {
          return;
        }
        try {
          ha.field_i = kl.a(252, param0, "commonui", "jagex_logo_grey");
          ng.field_h = of.a("button", "commonui", param0, 61);
          t.field_h = bg.a("validation", param0, (byte) 7, "commonui");
          nb.field_c = (fa) ((Object) fi.a(param0, param1, "commonui", "arezzo12", (byte) 82));
          ug.field_e = (fa) ((Object) fi.a(param0, param1, "commonui", "arezzo14", (byte) 82));
          rg.field_o = (fa) ((Object) fi.a(param0, param1, "commonui", "arezzo14bold", (byte) 82));
          var17 = new dd(param3.a(0, "", "button.gif"), (java.awt.Component) ((Object) ol.field_e));
          hm.a("dropdown", param0, (byte) -42, "commonui");
          var5 = fb.a(param0, (byte) 45, "commonui", "screen_options");
          k.field_c = new bi[4];
          lg.field_c = new bi[4];
          hh.field_a = new bi[4];
          var6 = new bi[][]{lg.field_c, k.field_c, hh.field_a};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_k[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            bi[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = uk.a((byte) 84, var19[var11_int], var5[var9]);
            }
          }
          var9Lifetime1 = var17.field_t;
          we.a(-111);
          var17.f();
          gb.e(0, 0, gb.field_d, gb.field_k);
          var15 = new dd(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.f();
          var17.f(0, 0);
          var11 = new dd(var9Lifetime1, var9Lifetime1);
          var11.f();
          var17.f(-var17.field_w + var9Lifetime1, 0);
          var12 = new dd(var17.field_w - 2 * var9Lifetime1, var9Lifetime1);
          var12.f();
          var17.f(-var9Lifetime1, 0);
          ia.a(-125);
          ng.field_h = new dd[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "j.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fa param0, int param1, String param2, int param3, int param4) {
        int var7 = 0;
        pi var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_k == param0 &&
            this.field_p &&
            this.field_n == 1 &&
            null != this.field_j &&
            this.field_j.equals(param2)) {
            return;
          }
          this.field_k = param0;
          this.field_p = true;
          this.field_n = 1;
          var8 = this.a(param2, (byte) -74, param4, param0);
          var7 = param0.b(param2);
          var8.field_d[0] = param3 - (var7 >> 1);
          var8.field_d[param2.length()] = param3 + (var7 >> 1);
          cd.a(param2, param0, var8, 30988, 0);
          if (param1 <= 45) {
            this.field_r = 7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("j.D(");
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
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final pi a(String param0, byte param1, int param2, fa param3) {
        pi var5 = null;
        RuntimeException var5_ref = null;
        rh var6 = null;
        pi var7 = null;
        pi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -74) {
            var6 = (rh) null;
            j.a((rh) null, (rh) null, -66, (rh) null);
          }
          var7 = new pi(param2 - param3.field_H, param3.field_K + param2, param0.length());
          var5 = var7;
          this.field_c = new pi[]{var7};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("j.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, fa param3, String param4, int param5, int param6, int param7) {
        pi stackIn_38_0;
        pi stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        pi stackIn_39_0 = null;
        pi stackIn_39_1 = null;
        int stackIn_39_4 = 0;
        String stackIn_43_0;
        fa stackIn_43_1;
        pi stackIn_43_2;
        int stackIn_43_3;
        int stackIn_44_4;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        pi var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = fleas.field_A ? 1 : 0;
        try {
          if (0 == param1) {
            param1 = param3.field_N;
          }
          if (param4 == null) {
            this.field_c = null;
            return;
          }
          if (this.field_k == param3 &&
            !this.field_p &&
            param2 == this.field_n &&
            this.field_i == param6 &&
            param1 == this.field_m &&
            param7 == this.field_r &&
            param5 == this.field_q &&
            this.field_j != null &&
            this.field_j.equals(param4)) {
            return;
          }
          this.field_r = param7;
          this.field_k = param3;
          this.field_j = param4;
          this.field_p = false;
          this.field_m = param1;
          this.field_n = param2;
          this.field_i = param6;
          this.field_q = param5;
          if (!param0) {
            return;
          }
          var16 = new String[1 + param3.a(param4, param5)];
          var17 = var16;
          var10 = Math.max(1, param3.a(param4, new int[]{param5}, var17));
          if (this.field_i == 3 &&
            var10 == 1) {
            this.field_i = 1;
          }
          if (this.field_i == 0) {
            var11 = param3.field_H;
          } else {
            if (this.field_i != 1) {
              if (this.field_i == 2) {
                var11 = -(this.field_m * var10) + this.field_r - param3.field_K;
              } else {
                var12 = (this.field_r - var10 * this.field_m) / (var10 + 1);
                if (0 > var12) {
                  var12 = 0;
                }
                var11 = var12 + param3.field_H;
                this.field_m = this.field_m + var12;
              }
            } else {
              var11 = param3.field_H + (this.field_r - var10 * this.field_m >> 1);
            }
          }
          this.field_c = new pi[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_38_0 = null;
            stackIn_38_1 = null;
            stackIn_38_2 = var11 - param3.field_H;
            stackIn_38_3 = var11 + param3.field_K;
            if (var13 != null) {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = var13.length();
            } else {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = 0;
            }
            var14 = new pi(stackIn_38_2, stackIn_38_3, stackIn_39_4);
            var14.field_d[0] = 0;
            if (var13 != null) {
              var14.field_d[var13.length()] = param3.b(var13);
              stackIn_43_0 = var13;
              stackIn_43_1 = (fa) (param3);
              stackIn_43_2 = var14;
              stackIn_43_3 = 30988;
              if (param2 != 3) {
                stackIn_44_4 = 0;
              } else {
                stackIn_44_4 = this.a(param3.b(var13), var13, 0, param5);
              }
              cd.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_44_4);
            }
            var11 = var11 + param1;
            this.field_c[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_49_0 = var9;
          stackIn_49_1 = new StringBuilder().append("j.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param4 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(String param0, int param1, fa param2, boolean param3, int param4) {
        pi var7 = null;
        pi var8 = null;
        if (param0 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_k == param2 &&
          this.field_p &&
          this.field_n == 0 &&
          null != this.field_j &&
          this.field_j.equals(param0)) {
          return;
        }
        try {
          this.field_n = 0;
          this.field_k = param2;
          this.field_p = param3 ? true : false;
          this.field_j = param0;
          var7 = this.a(param0, (byte) -74, param4, param2);
          var8 = var7;
          var7.field_d[0] = param1;
          var8.field_d[param0.length()] = param2.b(param0) + param1;
          cd.a(param0, param2, var8, 30988, 0);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "j.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public j() {
    }

    static {
        field_l = "<%0>Green Switches:<%1> cause all the recessed walls to slide out and become normal wall blocks. Warning: fleas standing in the way are crushed and die!";
        field_h = "Left slope: ";
        field_e = true;
        field_f = 0;
    }
}
