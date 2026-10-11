/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static aj field_a;
    static int field_f;
    static ci field_c;
    static String field_e;
    static vc field_d;
    static um field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 == param1) {
          var2 = sg.field_d;
        }
        int var3 = -37 % ((36 - param0) / 53);
        if (param1 == 1) {
          var2 = ii.field_Q;
        }
        if (param1 == 2) {
          var2 = v.field_d;
        }
        return var2;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 68) {
            lg.a((byte) -92);
          }
          stackIn_3_0 = hf.a(true, param1, -17, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != -122) {
          field_f = 52;
          return 1;
        }
        return 1;
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
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
        var42 = Chess.field_G;
        try {
          if (param6 >= 0 &&
            nh.field_l > param3) {
            if (param2 < 0 &&
              param14 < 0 &&
              param15 < 0) {
              return;
            }
            if (nh.field_o <= param2 &&
              param14 >= nh.field_o &&
              nh.field_o <= param15) {
              return;
            }
            if (param1) {
              lg.a((int[]) null, false, 99, -85, 76, 0, -23, 120, 25, 3, -33, 32, 68, 91, 124, 23, 71);
            }
            var34 = -param3 + param6;
            if (param12 != param3) {
              var30 = param9 << 16;
              var29 = param9 << 16;
              var18 = param2 << 16;
              var17_int = param2 << 16;
              var22 = param11 << 16;
              var21 = param11 << 16;
              var26 = param4 << 16;
              var25 = param4 << 16;
              var35 = param12 - param3;
              var20 = (-param2 + param15 << 16) / var34;
              var19 = (param14 - param2 << 16) / var35;
              if (var19 >= var20) {
                var23 = (-param11 + param13 << 16) / var34;
                var28 = (param7 - param4 << 16) / var35;
                var27 = (-param4 + param5 << 16) / var34;
                var31 = (param10 - param9 << 16) / var34;
                var33 = 1;
                var32 = (param8 - param9 << 16) / var35;
                var24 = (param16 - param11 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
              } else {
                var31 = (-param9 + param8 << 16) / var35;
                var27 = (param7 - param4 << 16) / var35;
                var32 = (-param9 + param10 << 16) / var34;
                var28 = (-param4 + param5 << 16) / var34;
                var23 = (param16 - param11 << 16) / var35;
                var33 = 0;
                var24 = (param13 - param11 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param12 < 0) {
                  param3 = -param3 + param12;
                  var17_int = var17_int + param3 * var19;
                  var30 = var30 + param3 * var32;
                  var25 = var25 + var27 * param3;
                  var18 = var18 + var20 * param3;
                  var26 = var26 + param3 * var28;
                  var29 = var29 + param3 * var31;
                  var22 = var22 + var24 * param3;
                  var21 = var21 + var23 * param3;
                  param3 = param12;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var21 = var21 + var23 * param3;
                  var29 = var29 + var31 * param3;
                  var26 = var26 + var28 * param3;
                  var17_int = var17_int + param3 * var19;
                  var30 = var30 + param3 * var32;
                  var25 = var25 + param3 * var27;
                  var22 = var22 + var24 * param3;
                  var18 = var18 + var20 * param3;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = nh.field_p[param3];
                while (param3 < param12) {
                  var37 = var17_int >> 16;
                  if (nh.field_o > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        var37 < nh.field_o) {
                        pi.a(0, 0, var25, param0, 0, var38, var29, var36Lifetime2 + var37, var21, -127);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (nh.field_o <= var37 + var38) {
                        var38 = -1 - var37 + nh.field_o;
                      }
                      if (var37 >= 0) {
                        pi.a(var41, var40, var25, param0, var39, var38, var29, var36Lifetime2 + var37, var21, 56);
                      } else {
                        pi.a(var41, var40, -(var37 * var40) + var25, param0, var39, var37 + var38, var29 - var41 * var37, var36Lifetime2, -(var37 * var39) + var21, 90);
                      }
                    }
                  }
                  param3++;
                  if (nh.field_l <= param3) {
                    return;
                  }
                  var36Lifetime2 = var36Lifetime2 + wb.field_h;
                  var22 = var22 + var24;
                  var17_int = var17_int + var19;
                  var29 = var29 + var31;
                  var21 = var21 + var23;
                  var26 = var26 + var28;
                  var25 = var25 + var27;
                  var18 = var18 + var20;
                  var30 = var30 + var32;
                }
              }
              var36Lifetime3 = -param12 + param6;
              if (var36Lifetime3 == 0) {
                var32 = 0;
                var28 = 0;
                var27 = 0;
                var20 = 0;
                var23 = 0;
                var19 = 0;
                var24 = 0;
                var31 = 0;
              } else {
                var37Lifetime2 = param15 << 16;
                var38Lifetime2 = param13 << 16;
                var39Lifetime2 = param5 << 16;
                if (var33 == 0) {
                  var17_int = param14 << 16;
                  var25 = param7 << 16;
                  var21 = param16 << 16;
                  var29 = param8 << 16;
                } else {
                  var22 = param16 << 16;
                  var26 = param7 << 16;
                  var30 = param8 << 16;
                  var18 = param14 << 16;
                }
                var40Lifetime2 = param10 << 16;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
              }
            } else {
              if (param3 == param6) {
                var31 = 0;
                var29 = param9;
                var22 = param16;
                var17_int = param2 << 16;
                var24 = 0;
                var27 = 0;
                var20 = 0;
                var26 = param7;
                var32 = 0;
                var28 = 0;
                var19 = 0;
                var30 = param8;
                var25 = param4;
                var23 = 0;
                var21 = param11;
                var18 = param14 << 16;
              } else {
                var35 = param6 - param12;
                if (param2 < param14) {
                  var26 = param7 << 16;
                  var29 = param9 << 16;
                  var17_int = param2 << 16;
                  var30 = param8 << 16;
                  var27 = (-param4 + param5 << 16) / var34;
                  var28 = (param5 - param7 << 16) / var35;
                  var18 = param14 << 16;
                  var32 = (-param8 + param10 << 16) / var35;
                  var23 = (param13 - param11 << 16) / var34;
                  var22 = param16 << 16;
                  var31 = (param10 - param9 << 16) / var34;
                  var21 = param11 << 16;
                  var20 = (-param14 + param15 << 16) / var35;
                  var25 = param4 << 16;
                  var24 = (param13 - param16 << 16) / var35;
                  var19 = (param15 - param2 << 16) / var34;
                } else {
                  var19 = (param15 - param14 << 16) / var35;
                  var24 = (-param11 + param13 << 16) / var34;
                  var22 = param11 << 16;
                  var25 = param7 << 16;
                  var26 = param4 << 16;
                  var21 = param16 << 16;
                  var31 = (param10 - param8 << 16) / var35;
                  var27 = (-param7 + param5 << 16) / var35;
                  var20 = (param15 - param2 << 16) / var34;
                  var29 = param8 << 16;
                  var17_int = param14 << 16;
                  var30 = param9 << 16;
                  var23 = (-param16 + param13 << 16) / var35;
                  var32 = (-param9 + param10 << 16) / var34;
                  var28 = (param5 - param4 << 16) / var34;
                  var18 = param2 << 16;
                }
              }
              var33 = 0;
              if (param3 < 0) {
                param3 = Math.min(-param3, -param3 + param12);
                var21 = var21 + param3 * var23;
                var22 = var22 + var24 * param3;
                var26 = var26 + var28 * param3;
                var25 = var25 + param3 * var27;
                var18 = var18 + var20 * param3;
                var17_int = var17_int + param3 * var19;
                var30 = var30 + var32 * param3;
                var29 = var29 + var31 * param3;
                param3 = 0;
              }
            }
            if (param3 < 0) {
              param3 = -param3;
              var30 = var30 + param3 * var32;
              var17_int = var17_int + var19 * param3;
              var26 = var26 + var28 * param3;
              var29 = var29 + param3 * var31;
              var21 = var21 + var23 * param3;
              var22 = var22 + param3 * var24;
              var18 = var18 + var20 * param3;
              var25 = var25 + var27 * param3;
              param3 = 0;
            }
            var35Lifetime1 = nh.field_p[param3];
            while (param6 > param3) {
              var36Lifetime1 = var17_int >> 16;
              if (nh.field_o > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (nh.field_o <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -1 + nh.field_o - var36Lifetime1;
                  }
                  if (var36Lifetime1 < 0) {
                    pi.a(var40Lifetime1, var39Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, param0, var38Lifetime1, var37Lifetime1 + var36Lifetime1, -(var40Lifetime1 * var36Lifetime1) + var29, var35Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, 4);
                  } else {
                    pi.a(var40Lifetime1, var39Lifetime1, var25, param0, var38Lifetime1, var37Lifetime1, var29, var36Lifetime1 + var35Lifetime1, var21, 84);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < nh.field_o) {
                    pi.a(0, 0, var25, param0, 0, var37Lifetime1, var29, var36Lifetime1 + var35Lifetime1, var21, 8);
                  }
                }
              }
              param3++;
              if (nh.field_l <= param3) {
                return;
              }
              var26 = var26 + var28;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var25 = var25 + var27;
              var17_int = var17_int + var19;
              var35Lifetime1 = var35Lifetime1 + wb.field_h;
              var30 = var30 + var32;
              var21 = var21 + var23;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_77_0 = var17;
          stackIn_77_1 = new StringBuilder().append("lg.C(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
        int var1 = -110 % ((50 - param0) / 35);
        field_d = null;
    }

    static {
        field_e = "white";
        field_d = new vc();
    }
}
