/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends ob {
    static vk field_N;
    static int field_K;
    static int field_M;
    static int[] field_L;
    static nl field_J;
    static int[] field_I;
    static String field_H;

    final void e(int param0) {
        int var3;
        var3 = Pool.field_O;
        if (param0 != -34) {
          field_J = (nl) null;
        }
        if (!hk.b(10)) {
          if (qi.field_a == 96) {
            if (this.field_B.field_h > 0) {
              if (this.field_B.field_h != 2) {
                this.field_B.a(0, (byte) 1);
              }
            } else {
              this.field_B.a(1, (byte) 1);
            }
          }
          if (qi.field_a == 97) {
            if (this.field_B.field_h == 1) {
              this.field_B.a(0, (byte) 1);
            } else {
              if (this.field_B.field_h != 2) {
                this.field_B.a(1, (byte) 1);
              }
            }
          }
          if (qi.field_a == 99) {
            if (0 <= this.field_B.field_h &&
              1 >= this.field_B.field_h) {
              this.field_B.a(2, (byte) 1);
            } else {
              this.field_B.a(eo.field_Lb, (byte) 1);
            }
          }
          if (qi.field_a == 98) {
            if (this.field_B.field_h == 2) {
              this.field_B.a(eo.field_Lb, (byte) 1);
            } else {
              this.field_B.a(2, (byte) 1);
            }
            this.field_B.a(false);
          } else {
            this.field_B.a(eo.field_Lb, (byte) 1);
          }
        } else {
          super.e(-34);
        }
    }

    tl(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(em.field_M, param0, param1, param2, param3, param4, param5);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        int var10_int = param3 + (param2 + param1);
        if (0 != var10_int) {
          param1 = (200 * param1 + var10_int) / (var10_int * 2);
          param3 = (200 * param3 + var10_int) / (var10_int * 2);
          param2 = (200 * param2 + var10_int) / (var10_int * 2);
        }
        if (param5 < 90) {
          return;
        }
        try {
          if (param0 != -1) {
            sa.field_h.c(param0 + 1 + ". ", 90, param7, param6, -1);
          }
          sa.field_h.d(param8, 95, param7, param6, -1);
          var12 = Integer.toString(param4);
          sa.field_h.b(var12, se.field_i[0], param7, param6, -1);
          var13 = var10_int >= 50 ? "50+" : Integer.toString(var10_int);
          String var11 = var13;
          sa.field_h.b(var13, se.field_i[1], param7, param6, -1);
          var14 = param1 + "%";
          sa.field_h.b(var14, se.field_i[2], param7, param6, -1);
          var15 = param2 + "%";
          sa.field_h.b(var15, se.field_i[3], param7, param6, -1);
          var16 = param3 + "%";
          sa.field_h.b(var16, se.field_i[4], param7, param6, -1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tl.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 69) {
          field_N = (vk) null;
        }
        if (!hk.b(-114) &&
          param1 < 2) {
          return 24;
        }
        return 36;
    }

    final static int h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var1_int = 0;
          while (n.h(param0 + 119)) {
            un.field_f.e(-15525);
            if (!un.field_f.b((byte) 119)) {
              continue;
            }
            var1_int = 1;
          }
          un.field_f.a(un.a(-49, ua.field_o, lq.field_W), un.a(-49, gg.field_f, wn.field_i), -30);
          if (un.field_f.b((byte) 99)) {
            var1_int = 1;
          }
          var2 = 0;
          if (param0 != 8) {
            tl.d(-51, true);
          }
          if (var1_int != 0 &&
            un.field_f.field_h >= 0) {
            var2 = ui.field_V[un.field_f.field_h];
            if (var2 == 2) {
              ra.a((byte) -108);
            }
          }
          stackIn_13_0 = var2;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "tl.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        try {
          if (param14 >= 0 &&
            param2 < fb.field_o) {
            if (param7 < 0 &&
              param5 < 0 &&
              param6 < 0) {
              return;
            }
            if (param7 >= fb.field_k &&
              param5 >= fb.field_k &&
              fb.field_k <= param6) {
              return;
            }
            var34 = param14 - param2;
            if (param2 != param1) {
              var30 = param4 << 16;
              var29 = param4 << 16;
              var22 = param12 << 16;
              var21 = param12 << 16;
              var26 = param13 << 16;
              var25 = param13 << 16;
              var18 = param7 << 16;
              var17_int = param7 << 16;
              var35 = -param2 + param1;
              var20 = (param6 - param7 << 16) / var34;
              var19 = (param5 - param7 << 16) / var35;
              if (var20 <= var19) {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var31 = (-param4 + param3 << 16) / var34;
                var27 = (param15 - param13 << 16) / var34;
                var32 = (-param4 + param0 << 16) / var35;
                var28 = (-param13 + param9 << 16) / var35;
                var24 = (param8 - param12 << 16) / var35;
                var23 = (param11 - param12 << 16) / var34;
              } else {
                var24 = (param11 - param12 << 16) / var34;
                var31 = (param0 - param4 << 16) / var35;
                var33 = 0;
                var28 = (param15 - param13 << 16) / var34;
                var23 = (-param12 + param8 << 16) / var35;
                var32 = (-param4 + param3 << 16) / var34;
                var27 = (param9 - param13 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param2) {
                if (param1 < 0) {
                  param2 = param1 - param2;
                  var25 = var25 + var27 * param2;
                  var30 = var30 + var32 * param2;
                  var26 = var26 + var28 * param2;
                  var29 = var29 + param2 * var31;
                  var18 = var18 + var20 * param2;
                  var22 = var22 + var24 * param2;
                  var17_int = var17_int + var19 * param2;
                  var21 = var21 + param2 * var23;
                  param2 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var25 = var25 + var27 * param2;
                  var18 = var18 + param2 * var20;
                  var29 = var29 + param2 * var31;
                  var17_int = var17_int + var19 * param2;
                  var30 = var30 + var32 * param2;
                  var26 = var26 + param2 * var28;
                  var22 = var22 + var24 * param2;
                  var21 = var21 + var23 * param2;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = fb.field_m[param2];
                while (param1 > param2) {
                  var37 = var17_int >> 16;
                  if (fb.field_k > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var38 + var37 >= fb.field_k) {
                        var38 = -1 + (fb.field_k - var37);
                      }
                      if (var37 >= 0) {
                        ng.a(var29, var25, var40, var36Lifetime2 + var37, (byte) -117, var41, var21, var38, param16, var39);
                      } else {
                        ng.a(-(var37 * var41) + var29, -(var40 * var37) + var25, var40, var36Lifetime2, (byte) -117, var41, var21 - var39 * var37, var37 + var38, param16, var39);
                      }
                    } else {
                      if (var37 >= 0 &&
                        var37 < fb.field_k) {
                        ng.a(var29, var25, 0, var36Lifetime2 + var37, (byte) -117, 0, var21, var38, param16, 0);
                      }
                    }
                  }
                  param2++;
                  if (fb.field_o <= param2) {
                    return;
                  }
                  var17_int = var17_int + var19;
                  var29 = var29 + var31;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var26 = var26 + var28;
                  var18 = var18 + var20;
                  var22 = var22 + var24;
                  var36Lifetime2 = var36Lifetime2 + qh.field_l;
                }
              }
              var36Lifetime3 = -param1 + param14;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param6 << 16;
                var38Lifetime2 = param11 << 16;
                var39Lifetime2 = param15 << 16;
                var40Lifetime2 = param3 << 16;
                if (var33 == 0) {
                  var21 = param8 << 16;
                  var25 = param9 << 16;
                  var17_int = param5 << 16;
                  var29 = param0 << 16;
                } else {
                  var18 = param5 << 16;
                  var22 = param8 << 16;
                  var30 = param0 << 16;
                  var26 = param9 << 16;
                }
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
              } else {
                var28 = 0;
                var19 = 0;
                var27 = 0;
                var31 = 0;
                var20 = 0;
                var24 = 0;
                var23 = 0;
                var32 = 0;
              }
            } else {
              if (param2 == param14) {
                var18 = param5 << 16;
                var30 = param0;
                var24 = 0;
                var26 = param9;
                var19 = 0;
                var32 = 0;
                var21 = param12;
                var23 = 0;
                var28 = 0;
                var22 = param8;
                var20 = 0;
                var27 = 0;
                var17_int = param7 << 16;
                var31 = 0;
                var25 = param13;
                var29 = param4;
              } else {
                var35 = param14 - param1;
                if (param5 > param7) {
                  var18 = param5 << 16;
                  var23 = (-param12 + param11 << 16) / var34;
                  var27 = (param15 - param13 << 16) / var34;
                  var30 = param0 << 16;
                  var20 = (-param5 + param6 << 16) / var35;
                  var24 = (-param8 + param11 << 16) / var35;
                  var19 = (-param7 + param6 << 16) / var34;
                  var31 = (-param4 + param3 << 16) / var34;
                  var29 = param4 << 16;
                  var26 = param9 << 16;
                  var25 = param13 << 16;
                  var32 = (param3 - param0 << 16) / var35;
                  var22 = param8 << 16;
                  var21 = param12 << 16;
                  var17_int = param7 << 16;
                  var28 = (-param9 + param15 << 16) / var35;
                } else {
                  var31 = (-param0 + param3 << 16) / var35;
                  var22 = param12 << 16;
                  var25 = param9 << 16;
                  var17_int = param5 << 16;
                  var20 = (-param7 + param6 << 16) / var34;
                  var28 = (param15 - param13 << 16) / var34;
                  var19 = (param6 - param5 << 16) / var35;
                  var32 = (-param4 + param3 << 16) / var34;
                  var18 = param7 << 16;
                  var30 = param4 << 16;
                  var29 = param0 << 16;
                  var26 = param13 << 16;
                  var27 = (param15 - param9 << 16) / var35;
                  var21 = param8 << 16;
                  var24 = (param11 - param12 << 16) / var34;
                  var23 = (-param8 + param11 << 16) / var35;
                }
              }
              var33 = 0;
              if (param2 < 0) {
                param2 = Math.min(-param2, -param2 + param1);
                var22 = var22 + param2 * var24;
                var26 = var26 + var28 * param2;
                var30 = var30 + var32 * param2;
                var25 = var25 + param2 * var27;
                var21 = var21 + var23 * param2;
                var18 = var18 + var20 * param2;
                var29 = var29 + param2 * var31;
                var17_int = var17_int + var19 * param2;
                param2 = 0;
              }
            }
            if (param2 < 0) {
              param2 = -param2;
              var21 = var21 + param2 * var23;
              var18 = var18 + param2 * var20;
              var30 = var30 + var32 * param2;
              var22 = var22 + var24 * param2;
              var26 = var26 + param2 * var28;
              var29 = var29 + param2 * var31;
              var25 = var25 + param2 * var27;
              var17_int = var17_int + param2 * var19;
              param2 = 0;
            }
            var35Lifetime1 = fb.field_m[param2];
            if (param10 != -49) {
              field_J = (nl) null;
            }
            while (param14 > param2) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < fb.field_k) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 == var37Lifetime1) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < fb.field_k) {
                    ng.a(var29, var25, 0, var36Lifetime1 + var35Lifetime1, (byte) -117, 0, var21, var37Lifetime1, param16, 0);
                  }
                } else {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (fb.field_k <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + fb.field_k - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    ng.a(-(var40Lifetime1 * var36Lifetime1) + var29, var25 - var36Lifetime1 * var39Lifetime1, var39Lifetime1, var35Lifetime1, (byte) -117, var40Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, var37Lifetime1 + var36Lifetime1, param16, var38Lifetime1);
                  } else {
                    ng.a(var29, var25, var39Lifetime1, var35Lifetime1 + var36Lifetime1, (byte) -117, var40Lifetime1, var21, var37Lifetime1, param16, var38Lifetime1);
                  }
                }
              }
              param2++;
              if (fb.field_o <= param2) {
                return;
              }
              var26 = var26 + var28;
              var22 = var22 + var24;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var30 = var30 + var32;
              var21 = var21 + var23;
              var35Lifetime1 = var35Lifetime1 + qh.field_l;
              var18 = var18 + var20;
              var29 = var29 + var31;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("tl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
          field_H = (String) null;
        }
        field_N = null;
        field_I = null;
        field_L = null;
        field_H = null;
        field_J = null;
    }

    final static void a(int param0, kh param1, int param2, boolean param3) {
        uo dupTemp$0 = null;
        int var17_int = 0;
        int var24 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        uo stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        uo stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        uo stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        uo stackIn_79_0 = null;
        byte stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        boolean stackIn_82_1 = false;
        uo stackIn_87_0 = null;
        boolean stackIn_87_1 = false;
        boolean stackIn_88_2 = false;
        uo stackIn_92_0 = null;
        boolean stackIn_93_1 = false;
        int stackIn_97_0 = 0;
        uo stackIn_112_0 = null;
        boolean stackIn_113_1 = false;
        uo stackIn_116_0 = null;
        boolean stackIn_117_1 = false;
        uo stackIn_120_0 = null;
        boolean stackIn_121_1 = false;
        uo stackIn_124_0 = null;
        boolean stackIn_125_1 = false;
        String stackIn_141_0 = null;
        uo stackIn_146_0 = null;
        boolean stackIn_147_1 = false;
        uo stackIn_149_0 = null;
        boolean stackIn_150_1 = false;
        int stackIn_156_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_215_0 = 0;
        uo stackIn_320_0 = null;
        boolean stackIn_320_1 = false;
        boolean stackIn_321_2 = false;
        uo stackIn_324_0 = null;
        boolean stackIn_325_1 = false;
        int stackIn_328_1 = 0;
        byte stackIn_328_2 = 0;
        int stackIn_328_3 = 0;
        uo stackIn_330_0 = null;
        boolean stackIn_331_1 = false;
        uo stackIn_335_0 = null;
        boolean stackIn_336_1 = false;
        RuntimeException stackIn_344_0 = null;
        StringBuilder stackIn_344_1 = null;
        String stackIn_345_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        uo[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        uo var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        uo var28 = null;
        uo var29 = null;
        uo[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        Object var25Lifetime1;
        String var25_refLifetime1;
        Object var25Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var16Lifetime2;
        var26 = Pool.field_O;
        try {
          if (param3) {
            stackIn_12_0 = (kh.field_Ac) ? 0 : 1;
            var4_int = stackIn_12_0;
          } else {
            if (cj.e((byte) 85)) {
              stackIn_8_0 = (!param1.field_ec) ? 1 : 0;
            } else {
              stackIn_8_0 = 0;
            }
            var4_int = stackIn_8_0;
          }
          var5 = 0;
          if (!param3) {
            for (var6 = 0; 5 > var6; var6++) {
              if (var4_int != 0 &&
                mc.field_f[0][var6 + 1].field_R != 0 &&
                var6 != param1.field_ac) {
                param1.field_ac = var6;
                var5 = 1;
              }
              stackIn_22_0 = mc.field_f[0][var6 + 1];
              stackIn_23_1 = (var4_int != 0);
              stackIn_22_0.field_pb = stackIn_23_1;
              if (!tq.field_p &&
                3 == var6) {
                mc.field_f[0][var6 + 1].field_pb = false;
              }
              stackIn_29_0 = mc.field_f[0][var6 + 1];
              stackIn_30_1 = (param1.field_ac == var6);
              stackIn_29_0.field_Ib = stackIn_30_1;
            }
            if (mc.field_f[0][2].field_db) {
              if (cj.e((byte) 85)) {
                kk.field_B = rq.field_r;
              } else {
                kk.field_B = nr.a(new String[]{em.field_L.field_Ob}, -1, ep.field_v);
              }
            }
          }
          if (dg.field_T.length >= 2) {
            if (param3) {
              stackIn_43_0 = (od.field_d != -1) ? 1 : 0;
            } else {
              stackIn_43_0 = 0;
            }
            var6Lifetime1 = stackIn_43_0;
            if (var6Lifetime1 != 0) {
              var7 = od.field_d;
              for (var8_int = 0; var8_int < md.field_c.length; var8_int++) {
                md.field_c[var8_int] = (byte) 0;
              }
              md.field_c[var7 / 8] = (byte)md.a((int) md.field_c[var7 / 8], 1 << var7 % 8);
            }
            stackIn_51_0 = (param3) ? -1 : 0;
            for (var7 = stackIn_51_0; dg.field_T.length > var7; var7++) {
              if (var6Lifetime1 != 0) {
                stackIn_59_0 = (var7 != od.field_d) ? 1 : 0;
              } else {
                stackIn_59_0 = 0;
              }
              var8_intLifetime1 = stackIn_59_0;
              if (var4_int != 0 &&
                mc.field_f[1][var7 + 1].field_R != 0) {
                if (!param3) {
                  var9 = dg.field_T[var7];
                  if (var9 != param1.field_Nb) {
                    param1.field_Nb = var9;
                    var5 = 1;
                  }
                } else {
                  if (var6Lifetime1 == 0) {
                    if (var7 == -1) {
                      for (var9 = 0; md.field_c.length > var9; var9++) {
                        md.field_c[var9] = (byte) 0;
                      }
                    } else {
                      md.field_c[var7 / 8] = (byte)cq.a((int) md.field_c[var7 / 8], 1 << rb.b(var7, 7));
                    }
                  }
                }
              }
              if (param3) {
                if (var7 == -1) {
                  mc.field_f[1][var7 + 1].field_Ib = true;
                  for (var9 = 0; var9 < dg.field_T.length; var9++) {
                    dupTemp$0 = mc.field_f[1][1 + var7];
                    stackIn_87_0 = dupTemp$0;
                    stackIn_87_1 = dupTemp$0.field_Ib;
                    stackIn_88_2 = ((md.field_c[var9 / 8] & 1 << (7 & var9)) == 0);
                    stackIn_87_0.field_Ib = stackIn_87_1 & stackIn_88_2;
                  }
                } else {
                  stackIn_79_0 = mc.field_f[1][1 + var7];
                  stackIn_79_1 = md.field_c[var7 / 8];
                  stackIn_79_2 = 1 << (7 & var7);
                  stackIn_82_1 = ((stackIn_79_1 & stackIn_79_2) != 0);
                  stackIn_79_0.field_Ib = stackIn_82_1;
                }
              } else {
                var9 = dg.field_T[var7];
                stackIn_74_0 = mc.field_f[1][var7 + 1];
                stackIn_75_1 = (var9 == param1.field_Nb);
                stackIn_74_0.field_Ib = stackIn_75_1;
              }
              stackIn_92_0 = mc.field_f[1][1 + var7];
              stackIn_93_1 = (var4_int != 0) && (var8_intLifetime1 == 0);
              stackIn_92_0.field_pb = stackIn_93_1;
            }
          }
          stackIn_97_0 = (!param3) ? 1 : 0;
          for (var6Lifetime2 = stackIn_97_0; var6Lifetime2 < 3; var6Lifetime2++) {
            var28 = mc.field_f[2][var6Lifetime2];
            if (var4_int != 0 &&
              var28.field_R != 0) {
              if (!param3) {
                if (param1.field_Yb != var6Lifetime2) {
                  var5 = 1;
                  param1.field_Yb = var6Lifetime2;
                }
              } else {
                if (var6Lifetime2 == 0) {
                  mc.field_l = 0;
                } else {
                  mc.field_l = mc.field_l ^ var6Lifetime2;
                }
              }
            }
            if (!param3) {
              stackIn_120_0 = var28;
              stackIn_121_1 = ((var6Lifetime2 & param1.field_Yb) != 0);
              stackIn_120_0.field_Ib = stackIn_121_1;
            } else {
              if (0 == var6Lifetime2) {
                stackIn_116_0 = var28;
                stackIn_117_1 = (0 == mc.field_l);
                stackIn_116_0.field_Ib = stackIn_117_1;
              } else {
                stackIn_112_0 = var28;
                stackIn_113_1 = ((mc.field_l & var6Lifetime2) != 0);
                stackIn_112_0.field_Ib = stackIn_113_1;
              }
            }
            stackIn_124_0 = var28;
            stackIn_125_1 = (var4_int != 0);
            stackIn_124_0.field_pb = stackIn_125_1;
          }
          if (param3 &&
            1 < ji.field_g) {
            for (var6Lifetime3 = 0; ji.field_g + 1 > var6Lifetime3; var6Lifetime3++) {
              var29 = mc.field_f[3][var6Lifetime3];
              if (var4_int != 0 &&
                var29.field_R != 0) {
                pm.field_l = var6Lifetime3;
              }
              if (var29.field_db &&
                var6Lifetime3 > 0) {
                if (null != wp.field_f) {
                  stackIn_141_0 = wp.field_f[-1 + var6Lifetime3];
                } else {
                  stackIn_141_0 = null;
                }
                var8 = stackIn_141_0;
                if (var8 != null) {
                  kk.field_B = var8;
                }
              }
              stackIn_146_0 = var29;
              stackIn_147_1 = (var4_int != 0);
              stackIn_146_0.field_pb = stackIn_147_1;
              stackIn_149_0 = var29;
              stackIn_150_1 = (pm.field_l == var6Lifetime3);
              stackIn_149_0.field_Ib = stackIn_150_1;
            }
          }
          var6Lifetime4 = 0;
          for (var7 = param2; var7 < dr.field_c; var7++) {
            var30 = mc.field_f[4 + var7];
            var8_array = var30;
            stackIn_156_0 = (param3) ? -1 : 0;
            for (var9 = stackIn_156_0; -1 + var30.length > var9; var9++) {
              var10 = 0;
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              if (var4_int != 0 &&
                var9 >= 0) {
                if (op.field_a != null &&
                  op.field_a[var7] != null &&
                  (~eq.field_S & op.field_a[var7][var9]) > 0) {
                  var14 = 1;
                  var15 = s.a(op.field_a[var7][var9] & ~eq.field_S, (byte) 87);
                }
                if (dl.field_j != null &&
                  null != dl.field_j[var7] &&
                  mp.field_V <= 0 &&
                  dl.field_j[var7][var9]) {
                  var10 = 1;
                }
                if (ci.field_d != null &&
                  ci.field_d[var7] != null) {
                  var16 = ci.field_d[var7][var9];
                  if (0 < var16 &&
                    mg.field_d < var16) {
                    var12 = 1;
                  }
                  if (var16 != 0 &&
                    !rg.field_s &&
                    0 >= mp.field_V) {
                    var10 = 1;
                  }
                }
                if (param3) {
                  if (ca.field_j != null) {
                    if (null != ca.field_j[var7]) {
                      stackIn_192_0 = (!ca.field_j[var7][var9]) ? 0 : 1;
                    } else {
                      stackIn_192_0 = 0;
                    }
                  } else {
                    stackIn_192_0 = 0;
                  }
                } else {
                  stackIn_192_0 = 0;
                }
                var13 = stackIn_192_0;
                if (null != w.field_j &&
                  w.field_j[var7] != null) {
                  var16Lifetime2 = w.field_j[var7][var9];
                  if (var16Lifetime2 != 0 &&
                    !rg.field_s &&
                    mp.field_V <= 0) {
                    var10 = 1;
                  }
                  if (var16Lifetime2 > 0 &&
                    og.field_I < var16Lifetime2) {
                    var11 = 1;
                  }
                }
              }
              if (2 <= hq.field_i &&
                vj.field_c[12]) {
                var12 = 0;
                var11 = 0;
                var14 = 0;
                var13 = 0;
                var10 = 0;
              }
              qk.field_b = true;
              if (var10 == 0 &&
                var11 == 0 &&
                var12 == 0 &&
                var13 == 0) {
                if (var14 == 0) {
                  stackIn_215_0 = 0;
                } else {
                  stackIn_215_0 = 1;
                }
              } else {
                stackIn_215_0 = 1;
              }
              var16Lifetime1 = stackIn_215_0;
              if (var16Lifetime1 == 0 &&
                0 <= var9 &&
                we.field_m != null && (!param3 ||
                !kh.field_Ac)) {
                qk.field_b = false;
                if (dk.field_j == null) {
                  dk.field_j = new byte[dr.field_c];
                  gf.field_b = new boolean[dr.field_c];
                }
                ln.field_p = false;
                for (var17_int = 0; var7 > var17_int; var17_int++) {
                  gf.field_b[var17_int] = false;
                }
                sh.a(0, var7, var9, false, param1, -1, -1, param3);
                if (2 <= hq.field_i &&
                  vj.field_c[12]) {
                  qk.field_b = true;
                }
                if (!qk.field_b) {
                  var16Lifetime1 = 1;
                }
              }
              var17 = var8_array[var9 + 1];
              if (var4_int != 0 &&
                var17.field_R != 0) {
                if (param3) {
                  if (var9 == -1) {
                    for (var18 = var6Lifetime4; var18 < -1 + var6Lifetime4 + var30.length; var18++) {
                      ka.field_s[var18 / 8] = (byte)rb.b((int) ka.field_s[var18 / 8], ~(1 << rb.b(7, var18)));
                    }
                  } else {
                    ka.field_s[(var9 + var6Lifetime4) / 8] = (byte)cq.a((int) ka.field_s[(var9 + var6Lifetime4) / 8], 1 << rb.b(var9 + var6Lifetime4, 7));
                  }
                } else {
                  if (var16Lifetime1 == 0 &&
                    param1.field_tc[var7] != (byte)var9) {
                    param1.field_tc[var7] = (byte)var9;
                    var5 = 1;
                  }
                }
              }
              if (param3 &&
                var16Lifetime1 != 0) {
                ka.field_s[(var9 + var6Lifetime4) / 8] = (byte)rb.b((int) ka.field_s[(var9 + var6Lifetime4) / 8], ~(1 << rb.b(var9 + var6Lifetime4, 7)));
              }
              if (var9 >= 0 &&
                var17.field_db) {
                if (null == mj.field_c) {
                  var18_ref = null;
                } else {
                  if (mj.field_c[var7] != null) {
                    var18_ref = mj.field_c[var7][var9];
                  } else {
                    var18_ref = null;
                  }
                }
                if (null == ir.field_p) {
                  var19 = null;
                } else {
                  if (null != ir.field_p[var7]) {
                    var19 = ir.field_p[var7][var9];
                  } else {
                    var19 = null;
                  }
                }
                var20 = null;
                if (var19 != null &&
                  !((String) (var19)).equals(var18_ref)) {
                  var20 = var19;
                }
                var21 = null;
                if (var13 != 0) {
                  var21 = he.field_a;
                  var22 = var21;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var25 = var21;
                  var22 = var25;
                  var25 = var22;
                  var22 = var25;
                  var21 = var22;
                  var22 = var25;
                } else {
                  if (var10 == 0) {
                    if (var11 != 0) {
                      var22_int = -og.field_I + w.field_j[var7][var9];
                      if (var22_int == 1) {
                        var21 = kb.field_b;
                      } else {
                        var21 = nr.a(new String[]{Integer.toString(var22_int)}, -1, cr.field_s);
                      }
                    }
                    if (var12 != 0) {
                      var31 = nr.a(new String[]{Integer.toString(mg.field_d), Integer.toString(ci.field_d[var7][var9])}, -1, sm.field_E);
                      var22 = var31;
                      var25 = var22;
                      var22 = var25;
                      var21 = var22;
                      var25_ref = var31;
                      var22 = var25_ref;
                      if (var21 == null) {
                        var21 = var31;
                      } else {
                        var21 = (String) (var21) + "<br>" + var31;
                      }
                    }
                    if (var14 != 0) {
                      var22 = dk.field_a;
                      if (0 < var15 &&
                        null != fg.field_f &&
                        var15 <= fg.field_f.length &&
                        null != fg.field_f[var15 - 1]) {
                        var22 = fg.field_f[-1 + var15][0];
                      }
                      if (var21 != null) {
                        var21 = (String) (var21) + "<br>" + (String) (var22);
                      } else {
                        var21 = var22;
                      }
                    }
                  } else {
                    var21 = lk.field_t;
                  }
                }
                if (var4_int != 0 &&
                  !qk.field_b) {
                  var22 = null;
                  if (ln.field_p) {
                    var22 = "</col>" + ab.field_h + "<col=A00000>";
                    var25Lifetime1 = var22;
                    var22 = var25Lifetime1;
                    var25Lifetime1Lifetime1 = var22;
                    var22 = var25Lifetime1Lifetime1;
                    var21 = var22;
                  }
                  var23 = 0;
                  for (var24 = 0; var7 > var24; var24++) {
                    if (gf.field_b[var24]) {
                      var25_refLifetime1 = "</col>" + ck.field_R[var24] + "<col=A00000>";
                      var22 = var25_refLifetime1;
                      var21 = var22;
                      var22 = var25_refLifetime1;
                      if (var22 != null) {
                        var23 = 1;
                        var22 = (String) (var22) + ", " + var25_refLifetime1;
                        var21 = var22;
                        var21 = var22;
                      } else {
                        var22 = var25_refLifetime1;
                      }
                    }
                  }
                  if (var23 != 0) {
                    var21 = bg.field_b + (String) (var22);
                  } else {
                    var21 = nr.a(new String[]{(String) (var22)}, ~param2, ka.field_t);
                  }
                }
                if (var21 != null) {
                  var32 = "<col=A00000>" + (String) (var21);
                  var33 = ug.a("<br>", "<br><col=A00000>", var32, -1);
                  if (var20 == null) {
                    var20 = var33;
                  } else {
                    var20 = (String) (var20) + "<br>" + var33;
                  }
                }
                if (var20 != null) {
                  kk.field_B = (String) (var20);
                }
              }
              if (!param3) {
                boolean decompiledFrameRemainder0 = true;
                stackIn_330_0 = var17;
                if (qk.field_b) {
                  stackIn_328_1 = ~param1.field_tc[var7];
                  stackIn_328_2 = (byte)var9;
                  stackIn_328_3 = -1;
                  if (stackIn_328_1 == (stackIn_328_2 ^ stackIn_328_3)) {
                    stackIn_331_1 = true;
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_331_1 = false;
                }
                stackIn_330_0.field_Ib = stackIn_331_1;
              } else {
                if (var9 == -1) {
                  var17.field_Ib = true;
                  var27 = var6Lifetime4;
                  var18Lifetime1 = var27;
                  while (-1 + (var30.length + var6Lifetime4) > var27) {
                    stackIn_320_0 = var17;
                    stackIn_320_1 = var17.field_Ib;
                    stackIn_321_2 = (0 == (ka.field_s[var27 / 8] & 1 << (var27 & 7)));
                    stackIn_320_0.field_Ib = stackIn_320_1 & stackIn_321_2;
                    var27++;
                  }
                } else {
                  stackIn_324_0 = var17;
                  stackIn_325_1 = ((ka.field_s[(var6Lifetime4 + var9) / 8] & 1 << (7 & var9 + var6Lifetime4)) != 0);
                  stackIn_324_0.field_Ib = stackIn_325_1;
                }
              }
              stackIn_335_0 = var17;
              stackIn_336_1 = (var4_int != 0) && (var16Lifetime1 == 0);
              stackIn_335_0.field_pb = stackIn_336_1;
            }
            var6Lifetime4 = var6Lifetime4 + (qf.field_j[var7] & 255);
          }
          if (var5 != 0 &&
            !param3) {
            lm.c(5, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_344_0 = var4;
          stackIn_344_1 = new StringBuilder().append("tl.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_345_2 = "null";
          } else {
            stackIn_345_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_344_0), ((StringBuilder) (Object) stackIn_344_1).append(stackIn_345_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static qb a(di param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(param3, -1);
          if (param1 != 3812) {
            field_H = (String) null;
          }
          var5 = param0.a(var4_int, 0, param2);
          stackIn_3_0 = kh.a(var5, var4_int, (byte) -97, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("tl.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final dd a(String param0, int param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        int[] var7 = null;
        dd stackIn_6_0 = null;
        dd stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var6 = (String) null;
            this.a((String) null, 127, -77, -84);
          }
          if (!hk.b(96) &&
            param3 < 2) {
            var7 = mc.field_e.field_U[param1];
            var5 = var7;
            stackIn_8_0 = ag.a((byte) 89, var7[var7.length >> 1], param0);
            return stackIn_8_0;
          }
          stackIn_6_0 = super.a(param0, param1, 0, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("tl.PA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        if (!hk.b(-114)) {
          return param1 < 2 ? param1 * 240 + 300 : 380;
        }
        if (param0) {
          field_H = (String) null;
        }
        if (param1 == 0) {
          return 340 + this.d(0, param1);
        }
        if (param1 == 1) {
          return 130 + this.d(0, param1);
        }
        return this.d(0, param1) + 140;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        if (param0 != -16470) {
          return;
        }
        var4 = this.field_h[param2];
        if (var4 != 23) {
          super.b(param0 + 0, param1, param2);
        } else {
          if (this.field_B.b((byte) 75)) {
            nk.a(pl.field_d, this.field_E, (byte) 101);
          }
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 6402) {
          return 53;
        }
        if (2 <= param0) {
          return super.a(param0, 6402);
        }
        return 0;
    }

    final void c(int param0) {
        int var8 = 0;
        int stackIn_18_0;
        int stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_19_4 = 0;
        int var2;
        int var3;
        Object var4;
        String[] var5;
        int[] var6;
        int var7;
        String var9;
        int var10;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime2Lifetime1;
        var10 = Pool.field_O;
        super.c(43);
        if (hk.b(-128)) {
          this.f(320);
          return;
        }
        if (tm.field_b == null) {
          tm.field_b = wp.a(0, 10, (byte) 68, 7);
        }
        var2 = 170;
        nj.a(vk.field_y, (byte) 65, 520, 60, 150, ni.field_Z.field_G + 176 + 16);
        var3 = 2;
        var3Lifetime1 = 15658734;
        ni.field_Z.b(eq.field_T, se.field_i[0], var2, var3Lifetime1, -1);
        ni.field_Z.b(jf.field_n, se.field_i[1], var2, var3Lifetime1, -1);
        ni.field_Z.b(vj.field_b, se.field_i[2], var2, var3Lifetime1, -1);
        ni.field_Z.b(qe.field_G, se.field_i[3], var2, var3Lifetime1, -1);
        ni.field_Z.b(um.field_a, se.field_i[4], var2, var3Lifetime1, -1);
        if (param0 <= 36) {
          return;
        }
        L1: {
          var2 = var2 + (8 + (ni.field_Z.field_w + sa.field_h.field_C));
          if (!tm.field_b.field_v) {
            var4 = cl.field_j;
          } else {
            if (tm.field_b.field_n != null) {
              var4 = mm.field_e;
              var5 = tm.field_b.field_n[eo.field_Lb];
              var6 = tm.field_b.field_q[eo.field_Lb];
              var7 = 0;
              for (var8 = 0; var8 < 10; var8++) {
                if (var5 != null) {
                  stackIn_18_0 = 62;
                  stackIn_18_1 = var2 - sa.field_h.field_C;
                  stackIn_18_2 = 516;
                  stackIn_18_3 = 16;
                  if ((1 & var8) == 0) {
                    stackIn_19_4 = 4475508;
                  } else {
                    stackIn_19_4 = 4146281;
                  }
                  qh.f(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_19_4);
                  var3Lifetime2 = 13421772;
                  var9 = var5[var8];
                  if (or.a((byte) 3, var9)) {
                    var7 = 1;
                    var3Lifetime2 = 16777215;
                  }
                  this.a(var8, var6[1 + 4 * var8], var6[var8 * 4 + 3], var6[2 + 4 * var8], var6[var8 * 4], 117, var3Lifetime2, var2, var9);
                  var4 = null;
                }
                var2 += 16;
              }
              if ((var7 == 0)) {
                var3Lifetime2Lifetime1 = 4;
                this.a(-1, tm.field_b.field_y, tm.field_b.field_x, tm.field_b.field_w, tm.field_b.field_t, 100, 16777215, var2, di.field_j);
              }
              break L1;
            }
            var4 = fh.field_a;
          }
        }
        if (var4 != null) {
          sa.field_h.b((String) (var4), qh.field_l >> 1, 245, 16777215, -1);
        }
        return;
    }

    private final void f(int param0) {
        sa.field_h.b(ra.field_a, param0, 380, 15658734, -1);
    }

    final static String a(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new char[param0];
          var10 = var11;
          var9 = var10;
          var4 = var9;
          var5 = 0;
          if (param1 != -7510) {
            tl.h(-13);
          }
          for (var6 = 0; var6 < param0; var6++) {
            var7 = param2[param3 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = rf.field_a[-128 + var7];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var9[incrementValue$1] = (char)var7;
            }
          }
          stackIn_14_0 = new String(var11, 0, var5);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("tl.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(int param0, int param1) {
        if (!hk.b(-117)) {
          return 2 <= param1 ? 260 : param1 * 240 + 100;
        }
        if (param0 != 0) {
          field_I = (int[]) null;
        }
        return param1 * 350 + 80;
    }

    final void e(byte param0) {
        tm.field_b = null;
        if (param0 != -6) {
          field_K = -93;
        }
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
          this.c(120);
        }
        if (!hk.b(-119)) {
          if (param1 < 2) {
            return this.field_x;
          }
          return 390;
        }
        return 390;
    }

    final static void d(int param0, boolean param1) {
        fl.field_q.a((byte) -79, param1);
        jj var2 = sg.field_J;
        if (var2 != null) {
          var2.a(fl.field_q.field_sb, (byte) 74, fl.field_q.field_ib);
        }
        if (param0 >= -74) {
          field_I = (int[]) null;
        }
    }

    static {
        field_L = new int[]{2, 20, 21, 49, 5, 12, 13};
        field_I = new int[16384];
        field_H = "<%0> is already on your friend list.";
        field_K = 236;
    }
}
