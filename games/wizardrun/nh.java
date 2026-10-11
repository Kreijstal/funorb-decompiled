/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends bb {
    static bh field_p;
    static String field_o;
    static int field_n;
    static String field_q;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, int param14, int param15, int param16) {
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
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
        int var42 = 0;
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
        var42 = wizardrun.field_H;
        try {
          if (param7 >= 0 &&
            cj.field_d > param3) {
            if (param9 < 0 &&
              0 > param15 &&
              0 > param11) {
              return;
            }
            if (param9 >= cj.field_b &&
              param15 >= cj.field_b &&
              cj.field_b <= param11) {
              return;
            }
            if (param12 > -119) {
              field_q = (String) null;
            }
            var34 = -param3 + param7;
            if (param0 != param3) {
              var26 = param8 << 16;
              var25 = param8 << 16;
              var22 = param6 << 16;
              var21 = param6 << 16;
              var18 = param9 << 16;
              var17_int = param9 << 16;
              var30 = param14 << 16;
              var29 = param14 << 16;
              var35 = param0 - param3;
              var19 = (param15 - param9 << 16) / var35;
              var20 = (param11 - param9 << 16) / var34;
              if (var19 >= var20) {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var24 = (-param6 + param10 << 16) / var35;
                var27 = (param1 - param8 << 16) / var34;
                var33 = 1;
                var31 = (param2 - param14 << 16) / var34;
                var23 = (param16 - param6 << 16) / var34;
                var28 = (-param8 + param4 << 16) / var35;
                var32 = (-param14 + param5 << 16) / var35;
              } else {
                var27 = (param4 - param8 << 16) / var35;
                var33 = 0;
                var23 = (param10 - param6 << 16) / var35;
                var32 = (param2 - param14 << 16) / var34;
                var28 = (param1 - param8 << 16) / var34;
                var24 = (param16 - param6 << 16) / var34;
                var31 = (param5 - param14 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param3) {
                if (0 > param0) {
                  param3 = -param3 + param0;
                  var21 = var21 + param3 * var23;
                  var17_int = var17_int + param3 * var19;
                  var18 = var18 + var20 * param3;
                  var30 = var30 + var32 * param3;
                  var29 = var29 + var31 * param3;
                  var25 = var25 + var27 * param3;
                  var22 = var22 + var24 * param3;
                  var26 = var26 + param3 * var28;
                  param3 = param0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var21 = var21 + param3 * var23;
                  var26 = var26 + var28 * param3;
                  var30 = var30 + param3 * var32;
                  var18 = var18 + var20 * param3;
                  var25 = var25 + param3 * var27;
                  var17_int = var17_int + param3 * var19;
                  var22 = var22 + var24 * param3;
                  var29 = var29 + var31 * param3;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = cj.field_a[param3];
                while (param3 < param0) {
                  var37 = var17_int >> 16;
                  if (var37 < cj.field_b) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var37 + var38 >= cj.field_b) {
                        var38 = cj.field_b - (var37 + 1);
                      }
                      if (var37 < 0) {
                        uk.a(var38 + var37, var39, var41, var21 - var37 * var39, var36Lifetime2, var40, param13, true, var25 - var40 * var37, var29 - var41 * var37);
                      } else {
                        uk.a(var38, var39, var41, var21, var37 + var36Lifetime2, var40, param13, true, var25, var29);
                      }
                    } else {
                      if (var37 >= 0 &&
                        cj.field_b > var37) {
                        uk.a(var38, 0, 0, var21, var37 + var36Lifetime2, 0, param13, true, var25, var29);
                      }
                    }
                  }
                  param3++;
                  if (param3 >= cj.field_d) {
                    return;
                  }
                  var21 = var21 + var23;
                  var17_int = var17_int + var19;
                  var30 = var30 + var32;
                  var29 = var29 + var31;
                  var36Lifetime2 = var36Lifetime2 + ed.field_h;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                }
              }
              var36Lifetime3 = -param0 + param7;
              if (var36Lifetime3 == 0) {
                var23 = 0;
                var20 = 0;
                var27 = 0;
                var31 = 0;
                var19 = 0;
                var32 = 0;
                var24 = 0;
                var28 = 0;
              } else {
                var37Lifetime2 = param11 << 16;
                var38Lifetime2 = param16 << 16;
                var39Lifetime2 = param1 << 16;
                var40Lifetime2 = param2 << 16;
                if (var33 == 0) {
                  var17_int = param15 << 16;
                  var25 = param4 << 16;
                  var29 = param5 << 16;
                  var21 = param10 << 16;
                } else {
                  var26 = param4 << 16;
                  var30 = param5 << 16;
                  var18 = param15 << 16;
                  var22 = param10 << 16;
                }
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
              }
            } else {
              if (param7 == param3) {
                var18 = param15 << 16;
                var28 = 0;
                var17_int = param9 << 16;
                var20 = 0;
                var30 = param5;
                var29 = param14;
                var26 = param4;
                var22 = param10;
                var23 = 0;
                var32 = 0;
                var24 = 0;
                var27 = 0;
                var31 = 0;
                var19 = 0;
                var21 = param6;
                var25 = param8;
              } else {
                var35 = -param0 + param7;
                if (param9 >= param15) {
                  var20 = (param11 - param9 << 16) / var34;
                  var17_int = param15 << 16;
                  var26 = param8 << 16;
                  var30 = param14 << 16;
                  var21 = param10 << 16;
                  var32 = (-param14 + param2 << 16) / var34;
                  var27 = (-param4 + param1 << 16) / var35;
                  var29 = param5 << 16;
                  var18 = param9 << 16;
                  var24 = (-param6 + param16 << 16) / var34;
                  var28 = (param1 - param8 << 16) / var34;
                  var31 = (-param5 + param2 << 16) / var35;
                  var23 = (-param10 + param16 << 16) / var35;
                  var25 = param4 << 16;
                  var19 = (param11 - param15 << 16) / var35;
                  var22 = param6 << 16;
                } else {
                  var32 = (-param5 + param2 << 16) / var35;
                  var28 = (param1 - param4 << 16) / var35;
                  var20 = (-param15 + param11 << 16) / var35;
                  var30 = param5 << 16;
                  var27 = (param1 - param8 << 16) / var34;
                  var24 = (param16 - param10 << 16) / var35;
                  var19 = (param11 - param9 << 16) / var34;
                  var18 = param15 << 16;
                  var26 = param4 << 16;
                  var25 = param8 << 16;
                  var31 = (-param14 + param2 << 16) / var34;
                  var23 = (-param6 + param16 << 16) / var34;
                  var29 = param14 << 16;
                  var22 = param10 << 16;
                  var17_int = param9 << 16;
                  var21 = param6 << 16;
                }
              }
              if (0 > param3) {
                param3 = Math.min(-param3, -param3 + param0);
                var26 = var26 + param3 * var28;
                var30 = var30 + var32 * param3;
                var18 = var18 + param3 * var20;
                var25 = var25 + param3 * var27;
                var21 = var21 + var23 * param3;
                var29 = var29 + var31 * param3;
                var22 = var22 + param3 * var24;
                var17_int = var17_int + param3 * var19;
                param3 = 0;
              }
              var33 = 0;
            }
            if (0 > param3) {
              param3 = -param3;
              var26 = var26 + var28 * param3;
              var30 = var30 + param3 * var32;
              var18 = var18 + var20 * param3;
              var21 = var21 + var23 * param3;
              var22 = var22 + var24 * param3;
              var29 = var29 + param3 * var31;
              var25 = var25 + var27 * param3;
              var17_int = var17_int + var19 * param3;
              param3 = 0;
            }
            var35Lifetime1 = cj.field_a[param3];
            while (param7 > param3) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < cj.field_b) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (0 != var37Lifetime1) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= cj.field_b) {
                    var37Lifetime1 = cj.field_b + (-var36Lifetime1 - 1);
                  }
                  if (0 <= var36Lifetime1) {
                    uk.a(var37Lifetime1, var38Lifetime1, var40Lifetime1, var21, var35Lifetime1 + var36Lifetime1, var39Lifetime1, param13, true, var25, var29);
                  } else {
                    uk.a(var36Lifetime1 + var37Lifetime1, var38Lifetime1, var40Lifetime1, -(var36Lifetime1 * var38Lifetime1) + var21, var35Lifetime1, var39Lifetime1, param13, true, var25 - var36Lifetime1 * var39Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29);
                  }
                } else {
                  if (0 <= var36Lifetime1 &&
                    var36Lifetime1 < cj.field_b) {
                    uk.a(var37Lifetime1, 0, 0, var21, var35Lifetime1 + var36Lifetime1, 0, param13, true, var25, var29);
                  }
                }
              }
              param3++;
              if (param3 >= cj.field_d) {
                return;
              }
              var30 = var30 + var32;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var35Lifetime1 = var35Lifetime1 + ed.field_h;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var29 = var29 + var31;
              var22 = var22 + var24;
              var18 = var18 + var20;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_83_0 = var17;
          stackIn_83_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    nh(long param0, String param1) {
        super(param0, param1);
    }

    final static bh a(int param0, int param1) {
        int var3 = 0;
        bh[] var2;
        int var4;
        bh[] var5;
        var4 = wizardrun.field_H;
        var5 = od.b(109);
        var2 = var5;
        for (var3 = param0; var3 < var5.length; var3++) {
          if (param1 == var5[var3].field_h) {
            return var5[var3];
          }
        }
        return null;
    }

    final sd a(boolean param0) {
        if (!param0) {
          field_q = (String) null;
        }
        return pc.field_m;
    }

    final static void c(byte param0) {
        gj.field_b = 0;
        ag.field_u = -1;
        vb.field_I = null;
        uc.field_a = -1;
        ol.field_b = false;
        int var1 = 71 / ((25 - param0) / 57);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = wizardrun.field_H;
        try {
          var5_int = param1 + param4;
          var6 = param3 + param2;
          if (ed.field_c < param4) {
            stackIn_4_0 = param4;
          } else {
            stackIn_4_0 = ed.field_c;
          }
          var7 = stackIn_4_0;
          if (param2 > ed.field_i) {
            stackIn_7_0 = param2;
          } else {
            stackIn_7_0 = ed.field_i;
          }
          var8 = stackIn_7_0;
          if (ed.field_l > var5_int) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = ed.field_l;
          }
          var9 = stackIn_10_0;
          if (var6 >= ed.field_b) {
            stackIn_13_0 = ed.field_b;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (ed.field_c <= param4 &&
            ed.field_l > param4) {
            var11 = param4 + ed.field_h * var8;
            var12 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ed.field_k[var11] = 16777215;
              var11 = var11 + ed.field_h * 2;
            }
          }
          if (ed.field_i <= param2 &&
            ed.field_b > var6) {
            var11Lifetime1 = param2 * ed.field_h + var7;
            var12Lifetime1 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              ed.field_k[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= ed.field_c &&
            var5_int < ed.field_l) {
            var11Lifetime2 = ed.field_h * (var8 + (var5_int - param4 & 1)) + var5_int;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              ed.field_k[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ed.field_h * 2;
            }
          }
          if (param2 >= ed.field_i &&
            var6 < ed.field_b) {
            var11Lifetime3 = var7 + (var6 * ed.field_h + (1 & var6 - param2));
            var12Lifetime3 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                break;
              }
              ed.field_k[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          if (param0 != 69) {
            field_o = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "nh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        int var1 = 9 / ((param0 - 53) / 57);
    }

    static {
        field_o = "Waiting for extra data";
        field_p = new bh(0, 2, 2, 1);
        field_q = "achievements to collect";
    }
}
