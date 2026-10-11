/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uw {
    static String[] field_b;
    static wb field_a;
    static String[] field_c;

    final int b(int param0, long param1) {
        if (param0 != 4007) {
          field_c = (String[]) null;
        }
        long var4 = this.a((byte) -52);
        if (var4 > 0L) {
          tg.a(var4, (byte) 110);
        }
        return this.a(0, param1);
    }

    abstract void b(byte param0);

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (0 <= param3 &&
            param2 < nk.field_c) {
            if (param7 < 0 &&
              param5 < 0 &&
              param1 < 0) {
              return;
            }
            if (param7 >= nk.field_i &&
              nk.field_i <= param5 &&
              nk.field_i <= param1) {
              return;
            }
            if (param6 != 1955582416) {
              field_a = (wb) null;
            }
            var14 = param3 - param2;
            if (param8 == param2) {
              if (param2 == param3) {
                var12 = 0;
                var9_int = param7 << 16;
                var10 = param5 << 16;
                var11 = 0;
              } else {
                var15 = param3 - param8;
                if (param7 >= param5) {
                  var9_int = param5 << 16;
                  var11 = (param1 - param5 << 16) / var15;
                  var10 = param7 << 16;
                  var12 = (param1 - param7 << 16) / var14;
                } else {
                  var9_int = param7 << 16;
                  var10 = param5 << 16;
                  var11 = (param1 - param7 << 16) / var14;
                  var12 = (-param5 + param1 << 16) / var15;
                }
              }
              var13 = 0;
              if (0 > param2) {
                param2 = Math.min(-param2, param8 - param2);
                var9_int = var9_int + param2 * var11;
                var10 = var10 + param2 * var12;
                param2 = 0;
              }
            } else {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = param8 - param2;
              var12 = (-param7 + param1 << 16) / var14;
              var11 = (-param7 + param5 << 16) / var15;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param2 < 0) {
                if (param8 < 0) {
                  param2 = param8 - param2;
                  var10 = var10 + param2 * var12;
                  var9_int = var9_int + param2 * var11;
                  param2 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var10 = var10 + var12 * param2;
                  var9_int = var9_int + param2 * var11;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = nk.field_d[param2];
                while (param2 < param8) {
                  var17 = var9_int >> 16;
                  if (nk.field_i > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (0 == var18) {
                      if (var17 >= 0 &&
                        nk.field_i > var17) {
                        wm.a(-1, var17 + var16Lifetime2, param4, var18, param0);
                      }
                    } else {
                      if (var18 + var17 >= nk.field_i) {
                        var18 = nk.field_i - var17 - 1;
                      }
                      if (0 > var17) {
                        wm.a(-1, var16Lifetime2, param4, var18 + var17, param0);
                      } else {
                        wm.a(-1, var17 + var16Lifetime2, param4, var18, param0);
                      }
                    }
                  }
                  param2++;
                  if (nk.field_c <= param2) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + lk.field_b;
                }
              }
              var16Lifetime3 = -param8 + param3;
              if (var16Lifetime3 != 0) {
                if (var13 == 0) {
                  var9_int = param5 << 16;
                } else {
                  var10 = param5 << 16;
                }
                var17Lifetime2 = param1 << 16;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
              } else {
                var11 = 0;
                var12 = 0;
              }
            }
            if (0 > param2) {
              param2 = -param2;
              var10 = var10 + param2 * var12;
              var9_int = var9_int + param2 * var11;
              param2 = 0;
            }
            var15Lifetime1 = nk.field_d[param2];
            while (param3 > param2) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < nk.field_i) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 != 0) {
                  if (nk.field_i <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + (nk.field_i - var16Lifetime1);
                  }
                  if (0 <= var16Lifetime1) {
                    wm.a(param6 ^ -1955582417, var15Lifetime1 + var16Lifetime1, param4, var17Lifetime1, param0);
                  } else {
                    wm.a(-1, var15Lifetime1, param4, var17Lifetime1 + var16Lifetime1, param0);
                  }
                } else {
                  if (0 <= var16Lifetime1 &&
                    nk.field_i > var16Lifetime1) {
                    wm.a(-1, var15Lifetime1 + var16Lifetime1, param4, var17Lifetime1, param0);
                  }
                }
              }
              param2++;
              if (nk.field_c <= param2) {
                return;
              }
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + lk.field_b;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_77_0 = var9;
          stackIn_77_1 = new StringBuilder().append("uw.D(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    abstract int a(int param0, long param1);

    public static void c(byte param0) {
        if (param0 != 96) {
          field_b = (String[]) null;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract long a(byte param0);

    static {
    }
}
