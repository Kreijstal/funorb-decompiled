/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static int[] field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
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
        var42 = HoldTheLine.field_D;
        try {
          if (param5 >= ~param1 &&
            li.field_d > param15) {
            if (param9 < 0 &&
              0 > param3 &&
              param6 < 0) {
              return;
            }
            if (param9 >= li.field_i &&
              param3 >= li.field_i &&
              li.field_i <= param6) {
              return;
            }
            var34 = -param15 + param1;
            if (param15 != param12) {
              var26 = param10 << 16;
              var25 = param10 << 16;
              var30 = param13 << 16;
              var29 = param13 << 16;
              var22 = param0 << 16;
              var21 = param0 << 16;
              var18 = param9 << 16;
              var17_int = param9 << 16;
              var35 = param12 - param15;
              var19 = (-param9 + param3 << 16) / var35;
              var20 = (-param9 + param6 << 16) / var34;
              if (var20 > var19) {
                var24 = (param2 - param0 << 16) / var34;
                var31 = (param7 - param13 << 16) / var35;
                var28 = (param11 - param10 << 16) / var34;
                var32 = (-param13 + param4 << 16) / var34;
                var27 = (-param10 + param16 << 16) / var35;
                var23 = (param14 - param0 << 16) / var35;
                var33 = 0;
              } else {
                var28 = (-param10 + param16 << 16) / var35;
                var32 = (param7 - param13 << 16) / var35;
                var27 = (param11 - param10 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var24 = (param14 - param0 << 16) / var35;
                var31 = (param4 - param13 << 16) / var34;
                var23 = (param2 - param0 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (0 > param12) {
                  param15 = param12 - param15;
                  var18 = var18 + var20 * param15;
                  var22 = var22 + param15 * var24;
                  var25 = var25 + var27 * param15;
                  var26 = var26 + param15 * var28;
                  var30 = var30 + param15 * var32;
                  var21 = var21 + param15 * var23;
                  var17_int = var17_int + var19 * param15;
                  var29 = var29 + param15 * var31;
                  param15 = param12;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var30 = var30 + param15 * var32;
                  var25 = var25 + var27 * param15;
                  var21 = var21 + param15 * var23;
                  var17_int = var17_int + var19 * param15;
                  var26 = var26 + param15 * var28;
                  var22 = var22 + param15 * var24;
                  var18 = var18 + var20 * param15;
                  var29 = var29 + var31 * param15;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = li.field_a[param15];
                while (param15 < param12) {
                  var37 = var17_int >> 16;
                  if (li.field_i > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (0 == var38) {
                      if (var37 >= 0 &&
                        li.field_i > var37) {
                        sg.a(0, var37 + var36Lifetime2, 0, var25, 0, param8, var38, var29, param5 ^ 122, var21);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (li.field_i <= var37 + var38) {
                        var38 = -1 + (-var37 + li.field_i);
                      }
                      if (var37 >= 0) {
                        sg.a(var41, var36Lifetime2 + var37, var39, var25, var40, param8, var38, var29, -123, var21);
                      } else {
                        sg.a(var41, var36Lifetime2, var39, -(var37 * var40) + var25, var40, param8, var38 + var37, var29 - var41 * var37, param5 ^ 126, -(var37 * var39) + var21);
                      }
                    }
                  }
                  param15++;
                  if (li.field_d <= param15) {
                    return;
                  }
                  var17_int = var17_int + var19;
                  var30 = var30 + var32;
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + tc.field_j;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var18 = var18 + var20;
                }
              }
              var36Lifetime3 = param1 - param12;
              if (var36Lifetime3 == 0) {
                var27 = 0;
                var20 = 0;
                var23 = 0;
                var32 = 0;
                var19 = 0;
                var24 = 0;
                var31 = 0;
                var28 = 0;
              } else {
                var37Lifetime2 = param6 << 16;
                var38Lifetime2 = param2 << 16;
                var39Lifetime2 = param11 << 16;
                var40Lifetime2 = param4 << 16;
                if (var33 != 0) {
                  var18 = param3 << 16;
                  var22 = param14 << 16;
                  var26 = param16 << 16;
                  var30 = param7 << 16;
                } else {
                  var21 = param14 << 16;
                  var29 = param7 << 16;
                  var25 = param16 << 16;
                  var17_int = param3 << 16;
                }
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
              }
            } else {
              if (param15 != param1) {
                var35 = -param12 + param1;
                if (param9 >= param3) {
                  var26 = param10 << 16;
                  var30 = param13 << 16;
                  var17_int = param3 << 16;
                  var25 = param16 << 16;
                  var20 = (-param9 + param6 << 16) / var34;
                  var28 = (param11 - param10 << 16) / var34;
                  var24 = (param2 - param0 << 16) / var34;
                  var32 = (-param13 + param4 << 16) / var34;
                  var21 = param14 << 16;
                  var31 = (-param7 + param4 << 16) / var35;
                  var22 = param0 << 16;
                  var27 = (param11 - param16 << 16) / var35;
                  var29 = param7 << 16;
                  var19 = (param6 - param3 << 16) / var35;
                  var23 = (param2 - param14 << 16) / var35;
                  var18 = param9 << 16;
                } else {
                  var31 = (-param13 + param4 << 16) / var34;
                  var24 = (param2 - param14 << 16) / var35;
                  var17_int = param9 << 16;
                  var20 = (param6 - param3 << 16) / var35;
                  var32 = (-param7 + param4 << 16) / var35;
                  var27 = (-param10 + param11 << 16) / var34;
                  var18 = param3 << 16;
                  var25 = param10 << 16;
                  var26 = param16 << 16;
                  var22 = param14 << 16;
                  var28 = (-param16 + param11 << 16) / var35;
                  var23 = (-param0 + param2 << 16) / var34;
                  var21 = param0 << 16;
                  var29 = param13 << 16;
                  var19 = (param6 - param9 << 16) / var34;
                  var30 = param7 << 16;
                }
              } else {
                var26 = param16;
                var20 = 0;
                var28 = 0;
                var24 = 0;
                var19 = 0;
                var31 = 0;
                var22 = param14;
                var30 = param7;
                var21 = param0;
                var25 = param10;
                var23 = 0;
                var18 = param3 << 16;
                var17_int = param9 << 16;
                var27 = 0;
                var29 = param13;
                var32 = 0;
              }
              var33 = 0;
              if (param15 < 0) {
                param15 = Math.min(-param15, -param15 + param12);
                var18 = var18 + var20 * param15;
                var21 = var21 + var23 * param15;
                var17_int = var17_int + var19 * param15;
                var22 = var22 + var24 * param15;
                var30 = var30 + var32 * param15;
                var25 = var25 + param15 * var27;
                var29 = var29 + var31 * param15;
                var26 = var26 + var28 * param15;
                param15 = 0;
              }
            }
            if (param15 < 0) {
              param15 = -param15;
              var18 = var18 + var20 * param15;
              var21 = var21 + param15 * var23;
              var26 = var26 + var28 * param15;
              var22 = var22 + var24 * param15;
              var25 = var25 + var27 * param15;
              var17_int = var17_int + var19 * param15;
              var30 = var30 + param15 * var32;
              var29 = var29 + param15 * var31;
              param15 = 0;
            }
            var35Lifetime1 = li.field_a[param15];
            while (param15 < param1) {
              var36Lifetime1 = var17_int >> 16;
              if (li.field_i > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    li.field_i > var36Lifetime1) {
                    sg.a(0, var36Lifetime1 + var35Lifetime1, 0, var25, 0, param8, var37Lifetime1, var29, -127, var21);
                  }
                } else {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (li.field_i <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = li.field_i + (-var36Lifetime1 - 1);
                  }
                  if (0 > var36Lifetime1) {
                    sg.a(var40Lifetime1, var35Lifetime1, var38Lifetime1, var25 - var39Lifetime1 * var36Lifetime1, var39Lifetime1, param8, var37Lifetime1 + var36Lifetime1, var29 - var40Lifetime1 * var36Lifetime1, -118, var21 - var36Lifetime1 * var38Lifetime1);
                  } else {
                    sg.a(var40Lifetime1, var35Lifetime1 + var36Lifetime1, var38Lifetime1, var25, var39Lifetime1, param8, var37Lifetime1, var29, param5 ^ 121, var21);
                  }
                }
              }
              param15++;
              if (param15 >= li.field_d) {
                return;
              }
              var25 = var25 + var27;
              var29 = var29 + var31;
              var18 = var18 + var20;
              var17_int = var17_int + var19;
              var35Lifetime1 = var35Lifetime1 + tc.field_j;
              var30 = var30 + var32;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var22 = var22 + var24;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_77_0 = var17;
          stackIn_77_1 = new StringBuilder().append("fe.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static k a(byte[] param0, int param1) {
        k var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        k stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 != 1092937296) {
            var3 = (byte[]) null;
            fe.a((byte[]) null, -47);
          }
          var2 = new k(param0, la.field_j, wb.field_g, nk.field_K, ad.field_d, dd.field_E, lk.field_e);
          tk.a(false);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("fe.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -754077296) {
          fe.a(-97, 113, 16, 125, -102, -116, 48, -40, (int[]) null, -2, -100, 114, 61, -5, 101, 85, 23);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_a = "SUV";
    }
}
