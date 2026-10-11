/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ag {
    private int field_K;
    int field_L;
    static qb[] field_J;
    private jl field_I;
    int field_H;

    final int g(byte param0) {
        if (param0 != -102) {
          qm var3 = (qm) null;
          this.a(-7, 91, (qm) null, 21, -15, 11, 120);
        }
        return this.field_K;
    }

    public static void d(boolean param0) {
        if (!param0) {
          return;
        }
        field_J = null;
    }

    final int c(boolean param0) {
        if (param0) {
          this.c(true);
        }
        return this.field_I.a(1);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param5 >= 0 &&
            id.field_b > param7) {
            if (param2 < 0 &&
              param0 < 0 &&
              param8 < 0) {
              return;
            }
            if (param2 >= id.field_d &&
              id.field_d <= param0 &&
              param8 >= id.field_d) {
              return;
            }
            if (param1 != 2973) {
              wg.d(false);
            }
            var14 = param5 - param7;
            if (param7 != param3) {
              var10 = param2 << 16;
              var9_int = param2 << 16;
              var15 = param3 - param7;
              var11 = (-param2 + param0 << 16) / var15;
              var12 = (-param2 + param8 << 16) / var14;
              if (var11 >= var12) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param3 < 0) {
                  param7 = -param7 + param3;
                  var10 = var10 + var12 * param7;
                  var9_int = var9_int + var11 * param7;
                  param7 = param3;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var10 = var10 + param7 * var12;
                  var9_int = var9_int + var11 * param7;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = id.field_f[param7];
                while (param7 < param3) {
                  var17 = var9_int >> 16;
                  if (id.field_d > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (0 <= var17 &&
                        var17 < id.field_d) {
                        ol.a(var16Lifetime2 + var17, param4, false, param6, var18);
                      }
                    } else {
                      if (var17 + var18 >= id.field_d) {
                        var18 = -1 + (id.field_d - var17);
                      }
                      if (var17 >= 0) {
                        ol.a(var17 + var16Lifetime2, param4, false, param6, var18);
                      } else {
                        ol.a(var16Lifetime2, param4, false, param6, var18 + var17);
                      }
                    }
                  }
                  param7++;
                  if (param7 >= id.field_b) {
                    return;
                  }
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + de.field_e;
                }
              }
              var16Lifetime3 = param5 - param3;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param8 << 16;
                if (var13 != 0) {
                  var10 = param0 << 16;
                } else {
                  var9_int = param0 << 16;
                }
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
              } else {
                var11 = 0;
                var12 = 0;
              }
            } else {
              if (param7 == param5) {
                var10 = param0 << 16;
                var11 = 0;
                var12 = 0;
                var9_int = param2 << 16;
              } else {
                var15 = -param3 + param5;
                if (param0 > param2) {
                  var10 = param0 << 16;
                  var11 = (param8 - param2 << 16) / var14;
                  var12 = (param8 - param0 << 16) / var15;
                  var9_int = param2 << 16;
                } else {
                  var12 = (param8 - param2 << 16) / var14;
                  var10 = param2 << 16;
                  var9_int = param0 << 16;
                  var11 = (-param0 + param8 << 16) / var15;
                }
              }
              if (0 > param7) {
                param7 = Math.min(-param7, param3 - param7);
                var10 = var10 + param7 * var12;
                var9_int = var9_int + var11 * param7;
                param7 = 0;
              }
              var13 = 0;
            }
            if (param7 < 0) {
              param7 = -param7;
              var10 = var10 + param7 * var12;
              var9_int = var9_int + var11 * param7;
              param7 = 0;
            }
            var15Lifetime1 = id.field_f[param7];
            while (param7 < param5) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < id.field_d) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 == 0) {
                  if (0 <= var16Lifetime1 &&
                    var16Lifetime1 < id.field_d) {
                    ol.a(var16Lifetime1 + var15Lifetime1, param4, false, param6, var17Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= id.field_d) {
                    var17Lifetime1 = -var16Lifetime1 + id.field_d - 1;
                  }
                  if (var16Lifetime1 >= 0) {
                    ol.a(var16Lifetime1 + var15Lifetime1, param4, false, param6, var17Lifetime1);
                  } else {
                    ol.a(var15Lifetime1, param4, false, param6, var16Lifetime1 + var17Lifetime1);
                  }
                }
              }
              param7++;
              if (param7 >= id.field_b) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + de.field_e;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_80_0 = var9;
          stackIn_80_1 = new StringBuilder().append("wg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var13 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var8_int = -12 % ((param4 + 42) / 35);
          if (!super.a(param0, param1, param2, param3, 94, param5, param6)) {
            return false;
          }
          var9 = -this.field_H - param6 + param5;
          var10 = -(2 * this.field_H) + this.field_v;
          if (var10 < var9) {
            var9 = var10;
          }
          if (var9 < 0) {
            var9 = 0;
          }
          var9 = this.field_K * var9 / var10;
          if (1 != param1) {
            if (param1 == 2) {
              var11 = 2147483647;
              var12 = -1;
              for (var13 = 0; var13 < this.field_I.a(1); var13++) {
                var14 = -var9 + this.field_I.c(31103, var13);
                var14 = var14 * var14;
                if (var14 < var11) {
                  var11 = var14;
                  var12 = var13;
                }
              }
              if (var12 < 0) {
                return true;
              }
              this.field_I.b(var12, -11292);
            }
          } else {
            this.field_I.a(var9, 1);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_25_0 = var8;
          stackIn_25_1 = new StringBuilder().append("wg.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param0 <= param1 &&
          this.field_I.a(param0 ^ 1) > param1) {
          return this.field_I.c(31103, param1);
        }
        return -1;
    }

    private wg() throws Throwable {
        throw new Error();
    }

    static {
    }
}
