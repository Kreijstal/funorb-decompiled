/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class emb extends rqa {
    static int field_p;
    static int[] field_o;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        var42 = VoidHunters.field_G;
        try {
          if (param3 >= 0 &&
            bfb.field_h > param7) {
            if (param15 < ~param9 &&
              param14 < 0 &&
              param16 < 0) {
              return;
            }
            if (param9 >= bfb.field_a &&
              bfb.field_a <= param14 &&
              bfb.field_a <= param16) {
              return;
            }
            var34 = -param7 + param3;
            if (param7 != param13) {
              var26 = param8 << 16;
              var25 = param8 << 16;
              var30 = param2 << 16;
              var29 = param2 << 16;
              var22 = param5 << 16;
              var21 = param5 << 16;
              var18 = param9 << 16;
              var17_int = param9 << 16;
              var35 = -param7 + param13;
              var19 = (-param9 + param14 << 16) / var35;
              var20 = (-param9 + param16 << 16) / var34;
              if (var20 > var19) {
                var33 = 0;
                var24 = (param12 - param5 << 16) / var34;
                var28 = (param11 - param8 << 16) / var34;
                var27 = (-param8 + param0 << 16) / var35;
                var23 = (-param5 + param1 << 16) / var35;
                var31 = (-param2 + param6 << 16) / var35;
                var32 = (param10 - param2 << 16) / var34;
              } else {
                var24 = (param1 - param5 << 16) / var35;
                var33 = 1;
                var27 = (-param8 + param11 << 16) / var34;
                var28 = (-param8 + param0 << 16) / var35;
                var23 = (param12 - param5 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (-param2 + param6 << 16) / var35;
                var31 = (param10 - param2 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param13 < 0) {
                  param7 = param13 - param7;
                  var29 = var29 + param7 * var31;
                  var18 = var18 + var20 * param7;
                  var22 = var22 + param7 * var24;
                  var25 = var25 + var27 * param7;
                  var21 = var21 + param7 * var23;
                  var17_int = var17_int + var19 * param7;
                  var30 = var30 + param7 * var32;
                  var26 = var26 + param7 * var28;
                  param7 = param13;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var18 = var18 + var20 * param7;
                  var30 = var30 + param7 * var32;
                  var29 = var29 + param7 * var31;
                  var21 = var21 + var23 * param7;
                  var26 = var26 + var28 * param7;
                  var22 = var22 + param7 * var24;
                  var17_int = var17_int + var19 * param7;
                  var25 = var25 + param7 * var27;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = bfb.field_g[param7];
                while (param7 < param13) {
                  var37 = var17_int >> 16;
                  if (bfb.field_a > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        bfb.field_a > var37) {
                        bdb.a(var25, 0, var21, var37 + var36Lifetime2, var38, 0, var29, param4, 0, true);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (bfb.field_a <= var38 + var37) {
                        var38 = -var37 + bfb.field_a - 1;
                      }
                      if (var37 < 0) {
                        bdb.a(-(var37 * var40) + var25, var40, var21 - var37 * var39, var36Lifetime2, var37 + var38, var41, -(var41 * var37) + var29, param4, var39, true);
                      } else {
                        bdb.a(var25, var40, var21, var37 + var36Lifetime2, var38, var41, var29, param4, var39, true);
                      }
                    }
                  }
                  param7++;
                  if (param7 >= bfb.field_h) {
                    return;
                  }
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + dma.field_g;
                  var25 = var25 + var27;
                  var26 = var26 + var28;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var18 = var18 + var20;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = -param13 + param3;
              if (var36Lifetime3 == 0) {
                var32 = 0;
                var31 = 0;
                var20 = 0;
                var19 = 0;
                var28 = 0;
                var23 = 0;
                var27 = 0;
                var24 = 0;
              } else {
                var37Lifetime2 = param16 << 16;
                var38Lifetime2 = param12 << 16;
                var39Lifetime2 = param11 << 16;
                var40Lifetime2 = param10 << 16;
                if (var33 == 0) {
                  var17_int = param14 << 16;
                  var21 = param1 << 16;
                  var25 = param0 << 16;
                  var29 = param6 << 16;
                } else {
                  var22 = param1 << 16;
                  var30 = param6 << 16;
                  var18 = param14 << 16;
                  var26 = param0 << 16;
                }
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
              }
            } else {
              if (param3 != param7) {
                var35 = -param13 + param3;
                if (param14 > param9) {
                  var25 = param8 << 16;
                  var27 = (param11 - param8 << 16) / var34;
                  var26 = param0 << 16;
                  var24 = (param12 - param1 << 16) / var35;
                  var20 = (param16 - param14 << 16) / var35;
                  var30 = param6 << 16;
                  var29 = param2 << 16;
                  var18 = param14 << 16;
                  var23 = (param12 - param5 << 16) / var34;
                  var28 = (param11 - param0 << 16) / var35;
                  var17_int = param9 << 16;
                  var19 = (param16 - param9 << 16) / var34;
                  var32 = (param10 - param6 << 16) / var35;
                  var31 = (-param2 + param10 << 16) / var34;
                  var22 = param1 << 16;
                  var21 = param5 << 16;
                } else {
                  var25 = param0 << 16;
                  var21 = param1 << 16;
                  var18 = param9 << 16;
                  var27 = (-param0 + param11 << 16) / var35;
                  var20 = (-param9 + param16 << 16) / var34;
                  var17_int = param14 << 16;
                  var30 = param2 << 16;
                  var29 = param6 << 16;
                  var32 = (param10 - param2 << 16) / var34;
                  var23 = (-param1 + param12 << 16) / var35;
                  var22 = param5 << 16;
                  var31 = (-param6 + param10 << 16) / var35;
                  var26 = param8 << 16;
                  var28 = (-param8 + param11 << 16) / var34;
                  var24 = (param12 - param5 << 16) / var34;
                  var19 = (-param14 + param16 << 16) / var35;
                }
              } else {
                var27 = 0;
                var18 = param14 << 16;
                var20 = 0;
                var17_int = param9 << 16;
                var31 = 0;
                var23 = 0;
                var32 = 0;
                var24 = 0;
                var26 = param0;
                var19 = 0;
                var30 = param6;
                var22 = param1;
                var28 = 0;
                var21 = param5;
                var25 = param8;
                var29 = param2;
              }
              var33 = 0;
              if (param7 < 0) {
                param7 = Math.min(-param7, param13 - param7);
                var18 = var18 + param7 * var20;
                var21 = var21 + var23 * param7;
                var26 = var26 + var28 * param7;
                var25 = var25 + var27 * param7;
                var29 = var29 + param7 * var31;
                var22 = var22 + var24 * param7;
                var30 = var30 + param7 * var32;
                var17_int = var17_int + var19 * param7;
                param7 = 0;
              }
            }
            if (param7 < 0) {
              param7 = -param7;
              var22 = var22 + param7 * var24;
              var21 = var21 + var23 * param7;
              var30 = var30 + var32 * param7;
              var29 = var29 + var31 * param7;
              var18 = var18 + var20 * param7;
              var26 = var26 + param7 * var28;
              var25 = var25 + var27 * param7;
              var17_int = var17_int + param7 * var19;
              param7 = 0;
            }
            var35Lifetime1 = bfb.field_g[param7];
            while (param7 < param3) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < bfb.field_a) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (bfb.field_a <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + bfb.field_a - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    bdb.a(var25 - var36Lifetime1 * var39Lifetime1, var39Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, var35Lifetime1, var37Lifetime1 + var36Lifetime1, var40Lifetime1, var29 - var36Lifetime1 * var40Lifetime1, param4, var38Lifetime1, true);
                  } else {
                    bdb.a(var25, var39Lifetime1, var21, var36Lifetime1 + var35Lifetime1, var37Lifetime1, var40Lifetime1, var29, param4, var38Lifetime1, true);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < bfb.field_a) {
                    bdb.a(var25, 0, var21, var36Lifetime1 + var35Lifetime1, var37Lifetime1, 0, var29, param4, 0, true);
                  }
                }
              }
              param7++;
              if (param7 >= bfb.field_h) {
                return;
              }
              var30 = var30 + var32;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var35Lifetime1 = var35Lifetime1 + dma.field_g;
              var26 = var26 + var28;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var21 = var21 + var23;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_76_0 = var17;
          stackIn_76_1 = new StringBuilder().append("emb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    emb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            emb.a(62);
          }
          si.a(76, 62, param0[0].a(92));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("emb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 23518) {
          emb.a(-25, -40, 101, -77, (int[]) null, -65, 79, 17, 32, 59, 77, -19, 88, -80, -117, 21, 79);
        }
        field_o = null;
    }

    static {
        field_p = 0;
    }
}
