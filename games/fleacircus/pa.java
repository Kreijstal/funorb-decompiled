/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pa extends lh {
    static int field_o;
    long field_j;
    static dd field_n;
    static rh field_l;
    static String field_k;
    static String[] field_i;
    pa field_p;
    pa field_m;

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var1_intLifetime1;
        int var1_intLifetime2;
        int var1_intLifetime3;
        int var1_intLifetime4;
        int var1_intLifetime5;
        int var1_intLifetime6;
        int var1_intLifetime7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var3Lifetime1;
        int var1_intLifetime1Lifetime1;
        int var2Lifetime1Lifetime1;
        int var2Lifetime1Lifetime2;
        int var2Lifetime1Lifetime3;
        int var2Lifetime1Lifetime4;
        var5 = fleas.field_A ? 1 : 0;
        try {
          if (param0 <= 100) {
            field_k = (String) null;
          }
          if (0 == fleas.field_E) {
            if (!fl.field_f) {
              return;
            }
            var3 = 1;
            var4 = (int)(32.0 * ma.a((double)ni.field_j / 50.0, 73));
            if (tj.field_a == 0) {
              ej.field_a[0].field_l = 380;
              ej.field_a[0].field_a = 30;
              ej.field_a[0].c(103);
            }
            if (tj.field_a == 1) {
              ej.field_a[1].field_l = 70;
              ej.field_a[1].field_a = 140;
              ej.field_a[1].c(51);
            }
            if (tj.field_a == 2) {
              ej.field_a[2].field_l = 380;
              ej.field_a[2].field_a = 30;
              ej.field_a[2].c(95);
              var2 = 20;
              var1_int = 4;
              if (fl.field_c[var2][var1_int] != 0) {
                var3Lifetime1 = 3;
                ea.a(var4, (byte) -101, var1_int, var3Lifetime1, var3Lifetime1, var2);
              }
            }
            if (tj.field_a == 3) {
              ej.field_a[3].field_a = 27;
              ej.field_a[3].field_l = 133;
              ej.field_a[3].c(-93);
            }
            if (tj.field_a == 4) {
              ej.field_a[4].field_a = 150;
              ej.field_a[4].field_l = 30;
              var2Lifetime1 = 18;
              var1_intLifetime1 = 13;
              ej.field_a[4].c(75);
              ea.a(var4, (byte) 77, var1_intLifetime1, 1, 1, var2Lifetime1);
              for (var2Lifetime1Lifetime1 = 19; var2Lifetime1Lifetime1 < 33; var2Lifetime1Lifetime1++) {
                pl.a(var1_intLifetime1, -67, var2Lifetime1Lifetime1);
              }
              for (var2Lifetime1Lifetime2 = 17; var2Lifetime1Lifetime2 > 0; var2Lifetime1Lifetime2--) {
                nl.a(var1_intLifetime1, -4, var2Lifetime1Lifetime2);
              }
              var1_intLifetime1Lifetime1 = 4;
              var2Lifetime1Lifetime3 = 19;
              ea.a(var4, (byte) -91, var1_intLifetime1Lifetime1, 1, 1, var2Lifetime1Lifetime3);
              for (var2Lifetime1Lifetime4 = 20; 39 > var2Lifetime1Lifetime4; var2Lifetime1Lifetime4++) {
                pl.a(var1_intLifetime1Lifetime1, -67, var2Lifetime1Lifetime4);
              }
            }
            if (tj.field_a == 5) {
              ej.field_a[5].field_a = 210;
              ej.field_a[5].field_l = 210;
              var2Lifetime2 = 12;
              var1_intLifetime2 = 19;
              ej.field_a[5].c(118);
              ea.a(var4, (byte) -124, var1_intLifetime2, 1, 1, var2Lifetime2);
            }
            if (6 == tj.field_a) {
              ej.field_a[6].field_a = 150;
              ej.field_a[6].field_l = 200;
              ej.field_a[6].c(-101);
              var1_intLifetime3 = 13;
              var2Lifetime3 = 11;
              ea.a(var4, (byte) 112, var1_intLifetime3, 3, 1, var2Lifetime3);
            }
            if (7 == tj.field_a) {
              ej.field_a[7].field_a = 150;
              ej.field_a[7].field_l = 280;
              var1_intLifetime4 = 2;
              var2Lifetime4 = 7;
              ej.field_a[7].c(-97);
              ea.a(var4, (byte) 92, var1_intLifetime4, 18, 1, var2Lifetime4);
            }
            if (tj.field_a != 9) {
              return;
            }
            ej.field_a[9].field_a = 120;
            ej.field_a[9].field_l = 200;
            var1_intLifetime5 = 4;
            var2Lifetime5 = 17;
            ej.field_a[9].c(94);
            ea.a(var4, (byte) -90, var1_intLifetime5, 2, 1, var2Lifetime5);
            var2Lifetime6 = 24;
            var1_intLifetime6 = 4;
            ea.a(var4, (byte) 24, var1_intLifetime6, 2, 1, var2Lifetime6);
            var2Lifetime7 = 30;
            var1_intLifetime7 = 9;
            ea.a(var4, (byte) 41, var1_intLifetime7, 2, 1, var2Lifetime7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "pa.M(" + param0 + ')');
        }
    }

    final static void a(boolean param0, dd param1) {
        if (param0) {
          return;
        }
        try {
          dl.field_s = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "pa.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
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
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var33 = 0;
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
        var42 = fleas.field_A ? 1 : 0;
        try {
          if (0 <= param14 &&
            bl.field_i > param7) {
            if (0 > param4 &&
              param6 < 0 &&
              param2 < 0) {
              return;
            }
            if (param4 >= bl.field_f &&
              bl.field_f <= param6 &&
              bl.field_f <= param2) {
              return;
            }
            var34 = -param7 + param14;
            if (param1 != param7) {
              var22 = param10 << 16;
              var21 = param10 << 16;
              var18 = param4 << 16;
              var17_int = param4 << 16;
              var26 = param3 << 16;
              var25 = param3 << 16;
              var30 = param8 << 16;
              var29 = param8 << 16;
              var35 = -param7 + param1;
              var19 = (param6 - param4 << 16) / var35;
              var20 = (param2 - param4 << 16) / var34;
              if (var19 >= var20) {
                var27 = (-param3 + param5 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var28 = (-param3 + param9 << 16) / var35;
                var31 = (param12 - param8 << 16) / var34;
                var24 = (-param10 + param13 << 16) / var35;
                var23 = (-param10 + param16 << 16) / var34;
                var33 = 1;
                var32 = (-param8 + param0 << 16) / var35;
              } else {
                var24 = (-param10 + param16 << 16) / var34;
                var27 = (param9 - param3 << 16) / var35;
                var33 = 0;
                var28 = (param5 - param3 << 16) / var34;
                var32 = (-param8 + param12 << 16) / var34;
                var31 = (-param8 + param0 << 16) / var35;
                var23 = (param13 - param10 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param7) {
                if (param1 < 0) {
                  param7 = -param7 + param1;
                  var26 = var26 + param7 * var28;
                  var25 = var25 + var27 * param7;
                  var30 = var30 + param7 * var32;
                  var29 = var29 + var31 * param7;
                  var18 = var18 + param7 * var20;
                  var21 = var21 + param7 * var23;
                  var17_int = var17_int + param7 * var19;
                  var22 = var22 + param7 * var24;
                  param7 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var17_int = var17_int + var19 * param7;
                  var21 = var21 + var23 * param7;
                  var25 = var25 + var27 * param7;
                  var26 = var26 + var28 * param7;
                  var29 = var29 + var31 * param7;
                  var18 = var18 + var20 * param7;
                  var30 = var30 + var32 * param7;
                  var22 = var22 + param7 * var24;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = bl.field_b[param7];
                while (param7 < param1) {
                  var37 = var17_int >> 16;
                  if (var37 < bl.field_f) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var37 + var38 >= bl.field_f) {
                        var38 = -var37 + bl.field_f - 1;
                      }
                      if (var37 >= 0) {
                        ue.a(var37 + var36Lifetime2, var41, var21, var29, var38, (byte) -117, var25, var40, var39, param11);
                      } else {
                        ue.a(var36Lifetime2, var41, -(var37 * var39) + var21, -(var37 * var41) + var29, var37 + var38, (byte) -117, -(var40 * var37) + var25, var40, var39, param11);
                      }
                    } else {
                      if (var37 >= 0 &&
                        bl.field_f > var37) {
                        ue.a(var36Lifetime2 + var37, 0, var21, var29, var38, (byte) -117, var25, 0, 0, param11);
                      }
                    }
                  }
                  param7++;
                  if (bl.field_i <= param7) {
                    return;
                  }
                  var21 = var21 + var23;
                  var17_int = var17_int + var19;
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var36Lifetime2 = var36Lifetime2 + gb.field_d;
                }
              }
              var36Lifetime3 = param14 - param1;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param2 << 16;
                var38Lifetime2 = param16 << 16;
                var39Lifetime2 = param5 << 16;
                var40Lifetime2 = param12 << 16;
                if (var33 == 0) {
                  var17_int = param6 << 16;
                  var29 = param0 << 16;
                  var21 = param13 << 16;
                  var25 = param9 << 16;
                } else {
                  var22 = param13 << 16;
                  var26 = param9 << 16;
                  var18 = param6 << 16;
                  var30 = param0 << 16;
                }
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
              } else {
                var27 = 0;
                var32 = 0;
                var24 = 0;
                var31 = 0;
                var23 = 0;
                var19 = 0;
                var20 = 0;
                var28 = 0;
              }
            } else {
              if (param14 == param7) {
                var26 = param9;
                var29 = param8;
                var23 = 0;
                var21 = param10;
                var24 = 0;
                var22 = param13;
                var17_int = param4 << 16;
                var32 = 0;
                var19 = 0;
                var28 = 0;
                var25 = param3;
                var20 = 0;
                var27 = 0;
                var30 = param0;
                var31 = 0;
                var18 = param6 << 16;
              } else {
                var35 = -param1 + param14;
                if (param4 < param6) {
                  var17_int = param4 << 16;
                  var27 = (param5 - param3 << 16) / var34;
                  var28 = (param5 - param9 << 16) / var35;
                  var24 = (-param13 + param16 << 16) / var35;
                  var31 = (param12 - param8 << 16) / var34;
                  var19 = (param2 - param4 << 16) / var34;
                  var23 = (-param10 + param16 << 16) / var34;
                  var30 = param0 << 16;
                  var25 = param3 << 16;
                  var21 = param10 << 16;
                  var26 = param9 << 16;
                  var22 = param13 << 16;
                  var32 = (param12 - param0 << 16) / var35;
                  var18 = param6 << 16;
                  var29 = param8 << 16;
                  var20 = (-param6 + param2 << 16) / var35;
                } else {
                  var23 = (-param13 + param16 << 16) / var35;
                  var30 = param8 << 16;
                  var17_int = param6 << 16;
                  var22 = param10 << 16;
                  var19 = (param2 - param6 << 16) / var35;
                  var32 = (param12 - param8 << 16) / var34;
                  var21 = param13 << 16;
                  var20 = (-param4 + param2 << 16) / var34;
                  var31 = (-param0 + param12 << 16) / var35;
                  var29 = param0 << 16;
                  var24 = (-param10 + param16 << 16) / var34;
                  var25 = param9 << 16;
                  var28 = (-param3 + param5 << 16) / var34;
                  var18 = param4 << 16;
                  var26 = param3 << 16;
                  var27 = (-param9 + param5 << 16) / var35;
                }
              }
              if (param7 < 0) {
                param7 = Math.min(-param7, -param7 + param1);
                var30 = var30 + param7 * var32;
                var22 = var22 + param7 * var24;
                var21 = var21 + param7 * var23;
                var29 = var29 + var31 * param7;
                var26 = var26 + param7 * var28;
                var25 = var25 + var27 * param7;
                var17_int = var17_int + param7 * var19;
                var18 = var18 + var20 * param7;
                param7 = 0;
              }
              var33 = 0;
            }
            if (param7 < 0) {
              param7 = -param7;
              var25 = var25 + param7 * var27;
              var30 = var30 + param7 * var32;
              var22 = var22 + param7 * var24;
              var26 = var26 + var28 * param7;
              var18 = var18 + var20 * param7;
              var29 = var29 + param7 * var31;
              var21 = var21 + var23 * param7;
              var17_int = var17_int + var19 * param7;
              param7 = 0;
            }
            var35Lifetime1 = bl.field_b[param7];
            while (param7 < param14) {
              var36Lifetime1 = var17_int >> 16;
              if (bl.field_f > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 == 0) {
                  if (0 <= var36Lifetime1 &&
                    var36Lifetime1 < bl.field_f) {
                    ue.a(var36Lifetime1 + var35Lifetime1, 0, var21, var29, var37Lifetime1, (byte) -117, var25, 0, 0, param11);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (bl.field_f <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = bl.field_f - var36Lifetime1 - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    ue.a(var35Lifetime1, var40Lifetime1, -(var36Lifetime1 * var38Lifetime1) + var21, -(var40Lifetime1 * var36Lifetime1) + var29, var36Lifetime1 + var37Lifetime1, (byte) -117, var25 - var36Lifetime1 * var39Lifetime1, var39Lifetime1, var38Lifetime1, param11);
                  } else {
                    ue.a(var35Lifetime1 + var36Lifetime1, var40Lifetime1, var21, var29, var37Lifetime1, (byte) -117, var25, var39Lifetime1, var38Lifetime1, param11);
                  }
                }
              }
              param7++;
              if (bl.field_i <= param7) {
                return;
              }
              var29 = var29 + var31;
              var22 = var22 + var24;
              var21 = var21 + var23;
              var17_int = var17_int + var19;
              var35Lifetime1 = var35Lifetime1 + gb.field_d;
              var25 = var25 + var27;
              var18 = var18 + var20;
              var26 = var26 + var28;
              var30 = var30 + var32;
            }
            if (param15 != 32679) {
              field_i = (String[]) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_81_0 = var17;
          stackIn_81_1 = new StringBuilder().append("pa.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final void e(int param0) {
        int var2 = 45 % ((-26 - param0) / 54);
        if (this.field_m == null) {
          return;
        }
        this.field_m.field_p = this.field_p;
        this.field_p.field_m = this.field_m;
        this.field_p = null;
        this.field_m = null;
    }

    public static void d(int param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        if (param0 != -6) {
          return;
        }
        field_k = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (th.field_D < 224) {
          var1 = th.field_D % 32;
          lg.a(-91, -var1 + (32 + th.field_D));
        } else {
          lg.a(-118, 256);
        }
        if (param0 != 93) {
          field_l = (rh) null;
        }
    }

    protected pa() {
    }

    static {
        field_o = 0;
    }
}
