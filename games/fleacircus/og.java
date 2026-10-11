/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends gj implements dc, da {
    private ja field_H;
    private bb field_G;
    private ua field_F;

    private final String j(int param0) {
        String discarded$0 = null;
        if (param0 != 0) {
          discarded$0 = this.j(113);
        }
        return "</col></u>";
    }

    private final String a(int param0) {
        if (param0 > -78) {
          this.field_H = (ja) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        if (param3 != 248) {
          return;
        }
        try {
          if (param4 == this.field_G) {
            ih.l(255);
            this.field_F.n(-22645);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "og.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, dd[] param1, int param2, int param3, int param4, int param5) {
        int var22 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = fleas.field_A ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (0 < param5 &&
            param4 > 0) {
            if (null == param1[3]) {
              stackIn_9_0 = 0;
            } else {
              stackIn_9_0 = param1[3].field_x;
            }
            var6_int = stackIn_9_0;
            if (param1[5] != null) {
              stackIn_12_0 = param1[5].field_x;
            } else {
              stackIn_12_0 = 0;
            }
            var7 = stackIn_12_0;
            if (param1[1] != null) {
              stackIn_15_0 = param1[1].field_r;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (null != param1[7]) {
              stackIn_18_0 = param1[7].field_r;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param3 + param5;
            var11 = param0 + param4;
            var13 = -77 % ((22 - param2) / 54);
            var12 = param3 + var6_int;
            var14 = var10 - var7;
            var15 = param0 + var8;
            var16 = var11 - var9;
            var17 = var12;
            var18 = var14;
            if (var17 > var18) {
              var18 = param5 * var6_int / (var6_int + var7) + param3;
              var17 = param5 * var6_int / (var6_int + var7) + param3;
            }
            var19 = var15;
            var20 = var16;
            if (var20 < var19) {
              var20 = param4 * var8 / (var8 + var9) + param0;
              var19 = param4 * var8 / (var8 + var9) + param0;
            }
            gb.a(il.field_f);
            if (null != param1[0]) {
              gb.g(param3, param0, var17, var19);
              param1[0].d(param3, param0);
              gb.b(il.field_f);
            }
            if (null != param1[2]) {
              gb.g(var18, param0, var10, var19);
              param1[2].d(var14, param0);
              gb.b(il.field_f);
            }
            if (param1[6] != null) {
              gb.g(param3, var20, var17, var11);
              param1[6].d(param3, var16);
              gb.b(il.field_f);
            }
            if (null != param1[8]) {
              gb.g(var18, var20, var10, var11);
              param1[8].d(var14, var16);
              gb.b(il.field_f);
            }
            if (null != param1[1] &&
              param1[1].field_x != 0) {
              gb.g(var17, param0, var18, var19);
              for (var21 = var12; var21 < var14; var21 = var21 + param1[1].field_x) {
                param1[1].d(var21, param0);
              }
              gb.b(il.field_f);
            }
            if (param1[7] != null &&
              param1[7].field_x != 0) {
              gb.g(var17, var20, var18, var11);
              for (var21Lifetime1 = var12; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param1[7].field_x) {
                param1[7].d(var21Lifetime1, var16);
              }
              gb.b(il.field_f);
            }
            if (null != param1[3] &&
              param1[3].field_r != 0) {
              gb.g(param3, var19, var17, var20);
              for (var21Lifetime2 = var15; var21Lifetime2 < var16; var21Lifetime2 = var21Lifetime2 + param1[3].field_r) {
                param1[3].d(param3, var21Lifetime2);
              }
              gb.b(il.field_f);
            }
            if (param1[5] != null &&
              param1[5].field_r != 0) {
              gb.g(var18, var19, var10, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param1[5].field_r) {
                param1[5].d(var14, var21Lifetime3);
              }
              gb.b(il.field_f);
            }
            if (null != param1[4] &&
              param1[4].field_x != 0) {
              if (param1[4].field_r == 0) {
                return;
              }
              gb.g(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param1[4].field_r) {
                for (var22 = var12; var22 < var14; var22 = var22 + param1[4].field_x) {
                  param1[4].d(var22, var21Lifetime4);
                }
              }
              gb.b(il.field_f);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("og.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
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
            stackIn_7_0 = this.b(param2, -28533);
            return stackIn_7_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_10_0 = this.a(32, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("og.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    og(ua param0) {
        super(0, 0, 288, 0, (ch) null);
        String var7 = null;
        int var3 = 0;
        e var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_F = param0;
          this.field_G = new bb(ee.field_k, (kd) null);
          this.field_G.field_p = (ch) ((Object) new ri());
          var7 = db.a(oh.field_jb, new String[]{this.a(-115), this.j(0)}, true);
          var3 = 20;
          var4 = new e(ug.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ug.field_e.field_H, -1, 2147483647, true);
          this.field_H = new ja(var7, var4);
          this.field_H.field_m = "";
          this.field_H.a(0, pi.field_f, 0);
          this.field_H.a(0, pi.field_f, 1);
          this.field_H.field_u = -40 + this.field_u;
          this.field_H.field_s = (kd) (this);
          this.field_H.b(this.field_u - 40, 26, var3, -9);
          var3 = var3 + (15 + this.field_H.field_j);
          this.a((qa) (this.field_H), (byte) -55);
          var5 = 4;
          var6 = 200;
          this.field_G.a(-var6 + 300 >> 1, var6, var3, 40, 80);
          this.field_G.field_s = (kd) (this);
          this.a((qa) (this.field_G), (byte) -70);
          this.a(0, 300, 0, var3 - (-55 - var5), 80);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, ja param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          var5_int = -79 % ((param3 + 36) / 61);
          if (0 != param0) {
            if (param0 != 1) {
              if (param0 == 2) {
                lk.a(-15493, "conduct.ws");
              }
            } else {
              lk.a(-15493, "privacy.ws");
            }
          } else {
            lk.a(-15493, "terms.ws");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("og.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
