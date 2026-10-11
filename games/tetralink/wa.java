/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_g;
    static String[] field_b;
    static String field_h;
    static String field_i;
    static id[] field_f;
    static hl field_a;
    static int field_d;
    static wk field_c;
    static fl field_e;

    final static hl a(int param0) {
        if (param0 <= 24) {
          field_f = (id[]) null;
        }
        return fl.field_n.field_Kb;
    }

    final static void a(int param0, boolean param1) {
        if (!param1) {
          field_g = (String) null;
        }
        pb.field_b = wm.field_n[param0];
        eg.field_N = bb.field_a[param0];
        nj.field_e = hb.field_c[param0];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
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
        var42 = TetraLink.field_J;
        try {
          if (param9 >= 0 &&
            vn.field_n > param11) {
            if (param14 < 0 &&
              param6 < 0 &&
              0 > param4) {
              return;
            }
            if (vn.field_k <= param14 &&
              param6 >= vn.field_k &&
              param4 >= vn.field_k) {
              return;
            }
            if (param0 != -1979588528) {
              field_a = (hl) null;
            }
            var34 = -param11 + param9;
            if (param11 != param15) {
              var22 = param13 << 16;
              var21 = param13 << 16;
              var30 = param8 << 16;
              var29 = param8 << 16;
              var18 = param14 << 16;
              var17_int = param14 << 16;
              var26 = param10 << 16;
              var25 = param10 << 16;
              var35 = param15 - param11;
              var19 = (param6 - param14 << 16) / var35;
              var20 = (param4 - param14 << 16) / var34;
              if (var20 > var19) {
                var33 = 0;
                var24 = (-param13 + param12 << 16) / var34;
                var27 = (param7 - param10 << 16) / var35;
                var28 = (param5 - param10 << 16) / var34;
                var23 = (param3 - param13 << 16) / var35;
                var31 = (-param8 + param1 << 16) / var35;
                var32 = (-param8 + param2 << 16) / var34;
              } else {
                var31 = (param2 - param8 << 16) / var34;
                var23 = (-param13 + param12 << 16) / var34;
                var27 = (param5 - param10 << 16) / var34;
                var24 = (-param13 + param3 << 16) / var35;
                var33 = 1;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var28 = (param7 - param10 << 16) / var35;
                var32 = (param1 - param8 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param11 < 0) {
                if (param15 < 0) {
                  param11 = param15 - param11;
                  var22 = var22 + param11 * var24;
                  var30 = var30 + param11 * var32;
                  var29 = var29 + param11 * var31;
                  var26 = var26 + var28 * param11;
                  var17_int = var17_int + var19 * param11;
                  var21 = var21 + param11 * var23;
                  var18 = var18 + var20 * param11;
                  var25 = var25 + param11 * var27;
                  param11 = param15;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param11 = -param11;
                  var30 = var30 + param11 * var32;
                  var22 = var22 + param11 * var24;
                  var21 = var21 + var23 * param11;
                  var18 = var18 + param11 * var20;
                  var17_int = var17_int + param11 * var19;
                  var29 = var29 + param11 * var31;
                  var25 = var25 + var27 * param11;
                  var26 = var26 + var28 * param11;
                  param11 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = vn.field_h[param11];
                while (param11 < param15) {
                  var37 = var17_int >> 16;
                  if (vn.field_k > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (0 == var38) {
                      if (var37 >= 0 &&
                        var37 < vn.field_k) {
                        hc.a(0, param16, var38, var29, -32263, var36Lifetime2 + var37, var25, var21, 0, 0);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (vn.field_k <= var37 + var38) {
                        var38 = vn.field_k - var37 - 1;
                      }
                      if (var37 >= 0) {
                        hc.a(var39, param16, var38, var29, -32263, var36Lifetime2 + var37, var25, var21, var40, var41);
                      } else {
                        hc.a(var39, param16, var37 + var38, var29 - var37 * var41, param0 + 1979556265, var36Lifetime2, -(var37 * var40) + var25, var21 - var39 * var37, var40, var41);
                      }
                    }
                  }
                  param11++;
                  if (vn.field_n <= param11) {
                    return;
                  }
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var18 = var18 + var20;
                  var29 = var29 + var31;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                  var36Lifetime2 = var36Lifetime2 + ra.field_f;
                  var21 = var21 + var23;
                  var25 = var25 + var27;
                }
              }
              var36Lifetime3 = param9 - param15;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param4 << 16;
                var38Lifetime2 = param12 << 16;
                var39Lifetime2 = param5 << 16;
                if (var33 != 0) {
                  var26 = param7 << 16;
                  var30 = param1 << 16;
                  var22 = param3 << 16;
                  var18 = param6 << 16;
                } else {
                  var25 = param7 << 16;
                  var29 = param1 << 16;
                  var17_int = param6 << 16;
                  var21 = param3 << 16;
                }
                var40Lifetime2 = param2 << 16;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
              } else {
                var24 = 0;
                var20 = 0;
                var19 = 0;
                var28 = 0;
                var32 = 0;
                var27 = 0;
                var23 = 0;
                var31 = 0;
              }
            } else {
              if (param11 == param9) {
                var31 = 0;
                var26 = param7;
                var27 = 0;
                var25 = param10;
                var32 = 0;
                var22 = param3;
                var23 = 0;
                var20 = 0;
                var17_int = param14 << 16;
                var18 = param6 << 16;
                var21 = param13;
                var19 = 0;
                var24 = 0;
                var30 = param1;
                var29 = param8;
                var28 = 0;
              } else {
                var35 = param9 - param15;
                if (param14 >= param6) {
                  var28 = (-param10 + param5 << 16) / var34;
                  var20 = (param4 - param14 << 16) / var34;
                  var29 = param1 << 16;
                  var17_int = param6 << 16;
                  var21 = param3 << 16;
                  var22 = param13 << 16;
                  var18 = param14 << 16;
                  var23 = (-param3 + param12 << 16) / var35;
                  var19 = (-param6 + param4 << 16) / var35;
                  var24 = (param12 - param13 << 16) / var34;
                  var32 = (param2 - param8 << 16) / var34;
                  var25 = param7 << 16;
                  var26 = param10 << 16;
                  var30 = param8 << 16;
                  var31 = (-param1 + param2 << 16) / var35;
                  var27 = (param5 - param7 << 16) / var35;
                } else {
                  var22 = param3 << 16;
                  var25 = param10 << 16;
                  var24 = (param12 - param3 << 16) / var35;
                  var28 = (-param7 + param5 << 16) / var35;
                  var23 = (-param13 + param12 << 16) / var34;
                  var17_int = param14 << 16;
                  var30 = param1 << 16;
                  var18 = param6 << 16;
                  var21 = param13 << 16;
                  var19 = (param4 - param14 << 16) / var34;
                  var27 = (-param10 + param5 << 16) / var34;
                  var26 = param7 << 16;
                  var29 = param8 << 16;
                  var31 = (param2 - param8 << 16) / var34;
                  var32 = (param2 - param1 << 16) / var35;
                  var20 = (-param6 + param4 << 16) / var35;
                }
              }
              if (param11 < 0) {
                param11 = Math.min(-param11, param15 - param11);
                var17_int = var17_int + param11 * var19;
                var29 = var29 + param11 * var31;
                var18 = var18 + param11 * var20;
                var26 = var26 + param11 * var28;
                var25 = var25 + param11 * var27;
                var30 = var30 + var32 * param11;
                var22 = var22 + var24 * param11;
                var21 = var21 + param11 * var23;
                param11 = 0;
              }
              var33 = 0;
            }
            if (param11 < 0) {
              param11 = -param11;
              var25 = var25 + var27 * param11;
              var29 = var29 + var31 * param11;
              var26 = var26 + param11 * var28;
              var22 = var22 + param11 * var24;
              var17_int = var17_int + var19 * param11;
              var21 = var21 + param11 * var23;
              var18 = var18 + param11 * var20;
              var30 = var30 + var32 * param11;
              param11 = 0;
            }
            var35Lifetime1 = vn.field_h[param11];
            while (param11 < param9) {
              var36Lifetime1 = var17_int >> 16;
              if (vn.field_k > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (0 <= var36Lifetime1 &&
                    vn.field_k > var36Lifetime1) {
                    hc.a(0, param16, var37Lifetime1, var29, -32263, var35Lifetime1 + var36Lifetime1, var25, var21, 0, 0);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= vn.field_k) {
                    var37Lifetime1 = vn.field_k - var36Lifetime1 - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    hc.a(var38Lifetime1, param16, var36Lifetime1 + var37Lifetime1, -(var40Lifetime1 * var36Lifetime1) + var29, -32263, var35Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, var21 - var38Lifetime1 * var36Lifetime1, var39Lifetime1, var40Lifetime1);
                  } else {
                    hc.a(var38Lifetime1, param16, var37Lifetime1, var29, -32263, var36Lifetime1 + var35Lifetime1, var25, var21, var39Lifetime1, var40Lifetime1);
                  }
                }
              }
              param11++;
              if (param11 >= vn.field_n) {
                return;
              }
              var21 = var21 + var23;
              var29 = var29 + var31;
              var25 = var25 + var27;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var26 = var26 + var28;
              var35Lifetime1 = var35Lifetime1 + ra.field_f;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_84_0 = var17;
          stackIn_84_1 = new StringBuilder().append("wa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 >= -104) {
          field_i = (String) null;
        }
        field_b = null;
    }

    static {
        field_i = "Allow spectators?";
        field_h = "Hide players in <%0>'s game";
        field_g = "Accept";
    }
}
