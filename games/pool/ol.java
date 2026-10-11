/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static int field_d;
    static int field_a;
    static int field_e;
    static String field_b;
    static an field_c;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        try {
          if (param6 >= 0 &&
            param5 < fb.field_o) {
            if (param2 < 0 &&
              param4 < 0 &&
              param7 < 0) {
              return;
            }
            if (param2 >= fb.field_k &&
              fb.field_k <= param4 &&
              fb.field_k <= param7) {
              return;
            }
            var14 = param6 - param5;
            if (param3 != param5) {
              var10 = param2 << 16;
              var9_int = param2 << 16;
              var15 = -param5 + param3;
              var11 = (param4 - param2 << 16) / var15;
              var12 = (-param2 + param7 << 16) / var14;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param5 < 0) {
                if (0 > param3) {
                  param5 = -param5 + param3;
                  var9_int = var9_int + var11 * param5;
                  var10 = var10 + param5 * var12;
                  param5 = param3;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var10 = var10 + param5 * var12;
                  var9_int = var9_int + var11 * param5;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = fb.field_m[param5];
                while (param3 > param5) {
                  var17 = var9_int >> 16;
                  if (var17 < fb.field_k) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 == var18) {
                      if (0 <= var17 &&
                        var17 < fb.field_k) {
                        fd.a(param0, param1, var16Lifetime2 + var17, var18, 2);
                      }
                    } else {
                      if (fb.field_k <= var17 + var18) {
                        var18 = -1 + (fb.field_k - var17);
                      }
                      if (var17 < 0) {
                        fd.a(param0, param1, var16Lifetime2, var17 + var18, param8 - 19545);
                      } else {
                        fd.a(param0, param1, var16Lifetime2 + var17, var18, param8 ^ 19545);
                      }
                    }
                  }
                  param5++;
                  if (fb.field_o <= param5) {
                    return;
                  }
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + qh.field_l;
                }
              }
              var16Lifetime3 = -param3 + param6;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                var17Lifetime2 = param7 << 16;
                if (var13 != 0) {
                  var10 = param4 << 16;
                } else {
                  var9_int = param4 << 16;
                }
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            } else {
              if (param6 == param5) {
                var9_int = param2 << 16;
                var12 = 0;
                var10 = param4 << 16;
                var11 = 0;
              } else {
                var15 = param6 - param3;
                if (param4 > param2) {
                  var12 = (-param4 + param7 << 16) / var15;
                  var9_int = param2 << 16;
                  var11 = (-param2 + param7 << 16) / var14;
                  var10 = param4 << 16;
                } else {
                  var11 = (param7 - param4 << 16) / var15;
                  var9_int = param4 << 16;
                  var12 = (param7 - param2 << 16) / var14;
                  var10 = param2 << 16;
                }
              }
              if (param5 < 0) {
                param5 = Math.min(-param5, param3 - param5);
                var9_int = var9_int + param5 * var11;
                var10 = var10 + var12 * param5;
                param5 = 0;
              }
              var13 = 0;
            }
            if (param5 < 0) {
              param5 = -param5;
              var10 = var10 + param5 * var12;
              var9_int = var9_int + param5 * var11;
              param5 = 0;
            }
            var15Lifetime1 = fb.field_m[param5];
            if (param8 != 19547) {
              field_c = (an) null;
            }
            while (param6 > param5) {
              var16Lifetime1 = var9_int >> 16;
              if (fb.field_k > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (0 <= var16Lifetime1 &&
                    fb.field_k > var16Lifetime1) {
                    fd.a(param0, param1, var16Lifetime1 + var15Lifetime1, var17Lifetime1, 2);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= fb.field_k) {
                    var17Lifetime1 = -1 + fb.field_k - var16Lifetime1;
                  }
                  if (var16Lifetime1 >= 0) {
                    fd.a(param0, param1, var16Lifetime1 + var15Lifetime1, var17Lifetime1, 2);
                  } else {
                    fd.a(param0, param1, var15Lifetime1, var17Lifetime1 + var16Lifetime1, 2);
                  }
                }
              }
              param5++;
              if (param5 >= fb.field_o) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + qh.field_l;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_79_0 = var9;
          stackIn_79_1 = new StringBuilder().append("ol.B(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static float[] a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            field_a = 96;
          }
          stackIn_3_0 = op.a(16, param0, 97);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ol.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1430775248) {
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Average rating";
    }
}
