/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends nc {
    static String field_l;
    static int[] field_m;
    static String field_o;
    static th field_n;

    public static void e(int param0) {
        field_o = null;
        field_n = null;
        field_l = null;
        field_m = null;
        if (param0 != 225) {
          field_l = (String) null;
        }
    }

    private final void a(int param0, int param1, fm param2, int param3, String param4, int param5, int param6, int param7, boolean param8, int param9, int param10) {
        String stackIn_10_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        try {
          var12_int = param6 + param10 + param7;
          if (0 != var12_int) {
            param10 = (var12_int + param10 * 200) / (var12_int * 2);
            param6 = (200 * param6 + var12_int) / (var12_int * 2);
            param7 = (var12_int + param7 * 200) / (var12_int * 2);
          }
          if (param1 != -1) {
            param2.a(param1 + 1 + ". ", 60, param9, param5, param3);
          }
          if ((param1 & 1) == 0) {
            oo.f(30, 3 + param9, 580, 1 + (param2.field_r + param2.field_C), 0, 64);
          }
          var14 = fm.a(param2, param4, 200);
          param2.c(var14, 60, param9, param5, param3);
          var15 = Integer.toString(param0);
          param2.b(var15, nq.field_q[1], param9, param5, param3);
          if (var12_int >= 500) {
            stackIn_10_0 = "500+";
          } else {
            stackIn_10_0 = Integer.toString(var12_int);
          }
          var16 = stackIn_10_0;
          var13 = var16;
          param2.b(var16, nq.field_q[2], param9, param5, param3);
          var17 = param10 + "%";
          if (param8) {
            fk.e(53);
          }
          param2.b(var17, nq.field_q[3], param9, param5, param3);
          var18 = param7 + "%";
          param2.b(var18, nq.field_q[4], param9, param5, param3);
          var19 = param6 + "%";
          param2.b(var19, nq.field_q[5], param9, param5, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_16_0 = var12;
          stackIn_16_1 = new StringBuilder().append("fk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final void a(boolean param0) {
        sl var2;
        int var3;
        String var4;
        ef var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var12;
        int var13;
        int var14;
        int var16;
        String[] var17;
        String var18;
        int stackIn_14_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_60_0 = 0;
        String[] var11;
        String[] var19;
        String var20;
        String var21;
        String[] var23;
        String var24;
        String var25;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime3;
        ef var5Lifetime1;
        ef var5Lifetime2;
        int[] var12Lifetime1;
        int[] var12Lifetime2;
        String[] var11Lifetime1;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        var2 = ah.field_e;
        var3 = ((fm) ((Object) var2)).field_C + ((fm) ((Object) var2)).field_r;
        if (mc.field_i != null) {
          L9: {
            if (wc.j(111)) {
              var4 = fq.field_j;
            } else {
              if (!mc.field_i.field_j) {
                var4 = op.field_l;
              } else {
                if (mc.field_i.field_t != null) {
                  var5 = pb.field_e;
                  var6 = ((fm) ((Object) var5)).field_r + ((fm) ((Object) var5)).field_C + 1;
                  var7 = var6 + 150;
                  var8 = 16777215;
                  var9 = 0;
                  oo.f(30, var7 - 35, 580, ((fm) ((Object) var2)).field_C + (((fm) ((Object) var2)).field_r + 1), 0, 64);
                  var10 = 11;
                  oo.f(30, -35 + var7, 186, 225, 0, 64);
                  oo.f(nq.field_q[2] - 58, -35 + var7, 111, 225, 0, 64);
                  oo.f(-32 + nq.field_q[4], var7 - 35, 65, 225, 0, 64);
                  ah.field_e.b(gn.field_C, nq.field_q[0], var7, var10, 1);
                  ah.field_e.b(ub.field_tb, nq.field_q[1], var7, var10, 1);
                  ah.field_e.b(ke.field_e, nq.field_q[2], var7, var10, 1);
                  ah.field_e.b("%W", nq.field_q[3], var7, var10, 1);
                  ah.field_e.b("%L", nq.field_q[4], var7, var10, 1);
                  ah.field_e.b("%D", nq.field_q[5], var7, var10, 1);
                  ak.a(586, 231, -5, 27, var7 - 38);
                  var7 = var7 + (4 + var6);
                  var4 = gb.field_d;
                  var17 = mc.field_i.field_t[sd.field_F];
                  var12 = mc.field_i.field_k[sd.field_F];
                  var13 = 0;
                  for (var14 = 0; var14 < 10; var14++) {
                    var18 = var17[var14];
                    if (var18 != null) {
                      if (!sf.a(1, var18)) {
                        stackIn_14_0 = ((var14 & 1) != 0) ? 4246528 : 16776992;
                        var8Lifetime5 = stackIn_14_0;
                      } else {
                        var8Lifetime5 = 16728064;
                        var13 = 1;
                      }
                      var4 = "";
                      this.a(var12[var14 * 4], var14, var5, var9, var18, var8Lifetime5, var12[2 + var14 * 4], var12[4 * var14 + 3], false, var7, var12[1 + 4 * var14]);
                    }
                    var7 = var7 + var6;
                  }
                  if ((var13 == 0)) {
                    var8Lifetime6 = 16777215;
                    var7 += 4;
                    this.a(mc.field_i.field_l, -1, var5, var9, ta.field_lb, var8Lifetime6, mc.field_i.field_o, mc.field_i.field_g, false, var7, mc.field_i.field_m);
                  }
                  break L9;
                }
                var4 = hk.field_g;
              }
            }
          }
          ((fm) ((Object) var2)).a(var4, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
        if (wc.j(114)) {
          L4: {
            if (wc.j(111)) {
              var4Lifetime1 = fq.field_j;
            } else {
              if (!mc.field_i.field_j) {
                var4Lifetime1 = op.field_l;
              } else {
                if (mc.field_i.field_t != null) {
                  var5Lifetime1 = pb.field_e;
                  var6Lifetime1 = ((fm) ((Object) var5Lifetime1)).field_r + ((fm) ((Object) var5Lifetime1)).field_C + 1;
                  var7Lifetime1 = var6Lifetime1 + 150;
                  var8Lifetime1 = 16777215;
                  var9Lifetime1 = 0;
                  oo.f(30, var7Lifetime1 - 35, 580, ((fm) ((Object) var2)).field_C + (((fm) ((Object) var2)).field_r + 1), 0, 64);
                  var10Lifetime1 = 11;
                  oo.f(30, -35 + var7Lifetime1, 186, 225, 0, 64);
                  oo.f(nq.field_q[2] - 58, -35 + var7Lifetime1, 111, 225, 0, 64);
                  oo.f(-32 + nq.field_q[4], var7Lifetime1 - 35, 65, 225, 0, 64);
                  ah.field_e.b(gn.field_C, nq.field_q[0], var7Lifetime1, var10Lifetime1, 1);
                  ah.field_e.b(ub.field_tb, nq.field_q[1], var7Lifetime1, var10Lifetime1, 1);
                  ah.field_e.b(ke.field_e, nq.field_q[2], var7Lifetime1, var10Lifetime1, 1);
                  ah.field_e.b("%W", nq.field_q[3], var7Lifetime1, var10Lifetime1, 1);
                  ah.field_e.b("%L", nq.field_q[4], var7Lifetime1, var10Lifetime1, 1);
                  ah.field_e.b("%D", nq.field_q[5], var7Lifetime1, var10Lifetime1, 1);
                  ak.a(586, 231, -5, 27, var7Lifetime1 - 38);
                  var7Lifetime1 = var7Lifetime1 + (4 + var6Lifetime1);
                  var4Lifetime1 = gb.field_d;
                  var19 = mc.field_i.field_t[sd.field_F];
                  var11 = var19;
                  var12Lifetime1 = mc.field_i.field_k[sd.field_F];
                  var13Lifetime1 = 0;
                  for (var14Lifetime1 = 0; var14Lifetime1 < 10; var14Lifetime1++) {
                    var20 = var19[var14Lifetime1];
                    if (var20 != null) {
                      if (!sf.a(1, var20)) {
                        stackIn_36_0 = ((var14Lifetime1 & 1) != 0) ? 4246528 : 16776992;
                        var8Lifetime1Lifetime1 = stackIn_36_0;
                      } else {
                        var8Lifetime1Lifetime1 = 16728064;
                        var13Lifetime1 = 1;
                      }
                      var4Lifetime1 = "";
                      this.a(var12Lifetime1[var14Lifetime1 * 4], var14Lifetime1, var5Lifetime1, var9Lifetime1, var20, var8Lifetime1Lifetime1, var12Lifetime1[2 + var14Lifetime1 * 4], var12Lifetime1[4 * var14Lifetime1 + 3], false, var7Lifetime1, var12Lifetime1[1 + 4 * var14Lifetime1]);
                    }
                    var7Lifetime1 = var7Lifetime1 + var6Lifetime1;
                  }
                  if ((var13Lifetime1 == 0)) {
                    var8Lifetime1Lifetime2 = 16777215;
                    var7Lifetime1 += 4;
                    this.a(mc.field_i.field_l, -1, var5Lifetime1, var9Lifetime1, ta.field_lb, var8Lifetime1Lifetime2, mc.field_i.field_o, mc.field_i.field_g, false, var7Lifetime1, mc.field_i.field_m);
                  }
                  break L4;
                }
                var4Lifetime1 = hk.field_g;
              }
            }
          }
          ((fm) ((Object) var2)).a(var4Lifetime1, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
        mc.field_i = qm.b(117, 7, 0, 10);
        if (wc.j(111)) {
          var4Lifetime2 = fq.field_j;
          ((fm) ((Object) var2)).a(var4Lifetime2, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
        if (!mc.field_i.field_j) {
          var25 = op.field_l;
          ((fm) ((Object) var2)).a(var25, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
        if (mc.field_i.field_t == null) {
          var21 = hk.field_g;
          ((fm) ((Object) var2)).a(var21, 40, 150, 560, 200, 0, -1, 1, 1, var3);
          return;
        }
        var5Lifetime2 = pb.field_e;
        var6Lifetime2 = ((fm) ((Object) var5Lifetime2)).field_r + ((fm) ((Object) var5Lifetime2)).field_C + 1;
        var7Lifetime2 = var6Lifetime2 + 150;
        var8Lifetime2 = 16777215;
        var9Lifetime2 = 0;
        oo.f(30, var7Lifetime2 - 35, 580, ((fm) ((Object) var2)).field_C + (((fm) ((Object) var2)).field_r + 1), 0, 64);
        var10Lifetime2 = 11;
        oo.f(30, -35 + var7Lifetime2, 186, 225, 0, 64);
        oo.f(nq.field_q[2] - 58, -35 + var7Lifetime2, 111, 225, 0, 64);
        oo.f(-32 + nq.field_q[4], var7Lifetime2 - 35, 65, 225, 0, 64);
        ah.field_e.b(gn.field_C, nq.field_q[0], var7Lifetime2, var10Lifetime2, 1);
        ah.field_e.b(ub.field_tb, nq.field_q[1], var7Lifetime2, var10Lifetime2, 1);
        ah.field_e.b(ke.field_e, nq.field_q[2], var7Lifetime2, var10Lifetime2, 1);
        ah.field_e.b("%W", nq.field_q[3], var7Lifetime2, var10Lifetime2, 1);
        ah.field_e.b("%L", nq.field_q[4], var7Lifetime2, var10Lifetime2, 1);
        ah.field_e.b("%D", nq.field_q[5], var7Lifetime2, var10Lifetime2, 1);
        ak.a(586, 231, -5, 27, var7Lifetime2 - 38);
        var7Lifetime2 = var7Lifetime2 + (4 + var6Lifetime2);
        var4Lifetime3 = gb.field_d;
        var23 = mc.field_i.field_t[sd.field_F];
        var11Lifetime1 = var23;
        var12Lifetime2 = mc.field_i.field_k[sd.field_F];
        var13Lifetime2 = 0;
        for (var14Lifetime2 = 0; var14Lifetime2 < 10; var14Lifetime2++) {
          var24 = var23[var14Lifetime2];
          if (var24 != null) {
            if (!sf.a(1, var24)) {
              stackIn_60_0 = ((var14Lifetime2 & 1) != 0) ? 4246528 : 16776992;
              var8Lifetime3 = stackIn_60_0;
            } else {
              var8Lifetime3 = 16728064;
              var13Lifetime2 = 1;
            }
            var4Lifetime3 = "";
            this.a(var12Lifetime2[var14Lifetime2 * 4], var14Lifetime2, var5Lifetime2, var9Lifetime2, var24, var8Lifetime3, var12Lifetime2[2 + var14Lifetime2 * 4], var12Lifetime2[4 * var14Lifetime2 + 3], false, var7Lifetime2, var12Lifetime2[1 + 4 * var14Lifetime2]);
          }
          var7Lifetime2 = var7Lifetime2 + var6Lifetime2;
        }
        if (var13Lifetime2 == 0) {
          var8Lifetime4 = 16777215;
          var7Lifetime2 += 4;
          this.a(mc.field_i.field_l, -1, var5Lifetime2, var9Lifetime2, ta.field_lb, var8Lifetime4, mc.field_i.field_o, mc.field_i.field_g, false, var7Lifetime2, mc.field_i.field_m);
        }
        ((fm) ((Object) var2)).a(var4Lifetime3, 40, 150, 560, 200, 0, -1, 1, 1, var3);
        return;
    }

    private final int c(byte param0, int param1) {
        String var3 = null;
        String var3Lifetime1;
        if (param0 == -95) {
          var3 = we.field_g[this.field_j[param1]];
          return 20 + ah.field_e.a(var3);
        }
        field_m = (int[]) null;
        var3Lifetime1 = we.field_g[this.field_j[param1]];
        return 20 + ah.field_e.a(var3Lifetime1);
    }

    final int d(int param0, int param1) {
        this.field_i = 50;
        if (param0 >= -65) {
          field_l = (String) null;
        }
        this.field_a = -this.field_i + 640;
        if (!wc.j(91) &&
          param1 < 2) {
          if (param1 != 0) {
            return this.field_a;
          }
          return this.field_i + this.c((byte) -95, 0);
        }
        if (param1 == 0) {
          return 450;
        }
        return 640;
    }

    fk(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final static void a(int param0, int param1, boolean param2, ja[] param3, int param4) {
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
        ug var11 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 != null &&
            param1 > 0) {
            var5_int = param3[0].field_z;
            var6 = param3[2].field_z;
            var7 = param3[1].field_z;
            param3[0].g(param0, param4);
            param3[2].g(-var6 + (param1 + param0), param4);
            oo.a(ki.field_d);
            oo.e(var5_int + param0, param4, -var6 + param0 + param1, param4 + param3[1].field_u);
            var8 = var5_int + param0;
            var9 = param0 + param1 - var6;
            for (param0 = var8; param0 < var9; param0 = param0 + var7) {
              param3[1].g(param0, param4);
            }
            oo.b(ki.field_d);
            if (!param2) {
              var11 = (ug) null;
              fk.a((ug) null, false);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(ug param0, boolean param1) {
        try {
          ih.a(param1, 256, param0);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        this.field_i = 50;
        if (param0 != -118) {
          field_o = (String) null;
        }
        this.field_a = -this.field_i + 640;
        if (!wc.j(96) &&
          param1 < 2) {
          if (0 != param1) {
            return this.field_a - this.c((byte) -95, 1);
          }
          return this.field_i;
        }
        if (param1 != 0) {
          return 450;
        }
        return 0;
    }

    final void b(byte param0) {
        if (param0 != 69) {
          field_l = (String) null;
          mc.field_i = null;
          return;
        }
        mc.field_i = null;
    }

    static {
        field_m = new int[8192];
        field_o = "Starve them.";
        field_l = "Deadly";
        field_n = new th();
    }
}
