/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends a {
    static tf field_db;
    static e[] field_eb;
    static String[] field_cb;

    rf(da param0, qg param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static int[] c(boolean param0) {
        if (param0) {
          rf.c(false);
        }
        return new int[8];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var42 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param5 >= param8 &&
            ka.field_a > param16) {
            if (param0 < 0 &&
              0 > param15 &&
              param9 < 0) {
              return;
            }
            if (param0 >= ka.field_i &&
              param15 >= ka.field_i &&
              ka.field_i <= param9) {
              return;
            }
            var34 = param5 - param16;
            if (param16 != param12) {
              var18 = param0 << 16;
              var17_int = param0 << 16;
              var22 = param2 << 16;
              var21 = param2 << 16;
              var26 = param11 << 16;
              var25 = param11 << 16;
              var30 = param6 << 16;
              var29 = param6 << 16;
              var35 = -param16 + param12;
              var19 = (param15 - param0 << 16) / var35;
              var20 = (param9 - param0 << 16) / var34;
              if (var20 <= var19) {
                var33 = 1;
                var28 = (-param11 + param1 << 16) / var35;
                var24 = (-param2 + param10 << 16) / var35;
                var23 = (-param2 + param14 << 16) / var34;
                var32 = (param13 - param6 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var31 = (-param6 + param3 << 16) / var34;
                var27 = (param4 - param11 << 16) / var34;
              } else {
                var31 = (-param6 + param13 << 16) / var35;
                var24 = (param14 - param2 << 16) / var34;
                var23 = (param10 - param2 << 16) / var35;
                var32 = (param3 - param6 << 16) / var34;
                var27 = (-param11 + param1 << 16) / var35;
                var28 = (param4 - param11 << 16) / var34;
                var33 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param16 < 0) {
                if (param12 < 0) {
                  param16 = param12 - param16;
                  var29 = var29 + var31 * param16;
                  var21 = var21 + param16 * var23;
                  var22 = var22 + param16 * var24;
                  var18 = var18 + param16 * var20;
                  var25 = var25 + param16 * var27;
                  var17_int = var17_int + var19 * param16;
                  var30 = var30 + param16 * var32;
                  var26 = var26 + param16 * var28;
                  param16 = param12;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param16 = -param16;
                  var25 = var25 + var27 * param16;
                  var30 = var30 + var32 * param16;
                  var22 = var22 + param16 * var24;
                  var17_int = var17_int + var19 * param16;
                  var26 = var26 + param16 * var28;
                  var21 = var21 + param16 * var23;
                  var18 = var18 + param16 * var20;
                  var29 = var29 + var31 * param16;
                  param16 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ka.field_d[param16];
                while (param16 < param12) {
                  var37 = var17_int >> 16;
                  if (var37 < ka.field_i) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var37 + var38 >= ka.field_i) {
                        var38 = -1 + ka.field_i - var37;
                      }
                      if (var37 >= 0) {
                        dh.a(var40, var39, param8 ^ 99, param7, var21, var36Lifetime2 + var37, var25, var41, var29, var38);
                      } else {
                        dh.a(var40, var39, param8 + 99, param7, -(var39 * var37) + var21, var36Lifetime2, var25 - var37 * var40, var41, -(var41 * var37) + var29, var37 + var38);
                      }
                    } else {
                      if (var37 >= 0 &&
                        ka.field_i > var37) {
                        dh.a(0, 0, 99, param7, var21, var36Lifetime2 + var37, var25, 0, var29, var38);
                      }
                    }
                  }
                  param16++;
                  if (ka.field_a <= param16) {
                    return;
                  }
                  var21 = var21 + var23;
                  var29 = var29 + var31;
                  var36Lifetime2 = var36Lifetime2 + sb.field_c;
                  var26 = var26 + var28;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = -param12 + param5;
              if (var36Lifetime3 == 0) {
                var24 = 0;
                var32 = 0;
                var23 = 0;
                var19 = 0;
                var27 = 0;
                var20 = 0;
                var31 = 0;
                var28 = 0;
              } else {
                var37Lifetime2 = param9 << 16;
                var38Lifetime2 = param14 << 16;
                var39Lifetime2 = param4 << 16;
                if (var33 == 0) {
                  var17_int = param15 << 16;
                  var25 = param1 << 16;
                  var29 = param13 << 16;
                  var21 = param10 << 16;
                } else {
                  var26 = param1 << 16;
                  var18 = param15 << 16;
                  var30 = param13 << 16;
                  var22 = param10 << 16;
                }
                var40Lifetime2 = param3 << 16;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
              }
            } else {
              if (param5 == param16) {
                var25 = param11;
                var22 = param10;
                var19 = 0;
                var18 = param15 << 16;
                var28 = 0;
                var20 = 0;
                var27 = 0;
                var32 = 0;
                var23 = 0;
                var21 = param2;
                var17_int = param0 << 16;
                var26 = param1;
                var31 = 0;
                var29 = param6;
                var24 = 0;
                var30 = param13;
              } else {
                var35 = param5 - param12;
                if (param15 > param0) {
                  var25 = param11 << 16;
                  var22 = param10 << 16;
                  var32 = (-param13 + param3 << 16) / var35;
                  var23 = (param14 - param2 << 16) / var34;
                  var28 = (param4 - param1 << 16) / var35;
                  var24 = (param14 - param10 << 16) / var35;
                  var17_int = param0 << 16;
                  var21 = param2 << 16;
                  var18 = param15 << 16;
                  var30 = param13 << 16;
                  var31 = (-param6 + param3 << 16) / var34;
                  var19 = (-param0 + param9 << 16) / var34;
                  var29 = param6 << 16;
                  var20 = (param9 - param15 << 16) / var35;
                  var26 = param1 << 16;
                  var27 = (-param11 + param4 << 16) / var34;
                } else {
                  var23 = (param14 - param10 << 16) / var35;
                  var29 = param13 << 16;
                  var30 = param6 << 16;
                  var18 = param0 << 16;
                  var22 = param2 << 16;
                  var27 = (-param1 + param4 << 16) / var35;
                  var21 = param10 << 16;
                  var28 = (-param11 + param4 << 16) / var34;
                  var17_int = param15 << 16;
                  var25 = param1 << 16;
                  var20 = (-param0 + param9 << 16) / var34;
                  var19 = (param9 - param15 << 16) / var35;
                  var32 = (-param6 + param3 << 16) / var34;
                  var24 = (param14 - param2 << 16) / var34;
                  var31 = (param3 - param13 << 16) / var35;
                  var26 = param11 << 16;
                }
              }
              var33 = 0;
              if (param16 < 0) {
                param16 = Math.min(-param16, -param16 + param12);
                var18 = var18 + var20 * param16;
                var22 = var22 + param16 * var24;
                var30 = var30 + param16 * var32;
                var17_int = var17_int + param16 * var19;
                var26 = var26 + param16 * var28;
                var29 = var29 + var31 * param16;
                var25 = var25 + param16 * var27;
                var21 = var21 + var23 * param16;
                param16 = 0;
              }
            }
            if (param16 < 0) {
              param16 = -param16;
              var18 = var18 + var20 * param16;
              var17_int = var17_int + var19 * param16;
              var26 = var26 + param16 * var28;
              var29 = var29 + var31 * param16;
              var22 = var22 + var24 * param16;
              var21 = var21 + var23 * param16;
              var30 = var30 + var32 * param16;
              var25 = var25 + param16 * var27;
              param16 = 0;
            }
            var35Lifetime1 = ka.field_d[param16];
            while (param5 > param16) {
              var36Lifetime1 = var17_int >> 16;
              if (ka.field_i > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 != var37Lifetime1) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (ka.field_i <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = ka.field_i + (-var36Lifetime1 - 1);
                  }
                  if (var36Lifetime1 >= 0) {
                    dh.a(var39Lifetime1, var38Lifetime1, 99, param7, var21, var35Lifetime1 + var36Lifetime1, var25, var40Lifetime1, var29, var37Lifetime1);
                  } else {
                    dh.a(var39Lifetime1, var38Lifetime1, 99, param7, var21 - var38Lifetime1 * var36Lifetime1, var35Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, var40Lifetime1, var29 - var40Lifetime1 * var36Lifetime1, var36Lifetime1 + var37Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    ka.field_i > var36Lifetime1) {
                    dh.a(0, 0, param8 ^ 99, param7, var21, var35Lifetime1 + var36Lifetime1, var25, 0, var29, var37Lifetime1);
                  }
                }
              }
              param16++;
              if (ka.field_a <= param16) {
                return;
              }
              var22 = var22 + var24;
              var17_int = var17_int + var19;
              var21 = var21 + var23;
              var29 = var29 + var31;
              var30 = var30 + var32;
              var25 = var25 + var27;
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + sb.field_c;
              var26 = var26 + var28;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_75_0 = var17;
          stackIn_75_1 = new StringBuilder().append("rf.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final void b(int param0, qg param1) {
        try {
          super.b(-52, param1);
          int var3_int = 83 / ((34 - param0) / 54);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "rf.RB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void r(int param0) {
        field_eb = null;
        field_cb = null;
        if (param0 != -2391) {
          field_cb = (String[]) null;
        }
        field_db = null;
    }

    final static void q(int param0) {
        hc.field_t = param0;
    }

    static {
        field_db = new tf(8, 0, 4, 1);
        field_cb = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
