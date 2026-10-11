/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static um field_d;
    static String field_c;
    static dd field_a;
    static String field_b;
    static String field_e;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = pj.a(param1 ^ -105, param0);
        int var4 = rf.a(param0, 255);
        int var5 = pj.a(110, param2);
        if (param1 != -1) {
          mm.a(44);
        }
        int var6 = rf.a(param2, 255);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var20 = Chess.field_G;
        try {
          if (0 <= param1 &&
            nh.field_l > param5) {
            if (param7 < 0 &&
              0 > param6 &&
              param3 < 0) {
              return;
            }
            if (nh.field_o <= param7 &&
              param6 >= nh.field_o &&
              nh.field_o <= param3) {
              return;
            }
            var9_int = -124 / ((29 - param0) / 63);
            var15 = -param5 + param1;
            if (param5 != param8) {
              var11 = param7 << 16;
              var10 = param7 << 16;
              var16 = param8 - param5;
              var13 = (-param7 + param3 << 16) / var15;
              var12 = (param6 - param7 << 16) / var16;
              if (var13 <= var12) {
                var17 = var12;
                var12 = var13;
                var13 = var17;
                var14 = 1;
              } else {
                var14 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param5 < 0) {
                if (param8 < 0) {
                  param5 = -param5 + param8;
                  var10 = var10 + var12 * param5;
                  var11 = var11 + param5 * var13;
                  param5 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var11 = var11 + param5 * var13;
                  var10 = var10 + var12 * param5;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var17Lifetime2 = nh.field_p[param5];
                while (param8 > param5) {
                  var18 = var10 >> 16;
                  if (nh.field_o > var18) {
                    var19 = -(var10 >> 16) + (var11 >> 16);
                    if (var19 == 0) {
                      if (var18 >= 0 &&
                        var18 < nh.field_o) {
                        fk.a(0, var19, param4, param2, var17Lifetime2 + var18);
                      }
                    } else {
                      if (var19 + var18 >= nh.field_o) {
                        var19 = nh.field_o - var18 - 1;
                      }
                      if (0 > var18) {
                        fk.a(0, var18 + var19, param4, param2, var17Lifetime2);
                      } else {
                        fk.a(0, var19, param4, param2, var17Lifetime2 + var18);
                      }
                    }
                  }
                  param5++;
                  if (nh.field_l <= param5) {
                    return;
                  }
                  var11 = var11 + var13;
                  var17Lifetime2 = var17Lifetime2 + wb.field_h;
                  var10 = var10 + var12;
                }
              }
              var17Lifetime3 = -param8 + param1;
              if (var17Lifetime3 != 0) {
                if (var14 != 0) {
                  var11 = param6 << 16;
                } else {
                  var10 = param6 << 16;
                }
                var18Lifetime2 = param3 << 16;
                var12 = (-var10 + var18Lifetime2) / var17Lifetime3;
                var13 = (-var11 + var18Lifetime2) / var17Lifetime3;
              } else {
                var13 = 0;
                var12 = 0;
              }
            } else {
              if (param5 != param1) {
                var16 = -param8 + param1;
                if (param7 < param6) {
                  var11 = param6 << 16;
                  var12 = (-param7 + param3 << 16) / var15;
                  var13 = (param3 - param6 << 16) / var16;
                  var10 = param7 << 16;
                } else {
                  var12 = (param3 - param6 << 16) / var16;
                  var13 = (param3 - param7 << 16) / var15;
                  var10 = param6 << 16;
                  var11 = param7 << 16;
                }
              } else {
                var11 = param6 << 16;
                var10 = param7 << 16;
                var12 = 0;
                var13 = 0;
              }
              if (0 > param5) {
                param5 = Math.min(-param5, param8 - param5);
                var11 = var11 + param5 * var13;
                var10 = var10 + var12 * param5;
                param5 = 0;
              }
              var14 = 0;
            }
            if (param5 < 0) {
              param5 = -param5;
              var11 = var11 + param5 * var13;
              var10 = var10 + var12 * param5;
              param5 = 0;
            }
            var16Lifetime1 = nh.field_p[param5];
            while (param1 > param5) {
              var17Lifetime1 = var10 >> 16;
              if (var17Lifetime1 < nh.field_o) {
                var18Lifetime1 = (var11 >> 16) - (var10 >> 16);
                if (var18Lifetime1 != 0) {
                  if (var17Lifetime1 + var18Lifetime1 >= nh.field_o) {
                    var18Lifetime1 = -1 + (-var17Lifetime1 + nh.field_o);
                  }
                  if (var17Lifetime1 >= 0) {
                    fk.a(0, var18Lifetime1, param4, param2, var17Lifetime1 + var16Lifetime1);
                  } else {
                    fk.a(0, var18Lifetime1 + var17Lifetime1, param4, param2, var16Lifetime1);
                  }
                } else {
                  if (0 <= var17Lifetime1 &&
                    var17Lifetime1 < nh.field_o) {
                    fk.a(0, var18Lifetime1, param4, param2, var16Lifetime1 + var17Lifetime1);
                  }
                }
              }
              param5++;
              if (nh.field_l <= param5) {
                return;
              }
              var10 = var10 + var12;
              var16Lifetime1 = var16Lifetime1 + wb.field_h;
              var11 = var11 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_75_0 = var9;
          stackIn_75_1 = new StringBuilder().append("mm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 118) {
          field_c = (String) null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    static {
        field_c = "your friend";
        field_b = "Please try changing the following settings:  ";
        field_e = "Unpacking graphics";
    }
}
