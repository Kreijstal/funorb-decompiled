/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qaa implements dja {
    static float field_a;
    static int field_b;

    public final tv a(byte param0) {
        int var2 = 46 % ((param0 + 64) / 50);
        return (tv) ((Object) new ptb());
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        int var20 = 0;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime2;
        var20 = VoidHunters.field_G;
        try {
          if (param0 >= 0 &&
            param3 < bfb.field_h) {
            if (param4 < 0 &&
              param6 < 0 &&
              param5 < 0) {
              return;
            }
            if (param4 >= bfb.field_a &&
              param6 >= bfb.field_a &&
              param5 >= bfb.field_a) {
              return;
            }
            var13 = 94 / ((param1 + 45) / 51);
            var15 = -param3 + param0;
            if (param8 == param3) {
              if (param3 == param0) {
                var12 = 0;
                var10 = param6 << 16;
                var9_int = param4 << 16;
                var11 = 0;
              } else {
                var16 = -param8 + param0;
                if (param4 < param6) {
                  var12 = (param5 - param6 << 16) / var16;
                  var10 = param6 << 16;
                  var9_int = param4 << 16;
                  var11 = (param5 - param4 << 16) / var15;
                } else {
                  var9_int = param6 << 16;
                  var11 = (param5 - param6 << 16) / var16;
                  var10 = param4 << 16;
                  var12 = (param5 - param4 << 16) / var15;
                }
              }
              var14 = 0;
              if (0 > param3) {
                param3 = Math.min(-param3, -param3 + param8);
                var10 = var10 + param3 * var12;
                var9_int = var9_int + param3 * var11;
                param3 = 0;
              }
            } else {
              var10 = param4 << 16;
              var9_int = param4 << 16;
              var16 = param8 - param3;
              var11 = (param6 - param4 << 16) / var16;
              var12 = (-param4 + param5 << 16) / var15;
              if (var12 <= var11) {
                var17 = var11;
                var11 = var12;
                var12 = var17;
                var14 = 1;
              } else {
                var14 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param8 < 0) {
                  param3 = -param3 + param8;
                  var10 = var10 + param3 * var12;
                  var9_int = var9_int + var11 * param3;
                  param3 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + param3 * var12;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var17Lifetime2 = bfb.field_g[param3];
                while (param3 < param8) {
                  var18 = var9_int >> 16;
                  if (bfb.field_a > var18) {
                    var19 = (var10 >> 16) - (var9_int >> 16);
                    if (0 != var19) {
                      if (bfb.field_a <= var19 + var18) {
                        var19 = -1 + (bfb.field_a - var18);
                      }
                      if (var18 >= 0) {
                        wga.a(true, var18 + var17Lifetime2, param2, var19, param7);
                      } else {
                        wga.a(true, var17Lifetime2, param2, var18 + var19, param7);
                      }
                    } else {
                      if (0 <= var18 &&
                        var18 < bfb.field_a) {
                        wga.a(true, var17Lifetime2 + var18, param2, var19, param7);
                      }
                    }
                  }
                  param3++;
                  if (param3 >= bfb.field_h) {
                    return;
                  }
                  var10 = var10 + var12;
                  var17Lifetime2 = var17Lifetime2 + dma.field_g;
                  var9_int = var9_int + var11;
                }
              }
              var17Lifetime3 = param0 - param8;
              if (var17Lifetime3 != 0) {
                var18Lifetime2 = param5 << 16;
                if (var14 != 0) {
                  var10 = param6 << 16;
                } else {
                  var9_int = param6 << 16;
                }
                var11 = (-var9_int + var18Lifetime2) / var17Lifetime3;
                var12 = (-var10 + var18Lifetime2) / var17Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (0 > param3) {
              param3 = -param3;
              var10 = var10 + var12 * param3;
              var9_int = var9_int + param3 * var11;
              param3 = 0;
            }
            var16Lifetime1 = bfb.field_g[param3];
            while (param3 < param0) {
              var17Lifetime1 = var9_int >> 16;
              if (var17Lifetime1 < bfb.field_a) {
                var18Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var18Lifetime1 == 0) {
                  if (0 <= var17Lifetime1 &&
                    bfb.field_a > var17Lifetime1) {
                    wga.a(true, var17Lifetime1 + var16Lifetime1, param2, var18Lifetime1, param7);
                  }
                } else {
                  if (bfb.field_a <= var18Lifetime1 + var17Lifetime1) {
                    var18Lifetime1 = -1 + bfb.field_a - var17Lifetime1;
                  }
                  if (0 > var17Lifetime1) {
                    wga.a(true, var16Lifetime1, param2, var17Lifetime1 + var18Lifetime1, param7);
                  } else {
                    wga.a(true, var17Lifetime1 + var16Lifetime1, param2, var18Lifetime1, param7);
                  }
                }
              }
              param3++;
              if (bfb.field_h <= param3) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var16Lifetime1 = var16Lifetime1 + dma.field_g;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_73_0 = var9;
          stackIn_73_1 = new StringBuilder().append("qaa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param8).append(')').toString());
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          int[] var4 = (int[]) null;
          qaa.a(35, 80, -54, 13, 73, 4, -14, (int[]) null, -74);
        }
        return (tv[]) ((Object) new ptb[param1]);
    }

    static {
        field_a = 20.0f;
        field_b = 1500;
    }
}
