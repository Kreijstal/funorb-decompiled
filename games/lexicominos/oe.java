/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_a;

    final static mb a(int param0, String[] param1) {
        mb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new mb(false);
          var3 = -62 / ((param0 + 3) / 59);
          var2.field_d = param1;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("oe.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 32113) {
          String[] var2 = (String[]) null;
          oe.a(65, (String[]) null);
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -88 % ((-7 - param0) / 44);
          stackIn_1_0 = oh.a(0, param1, false, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("oe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        String var20 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param6 >= 0 &&
            param5 < k.field_d) {
            if (0 > param7 &&
              param4 < 0 &&
              0 > param1) {
              return;
            }
            if (param7 >= k.field_f &&
              k.field_f <= param4 &&
              k.field_f <= param1) {
              return;
            }
            if (param0 < 58) {
              var20 = (String) null;
              oe.a((String) null, true);
            }
            var14 = param6 - param5;
            if (param5 != param8) {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = param8 - param5;
              var11 = (-param7 + param4 << 16) / var15;
              var12 = (-param7 + param1 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param5 < 0) {
                if (param8 < 0) {
                  param5 = -param5 + param8;
                  var10 = var10 + var12 * param5;
                  var9_int = var9_int + param5 * var11;
                  param5 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var9_int = var9_int + var11 * param5;
                  var10 = var10 + param5 * var12;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = k.field_e[param5];
                while (param8 > param5) {
                  var17 = var9_int >> 16;
                  if (var17 < k.field_f) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 != 0) {
                      if (k.field_f <= var18 + var17) {
                        var18 = -var17 + (k.field_f - 1);
                      }
                      if (var17 >= 0) {
                        ib.a(var17 + var16Lifetime2, param2, var18, param3, -109);
                      } else {
                        ib.a(var16Lifetime2, param2, var17 + var18, param3, -106);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < k.field_f) {
                        ib.a(var17 + var16Lifetime2, param2, var18, param3, -74);
                      }
                    }
                  }
                  param5++;
                  if (param5 >= k.field_d) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + lf.field_f;
                }
              }
              var16Lifetime3 = -param8 + param6;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param1 << 16;
                if (var13 != 0) {
                  var10 = param4 << 16;
                } else {
                  var9_int = param4 << 16;
                }
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              }
            } else {
              if (param6 == param5) {
                var11 = 0;
                var12 = 0;
                var9_int = param7 << 16;
                var10 = param4 << 16;
              } else {
                var15 = param6 - param8;
                if (param7 < param4) {
                  var9_int = param7 << 16;
                  var12 = (-param4 + param1 << 16) / var15;
                  var11 = (-param7 + param1 << 16) / var14;
                  var10 = param4 << 16;
                } else {
                  var11 = (param1 - param4 << 16) / var15;
                  var9_int = param4 << 16;
                  var10 = param7 << 16;
                  var12 = (param1 - param7 << 16) / var14;
                }
              }
              var13 = 0;
              if (param5 < 0) {
                param5 = Math.min(-param5, param8 - param5);
                var10 = var10 + var12 * param5;
                var9_int = var9_int + var11 * param5;
                param5 = 0;
              }
            }
            if (param5 < 0) {
              param5 = -param5;
              var10 = var10 + var12 * param5;
              var9_int = var9_int + param5 * var11;
              param5 = 0;
            }
            var15Lifetime1 = k.field_e[param5];
            while (param6 > param5) {
              var16Lifetime1 = var9_int >> 16;
              if (k.field_f > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (0 != var17Lifetime1) {
                  if (var17Lifetime1 + var16Lifetime1 >= k.field_f) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + k.field_f);
                  }
                  if (var16Lifetime1 >= 0) {
                    ib.a(var15Lifetime1 + var16Lifetime1, param2, var17Lifetime1, param3, -94);
                  } else {
                    ib.a(var15Lifetime1, param2, var17Lifetime1 + var16Lifetime1, param3, -81);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < k.field_f) {
                    ib.a(var15Lifetime1 + var16Lifetime1, param2, var17Lifetime1, param3, -49);
                  }
                }
              }
              param5++;
              if (k.field_d <= param5) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + lf.field_f;
              var9_int = var9_int + var11;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("oe.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1) {
        System.out.println("Error: " + tb.a("%0a", param0, param1, "\n"));
    }

    static {
        field_a = 26;
    }
}
