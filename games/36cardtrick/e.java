/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static int field_i;
    static String field_a;
    int field_g;
    static int field_c;
    int field_h;
    static char[] field_b;
    static String field_f;
    int field_d;
    static tk field_e;

    final static void a(byte param0) {
        if (param0 == 112) {
          sd.field_c.k(119);
          if (ji.field_a == null) {
            ji.field_a = new rk(sd.field_c, rk.field_ab);
          }
          sd.field_c.b(ji.field_a, (byte) 6);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -560430640) {
          field_i = -7;
        }
        field_a = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        var42 = Main.field_T;
        try {
          if (param11 >= 0 &&
            jb.field_c > param0) {
            if (param2 < 0 &&
              param5 < 0 &&
              param9 < 0) {
              return;
            }
            if (param2 >= jb.field_i &&
              jb.field_i <= param5 &&
              param9 >= jb.field_i) {
              return;
            }
            if (param12 <= 12) {
              return;
            }
            var34 = -param0 + param11;
            if (param8 == param0) {
              if (param0 == param11) {
                var21 = param1;
                var28 = 0;
                var24 = 0;
                var23 = 0;
                var22 = param3;
                var32 = 0;
                var19 = 0;
                var27 = 0;
                var18 = param5 << 16;
                var25 = param10;
                var26 = param16;
                var30 = param14;
                var29 = param4;
                var31 = 0;
                var20 = 0;
                var17_int = param2 << 16;
              } else {
                var35 = param11 - param8;
                if (param2 >= param5) {
                  var30 = param4 << 16;
                  var27 = (param15 - param16 << 16) / var35;
                  var23 = (param6 - param3 << 16) / var35;
                  var26 = param10 << 16;
                  var25 = param16 << 16;
                  var28 = (param15 - param10 << 16) / var34;
                  var32 = (param13 - param4 << 16) / var34;
                  var19 = (param9 - param5 << 16) / var35;
                  var31 = (-param14 + param13 << 16) / var35;
                  var21 = param3 << 16;
                  var20 = (-param2 + param9 << 16) / var34;
                  var17_int = param5 << 16;
                  var29 = param14 << 16;
                  var22 = param1 << 16;
                  var18 = param2 << 16;
                  var24 = (-param1 + param6 << 16) / var34;
                } else {
                  var24 = (-param3 + param6 << 16) / var35;
                  var29 = param4 << 16;
                  var21 = param1 << 16;
                  var26 = param16 << 16;
                  var20 = (-param5 + param9 << 16) / var35;
                  var25 = param10 << 16;
                  var32 = (-param14 + param13 << 16) / var35;
                  var17_int = param2 << 16;
                  var27 = (param15 - param10 << 16) / var34;
                  var19 = (-param2 + param9 << 16) / var34;
                  var18 = param5 << 16;
                  var31 = (param13 - param4 << 16) / var34;
                  var30 = param14 << 16;
                  var22 = param3 << 16;
                  var28 = (-param16 + param15 << 16) / var35;
                  var23 = (param6 - param1 << 16) / var34;
                }
              }
              var33 = 0;
              if (0 > param0) {
                param0 = Math.min(-param0, param8 - param0);
                var21 = var21 + var23 * param0;
                var22 = var22 + param0 * var24;
                var18 = var18 + var20 * param0;
                var26 = var26 + var28 * param0;
                var30 = var30 + var32 * param0;
                var17_int = var17_int + var19 * param0;
                var25 = var25 + param0 * var27;
                var29 = var29 + var31 * param0;
                param0 = 0;
              }
            } else {
              var18 = param2 << 16;
              var17_int = param2 << 16;
              var26 = param10 << 16;
              var25 = param10 << 16;
              var22 = param1 << 16;
              var21 = param1 << 16;
              var30 = param4 << 16;
              var29 = param4 << 16;
              var35 = param8 - param0;
              var19 = (-param2 + param5 << 16) / var35;
              var20 = (param9 - param2 << 16) / var34;
              if (var20 <= var19) {
                var32 = (param14 - param4 << 16) / var35;
                var27 = (-param10 + param15 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var28 = (-param10 + param16 << 16) / var35;
                var24 = (-param1 + param3 << 16) / var35;
                var23 = (-param1 + param6 << 16) / var34;
                var31 = (param13 - param4 << 16) / var34;
              } else {
                var23 = (param3 - param1 << 16) / var35;
                var32 = (-param4 + param13 << 16) / var34;
                var31 = (param14 - param4 << 16) / var35;
                var28 = (param15 - param10 << 16) / var34;
                var33 = 0;
                var27 = (param16 - param10 << 16) / var35;
                var24 = (-param1 + param6 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param8 < 0) {
                  param0 = param8 - param0;
                  var30 = var30 + param0 * var32;
                  var29 = var29 + var31 * param0;
                  var22 = var22 + var24 * param0;
                  var21 = var21 + param0 * var23;
                  var26 = var26 + param0 * var28;
                  var18 = var18 + param0 * var20;
                  var17_int = var17_int + var19 * param0;
                  var25 = var25 + var27 * param0;
                  param0 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var29 = var29 + param0 * var31;
                  var18 = var18 + var20 * param0;
                  var21 = var21 + param0 * var23;
                  var22 = var22 + param0 * var24;
                  var17_int = var17_int + var19 * param0;
                  var25 = var25 + var27 * param0;
                  var26 = var26 + param0 * var28;
                  var30 = var30 + var32 * param0;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = jb.field_e[param0];
                while (param8 > param0) {
                  var37 = var17_int >> 16;
                  if (var37 < jb.field_i) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        jb.field_i > var37) {
                        gi.a(var36Lifetime2 + var37, var25, var21, 8355711, var29, 0, param7, var38, 0, 0);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (jb.field_i <= var37 + var38) {
                        var38 = jb.field_i - var37 - 1;
                      }
                      if (var37 < 0) {
                        gi.a(var36Lifetime2, -(var37 * var40) + var25, var21 - var39 * var37, 8355711, -(var37 * var41) + var29, var40, param7, var37 + var38, var39, var41);
                      } else {
                        gi.a(var37 + var36Lifetime2, var25, var21, 8355711, var29, var40, param7, var38, var39, var41);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= jb.field_c) {
                    return;
                  }
                  var29 = var29 + var31;
                  var21 = var21 + var23;
                  var22 = var22 + var24;
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var36Lifetime2 = var36Lifetime2 + vj.field_l;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                }
              }
              var36Lifetime3 = param11 - param8;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param9 << 16;
                var38Lifetime2 = param6 << 16;
                var39Lifetime2 = param15 << 16;
                if (var33 == 0) {
                  var25 = param16 << 16;
                  var17_int = param5 << 16;
                  var29 = param14 << 16;
                  var21 = param3 << 16;
                } else {
                  var18 = param5 << 16;
                  var22 = param3 << 16;
                  var30 = param14 << 16;
                  var26 = param16 << 16;
                }
                var40Lifetime2 = param13 << 16;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
              } else {
                var23 = 0;
                var24 = 0;
                var32 = 0;
                var27 = 0;
                var19 = 0;
                var28 = 0;
                var20 = 0;
                var31 = 0;
              }
            }
            if (param0 < 0) {
              param0 = -param0;
              var22 = var22 + param0 * var24;
              var18 = var18 + var20 * param0;
              var25 = var25 + var27 * param0;
              var26 = var26 + param0 * var28;
              var17_int = var17_int + param0 * var19;
              var21 = var21 + var23 * param0;
              var30 = var30 + param0 * var32;
              var29 = var29 + var31 * param0;
              param0 = 0;
            }
            var35Lifetime1 = jb.field_e[param0];
            while (param11 > param0) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < jb.field_i) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (0 != var37Lifetime1) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= jb.field_i) {
                    var37Lifetime1 = -var36Lifetime1 + (jb.field_i - 1);
                  }
                  if (var36Lifetime1 < 0) {
                    gi.a(var35Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, 8355711, -(var40Lifetime1 * var36Lifetime1) + var29, var39Lifetime1, param7, var36Lifetime1 + var37Lifetime1, var38Lifetime1, var40Lifetime1);
                  } else {
                    gi.a(var35Lifetime1 + var36Lifetime1, var25, var21, 8355711, var29, var39Lifetime1, param7, var37Lifetime1, var38Lifetime1, var40Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    jb.field_i > var36Lifetime1) {
                    gi.a(var35Lifetime1 + var36Lifetime1, var25, var21, 8355711, var29, 0, param7, var37Lifetime1, 0, 0);
                  }
                }
              }
              param0++;
              if (jb.field_c <= param0) {
                return;
              }
              var21 = var21 + var23;
              var26 = var26 + var28;
              var25 = var25 + var27;
              var29 = var29 + var31;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + vj.field_l;
              var22 = var22 + var24;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("e.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    static {
        field_b = new char[128];
        field_f = "Error connecting to server. Please try using a different server.";
    }
}
