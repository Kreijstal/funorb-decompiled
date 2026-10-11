/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fp {
    static int field_c;
    static pf field_b;
    static String field_a;

    abstract long a(int param0);

    final static hb a(pf param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        un stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -39) {
            var3 = (int[]) null;
            fp.a(-79, 121, 76, -123, 0, -125, (int[]) null, -35, -114);
          }
          stackIn_3_0 = new un(param0);
          return (hb) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fp.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(long param0, int param1) {
        long var4 = this.a(0);
        if (var4 > 0L) {
          jb.a((byte) -115, var4);
        }
        if (param1 == -1) {
          return this.a(18907, param0);
        }
        return 113;
    }

    abstract int a(int param0, long param1);

    abstract void b(int param0);

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 47) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        pf var20 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (0 <= param8 &&
            param7 < wn.field_e) {
            if (param3 < 0 &&
              param1 < 0 &&
              param0 < 0) {
              return;
            }
            if (param3 >= wn.field_c &&
              param1 >= wn.field_c &&
              wn.field_c <= param0) {
              return;
            }
            if (param2 >= -90) {
              var20 = (pf) null;
              fp.a((pf) null, 68);
            }
            var14 = -param7 + param8;
            if (param5 == param7) {
              if (param7 == param8) {
                var9_int = param3 << 16;
                var11 = 0;
                var12 = 0;
                var10 = param1 << 16;
              } else {
                var15 = param8 - param5;
                if (param3 >= param1) {
                  var10 = param3 << 16;
                  var12 = (param0 - param3 << 16) / var14;
                  var11 = (-param1 + param0 << 16) / var15;
                  var9_int = param1 << 16;
                } else {
                  var10 = param1 << 16;
                  var12 = (param0 - param1 << 16) / var15;
                  var9_int = param3 << 16;
                  var11 = (param0 - param3 << 16) / var14;
                }
              }
              if (0 > param7) {
                param7 = Math.min(-param7, -param7 + param5);
                var9_int = var9_int + param7 * var11;
                var10 = var10 + var12 * param7;
                param7 = 0;
              }
              var13 = 0;
            } else {
              var10 = param3 << 16;
              var9_int = param3 << 16;
              var15 = param5 - param7;
              var11 = (param1 - param3 << 16) / var15;
              var12 = (-param3 + param0 << 16) / var14;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param7) {
                if (param5 < 0) {
                  param7 = -param7 + param5;
                  var10 = var10 + var12 * param7;
                  var9_int = var9_int + param7 * var11;
                  param7 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var9_int = var9_int + param7 * var11;
                  var10 = var10 + var12 * param7;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = wn.field_h[param7];
                while (param7 < param5) {
                  var17 = var9_int >> 16;
                  if (wn.field_c > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 != 0) {
                      if (wn.field_c <= var17 + var18) {
                        var18 = -1 + wn.field_c - var17;
                      }
                      if (var17 >= 0) {
                        dp.a(var17 + var16Lifetime2, param6, -1, param4, var18);
                      } else {
                        dp.a(var16Lifetime2, param6, -1, param4, var17 + var18);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < wn.field_c) {
                        dp.a(var17 + var16Lifetime2, param6, -1, param4, var18);
                      }
                    }
                  }
                  param7++;
                  if (wn.field_e <= param7) {
                    return;
                  }
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + gf.field_b;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = param8 - param5;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 == 0) {
                  var9_int = param1 << 16;
                } else {
                  var10 = param1 << 16;
                }
                var17Lifetime2 = param0 << 16;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              }
            }
            if (param7 < 0) {
              param7 = -param7;
              var9_int = var9_int + param7 * var11;
              var10 = var10 + var12 * param7;
              param7 = 0;
            }
            var15Lifetime1 = wn.field_h[param7];
            while (param8 > param7) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < wn.field_c) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    wn.field_c > var16Lifetime1) {
                    dp.a(var15Lifetime1 + var16Lifetime1, param6, -1, param4, var17Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= wn.field_c) {
                    var17Lifetime1 = -1 + wn.field_c - var16Lifetime1;
                  }
                  if (var16Lifetime1 < 0) {
                    dp.a(var15Lifetime1, param6, -1, param4, var17Lifetime1 + var16Lifetime1);
                  } else {
                    dp.a(var16Lifetime1 + var15Lifetime1, param6, -1, param4, var17Lifetime1);
                  }
                }
              }
              param7++;
              if (param7 >= wn.field_e) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + gf.field_b;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("fp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_a = "Names should contain a maximum of 12 characters";
    }
}
