/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kj {
    int field_c;
    int field_a;
    int field_e;
    static df field_d;
    static t field_b;
    static String field_f;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        df var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        try {
          if (param0 != 8) {
            return;
          }
          var1 = wa.field_d;
          while (jd.g((byte) -126)) {
            var1.f(73, 8);
            fieldTemp$0 = var1.field_n + 1;
            var1.field_n = var1.field_n + 1;
            var2 = fieldTemp$0;
            hk.a(var1, -2933);
            wa.field_d.c((byte) 48, -var2 + var1.field_n);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "kj.I(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        var42 = Torquing.field_u;
        try {
          if (param16 >= 0 &&
            param15 < be.field_f) {
            if (param2 < 0 &&
              param4 < 0 &&
              param9 < 0) {
              return;
            }
            if (be.field_p <= param2 &&
              param4 >= be.field_p &&
              be.field_p <= param9) {
              return;
            }
            if (param7 != 388870384) {
              return;
            }
            var34 = -param15 + param16;
            if (param15 == param11) {
              if (param15 == param16) {
                var18 = param4 << 16;
                var31 = 0;
                var26 = param3;
                var24 = 0;
                var22 = param8;
                var32 = 0;
                var30 = param0;
                var17_int = param2 << 16;
                var27 = 0;
                var20 = 0;
                var25 = param1;
                var23 = 0;
                var19 = 0;
                var21 = param12;
                var28 = 0;
                var29 = param14;
              } else {
                var35 = param16 - param11;
                if (param2 < param4) {
                  var29 = param14 << 16;
                  var22 = param8 << 16;
                  var31 = (-param14 + param10 << 16) / var34;
                  var20 = (-param4 + param9 << 16) / var35;
                  var28 = (-param3 + param13 << 16) / var35;
                  var32 = (param10 - param0 << 16) / var35;
                  var27 = (-param1 + param13 << 16) / var34;
                  var24 = (param6 - param8 << 16) / var35;
                  var19 = (-param2 + param9 << 16) / var34;
                  var26 = param3 << 16;
                  var30 = param0 << 16;
                  var17_int = param2 << 16;
                  var18 = param4 << 16;
                  var25 = param1 << 16;
                  var21 = param12 << 16;
                  var23 = (-param12 + param6 << 16) / var34;
                } else {
                  var19 = (param9 - param4 << 16) / var35;
                  var28 = (-param1 + param13 << 16) / var34;
                  var31 = (-param0 + param10 << 16) / var35;
                  var26 = param1 << 16;
                  var20 = (param9 - param2 << 16) / var34;
                  var30 = param14 << 16;
                  var17_int = param4 << 16;
                  var21 = param8 << 16;
                  var18 = param2 << 16;
                  var29 = param0 << 16;
                  var24 = (-param12 + param6 << 16) / var34;
                  var32 = (-param14 + param10 << 16) / var34;
                  var25 = param3 << 16;
                  var27 = (param13 - param3 << 16) / var35;
                  var23 = (-param8 + param6 << 16) / var35;
                  var22 = param12 << 16;
                }
              }
              if (param15 < 0) {
                param15 = Math.min(-param15, param11 - param15);
                var21 = var21 + param15 * var23;
                var26 = var26 + var28 * param15;
                var30 = var30 + var32 * param15;
                var18 = var18 + param15 * var20;
                var25 = var25 + var27 * param15;
                var29 = var29 + param15 * var31;
                var22 = var22 + var24 * param15;
                var17_int = var17_int + var19 * param15;
                param15 = 0;
              }
              var33 = 0;
            } else {
              var30 = param14 << 16;
              var29 = param14 << 16;
              var26 = param1 << 16;
              var25 = param1 << 16;
              var18 = param2 << 16;
              var17_int = param2 << 16;
              var22 = param12 << 16;
              var21 = param12 << 16;
              var35 = param11 - param15;
              var20 = (-param2 + param9 << 16) / var34;
              var19 = (-param2 + param4 << 16) / var35;
              if (var20 <= var19) {
                var23 = (param6 - param12 << 16) / var34;
                var28 = (-param1 + param3 << 16) / var35;
                var32 = (param0 - param14 << 16) / var35;
                var33 = 1;
                var24 = (param8 - param12 << 16) / var35;
                var31 = (-param14 + param10 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (param13 - param1 << 16) / var34;
              } else {
                var23 = (param8 - param12 << 16) / var35;
                var27 = (param3 - param1 << 16) / var35;
                var32 = (-param14 + param10 << 16) / var34;
                var28 = (param13 - param1 << 16) / var34;
                var24 = (-param12 + param6 << 16) / var34;
                var33 = 0;
                var31 = (param0 - param14 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (param11 < 0) {
                  param15 = param11 - param15;
                  var26 = var26 + var28 * param15;
                  var17_int = var17_int + param15 * var19;
                  var29 = var29 + var31 * param15;
                  var21 = var21 + param15 * var23;
                  var30 = var30 + param15 * var32;
                  var22 = var22 + param15 * var24;
                  var25 = var25 + var27 * param15;
                  var18 = var18 + var20 * param15;
                  param15 = param11;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var18 = var18 + param15 * var20;
                  var30 = var30 + param15 * var32;
                  var22 = var22 + param15 * var24;
                  var25 = var25 + param15 * var27;
                  var17_int = var17_int + param15 * var19;
                  var26 = var26 + param15 * var28;
                  var21 = var21 + var23 * param15;
                  var29 = var29 + var31 * param15;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = be.field_n[param15];
                while (param11 > param15) {
                  var37 = var17_int >> 16;
                  if (be.field_p > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        be.field_p > var37) {
                        fh.a(-1709787119, var21, var38, var29, var25, 0, 0, var37 + var36Lifetime2, 0, param5);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var38 + var37 >= be.field_p) {
                        var38 = be.field_p - var37 - 1;
                      }
                      if (var37 < 0) {
                        fh.a(-1709787119, var21 - var39 * var37, var37 + var38, -(var41 * var37) + var29, var25 - var37 * var40, var40, var41, var36Lifetime2, var39, param5);
                      } else {
                        fh.a(-1709787119, var21, var38, var29, var25, var40, var41, var36Lifetime2 + var37, var39, param5);
                      }
                    }
                  }
                  param15++;
                  if (be.field_f <= param15) {
                    return;
                  }
                  var29 = var29 + var31;
                  var22 = var22 + var24;
                  var36Lifetime2 = var36Lifetime2 + ph.field_j;
                  var18 = var18 + var20;
                  var30 = var30 + var32;
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                }
              }
              var36Lifetime3 = param16 - param11;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param9 << 16;
                var38Lifetime2 = param6 << 16;
                var39Lifetime2 = param13 << 16;
                if (var33 == 0) {
                  var21 = param8 << 16;
                  var29 = param0 << 16;
                  var17_int = param4 << 16;
                  var25 = param3 << 16;
                } else {
                  var30 = param0 << 16;
                  var18 = param4 << 16;
                  var22 = param8 << 16;
                  var26 = param3 << 16;
                }
                var40Lifetime2 = param10 << 16;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
              } else {
                var28 = 0;
                var27 = 0;
                var31 = 0;
                var32 = 0;
                var24 = 0;
                var19 = 0;
                var23 = 0;
                var20 = 0;
              }
            }
            if (param15 < 0) {
              param15 = -param15;
              var17_int = var17_int + var19 * param15;
              var18 = var18 + var20 * param15;
              var29 = var29 + var31 * param15;
              var21 = var21 + param15 * var23;
              var26 = var26 + var28 * param15;
              var22 = var22 + var24 * param15;
              var30 = var30 + param15 * var32;
              var25 = var25 + param15 * var27;
              param15 = 0;
            }
            var35Lifetime1 = be.field_n[param15];
            while (param16 > param15) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < be.field_p) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 == var37Lifetime1) {
                  if (var36Lifetime1 >= 0 &&
                    be.field_p > var36Lifetime1) {
                    fh.a(param7 - 2098657503, var21, var37Lifetime1, var29, var25, 0, 0, var36Lifetime1 + var35Lifetime1, 0, param5);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= be.field_p) {
                    var37Lifetime1 = be.field_p - var36Lifetime1 - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    fh.a(-1709787119, -(var36Lifetime1 * var38Lifetime1) + var21, var37Lifetime1 + var36Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29, -(var39Lifetime1 * var36Lifetime1) + var25, var39Lifetime1, var40Lifetime1, var35Lifetime1, var38Lifetime1, param5);
                  } else {
                    fh.a(-1709787119, var21, var37Lifetime1, var29, var25, var39Lifetime1, var40Lifetime1, var36Lifetime1 + var35Lifetime1, var38Lifetime1, param5);
                  }
                }
              }
              param15++;
              if (param15 >= be.field_f) {
                return;
              }
              var25 = var25 + var27;
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + ph.field_j;
              var22 = var22 + var24;
              var21 = var21 + var23;
              var30 = var30 + var32;
              var29 = var29 + var31;
              var26 = var26 + var28;
              var17_int = var17_int + var19;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("kj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    abstract void a(byte param0, int param1, int param2);

    public static void a(byte param0) {
        field_b = null;
        int var1 = 55 / ((36 - param0) / 55);
        field_d = null;
        field_f = null;
    }

    abstract void a(int param0, int param1, byte param2);

    abstract void a(int param0, int param1, int param2);

    kj(int param0, int param1, int param2) {
        this.field_c = param1;
        this.field_a = param0;
        this.field_e = param2;
    }

    static {
        field_f = "Quit to website";
    }
}
