/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends pj {
    byte[] field_A;
    static vn field_y;
    static String field_w;
    na field_x;
    static int[] field_z;
    int field_v;

    final byte[] d(int param0) {
        if (this.field_q) {
          throw new RuntimeException();
        }
        if (param0 != 0) {
          return (byte[]) null;
        }
        return this.field_A;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, int[] param8) {
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = ZombieDawn.field_J;
        try {
          if (param4 >= 0 &&
            en.field_d > param5) {
            if (param1 < 0 &&
              param2 < 0 &&
              param0 < 0) {
              return;
            }
            if (param6) {
              wd.g(-39);
            }
            if (param1 >= en.field_g &&
              param2 >= en.field_g &&
              param0 >= en.field_g) {
              return;
            }
            var14 = param4 - param5;
            if (param5 == param3) {
              if (param4 != param5) {
                var15 = -param3 + param4;
                if (param2 <= param1) {
                  var10 = param1 << 16;
                  var12 = (param0 - param1 << 16) / var14;
                  var9_int = param2 << 16;
                  var11 = (param0 - param2 << 16) / var15;
                } else {
                  var9_int = param1 << 16;
                  var12 = (-param2 + param0 << 16) / var15;
                  var11 = (param0 - param1 << 16) / var14;
                  var10 = param2 << 16;
                }
              } else {
                var10 = param2 << 16;
                var9_int = param1 << 16;
                var12 = 0;
                var11 = 0;
              }
              if (0 > param5) {
                param5 = Math.min(-param5, -param5 + param3);
                var10 = var10 + param5 * var12;
                var9_int = var9_int + param5 * var11;
                param5 = 0;
              }
              var13 = 0;
            } else {
              var10 = param1 << 16;
              var9_int = param1 << 16;
              var15 = -param5 + param3;
              var12 = (-param1 + param0 << 16) / var14;
              var11 = (-param1 + param2 << 16) / var15;
              if (var12 <= var11) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param5 < 0) {
                if (param3 < 0) {
                  param5 = -param5 + param3;
                  var9_int = var9_int + var11 * param5;
                  var10 = var10 + param5 * var12;
                  param5 = param3;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var10 = var10 + var12 * param5;
                  var9_int = var9_int + var11 * param5;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = en.field_b[param5];
                while (param5 < param3) {
                  var17 = var9_int >> 16;
                  if (en.field_g > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 == var18) {
                      if (var17 >= 0 &&
                        var17 < en.field_g) {
                        eb.a(param8, 1393669633, var18, var17 + var16Lifetime2, param7);
                      }
                    } else {
                      if (var18 + var17 >= en.field_g) {
                        var18 = -var17 + en.field_g - 1;
                      }
                      if (var17 < 0) {
                        eb.a(param8, 1393669633, var18 + var17, var16Lifetime2, param7);
                      } else {
                        eb.a(param8, 1393669633, var18, var16Lifetime2 + var17, param7);
                      }
                    }
                  }
                  param5++;
                  if (en.field_d <= param5) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + bi.field_f;
                }
              }
              var16Lifetime3 = -param3 + param4;
              if (var16Lifetime3 != 0) {
                if (var13 == 0) {
                  var9_int = param2 << 16;
                } else {
                  var10 = param2 << 16;
                }
                var17Lifetime2 = param0 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param5 < 0) {
              param5 = -param5;
              var9_int = var9_int + param5 * var11;
              var10 = var10 + var12 * param5;
              param5 = 0;
            }
            var15Lifetime1 = en.field_b[param5];
            while (param4 > param5) {
              var16Lifetime1 = var9_int >> 16;
              if (en.field_g > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < en.field_g) {
                    eb.a(param8, 1393669633, var17Lifetime1, var15Lifetime1 + var16Lifetime1, param7);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= en.field_g) {
                    var17Lifetime1 = -1 - var16Lifetime1 + en.field_g;
                  }
                  if (var16Lifetime1 < 0) {
                    eb.a(param8, 1393669633, var17Lifetime1 + var16Lifetime1, var15Lifetime1, param7);
                  } else {
                    eb.a(param8, 1393669633, var17Lifetime1, var15Lifetime1 + var16Lifetime1, param7);
                  }
                }
              }
              param5++;
              if (param5 >= en.field_d) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + bi.field_f;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("wd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        qo.b((byte) -122);
        int var2 = 100 / ((-19 - param0) / 35);
    }

    final int e(int param0) {
        if (this.field_q) {
          return 0;
        }
        if (param0 != -31478) {
          return -121;
        }
        return 100;
    }

    public static void g(int param0) {
        field_w = null;
        field_y = null;
        if (param0 != 1445852592) {
          int[] var2 = (int[]) null;
          wd.a(-38, 92, -57, -122, -91, 120, true, -19, (int[]) null);
        }
        field_z = null;
    }

    wd() {
    }

    static {
        int var4 = 0;
        field_w = "Members";
        field_z = new int[50];
        double var0 = 0.0;
        double var2 = 0.12566370614359174;
        for (var4 = 0; var4 < 50; var4++) {
          field_z[var4] = (int)(64.0 * Math.sin(var0)) + 192;
          var0 = var0 + var2;
        }
    }
}
