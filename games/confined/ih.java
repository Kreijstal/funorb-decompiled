/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_c;
    static int field_b;
    static mi field_d;
    static bi field_e;
    static int field_a;

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != -172274096) {
          ih.a(false, '\021');
        }
    }

    final static boolean a(boolean param0, char param1) {
        boolean stackIn_10_0 = false;
        if (!param0) {
          ih.a(true, (int[]) null, 125, -111, -72, 48, 84, 24, -101, 87, -75, 13, 94, 63, -39, -22, 35);
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(param1 > 90)) ||
          (!(param1 < 97) &&
          !(param1 > 122)));
        return stackIn_10_0;
    }

    final static jb a(boolean param0, boolean param1, boolean param2, boolean param3, byte param4) {
        jb stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        jb stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        jb stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        int var6;
        int var7;
        jb var8;
        jb var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = new jb(2);
        var9 = var8;
        stackIn_2_0 = var9;
        stackIn_3_1 = (!param3) ? false : true;
        stackIn_2_0.field_n = stackIn_3_1;
        stackIn_5_0 = var9;
        stackIn_6_1 = (!param0) ? false : true;
        stackIn_5_0.field_i = stackIn_6_1;
        stackIn_8_0 = var9;
        stackIn_9_1 = (!param2) ? false : true;
        stackIn_8_0.field_t = stackIn_9_1;
        if (param4 < 40) {
          field_c = (String) null;
        }
        var9.a((byte) -117, new bd(16, ba.field_Q, pn.field_a));
        var9.a((byte) -87, new bd(17, nh.field_a, pn.field_a));
        var8.field_h[0].field_b = 150;
        var8.field_h[0].field_j = 320 - var8.field_h[0].field_f / 2;
        var8.field_h[1].field_b = 250;
        var8.field_h[1].field_j = 320 - var8.field_h[1].field_f / 2;
        var9.a(param1, 26206, -1);
        var6 = var8.field_h[0].field_f;
        var7 = var8.field_h[1].field_f;
        if (var7 > var6) {
          var6 = var7;
        }
        var7Lifetime1 = pn.field_a.c(p.field_b);
        if (var7Lifetime1 > var6) {
          var6 = var7Lifetime1;
        }
        var7Lifetime2 = pn.field_a.c(fb.a(param2, param3, 0, param0));
        if (var6 < var7Lifetime2) {
          var6 = var7Lifetime2;
        }
        var7Lifetime3 = pn.field_a.c(qc.a(param3, param0, 2, param2));
        if (var7Lifetime3 > var6) {
          var6 = var7Lifetime3;
        }
        var7Lifetime4 = pn.field_a.c(ah.a(param0, param3, -108, param2));
        if (var6 < var7Lifetime4) {
          var6 = var7Lifetime4;
        }
        var9.field_c = 76;
        var9.field_s = 280 - var6 / 2;
        var9.field_k = 360 + var6 / 2 - var9.field_s;
        var9.field_b = 260;
        return var9;
    }

    final static void a(boolean param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
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
        var42 = Confined.field_J ? 1 : 0;
        try {
          if (0 <= param6 &&
            ti.field_g > param2) {
            if (param8 < 0 &&
              param14 < 0 &&
              param12 < 0) {
              return;
            }
            if (ti.field_e <= param8 &&
              ti.field_e <= param14 &&
              param12 >= ti.field_e) {
              return;
            }
            var34 = -param2 + param6;
            if (param2 != param10) {
              var22 = param15 << 16;
              var21 = param15 << 16;
              var18 = param8 << 16;
              var17_int = param8 << 16;
              var30 = param5 << 16;
              var29 = param5 << 16;
              var26 = param16 << 16;
              var25 = param16 << 16;
              var35 = -param2 + param10;
              var20 = (-param8 + param12 << 16) / var34;
              var19 = (-param8 + param14 << 16) / var35;
              if (var20 <= var19) {
                var27 = (-param16 + param11 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var23 = (param9 - param15 << 16) / var34;
                var24 = (param13 - param15 << 16) / var35;
                var32 = (param4 - param5 << 16) / var35;
                var28 = (-param16 + param3 << 16) / var35;
                var31 = (-param5 + param7 << 16) / var34;
                var33 = 1;
              } else {
                var23 = (param13 - param15 << 16) / var35;
                var24 = (param9 - param15 << 16) / var34;
                var32 = (param7 - param5 << 16) / var34;
                var28 = (-param16 + param11 << 16) / var34;
                var31 = (-param5 + param4 << 16) / var35;
                var33 = 0;
                var27 = (-param16 + param3 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param2 < 0) {
                if (param10 < 0) {
                  param2 = -param2 + param10;
                  var22 = var22 + var24 * param2;
                  var17_int = var17_int + var19 * param2;
                  var29 = var29 + param2 * var31;
                  var21 = var21 + var23 * param2;
                  var18 = var18 + param2 * var20;
                  var26 = var26 + var28 * param2;
                  var30 = var30 + var32 * param2;
                  var25 = var25 + param2 * var27;
                  param2 = param10;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var22 = var22 + param2 * var24;
                  var26 = var26 + var28 * param2;
                  var25 = var25 + var27 * param2;
                  var17_int = var17_int + var19 * param2;
                  var29 = var29 + var31 * param2;
                  var21 = var21 + param2 * var23;
                  var30 = var30 + var32 * param2;
                  var18 = var18 + var20 * param2;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ti.field_l[param2];
                while (param10 > param2) {
                  var37 = var17_int >> 16;
                  if (ti.field_e > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (var30 - var29) / var38;
                      if (ti.field_e <= var38 + var37) {
                        var38 = -1 - var37 + ti.field_e;
                      }
                      if (0 > var37) {
                        oc.a(var36Lifetime2, param1, 104, var21 - var39 * var37, -(var37 * var40) + var25, var29 - var41 * var37, var41, var39, var38 + var37, var40);
                      } else {
                        oc.a(var36Lifetime2 + var37, param1, -112, var21, var25, var29, var41, var39, var38, var40);
                      }
                    } else {
                      if (var37 >= 0 &&
                        var37 < ti.field_e) {
                        oc.a(var37 + var36Lifetime2, param1, 67, var21, var25, var29, 0, 0, var38, 0);
                      }
                    }
                  }
                  param2++;
                  if (param2 >= ti.field_g) {
                    return;
                  }
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var22 = var22 + var24;
                  var21 = var21 + var23;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var36Lifetime2 = var36Lifetime2 + fn.field_g;
                }
              }
              var36Lifetime3 = param6 - param10;
              if (0 == var36Lifetime3) {
                var28 = 0;
                var20 = 0;
                var24 = 0;
                var31 = 0;
                var19 = 0;
                var32 = 0;
                var23 = 0;
                var27 = 0;
              } else {
                var37Lifetime2 = param12 << 16;
                var38Lifetime2 = param9 << 16;
                var39Lifetime2 = param11 << 16;
                if (var33 != 0) {
                  var26 = param3 << 16;
                  var18 = param14 << 16;
                  var30 = param4 << 16;
                  var22 = param13 << 16;
                } else {
                  var21 = param13 << 16;
                  var25 = param3 << 16;
                  var17_int = param14 << 16;
                  var29 = param4 << 16;
                }
                var40Lifetime2 = param7 << 16;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
              }
            } else {
              if (param2 == param6) {
                var31 = 0;
                var26 = param3;
                var19 = 0;
                var28 = 0;
                var30 = param4;
                var20 = 0;
                var21 = param15;
                var17_int = param8 << 16;
                var18 = param14 << 16;
                var27 = 0;
                var24 = 0;
                var25 = param16;
                var23 = 0;
                var22 = param13;
                var32 = 0;
                var29 = param5;
              } else {
                var35 = param6 - param10;
                if (param14 <= param8) {
                  var25 = param3 << 16;
                  var32 = (-param5 + param7 << 16) / var34;
                  var27 = (param11 - param3 << 16) / var35;
                  var17_int = param14 << 16;
                  var30 = param5 << 16;
                  var19 = (param12 - param14 << 16) / var35;
                  var29 = param4 << 16;
                  var28 = (param11 - param16 << 16) / var34;
                  var26 = param16 << 16;
                  var21 = param13 << 16;
                  var22 = param15 << 16;
                  var18 = param8 << 16;
                  var24 = (-param15 + param9 << 16) / var34;
                  var31 = (param7 - param4 << 16) / var35;
                  var20 = (-param8 + param12 << 16) / var34;
                  var23 = (-param13 + param9 << 16) / var35;
                } else {
                  var17_int = param8 << 16;
                  var24 = (param9 - param13 << 16) / var35;
                  var23 = (-param15 + param9 << 16) / var34;
                  var26 = param3 << 16;
                  var30 = param4 << 16;
                  var32 = (-param4 + param7 << 16) / var35;
                  var28 = (-param3 + param11 << 16) / var35;
                  var19 = (-param8 + param12 << 16) / var34;
                  var27 = (-param16 + param11 << 16) / var34;
                  var20 = (-param14 + param12 << 16) / var35;
                  var31 = (param7 - param5 << 16) / var34;
                  var21 = param15 << 16;
                  var25 = param16 << 16;
                  var22 = param13 << 16;
                  var29 = param5 << 16;
                  var18 = param14 << 16;
                }
              }
              var33 = 0;
              if (param2 < 0) {
                param2 = Math.min(-param2, -param2 + param10);
                var25 = var25 + var27 * param2;
                var30 = var30 + param2 * var32;
                var26 = var26 + var28 * param2;
                var18 = var18 + param2 * var20;
                var21 = var21 + var23 * param2;
                var17_int = var17_int + param2 * var19;
                var22 = var22 + param2 * var24;
                var29 = var29 + param2 * var31;
                param2 = 0;
              }
            }
            if (0 > param2) {
              param2 = -param2;
              var25 = var25 + param2 * var27;
              var21 = var21 + var23 * param2;
              var22 = var22 + param2 * var24;
              var18 = var18 + param2 * var20;
              var30 = var30 + param2 * var32;
              var17_int = var17_int + var19 * param2;
              var26 = var26 + param2 * var28;
              var29 = var29 + var31 * param2;
              param2 = 0;
            }
            if (!param0) {
              field_d = (mi) null;
            }
            var35Lifetime1 = ti.field_l[param2];
            while (param6 > param2) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < ti.field_e) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= ti.field_e) {
                    var37Lifetime1 = -1 + (-var36Lifetime1 + ti.field_e);
                  }
                  if (var36Lifetime1 >= 0) {
                    oc.a(var35Lifetime1 + var36Lifetime1, param1, 57, var21, var25, var29, var40Lifetime1, var38Lifetime1, var37Lifetime1, var39Lifetime1);
                  } else {
                    oc.a(var35Lifetime1, param1, 82, var21 - var38Lifetime1 * var36Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, -(var40Lifetime1 * var36Lifetime1) + var29, var40Lifetime1, var38Lifetime1, var37Lifetime1 + var36Lifetime1, var39Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < ti.field_e) {
                    oc.a(var36Lifetime1 + var35Lifetime1, param1, 73, var21, var25, var29, 0, 0, var37Lifetime1, 0);
                  }
                }
              }
              param2++;
              if (param2 >= ti.field_g) {
                return;
              }
              var29 = var29 + var31;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
              var18 = var18 + var20;
              var26 = var26 + var28;
              var21 = var21 + var23;
              var35Lifetime1 = var35Lifetime1 + fn.field_g;
              var22 = var22 + var24;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_79_0 = var17;
          stackIn_79_1 = new StringBuilder().append("ih.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    static {
        field_c = "Please enter your age in years";
    }
}
