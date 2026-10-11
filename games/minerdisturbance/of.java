/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static java.applet.Applet field_b;
    static boolean field_a;

    public static void a(int param0) {
        int var1 = 45 % ((75 - param0) / 45);
        field_b = null;
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
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var42 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
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
        var42 = MinerDisturbance.field_ab;
        try {
          if (0 <= param7 &&
            param6 < dj.field_f) {
            if (param13 < 0 &&
              param3 < 0 &&
              param4 < 0) {
              return;
            }
            if (dj.field_b <= param13 &&
              dj.field_b <= param3 &&
              param4 >= dj.field_b) {
              return;
            }
            var34 = -param6 + param7;
            if (param6 == param8) {
              if (param7 != param6) {
                var35 = -param8 + param7;
                if (param3 > param13) {
                  var30 = param16 << 16;
                  var32 = (-param16 + param9 << 16) / var35;
                  var27 = (-param12 + param5 << 16) / var34;
                  var20 = (param4 - param3 << 16) / var35;
                  var21 = param14 << 16;
                  var29 = param10 << 16;
                  var23 = (param0 - param14 << 16) / var34;
                  var24 = (param0 - param2 << 16) / var35;
                  var18 = param3 << 16;
                  var28 = (param5 - param15 << 16) / var35;
                  var22 = param2 << 16;
                  var17_int = param13 << 16;
                  var26 = param15 << 16;
                  var31 = (-param10 + param9 << 16) / var34;
                  var19 = (param4 - param13 << 16) / var34;
                  var25 = param12 << 16;
                } else {
                  var22 = param14 << 16;
                  var17_int = param3 << 16;
                  var31 = (-param16 + param9 << 16) / var35;
                  var23 = (-param2 + param0 << 16) / var35;
                  var19 = (param4 - param3 << 16) / var35;
                  var21 = param2 << 16;
                  var30 = param10 << 16;
                  var25 = param15 << 16;
                  var20 = (-param13 + param4 << 16) / var34;
                  var24 = (param0 - param14 << 16) / var34;
                  var29 = param16 << 16;
                  var27 = (param5 - param15 << 16) / var35;
                  var28 = (param5 - param12 << 16) / var34;
                  var32 = (param9 - param10 << 16) / var34;
                  var26 = param12 << 16;
                  var18 = param13 << 16;
                }
              } else {
                var17_int = param13 << 16;
                var31 = 0;
                var27 = 0;
                var19 = 0;
                var29 = param10;
                var21 = param14;
                var23 = 0;
                var24 = 0;
                var25 = param12;
                var28 = 0;
                var30 = param16;
                var20 = 0;
                var32 = 0;
                var22 = param2;
                var26 = param15;
                var18 = param3 << 16;
              }
              var33 = 0;
              if (param6 < 0) {
                param6 = Math.min(-param6, -param6 + param8);
                var17_int = var17_int + param6 * var19;
                var22 = var22 + var24 * param6;
                var18 = var18 + var20 * param6;
                var25 = var25 + var27 * param6;
                var30 = var30 + param6 * var32;
                var29 = var29 + param6 * var31;
                var26 = var26 + var28 * param6;
                var21 = var21 + param6 * var23;
                param6 = 0;
              }
            } else {
              var22 = param14 << 16;
              var21 = param14 << 16;
              var26 = param12 << 16;
              var25 = param12 << 16;
              var18 = param13 << 16;
              var17_int = param13 << 16;
              var30 = param10 << 16;
              var29 = param10 << 16;
              var35 = -param6 + param8;
              var20 = (-param13 + param4 << 16) / var34;
              var19 = (-param13 + param3 << 16) / var35;
              if (var19 < var20) {
                var32 = (-param10 + param9 << 16) / var34;
                var31 = (param16 - param10 << 16) / var35;
                var28 = (param5 - param12 << 16) / var34;
                var33 = 0;
                var24 = (-param14 + param0 << 16) / var34;
                var23 = (param2 - param14 << 16) / var35;
                var27 = (-param12 + param15 << 16) / var35;
              } else {
                var28 = (param15 - param12 << 16) / var35;
                var32 = (param16 - param10 << 16) / var35;
                var31 = (-param10 + param9 << 16) / var34;
                var23 = (param0 - param14 << 16) / var34;
                var27 = (-param12 + param5 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var24 = (-param14 + param2 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param6 < 0) {
                if (param8 < 0) {
                  param6 = param8 - param6;
                  var25 = var25 + var27 * param6;
                  var26 = var26 + var28 * param6;
                  var17_int = var17_int + var19 * param6;
                  var21 = var21 + var23 * param6;
                  var22 = var22 + param6 * var24;
                  var29 = var29 + var31 * param6;
                  var18 = var18 + var20 * param6;
                  var30 = var30 + param6 * var32;
                  param6 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param6 = -param6;
                  var26 = var26 + param6 * var28;
                  var25 = var25 + param6 * var27;
                  var30 = var30 + param6 * var32;
                  var18 = var18 + var20 * param6;
                  var29 = var29 + param6 * var31;
                  var21 = var21 + var23 * param6;
                  var17_int = var17_int + param6 * var19;
                  var22 = var22 + var24 * param6;
                  param6 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = dj.field_a[param6];
                while (param6 < param8) {
                  var37 = var17_int >> 16;
                  if (dj.field_b > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        var37 < dj.field_b) {
                        nj.a(var29, var38, 0, var37 + var36Lifetime2, 0, 255, param11, var25, var21, 0);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var37 + var38 >= dj.field_b) {
                        var38 = -var37 + dj.field_b - 1;
                      }
                      if (var37 >= 0) {
                        nj.a(var29, var38, var39, var36Lifetime2 + var37, var41, 255, param11, var25, var21, var40);
                      } else {
                        nj.a(-(var37 * var41) + var29, var38 + var37, var39, var36Lifetime2, var41, param1 ^ -5307, param11, var25 - var37 * var40, var21 - var39 * var37, var40);
                      }
                    }
                  }
                  param6++;
                  if (dj.field_f <= param6) {
                    return;
                  }
                  var36Lifetime2 = var36Lifetime2 + eh.field_g;
                  var21 = var21 + var23;
                  var25 = var25 + var27;
                  var17_int = var17_int + var19;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var29 = var29 + var31;
                }
              }
              var36Lifetime3 = param7 - param8;
              if (var36Lifetime3 == 0) {
                var28 = 0;
                var20 = 0;
                var19 = 0;
                var31 = 0;
                var24 = 0;
                var23 = 0;
                var27 = 0;
                var32 = 0;
              } else {
                var37Lifetime2 = param4 << 16;
                var38Lifetime2 = param0 << 16;
                var39Lifetime2 = param5 << 16;
                if (var33 == 0) {
                  var29 = param16 << 16;
                  var21 = param2 << 16;
                  var25 = param15 << 16;
                  var17_int = param3 << 16;
                } else {
                  var18 = param3 << 16;
                  var30 = param16 << 16;
                  var26 = param15 << 16;
                  var22 = param2 << 16;
                }
                var40Lifetime2 = param9 << 16;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
              }
            }
            if (0 > param6) {
              param6 = -param6;
              var26 = var26 + param6 * var28;
              var18 = var18 + param6 * var20;
              var17_int = var17_int + var19 * param6;
              var30 = var30 + var32 * param6;
              var22 = var22 + param6 * var24;
              var29 = var29 + var31 * param6;
              var25 = var25 + param6 * var27;
              var21 = var21 + param6 * var23;
              param6 = 0;
            }
            var35Lifetime1 = dj.field_a[param6];
            while (param6 < param7) {
              var36Lifetime1 = var17_int >> 16;
              if (dj.field_b > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= dj.field_b) {
                    var37Lifetime1 = dj.field_b - var36Lifetime1 - 1;
                  }
                  if (var36Lifetime1 >= 0) {
                    nj.a(var29, var37Lifetime1, var38Lifetime1, var35Lifetime1 + var36Lifetime1, var40Lifetime1, 255, param11, var25, var21, var39Lifetime1);
                  } else {
                    nj.a(var29 - var40Lifetime1 * var36Lifetime1, var37Lifetime1 + var36Lifetime1, var38Lifetime1, var35Lifetime1, var40Lifetime1, param1 ^ -5307, param11, var25 - var39Lifetime1 * var36Lifetime1, -(var36Lifetime1 * var38Lifetime1) + var21, var39Lifetime1);
                  }
                } else {
                  if (0 <= var36Lifetime1 &&
                    dj.field_b > var36Lifetime1) {
                    nj.a(var29, var37Lifetime1, 0, var36Lifetime1 + var35Lifetime1, 0, 255, param11, var25, var21, 0);
                  }
                }
              }
              param6++;
              if (dj.field_f <= param6) {
                return;
              }
              var22 = var22 + var24;
              var21 = var21 + var23;
              var29 = var29 + var31;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
              var35Lifetime1 = var35Lifetime1 + eh.field_g;
              var25 = var25 + var27;
              var26 = var26 + var28;
              var18 = var18 + var20;
            }
            if (param1 != -5190) {
              of.a(83);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_76_0 = var17;
          stackIn_76_1 = new StringBuilder().append("of.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    static {
    }
}
