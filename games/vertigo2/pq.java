/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    static long field_e;
    static int[] field_c;
    static wk field_f;
    static String field_a;
    private int[] field_d;
    static String field_g;
    static String field_b;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        var3 = -1 + (this.field_d.length >> 1);
        if (param1 != 1) {
          field_f = (wk) null;
        }
        var4 = param0 & var3;
        while (true) {
          var5 = this.field_d[var4 + (var4 + 1)];
          if (var5 == -1) {
            return -1;
          }
          if (param0 == this.field_d[var4 + var4]) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -1) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, boolean param14, int param15, int param16) {
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var42 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 >= 0 &&
            param7 < oo.field_b) {
            if (param2 < 0 &&
              0 > param12 &&
              param8 < 0) {
              return;
            }
            if (param2 >= oo.field_q &&
              oo.field_q <= param12 &&
              oo.field_q <= param8) {
              return;
            }
            if (!param14) {
              return;
            }
            var34 = -param7 + param3;
            if (param16 != param7) {
              var30 = param15 << 16;
              var29 = param15 << 16;
              var22 = param5 << 16;
              var21 = param5 << 16;
              var26 = param0 << 16;
              var25 = param0 << 16;
              var18 = param2 << 16;
              var17_int = param2 << 16;
              var35 = param16 - param7;
              var19 = (-param2 + param12 << 16) / var35;
              var20 = (-param2 + param8 << 16) / var34;
              if (var19 >= var20) {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var28 = (param1 - param0 << 16) / var35;
                var24 = (-param5 + param9 << 16) / var35;
                var23 = (param4 - param5 << 16) / var34;
                var32 = (param6 - param15 << 16) / var35;
                var27 = (-param0 + param11 << 16) / var34;
                var31 = (-param15 + param10 << 16) / var34;
              } else {
                var28 = (-param0 + param11 << 16) / var34;
                var32 = (-param15 + param10 << 16) / var34;
                var31 = (param6 - param15 << 16) / var35;
                var33 = 0;
                var24 = (-param5 + param4 << 16) / var34;
                var27 = (param1 - param0 << 16) / var35;
                var23 = (-param5 + param9 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param16 < 0) {
                  param7 = param16 - param7;
                  var22 = var22 + param7 * var24;
                  var18 = var18 + var20 * param7;
                  var17_int = var17_int + param7 * var19;
                  var30 = var30 + var32 * param7;
                  var29 = var29 + var31 * param7;
                  var25 = var25 + param7 * var27;
                  var26 = var26 + var28 * param7;
                  var21 = var21 + param7 * var23;
                  param7 = param16;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var21 = var21 + var23 * param7;
                  var22 = var22 + param7 * var24;
                  var17_int = var17_int + param7 * var19;
                  var30 = var30 + var32 * param7;
                  var29 = var29 + var31 * param7;
                  var25 = var25 + var27 * param7;
                  var18 = var18 + var20 * param7;
                  var26 = var26 + var28 * param7;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = oo.field_a[param7];
                while (param16 > param7) {
                  var37 = var17_int >> 16;
                  if (oo.field_q > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        var37 < oo.field_q) {
                        hm.a(0, 0, var25, var38, (byte) 120, var21, var29, param13, var36Lifetime2 + var37, 0);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var37 + var38 >= oo.field_q) {
                        var38 = -var37 + (oo.field_q - 1);
                      }
                      if (var37 >= 0) {
                        hm.a(var41, var40, var25, var38, (byte) 52, var21, var29, param13, var37 + var36Lifetime2, var39);
                      } else {
                        hm.a(var41, var40, var25 - var40 * var37, var37 + var38, (byte) 40, var21 - var37 * var39, -(var41 * var37) + var29, param13, var36Lifetime2, var39);
                      }
                    }
                  }
                  param7++;
                  if (param7 >= oo.field_b) {
                    return;
                  }
                  var17_int = var17_int + var19;
                  var18 = var18 + var20;
                  var36Lifetime2 = var36Lifetime2 + bi.field_e;
                  var26 = var26 + var28;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var29 = var29 + var31;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = -param16 + param3;
              if (var36Lifetime3 == 0) {
                var20 = 0;
                var32 = 0;
                var27 = 0;
                var28 = 0;
                var24 = 0;
                var19 = 0;
                var31 = 0;
                var23 = 0;
              } else {
                var37Lifetime2 = param8 << 16;
                var38Lifetime2 = param4 << 16;
                var39Lifetime2 = param11 << 16;
                if (var33 == 0) {
                  var29 = param6 << 16;
                  var25 = param1 << 16;
                  var17_int = param12 << 16;
                  var21 = param9 << 16;
                } else {
                  var30 = param6 << 16;
                  var18 = param12 << 16;
                  var22 = param9 << 16;
                  var26 = param1 << 16;
                }
                var40Lifetime2 = param10 << 16;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
              }
            } else {
              if (param7 == param3) {
                var27 = 0;
                var22 = param9;
                var28 = 0;
                var25 = param0;
                var31 = 0;
                var23 = 0;
                var26 = param1;
                var20 = 0;
                var30 = param6;
                var24 = 0;
                var32 = 0;
                var19 = 0;
                var17_int = param2 << 16;
                var29 = param15;
                var18 = param12 << 16;
                var21 = param5;
              } else {
                var35 = param3 - param16;
                if (param2 < param12) {
                  var25 = param0 << 16;
                  var23 = (param4 - param5 << 16) / var34;
                  var22 = param9 << 16;
                  var18 = param12 << 16;
                  var27 = (-param0 + param11 << 16) / var34;
                  var26 = param1 << 16;
                  var28 = (param11 - param1 << 16) / var35;
                  var20 = (param8 - param12 << 16) / var35;
                  var17_int = param2 << 16;
                  var32 = (-param6 + param10 << 16) / var35;
                  var24 = (param4 - param9 << 16) / var35;
                  var29 = param15 << 16;
                  var30 = param6 << 16;
                  var31 = (param10 - param15 << 16) / var34;
                  var19 = (-param2 + param8 << 16) / var34;
                  var21 = param5 << 16;
                } else {
                  var32 = (-param15 + param10 << 16) / var34;
                  var24 = (param4 - param5 << 16) / var34;
                  var21 = param9 << 16;
                  var31 = (param10 - param6 << 16) / var35;
                  var22 = param5 << 16;
                  var28 = (-param0 + param11 << 16) / var34;
                  var29 = param6 << 16;
                  var30 = param15 << 16;
                  var20 = (param8 - param2 << 16) / var34;
                  var26 = param0 << 16;
                  var17_int = param12 << 16;
                  var25 = param1 << 16;
                  var19 = (param8 - param12 << 16) / var35;
                  var18 = param2 << 16;
                  var27 = (param11 - param1 << 16) / var35;
                  var23 = (-param9 + param4 << 16) / var35;
                }
              }
              if (0 > param7) {
                param7 = Math.min(-param7, param16 - param7);
                var26 = var26 + var28 * param7;
                var30 = var30 + param7 * var32;
                var18 = var18 + var20 * param7;
                var29 = var29 + param7 * var31;
                var22 = var22 + param7 * var24;
                var25 = var25 + param7 * var27;
                var21 = var21 + param7 * var23;
                var17_int = var17_int + param7 * var19;
                param7 = 0;
              }
              var33 = 0;
            }
            if (param7 < 0) {
              param7 = -param7;
              var17_int = var17_int + var19 * param7;
              var25 = var25 + var27 * param7;
              var30 = var30 + param7 * var32;
              var22 = var22 + var24 * param7;
              var21 = var21 + param7 * var23;
              var18 = var18 + var20 * param7;
              var29 = var29 + param7 * var31;
              var26 = var26 + param7 * var28;
              param7 = 0;
            }
            var35Lifetime1 = oo.field_a[param7];
            while (param7 < param3) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < oo.field_q) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    oo.field_q > var36Lifetime1) {
                    hm.a(0, 0, var25, var37Lifetime1, (byte) 68, var21, var29, param13, var36Lifetime1 + var35Lifetime1, 0);
                  }
                } else {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= oo.field_q) {
                    var37Lifetime1 = -1 - var36Lifetime1 + oo.field_q;
                  }
                  if (var36Lifetime1 < 0) {
                    hm.a(var40Lifetime1, var39Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, var36Lifetime1 + var37Lifetime1, (byte) 107, var21 - var36Lifetime1 * var38Lifetime1, var29 - var36Lifetime1 * var40Lifetime1, param13, var35Lifetime1, var38Lifetime1);
                  } else {
                    hm.a(var40Lifetime1, var39Lifetime1, var25, var37Lifetime1, (byte) 89, var21, var29, param13, var36Lifetime1 + var35Lifetime1, var38Lifetime1);
                  }
                }
              }
              param7++;
              if (oo.field_b <= param7) {
                return;
              }
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + bi.field_e;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
              var29 = var29 + var31;
              var22 = var22 + var24;
              var26 = var26 + var28;
              var25 = var25 + var27;
              var21 = var21 + var23;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_75_0 = var17;
          stackIn_75_1 = new StringBuilder().append("pq.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    pq(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_d[var4 + (var4 + 1)] != -1) {
              var4 = 1 + var4 & -1 + var2_int;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("pq.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          field_e = 43L;
        }
        gl.field_k = true;
        aj.field_j = 15000L + gk.a(56);
        return hn.field_w == 11 ? true : false;
    }

    final static void a(byte param0) {
        pe.field_r = false;
        if (param0 <= 92) {
          pq.b(-21);
        }
        hj.field_b = id.field_f.h(-11) == 0 ? true : false;
    }

    static {
        field_a = "You are on <%0>";
        field_b = "Updates will sent to the email address you've given";
        field_g = "Open";
    }
}
