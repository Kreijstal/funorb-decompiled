/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends ne {
    static String field_m;
    byte[] field_l;
    static cn[] field_i;
    int field_k;
    static int[] field_j;

    final static boolean b(byte param0) {
        if (param0 >= -91) {
          ue.a((byte) -63);
        }
        return d.field_f;
    }

    final static void a(int param0) {
        int var1 = 95 % ((param0 - 38) / 34);
        sn.a(97, 4);
    }

    final static int a(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param0 < 0 ||
          65536 <= param0) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (16 <= param0) {
          param0 = param0 >>> 4;
          var2 += 4;
        }
        if (param1 != -715) {
          field_i = (cn[]) null;
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    public static void a(byte param0) {
        field_j = null;
        field_m = null;
        field_i = null;
        int var1 = -109 % ((-45 - param0) / 53);
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
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
        var19 = DungeonAssault.field_K;
        try {
          if (param3 >= 0 &&
            re.field_i > param0) {
            if (param6 < 0 &&
              param4 < 0 &&
              param7 < 0) {
              return;
            }
            if (re.field_b <= param6 &&
              re.field_b <= param4 &&
              re.field_b <= param7) {
              return;
            }
            var14 = -param0 + param3;
            if (param0 == param5) {
              if (param0 != param3) {
                var15 = param3 - param5;
                if (param4 > param6) {
                  var11 = (param7 - param6 << 16) / var14;
                  var12 = (-param4 + param7 << 16) / var15;
                  var10 = param4 << 16;
                  var9_int = param6 << 16;
                } else {
                  var9_int = param4 << 16;
                  var12 = (param7 - param6 << 16) / var14;
                  var10 = param6 << 16;
                  var11 = (param7 - param4 << 16) / var15;
                }
              } else {
                var10 = param4 << 16;
                var11 = 0;
                var12 = 0;
                var9_int = param6 << 16;
              }
              var13 = 0;
              if (param0 < 0) {
                param0 = Math.min(-param0, -param0 + param5);
                var9_int = var9_int + var11 * param0;
                var10 = var10 + param0 * var12;
                param0 = 0;
              }
            } else {
              var10 = param6 << 16;
              var9_int = param6 << 16;
              var15 = param5 - param0;
              var12 = (param7 - param6 << 16) / var14;
              var11 = (-param6 + param4 << 16) / var15;
              if (var11 >= var12) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              if (0 <= param0) {
                var16Lifetime2 = re.field_e[param0];
                while (param0 < param5) {
                  var17 = var9_int >> 16;
                  if (var17 < re.field_b) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (0 <= var17 &&
                        var17 < re.field_b) {
                        sa.a((byte) 45, var18, var16Lifetime2 + var17, param2, param1);
                      }
                    } else {
                      if (re.field_b <= var17 + var18) {
                        var18 = re.field_b - var17 - 1;
                      }
                      if (var17 >= 0) {
                        sa.a((byte) 45, var18, var17 + var16Lifetime2, param2, param1);
                      } else {
                        sa.a((byte) 45, var18 + var17, var16Lifetime2, param2, param1);
                      }
                    }
                  }
                  param0++;
                  if (re.field_i <= param0) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + gf.field_i;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              } else if (0 <= param5) {
                param0 = -param0;
                var10 = var10 + param0 * var12;
                var9_int = var9_int + var11 * param0;
                param0 = 0;
                var16Lifetime2 = re.field_e[param0];
                while (param0 < param5) {
                  var17 = var9_int >> 16;
                  if (var17 < re.field_b) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (0 <= var17 &&
                        var17 < re.field_b) {
                        sa.a((byte) 45, var18, var16Lifetime2 + var17, param2, param1);
                      }
                    } else {
                      if (re.field_b <= var17 + var18) {
                        var18 = re.field_b - var17 - 1;
                      }
                      if (var17 >= 0) {
                        sa.a((byte) 45, var18, var17 + var16Lifetime2, param2, param1);
                      } else {
                        sa.a((byte) 45, var18 + var17, var16Lifetime2, param2, param1);
                      }
                    }
                  }
                  param0++;
                  if (re.field_i <= param0) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + gf.field_i;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              } else {
                param0 = param5 - param0;
                var10 = var10 + var12 * param0;
                var9_int = var9_int + param0 * var11;
                param0 = param5;
              }
              var16Lifetime3 = param3 - param5;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param4 << 16;
                } else {
                  var9_int = param4 << 16;
                }
                var17Lifetime2 = param7 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param0 < 0) {
              param0 = -param0;
              var9_int = var9_int + var11 * param0;
              var10 = var10 + var12 * param0;
              param0 = 0;
            }
            var15Lifetime1 = re.field_e[param0];
            if (param8 != 16) {
              field_j = (int[]) null;
            }
            while (param3 > param0) {
              var16Lifetime1 = var9_int >> 16;
              if (re.field_b > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < re.field_b) {
                    sa.a((byte) 45, var17Lifetime1, var16Lifetime1 + var15Lifetime1, param2, param1);
                  }
                } else {
                  if (var17Lifetime1 + var16Lifetime1 >= re.field_b) {
                    var17Lifetime1 = re.field_b - var16Lifetime1 - 1;
                  }
                  if (var16Lifetime1 >= 0) {
                    sa.a((byte) 45, var17Lifetime1, var16Lifetime1 + var15Lifetime1, param2, param1);
                  } else {
                    sa.a((byte) 45, var16Lifetime1 + var17Lifetime1, var15Lifetime1, param2, param1);
                  }
                }
              }
              param0++;
              if (re.field_i <= param0) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + gf.field_i;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_96_0 = var9;
          stackIn_96_1 = new StringBuilder().append("ue.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_96_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_m = "Instructions";
    }
}
