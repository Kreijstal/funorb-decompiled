/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends lq {
    static String field_k;
    static String field_m;
    private ru field_l;
    tf field_j;
    gq field_i;

    final int d() {
        return 0;
    }

    final lq b() {
        da var1;
        while (true) {
          var1 = (da) (this.field_j.c(33));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_F) {
            return (lq) ((Object) var1.field_F);
          }
        }
    }

    final lq c() {
        da var1 = (da) (this.field_j.g(24009));
        if (var1 == null) {
          return null;
        }
        if (var1.field_F != null) {
          return (lq) ((Object) var1.field_F);
        }
        return this.b();
    }

    final void a(int param0) {
        int var2;
        da var3;
        int var4;
        boolean stackIn_3_0 = false;
        var4 = Kickabout.field_G;
        this.field_i.a(param0);
        var3 = (da) (this.field_j.g(24009));
        while (var3 != null) {
          stackIn_3_0 = this.field_l.a(-25102, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_3_0) {
            var2 = param0;
            while (var3.field_B < var2) {
              this.a(var3.field_B, var3, (byte) -105);
              var2 = var2 - var3.field_B;
              if (this.field_l.a(-123, var2, 0, var3, (int[]) null)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var2, var3, (byte) 46);
              var3.field_B = var3.field_B - var2;
            }
          }
          var3 = (da) (this.field_j.c(33));
        }
    }

    private final void a(int param0, da param1, byte param2) {
        ru stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        da stackIn_7_2 = null;
        boolean stackIn_8_3;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = 65 / ((-22 - param2) / 49);
          if ((4 & this.field_l.field_i[param1.field_q]) != 0 &&
            param1.field_s < 0) {
            var5 = this.field_l.field_o[param1.field_q] / uh.field_i;
            var6 = (1048575 + var5 - param1.field_r) / var5;
            param1.field_r = param0 * var5 + param1.field_r & 1048575;
            if (var6 <= param0) {
              if (this.field_l.field_s[param1.field_q] == 0) {
                param1.field_F = vm.b(param1.field_y, param1.field_F.e(), param1.field_F.m(), param1.field_F.k());
              } else {
                param1.field_F = vm.b(param1.field_y, param1.field_F.e(), 0, param1.field_F.k());
                stackIn_7_0 = this.field_l;
                stackIn_7_1 = false;
                stackIn_7_2 = (da) (param1);
                stackIn_8_3 = !(param1.field_g.field_r[param1.field_e] >= 0);
                ((ru) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_8_3);
              }
              if (0 > param1.field_g.field_r[param1.field_e]) {
                param1.field_F.g(-1);
              }
              param0 = param1.field_r / var5;
            }
          }
          param1.field_F.a(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("pp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        da var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Kickabout.field_G;
        try {
          this.field_i.a(param0, param1, param2);
          var6 = (da) (this.field_j.g(24009));
          while (var6 != null) {
            stackIn_4_0 = this.field_l.a(-25102, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_B) {
                this.a(0, var6.field_B, var4_int, param0, var6, var5 + var4_int);
                var4_int = var4_int + var6.field_B;
                var5 = var5 - var6.field_B;
                if (this.field_l.a(-30, var5, var4_int, var6, param0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(0, var5, var4_int, param0, var6, var5 + var4_int);
                var6.field_B = var6.field_B - var5;
              }
            }
            var6 = (da) (this.field_j.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pp.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 18267) {
            pp.b(-60);
          }
          if (null != wm.field_u) {
            wm.field_u.field_L.a(param1, -48);
          }
          if (ki.field_n != null) {
            ki.field_n.field_G.a(param1, -71);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("pp.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$14 = 0;
        int incrementValue$13 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        ut stackIn_9_0 = null;
        ut stackIn_15_0 = null;
        oh[] stackIn_25_0;
        int stackIn_25_1;
        oh stackIn_25_2;
        oh stackIn_25_3;
        oh stackIn_26_2 = null;
        oh stackIn_26_3 = null;
        ut stackIn_26_4 = null;
        oh[] stackIn_28_0;
        int stackIn_28_1;
        oh stackIn_28_2;
        oh stackIn_28_3;
        oh stackIn_29_2;
        oh stackIn_29_3;
        ut stackIn_29_4;
        ut stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        ut var2 = null;
        int var2_int = 0;
        ut var3 = null;
        ut var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ut var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ut var11 = null;
        ut var12 = null;
        ut var13 = null;
        ut var14 = null;
        ut var3Lifetime1;
        ut var7Lifetime1;
        ut var13Lifetime1;
        ut var7Lifetime2;
        ut var13Lifetime2;
        ut var7Lifetime1Lifetime1;
        ut var7Lifetime1Lifetime2;
        ut var7Lifetime1Lifetime3;
        ut var7Lifetime1Lifetime4;
        ut var7Lifetime1Lifetime5;
        ut var7Lifetime1Lifetime6;
        ut var7Lifetime1Lifetime7;
        ut var7Lifetime1Lifetime8;
        int var2_intLifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var5Lifetime2;
        var10 = Kickabout.field_G;
        try {
          if (param0 != 1) {
            return;
          }
          if (0 == rm.field_C) {
            oi.field_e = new oh[34];
            var1_int = 0;
            incrementValue$3 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$3] = new oh(ao.field_c, -100, -100);
            incrementValue$4 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$4] = new oh(pi.field_a, 60, -180);
            incrementValue$5 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$5] = new oh(ng.field_j[0], 280, -280);
            incrementValue$6 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$6] = new oh(ao.field_c, -190, 1184);
            incrementValue$7 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$7] = new oh(pi.field_a, -280, 994);
            incrementValue$8 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$8] = new oh(pi.field_a, -160, 1047);
            incrementValue$9 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$9] = new oh(ng.field_j[0], 660, -260);
            incrementValue$10 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$10] = new oh(ng.field_j[1], 800, -240);
            for (var2_int = 0; var2_int < 8; var2_int++) {
              if (p.a((byte) -24, 2) == 1) {
                stackIn_9_0 = ng.field_j[0];
              } else {
                stackIn_9_0 = ng.field_j[1];
              }
              var11 = stackIn_9_0;
              var13 = var11;
              var7 = var13;
              var13Lifetime2 = var11;
              var3 = var11;
              var4_int = el.a(29430, 70, -220);
              var5 = el.a(29430, 10, var2_int * 110 - 20);
              incrementValue$14 = var1_int;
              var1_int++;
              oi.field_e[incrementValue$14] = new oh(var11, var4_int, var5);
            }
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              if (p.a((byte) -24, 2) != 1) {
                stackIn_15_0 = ng.field_j[1];
              } else {
                stackIn_15_0 = ng.field_j[0];
              }
              var12 = stackIn_15_0;
              var7Lifetime2 = var12;
              var7Lifetime2 = var12;
              var3Lifetime1 = var12;
              var4_intLifetime1 = el.a(29430, 70, 976);
              var5Lifetime2 = el.a(29430, 1, -200 + 100 * var2_intLifetime1);
              incrementValue$13 = var1_int;
              var1_int++;
              oi.field_e[incrementValue$13] = new oh(var12, var4_intLifetime1, var5Lifetime2);
            }
            incrementValue$11 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$11] = new oh(ng.field_j[0], 650, 1354);
            incrementValue$12 = var1_int;
            var1_int++;
            oi.field_e[incrementValue$12] = new oh(ng.field_j[1], 800, 1364);
            return;
          }
          if (rm.field_C == 1) {
            var13Lifetime1 = bn.field_E[0];
            var7Lifetime1 = var13Lifetime1;
            var7Lifetime1Lifetime1 = var13Lifetime1;
            var2 = bn.field_E[1];
            var7Lifetime1Lifetime2 = var2;
            var7Lifetime1Lifetime3 = var2;
            var14 = bn.field_E[2];
            var7Lifetime1Lifetime4 = var14;
            var7Lifetime1Lifetime5 = var14;
            var4 = bn.field_E[3];
            var7Lifetime1Lifetime6 = var4;
            var7Lifetime1Lifetime7 = var4;
            oi.field_e = new oh[28];
            var5Lifetime1 = 0;
            for (var6 = 0; var6 < 8; var6++) {
              var7_int = el.a(param0 + 29429, 20, -170);
              var8 = -50 + var6 / 2 * 400;
              if ((1 & var6) != 0) {
                var8 = var8 + el.a(29430, 20, 120);
              }
              incrementValue$1 = var5Lifetime1;
              var5Lifetime1++;
              stackIn_25_0 = oi.field_e;
              stackIn_25_1 = incrementValue$1;
              stackIn_25_2 = null;
              stackIn_25_3 = null;
              if (var6 != 0) {
                stackIn_26_2 = null;
                stackIn_26_3 = null;
                stackIn_26_4 = var13Lifetime1;
              } else {
                stackIn_26_2 = null;
                stackIn_26_3 = null;
                stackIn_26_4 = var2;
              }
              stackIn_25_0[stackIn_25_1] = new oh(stackIn_26_4, var7_int, var8);
              incrementValue$2 = var5Lifetime1;
              var5Lifetime1++;
              stackIn_28_0 = oi.field_e;
              stackIn_28_1 = incrementValue$2;
              stackIn_28_2 = null;
              stackIn_28_3 = null;
              if (var6 != 0) {
                stackIn_29_2 = null;
                stackIn_29_3 = null;
                stackIn_29_4 = var14;
              } else {
                stackIn_29_2 = null;
                stackIn_29_3 = null;
                stackIn_29_4 = var4;
              }
              stackIn_28_0[stackIn_28_1] = new oh(stackIn_29_4, 896 - var7_int - 20, var8);
            }
            for (var6Lifetime1 = 0; var6Lifetime1 < 12; var6Lifetime1++) {
              if (p.a((byte) -24, 2) == 0) {
                stackIn_35_0 = ng.field_j[0];
              } else {
                stackIn_35_0 = ng.field_j[1];
              }
              var7Lifetime1Lifetime8 = stackIn_35_0;
              var8Lifetime1 = el.a(29430, 50, 130 * var6Lifetime1 - 300);
              var9 = el.a(29430, 50, -290);
              if ((1 & var6Lifetime1) == 0) {
                var9 += 1674;
              }
              incrementValue$0 = var5Lifetime1;
              var5Lifetime1++;
              oi.field_e[incrementValue$0] = new oh(var7Lifetime1Lifetime8, var8Lifetime1, var9);
            }
          } else {
            if (rm.field_C == 2) {
              oi.field_e = new oh[9];
              oi.field_e[0] = new oh(ng.field_j[0], -345, 132);
              oi.field_e[1] = new oh(ng.field_j[1], -157, 510);
              oi.field_e[2] = new oh(ng.field_j[1], -170, 1294);
              oi.field_e[3] = new oh(ng.field_j[0], -245, 1384);
              oi.field_e[4] = new oh(ng.field_j[0], 690, -220);
              oi.field_e[5] = new oh(ng.field_j[1], 1086, 910);
              oi.field_e[6] = new oh(ng.field_j[0], 920, 1294);
              oi.field_e[7] = new oh(tm.field_w, -150, 940);
              oi.field_e[8] = new oh(tm.field_w, 925, 214);
              return;
            }
            if (rm.field_C != 3) {
              return;
            }
            oi.field_e = new oh[]{};
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "pp.H(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int[] param3, da param4, int param5) {
        ru stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        da stackIn_11_2 = null;
        boolean stackIn_12_3;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vm var11 = null;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          if ((this.field_l.field_i[param4.field_q] & 4) != param0 &&
            0 > param4.field_s) {
            var7_int = this.field_l.field_o[param4.field_q] / uh.field_i;
            while (true) {
              var8 = (var7_int + 1048575 - param4.field_r) / var7_int;
              if (param1 < var8) {
                param4.field_r = param4.field_r + param1 * var7_int;
                break;
              }
              param4.field_F.a(param3, param2, var8);
              param1 = param1 - var8;
              param4.field_r = param4.field_r + (var7_int * var8 - 1048576);
              param2 = param2 + var8;
              var9 = uh.field_i / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param4.field_F;
              if (this.field_l.field_s[param4.field_q] != 0) {
                param4.field_F = vm.b(param4.field_y, var11.e(), 0, var11.k());
                stackIn_11_0 = this.field_l;
                stackIn_11_1 = false;
                stackIn_11_2 = (da) (param4);
                stackIn_12_3 = !(0 <= param4.field_g.field_r[param4.field_e]);
                ((ru) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
                param4.field_F.c(var9, var11.m());
              } else {
                param4.field_F = vm.b(param4.field_y, var11.e(), var11.m(), var11.k());
              }
              if (param4.field_g.field_r[param4.field_e] < 0) {
                param4.field_F.g(-1);
              }
              var11.e(var9);
              var11.a(param3, param2, -param2 + param5);
              if (!var11.n()) {
                continue;
              }
              this.field_i.a(var11);
            }
          }
          param4.field_F.a(param3, param2, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("pp.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_k = null;
        if (param0) {
          field_k = (String) null;
        }
    }

    pp(ru param0) {
        this.field_j = new tf();
        this.field_i = new gq();
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "pp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "click to";
        field_m = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
