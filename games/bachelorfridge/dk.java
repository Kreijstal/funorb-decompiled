/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dk extends td {
    static String field_q;
    static String field_p;

    final ii a(op param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        ii stackIn_12_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        av stackIn_43_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        av var6 = null;
        int var9 = 0;
        int var10 = 0;
        wia var11 = null;
        aga var12 = null;
        int var13 = 0;
        int var14 = 0;
        iv var15 = null;
        int var16 = 0;
        aga var17 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        var16 = BachelorFridge.field_y;
        try {
          var17 = this.field_h.a(18, param0);
          var4 = this.field_k;
          var5 = this.field_n;
          var4Lifetime1 = -2 + this.field_k + kla.a(5, param0.field_w, -2147483648);
          if (var4Lifetime1 < 0) {
            var4Lifetime1 = 0;
          }
          var5Lifetime1 = -2 + this.field_n + kla.a(5, param0.field_w, param1 + 2147483645);
          if (param0.field_z <= var4Lifetime1) {
            var4Lifetime1 = param0.field_z - 1;
          }
          if (var5Lifetime1 < 0) {
            var5Lifetime1 = 0;
          }
          if (param0.field_B <= var5Lifetime1) {
            var5Lifetime1 = -1 + param0.field_B;
          }
          var6 = new av(this.field_g, new nq(var17), this.field_k, this.field_n, var4Lifetime1, var5Lifetime1);
          if (param1 != 3) {
            stackIn_12_0 = (ii) null;
            return stackIn_12_0;
          }
          for (var7 = -3; var7 <= 3; var7++) {
            for (var8 = -3; var8 <= 3; var8++) {
              var9 = var7 + var4Lifetime1;
              var10 = var8 + var5Lifetime1;
              if (0 <= var9 &&
                param0.field_z > var9 &&
                var10 >= 0 &&
                var10 < param0.field_B) {
                var11 = param0.field_a[var9][var10];
                var12 = var11.field_l;
                if (var12 != null) {
                  if (0 <= var7) {
                    stackIn_34_0 = var7;
                  } else {
                    stackIn_34_0 = -var7;
                  }
                  if (var8 < 0) {
                    stackIn_37_1 = -var8;
                  } else {
                    stackIn_37_1 = var8;
                  }
                  var13 = stackIn_34_0 + stackIn_37_1;
                  if (var13 < ov.field_e.length) {
                    var14 = ov.field_e[var13];
                    var15 = new iv(new nq(var12), false, 1, var14, 0);
                    var6.field_o.a(var15, true);
                  }
                }
              }
            }
          }
          stackIn_43_0 = var6;
          return (ii) ((Object) stackIn_43_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_46_0 = var3;
          stackIn_46_1 = new StringBuilder().append("dk.A(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(')').toString());
        }
    }

    dk(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, byte param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        var42 = BachelorFridge.field_y;
        try {
          if (param4 >= 0 &&
            param3 < jb.field_n) {
            if (param13 < 0 &&
              param14 < 0 &&
              param6 < 0) {
              return;
            }
            if (jb.field_o <= param13 &&
              param14 >= jb.field_o &&
              jb.field_o <= param6) {
              return;
            }
            if (param8 != -68) {
              dk.a(28, -88, 0, -108, 107, -93, 5, (int[]) null, (byte) 90, -118, -41, -89, 64, -56, 104, 76, -106);
            }
            var34 = param4 - param3;
            if (param3 == param9) {
              if (param3 != param4) {
                var35 = param4 - param9;
                if (param14 > param13) {
                  var32 = (-param2 + param12 << 16) / var35;
                  var31 = (param12 - param15 << 16) / var34;
                  var22 = param0 << 16;
                  var27 = (-param10 + param1 << 16) / var34;
                  var21 = param11 << 16;
                  var18 = param14 << 16;
                  var26 = param16 << 16;
                  var24 = (-param0 + param5 << 16) / var35;
                  var29 = param15 << 16;
                  var17_int = param13 << 16;
                  var23 = (-param11 + param5 << 16) / var34;
                  var28 = (param1 - param16 << 16) / var35;
                  var25 = param10 << 16;
                  var30 = param2 << 16;
                  var19 = (-param13 + param6 << 16) / var34;
                  var20 = (-param14 + param6 << 16) / var35;
                } else {
                  var22 = param11 << 16;
                  var32 = (-param15 + param12 << 16) / var34;
                  var26 = param10 << 16;
                  var21 = param0 << 16;
                  var30 = param15 << 16;
                  var19 = (param6 - param14 << 16) / var35;
                  var25 = param16 << 16;
                  var20 = (param6 - param13 << 16) / var34;
                  var24 = (param5 - param11 << 16) / var34;
                  var28 = (-param10 + param1 << 16) / var34;
                  var23 = (-param0 + param5 << 16) / var35;
                  var17_int = param14 << 16;
                  var18 = param13 << 16;
                  var31 = (param12 - param2 << 16) / var35;
                  var29 = param2 << 16;
                  var27 = (param1 - param16 << 16) / var35;
                }
              } else {
                var27 = 0;
                var32 = 0;
                var31 = 0;
                var30 = param2;
                var20 = 0;
                var28 = 0;
                var23 = 0;
                var17_int = param13 << 16;
                var19 = 0;
                var21 = param11;
                var22 = param0;
                var25 = param10;
                var29 = param15;
                var26 = param16;
                var18 = param14 << 16;
                var24 = 0;
              }
              var33 = 0;
              if (param3 < 0) {
                param3 = Math.min(-param3, -param3 + param9);
                var25 = var25 + param3 * var27;
                var17_int = var17_int + var19 * param3;
                var29 = var29 + var31 * param3;
                var22 = var22 + var24 * param3;
                var18 = var18 + var20 * param3;
                var26 = var26 + param3 * var28;
                var21 = var21 + var23 * param3;
                var30 = var30 + var32 * param3;
                param3 = 0;
              }
            } else {
              var30 = param15 << 16;
              var29 = param15 << 16;
              var26 = param10 << 16;
              var25 = param10 << 16;
              var22 = param11 << 16;
              var21 = param11 << 16;
              var18 = param13 << 16;
              var17_int = param13 << 16;
              var35 = -param3 + param9;
              var19 = (param14 - param13 << 16) / var35;
              var20 = (-param13 + param6 << 16) / var34;
              if (var19 < var20) {
                var32 = (param12 - param15 << 16) / var34;
                var33 = 0;
                var27 = (-param10 + param16 << 16) / var35;
                var31 = (-param15 + param2 << 16) / var35;
                var24 = (param5 - param11 << 16) / var34;
                var28 = (param1 - param10 << 16) / var34;
                var23 = (param0 - param11 << 16) / var35;
              } else {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var28 = (-param10 + param16 << 16) / var35;
                var33 = 1;
                var31 = (param12 - param15 << 16) / var34;
                var27 = (param1 - param10 << 16) / var34;
                var32 = (param2 - param15 << 16) / var35;
                var23 = (param5 - param11 << 16) / var34;
                var24 = (-param11 + param0 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param9 < 0) {
                  param3 = -param3 + param9;
                  var17_int = var17_int + param3 * var19;
                  var25 = var25 + param3 * var27;
                  var18 = var18 + param3 * var20;
                  var26 = var26 + var28 * param3;
                  var29 = var29 + param3 * var31;
                  var30 = var30 + var32 * param3;
                  var22 = var22 + param3 * var24;
                  var21 = var21 + var23 * param3;
                  param3 = param9;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var25 = var25 + param3 * var27;
                  var26 = var26 + var28 * param3;
                  var17_int = var17_int + param3 * var19;
                  var18 = var18 + var20 * param3;
                  var30 = var30 + param3 * var32;
                  var22 = var22 + param3 * var24;
                  var29 = var29 + param3 * var31;
                  var21 = var21 + param3 * var23;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = jb.field_a[param3];
                while (param3 < param9) {
                  var37 = var17_int >> 16;
                  if (var37 < jb.field_o) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var38 + var37 >= jb.field_o) {
                        var38 = -1 + (-var37 + jb.field_o);
                      }
                      if (var37 < 0) {
                        oj.a(-(var39 * var37) + var21, var39, 92, var36Lifetime2, param7, var29 - var41 * var37, -(var40 * var37) + var25, var38 + var37, var40, var41);
                      } else {
                        oj.a(var21, var39, 120, var36Lifetime2 + var37, param7, var29, var25, var38, var40, var41);
                      }
                    } else {
                      if (var37 >= 0 &&
                        jb.field_o > var37) {
                        oj.a(var21, 0, 91, var36Lifetime2 + var37, param7, var29, var25, var38, 0, 0);
                      }
                    }
                  }
                  param3++;
                  if (jb.field_n <= param3) {
                    return;
                  }
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                  var17_int = var17_int + var19;
                  var18 = var18 + var20;
                  var21 = var21 + var23;
                  var29 = var29 + var31;
                  var25 = var25 + var27;
                  var36Lifetime2 = var36Lifetime2 + dg.field_i;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = -param9 + param4;
              if (var36Lifetime3 == 0) {
                var19 = 0;
                var24 = 0;
                var31 = 0;
                var20 = 0;
                var23 = 0;
                var28 = 0;
                var32 = 0;
                var27 = 0;
              } else {
                var37Lifetime2 = param6 << 16;
                var38Lifetime2 = param5 << 16;
                var39Lifetime2 = param1 << 16;
                var40Lifetime2 = param12 << 16;
                if (var33 == 0) {
                  var29 = param2 << 16;
                  var25 = param16 << 16;
                  var21 = param0 << 16;
                  var17_int = param14 << 16;
                } else {
                  var22 = param0 << 16;
                  var26 = param16 << 16;
                  var30 = param2 << 16;
                  var18 = param14 << 16;
                }
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
              }
            }
            if (param3 < 0) {
              param3 = -param3;
              var25 = var25 + param3 * var27;
              var29 = var29 + param3 * var31;
              var21 = var21 + param3 * var23;
              var18 = var18 + param3 * var20;
              var22 = var22 + var24 * param3;
              var17_int = var17_int + param3 * var19;
              var26 = var26 + var28 * param3;
              var30 = var30 + param3 * var32;
              param3 = 0;
            }
            var35Lifetime1 = jb.field_a[param3];
            while (param4 > param3) {
              var36Lifetime1 = var17_int >> 16;
              if (jb.field_o > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (jb.field_o <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + jb.field_o - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    oj.a(-(var38Lifetime1 * var36Lifetime1) + var21, var38Lifetime1, 97, var35Lifetime1, param7, var29 - var40Lifetime1 * var36Lifetime1, -(var36Lifetime1 * var39Lifetime1) + var25, var37Lifetime1 + var36Lifetime1, var39Lifetime1, var40Lifetime1);
                  } else {
                    oj.a(var21, var38Lifetime1, 123, var36Lifetime1 + var35Lifetime1, param7, var29, var25, var37Lifetime1, var39Lifetime1, var40Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < jb.field_o) {
                    oj.a(var21, 0, 78, var36Lifetime1 + var35Lifetime1, param7, var29, var25, var37Lifetime1, 0, 0);
                  }
                }
              }
              param3++;
              if (jb.field_n <= param3) {
                return;
              }
              var17_int = var17_int + var19;
              var26 = var26 + var28;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var21 = var21 + var23;
              var25 = var25 + var27;
              var30 = var30 + var32;
              var29 = var29 + var31;
              var35Lifetime1 = var35Lifetime1 + dg.field_i;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_78_0 = var17;
          stackIn_78_1 = new StringBuilder().append("dk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        try {
          if (param9 != 455530063) {
            field_p = (String) null;
          }
          for (param1 = -param12; 0 > param1; param1++) {
            for (param11 = -param2; param11 < 0; param11++) {
              param6 = param8[param10++];
              if ((param6 & -33554432) == 0) {
                param7++;
              } else {
                param0 = (255 & param6) + (param6 >> 15 & 510);
                param6 = ((param6 & 65347) >> 8) + param0 / 3 >> 1;
                if (param6 == 0) {
                  param6 = 1;
                }
                param6 = (param6 << 8) + (param6 << 16) + param6;
                param3[param7++] = param6;
              }
            }
            param7 = param7 + param4;
            param10 = param10 + param5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_17_0 = var13;
          stackIn_17_1 = new StringBuilder().append("dk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final static void a(Object[] param0, byte param1, int[] param2) {
        try {
          if (param1 <= 85) {
            field_q = (String) null;
          }
          ea.a(-1 + param2.length, 0, (byte) 27, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 != -19353) {
          int[] var2 = (int[]) null;
          dk.a(-88, 87, 19, (int[]) null, -13, 60, -25, 60, (int[]) null, -102, 66, -4, 77);
        }
        field_p = null;
    }

    static {
        field_q = "Cancel rematch";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$e46325ef0b7e(Object[] param0, int param1, int[] param2) {
        try {
          if (param1 <= 85) {
            field_q = (String) null;
          }
          ea.a(-1 + param2.length, 0, (byte) 27, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
