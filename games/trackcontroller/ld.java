/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int[] param15, int param16) {
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
        int var42 = 0;
        int[] var43 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
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
        var42 = TrackController.field_F ? 1 : 0;
        try {
          if (0 <= param9 &&
            param11 < ig.field_d) {
            if (param4 < 0 &&
              param12 < 0 &&
              param5 < 0) {
              return;
            }
            if (ig.field_g <= param4 &&
              ig.field_g <= param12 &&
              param5 >= ig.field_g) {
              return;
            }
            var34 = -param11 + param9;
            if (!param13) {
              var43 = (int[]) null;
              ld.a(29, 6, -127, -98, -7, 42, 31, -8, 40, -32, 19, -107, 30, true, 124, (int[]) null, -97);
            }
            if (param8 != param11) {
              var26 = param2 << 16;
              var25 = param2 << 16;
              var18 = param4 << 16;
              var17_int = param4 << 16;
              var22 = param6 << 16;
              var21 = param6 << 16;
              var30 = param10 << 16;
              var29 = param10 << 16;
              var35 = -param11 + param8;
              var20 = (-param4 + param5 << 16) / var34;
              var19 = (-param4 + param12 << 16) / var35;
              if (var20 > var19) {
                var24 = (-param6 + param1 << 16) / var34;
                var27 = (-param2 + param3 << 16) / var35;
                var32 = (param16 - param10 << 16) / var34;
                var33 = 0;
                var31 = (-param10 + param0 << 16) / var35;
                var28 = (-param2 + param14 << 16) / var34;
                var23 = (param7 - param6 << 16) / var35;
              } else {
                var28 = (-param2 + param3 << 16) / var35;
                var31 = (param16 - param10 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (-param2 + param14 << 16) / var34;
                var23 = (param1 - param6 << 16) / var34;
                var33 = 1;
                var24 = (param7 - param6 << 16) / var35;
                var32 = (-param10 + param0 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param11 < 0) {
                if (param8 < 0) {
                  param11 = -param11 + param8;
                  var21 = var21 + var23 * param11;
                  var18 = var18 + param11 * var20;
                  var25 = var25 + param11 * var27;
                  var22 = var22 + var24 * param11;
                  var26 = var26 + var28 * param11;
                  var30 = var30 + var32 * param11;
                  var29 = var29 + param11 * var31;
                  var17_int = var17_int + var19 * param11;
                  param11 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param11 = -param11;
                  var18 = var18 + var20 * param11;
                  var30 = var30 + param11 * var32;
                  var26 = var26 + param11 * var28;
                  var25 = var25 + param11 * var27;
                  var22 = var22 + param11 * var24;
                  var17_int = var17_int + var19 * param11;
                  var29 = var29 + var31 * param11;
                  var21 = var21 + var23 * param11;
                  param11 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ig.field_i[param11];
                while (param8 > param11) {
                  var37 = var17_int >> 16;
                  if (var37 < ig.field_g) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (0 != var38) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (ig.field_g <= var37 + var38) {
                        var38 = -var37 + (ig.field_g - 1);
                      }
                      if (0 > var37) {
                        al.a(var41, var37 + var38, var21 - var37 * var39, var29 - var41 * var37, var40, var39, param15, -1, var36Lifetime2, -(var40 * var37) + var25);
                      } else {
                        al.a(var41, var38, var21, var29, var40, var39, param15, -1, var37 + var36Lifetime2, var25);
                      }
                    } else {
                      if (var37 >= 0 &&
                        ig.field_g > var37) {
                        al.a(0, var38, var21, var29, 0, 0, param15, -1, var37 + var36Lifetime2, var25);
                      }
                    }
                  }
                  param11++;
                  if (param11 >= ig.field_d) {
                    return;
                  }
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + ll.field_d;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var26 = var26 + var28;
                  var21 = var21 + var23;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = param9 - param8;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param5 << 16;
                var38Lifetime2 = param1 << 16;
                var39Lifetime2 = param14 << 16;
                if (var33 == 0) {
                  var17_int = param12 << 16;
                  var29 = param0 << 16;
                  var25 = param3 << 16;
                  var21 = param7 << 16;
                } else {
                  var26 = param3 << 16;
                  var30 = param0 << 16;
                  var18 = param12 << 16;
                  var22 = param7 << 16;
                }
                var40Lifetime2 = param16 << 16;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
              } else {
                var28 = 0;
                var24 = 0;
                var27 = 0;
                var23 = 0;
                var20 = 0;
                var32 = 0;
                var19 = 0;
                var31 = 0;
              }
            } else {
              if (param9 != param11) {
                var35 = -param8 + param9;
                if (param12 <= param4) {
                  var18 = param4 << 16;
                  var25 = param3 << 16;
                  var27 = (-param3 + param14 << 16) / var35;
                  var30 = param10 << 16;
                  var32 = (-param10 + param16 << 16) / var34;
                  var29 = param0 << 16;
                  var21 = param7 << 16;
                  var20 = (param5 - param4 << 16) / var34;
                  var31 = (param16 - param0 << 16) / var35;
                  var28 = (param14 - param2 << 16) / var34;
                  var19 = (param5 - param12 << 16) / var35;
                  var23 = (param1 - param7 << 16) / var35;
                  var17_int = param12 << 16;
                  var26 = param2 << 16;
                  var24 = (param1 - param6 << 16) / var34;
                  var22 = param6 << 16;
                } else {
                  var18 = param12 << 16;
                  var22 = param7 << 16;
                  var23 = (param1 - param6 << 16) / var34;
                  var25 = param2 << 16;
                  var31 = (-param10 + param16 << 16) / var34;
                  var32 = (param16 - param0 << 16) / var35;
                  var26 = param3 << 16;
                  var21 = param6 << 16;
                  var27 = (param14 - param2 << 16) / var34;
                  var19 = (-param4 + param5 << 16) / var34;
                  var24 = (-param7 + param1 << 16) / var35;
                  var28 = (param14 - param3 << 16) / var35;
                  var29 = param10 << 16;
                  var17_int = param4 << 16;
                  var20 = (param5 - param12 << 16) / var35;
                  var30 = param0 << 16;
                }
              } else {
                var28 = 0;
                var17_int = param4 << 16;
                var18 = param12 << 16;
                var20 = 0;
                var24 = 0;
                var30 = param0;
                var26 = param3;
                var29 = param10;
                var23 = 0;
                var27 = 0;
                var32 = 0;
                var25 = param2;
                var31 = 0;
                var19 = 0;
                var21 = param6;
                var22 = param7;
              }
              var33 = 0;
              if (0 > param11) {
                param11 = Math.min(-param11, -param11 + param8);
                var22 = var22 + param11 * var24;
                var26 = var26 + var28 * param11;
                var21 = var21 + param11 * var23;
                var29 = var29 + param11 * var31;
                var17_int = var17_int + var19 * param11;
                var18 = var18 + var20 * param11;
                var30 = var30 + var32 * param11;
                var25 = var25 + param11 * var27;
                param11 = 0;
              }
            }
            if (param11 < 0) {
              param11 = -param11;
              var21 = var21 + var23 * param11;
              var22 = var22 + var24 * param11;
              var17_int = var17_int + param11 * var19;
              var25 = var25 + var27 * param11;
              var18 = var18 + var20 * param11;
              var26 = var26 + param11 * var28;
              var29 = var29 + var31 * param11;
              var30 = var30 + param11 * var32;
              param11 = 0;
            }
            var35Lifetime1 = ig.field_i[param11];
            while (param9 > param11) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < ig.field_g) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 == var37Lifetime1) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < ig.field_g) {
                    al.a(0, var37Lifetime1, var21, var29, 0, 0, param15, -1, var35Lifetime1 + var36Lifetime1, var25);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= ig.field_g) {
                    var37Lifetime1 = -1 - var36Lifetime1 + ig.field_g;
                  }
                  if (var36Lifetime1 < 0) {
                    al.a(var40Lifetime1, var36Lifetime1 + var37Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, -(var40Lifetime1 * var36Lifetime1) + var29, var39Lifetime1, var38Lifetime1, param15, -1, var35Lifetime1, -(var36Lifetime1 * var39Lifetime1) + var25);
                  } else {
                    al.a(var40Lifetime1, var37Lifetime1, var21, var29, var39Lifetime1, var38Lifetime1, param15, -1, var36Lifetime1 + var35Lifetime1, var25);
                  }
                }
              }
              param11++;
              if (ig.field_d <= param11) {
                return;
              }
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + ll.field_d;
              var17_int = var17_int + var19;
              var26 = var26 + var28;
              var22 = var22 + var24;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var25 = var25 + var27;
              var30 = var30 + var32;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("ld.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param16).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -16723) {
          field_a = (String) null;
        }
        field_a = null;
    }

    final static void a(boolean param0, boolean param1) {
        sa.field_Q.a(param0, param1);
        if (!param1) {
          ld.a(false, true);
        }
    }

    final static void a(int param0, byte param1) {
        ee.field_f = TrackController.field_E[param0];
        if (param1 != -29) {
          return;
        }
        pc.field_t = ea.field_u[param0];
        jb.field_c = ff.field_c[param0];
    }

    static {
        field_a = "Unpacking sound effects";
    }
}
