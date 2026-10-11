/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ica {
    static boolean field_a;
    static long field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
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
        var42 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 <= param15 &&
            param16 < uoa.field_b) {
            if (0 > param14 &&
              0 > param8 &&
              param5 < 0) {
              return;
            }
            if (param14 >= uoa.field_e &&
              uoa.field_e <= param8 &&
              uoa.field_e <= param5) {
              return;
            }
            var34 = param15 - param16;
            if (param0 == param16) {
              if (param16 != param15) {
                var35 = param15 - param0;
                if (param8 > param14) {
                  var17_int = param14 << 16;
                  var23 = (param10 - param1 << 16) / var34;
                  var25 = param7 << 16;
                  var22 = param2 << 16;
                  var27 = (param9 - param7 << 16) / var34;
                  var24 = (-param2 + param10 << 16) / var35;
                  var30 = param12 << 16;
                  var19 = (-param14 + param5 << 16) / var34;
                  var28 = (-param3 + param9 << 16) / var35;
                  var29 = param13 << 16;
                  var18 = param8 << 16;
                  var26 = param3 << 16;
                  var32 = (param11 - param12 << 16) / var35;
                  var20 = (-param8 + param5 << 16) / var35;
                  var21 = param1 << 16;
                  var31 = (param11 - param13 << 16) / var34;
                } else {
                  var22 = param1 << 16;
                  var32 = (-param13 + param11 << 16) / var34;
                  var29 = param12 << 16;
                  var28 = (-param7 + param9 << 16) / var34;
                  var19 = (param5 - param8 << 16) / var35;
                  var27 = (param9 - param3 << 16) / var35;
                  var30 = param13 << 16;
                  var18 = param14 << 16;
                  var21 = param2 << 16;
                  var31 = (-param12 + param11 << 16) / var35;
                  var20 = (-param14 + param5 << 16) / var34;
                  var25 = param3 << 16;
                  var26 = param7 << 16;
                  var17_int = param8 << 16;
                  var23 = (param10 - param2 << 16) / var35;
                  var24 = (param10 - param1 << 16) / var34;
                }
              } else {
                var17_int = param14 << 16;
                var32 = 0;
                var26 = param3;
                var30 = param12;
                var20 = 0;
                var19 = 0;
                var28 = 0;
                var29 = param13;
                var22 = param2;
                var27 = 0;
                var18 = param8 << 16;
                var23 = 0;
                var21 = param1;
                var25 = param7;
                var24 = 0;
                var31 = 0;
              }
              if (param16 < 0) {
                param16 = Math.min(-param16, param0 - param16);
                var26 = var26 + var28 * param16;
                var30 = var30 + param16 * var32;
                var25 = var25 + param16 * var27;
                var29 = var29 + param16 * var31;
                var17_int = var17_int + param16 * var19;
                var21 = var21 + var23 * param16;
                var18 = var18 + param16 * var20;
                var22 = var22 + param16 * var24;
                param16 = 0;
              }
              var33 = 0;
            } else {
              var18 = param14 << 16;
              var17_int = param14 << 16;
              var26 = param7 << 16;
              var25 = param7 << 16;
              var30 = param13 << 16;
              var29 = param13 << 16;
              var22 = param1 << 16;
              var21 = param1 << 16;
              var35 = param0 - param16;
              var20 = (-param14 + param5 << 16) / var34;
              var19 = (param8 - param14 << 16) / var35;
              if (var19 >= var20) {
                var23 = (-param1 + param10 << 16) / var34;
                var27 = (param9 - param7 << 16) / var34;
                var31 = (param11 - param13 << 16) / var34;
                var24 = (-param1 + param2 << 16) / var35;
                var28 = (param3 - param7 << 16) / var35;
                var33 = 1;
                var32 = (-param13 + param12 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
              } else {
                var31 = (param12 - param13 << 16) / var35;
                var33 = 0;
                var27 = (-param7 + param3 << 16) / var35;
                var23 = (-param1 + param2 << 16) / var35;
                var28 = (-param7 + param9 << 16) / var34;
                var32 = (param11 - param13 << 16) / var34;
                var24 = (-param1 + param10 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param16 < 0) {
                if (0 > param0) {
                  param16 = -param16 + param0;
                  var29 = var29 + param16 * var31;
                  var22 = var22 + param16 * var24;
                  var21 = var21 + param16 * var23;
                  var30 = var30 + param16 * var32;
                  var26 = var26 + var28 * param16;
                  var18 = var18 + var20 * param16;
                  var17_int = var17_int + param16 * var19;
                  var25 = var25 + var27 * param16;
                  param16 = param0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param16 = -param16;
                  var18 = var18 + param16 * var20;
                  var17_int = var17_int + param16 * var19;
                  var22 = var22 + param16 * var24;
                  var26 = var26 + param16 * var28;
                  var21 = var21 + param16 * var23;
                  var25 = var25 + var27 * param16;
                  var30 = var30 + var32 * param16;
                  var29 = var29 + param16 * var31;
                  param16 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = uoa.field_d[param16];
                while (param16 < param0) {
                  var37 = var17_int >> 16;
                  if (uoa.field_e > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (uoa.field_e <= var37 + var38) {
                        var38 = uoa.field_e - var37 - 1;
                      }
                      if (var37 < 0) {
                        qga.a(-(var37 * var41) + var29, var25 - var37 * var40, param6, var39, var36Lifetime2, -116, var38 + var37, var40, -(var39 * var37) + var21, var41);
                      } else {
                        qga.a(var29, var25, param6, var39, var36Lifetime2 + var37, param4 - 113, var38, var40, var21, var41);
                      }
                    } else {
                      if (var37 >= 0 &&
                        uoa.field_e > var37) {
                        qga.a(var29, var25, param6, 0, var37 + var36Lifetime2, param4 ^ -108, var38, 0, var21, 0);
                      }
                    }
                  }
                  param16++;
                  if (param16 >= uoa.field_b) {
                    return;
                  }
                  var25 = var25 + var27;
                  var18 = var18 + var20;
                  var30 = var30 + var32;
                  var17_int = var17_int + var19;
                  var26 = var26 + var28;
                  var29 = var29 + var31;
                  var22 = var22 + var24;
                  var36Lifetime2 = var36Lifetime2 + bea.field_g;
                  var21 = var21 + var23;
                }
              }
              var36Lifetime3 = param15 - param0;
              if (0 == var36Lifetime3) {
                var27 = 0;
                var20 = 0;
                var31 = 0;
                var24 = 0;
                var28 = 0;
                var32 = 0;
                var19 = 0;
                var23 = 0;
              } else {
                var37Lifetime2 = param5 << 16;
                var38Lifetime2 = param10 << 16;
                var39Lifetime2 = param9 << 16;
                if (var33 != 0) {
                  var18 = param8 << 16;
                  var26 = param3 << 16;
                  var30 = param12 << 16;
                  var22 = param2 << 16;
                } else {
                  var17_int = param8 << 16;
                  var29 = param12 << 16;
                  var21 = param2 << 16;
                  var25 = param3 << 16;
                }
                var40Lifetime2 = param11 << 16;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
              }
            }
            if (param16 < 0) {
              param16 = -param16;
              var25 = var25 + param16 * var27;
              var21 = var21 + var23 * param16;
              var29 = var29 + var31 * param16;
              var17_int = var17_int + var19 * param16;
              var26 = var26 + var28 * param16;
              var22 = var22 + param16 * var24;
              var30 = var30 + param16 * var32;
              var18 = var18 + param16 * var20;
              param16 = 0;
            }
            var35Lifetime1 = uoa.field_d[param16];
            while (param15 > param16) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < uoa.field_e) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 == 0) {
                  if (0 <= var36Lifetime1 &&
                    uoa.field_e > var36Lifetime1) {
                    qga.a(var29, var25, param6, 0, var35Lifetime1 + var36Lifetime1, -112, var37Lifetime1, 0, var21, 0);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (uoa.field_e <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = uoa.field_e - var36Lifetime1 - 1;
                  }
                  if (var36Lifetime1 >= 0) {
                    qga.a(var29, var25, param6, var38Lifetime1, var36Lifetime1 + var35Lifetime1, -123, var37Lifetime1, var39Lifetime1, var21, var40Lifetime1);
                  } else {
                    qga.a(var29 - var36Lifetime1 * var40Lifetime1, -(var36Lifetime1 * var39Lifetime1) + var25, param6, var38Lifetime1, var35Lifetime1, -127, var36Lifetime1 + var37Lifetime1, var39Lifetime1, -(var36Lifetime1 * var38Lifetime1) + var21, var40Lifetime1);
                  }
                }
              }
              param16++;
              if (param16 >= uoa.field_b) {
                return;
              }
              var18 = var18 + var20;
              var22 = var22 + var24;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
              var29 = var29 + var31;
              var35Lifetime1 = var35Lifetime1 + bea.field_g;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_77_0 = var17;
          stackIn_77_1 = new StringBuilder().append("ica.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(int param0) {
        iu var1 = null;
        iu var2 = null;
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
          var1 = new iu(540, 140);
          nm.a(var1, (byte) 112);
          uoa.b();
          bea.a();
          tl.field_r = 0;
          uw.a(false);
          var2 = var1.a();
          if (param0 != 16777215) {
            field_b = 106L;
          }
          for (var3 = 0; 15 > var3; var3++) {
            var2.b(-2, -2, 16777215);
            bea.a(4, 4, 0, 0, 540, 140);
          }
          bw.field_a.c();
          var1.c(0, 0);
          pfa.a(1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ica.B(" + param0 + ')');
        }
    }

    static {
        field_a = true;
    }
}
