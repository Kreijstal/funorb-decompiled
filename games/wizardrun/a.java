/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static gb field_a;
    static String[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
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
        var19 = wizardrun.field_H;
        try {
          if (param6 >= 0 &&
            param8 < cj.field_d) {
            if (param7 != -20476) {
              field_a = (gb) null;
            }
            if (param3 < 0 &&
              param5 < 0 &&
              param0 < 0) {
              return;
            }
            if (param3 >= cj.field_b &&
              cj.field_b <= param5 &&
              param0 >= cj.field_b) {
              return;
            }
            var14 = -param8 + param6;
            if (param8 == param2) {
              if (param8 != param6) {
                var15 = param6 - param2;
                if (param3 >= param5) {
                  var11 = (-param5 + param0 << 16) / var15;
                  var12 = (-param3 + param0 << 16) / var14;
                  var10 = param3 << 16;
                  var9_int = param5 << 16;
                } else {
                  var10 = param5 << 16;
                  var9_int = param3 << 16;
                  var12 = (-param5 + param0 << 16) / var15;
                  var11 = (-param3 + param0 << 16) / var14;
                }
              } else {
                var9_int = param3 << 16;
                var11 = 0;
                var12 = 0;
                var10 = param5 << 16;
              }
              var13 = 0;
              if (param8 < 0) {
                param8 = Math.min(-param8, param2 - param8);
                var10 = var10 + var12 * param8;
                var9_int = var9_int + var11 * param8;
                param8 = 0;
              }
            } else {
              var10 = param3 << 16;
              var9_int = param3 << 16;
              var15 = -param8 + param2;
              var11 = (param5 - param3 << 16) / var15;
              var12 = (-param3 + param0 << 16) / var14;
              if (var12 <= var11) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (param2 < 0) {
                  param8 = param2 - param8;
                  var9_int = var9_int + var11 * param8;
                  var10 = var10 + var12 * param8;
                  param8 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var10 = var10 + var12 * param8;
                  var9_int = var9_int + var11 * param8;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = cj.field_a[param8];
                while (param8 < param2) {
                  var17 = var9_int >> 16;
                  if (cj.field_b > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < cj.field_b) {
                        se.a(var17 + var16Lifetime2, 123, param1, var18, param4);
                      }
                    } else {
                      if (var18 + var17 >= cj.field_b) {
                        var18 = -1 + (-var17 + cj.field_b);
                      }
                      if (var17 < 0) {
                        se.a(var16Lifetime2, 95, param1, var17 + var18, param4);
                      } else {
                        se.a(var17 + var16Lifetime2, param7 + 20599, param1, var18, param4);
                      }
                    }
                  }
                  param8++;
                  if (cj.field_d <= param8) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + ed.field_h;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = param6 - param2;
              if (0 != var16Lifetime3) {
                var17Lifetime2 = param0 << 16;
                if (var13 != 0) {
                  var10 = param5 << 16;
                } else {
                  var9_int = param5 << 16;
                }
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param8 < 0) {
              param8 = -param8;
              var9_int = var9_int + param8 * var11;
              var10 = var10 + var12 * param8;
              param8 = 0;
            }
            var15Lifetime1 = cj.field_a[param8];
            while (param6 > param8) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < cj.field_b) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < cj.field_b) {
                    se.a(var15Lifetime1 + var16Lifetime1, 123, param1, var17Lifetime1, param4);
                  }
                } else {
                  if (cj.field_b <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = -1 + (cj.field_b - var16Lifetime1);
                  }
                  if (0 <= var16Lifetime1) {
                    se.a(var15Lifetime1 + var16Lifetime1, 89, param1, var17Lifetime1, param4);
                  } else {
                    se.a(var15Lifetime1, 84, param1, var16Lifetime1 + var17Lifetime1, param4);
                  }
                }
              }
              param8++;
              if (param8 >= cj.field_d) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + ed.field_h;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_77_0 = var9;
          stackIn_77_1 = new StringBuilder().append("a.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -331851056) {
          int[] var2 = (int[]) null;
          a.a(-97, -4, 61, -122, (int[]) null, -38, 93, 89, -73);
        }
        field_b = null;
        field_a = null;
    }

    static {
    }
}
