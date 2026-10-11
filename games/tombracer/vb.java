/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends vg {
    int field_g;
    qia field_f;
    vg field_h;
    static int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
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
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          if (param7 >= 0 &&
            uoa.field_b > param3) {
            if (0 > param5 &&
              param1 < 0 &&
              param4 < 0) {
              return;
            }
            if (uoa.field_e <= param5 &&
              uoa.field_e <= param1 &&
              param4 >= uoa.field_e) {
              return;
            }
            if (param0 != -922437200) {
              field_i = -119;
            }
            var14 = param7 - param3;
            if (param3 != param6) {
              var10 = param5 << 16;
              var9_int = param5 << 16;
              var15 = param6 - param3;
              var11 = (param1 - param5 << 16) / var15;
              var12 = (param4 - param5 << 16) / var14;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param6 < 0) {
                  param3 = param6 - param3;
                  var10 = var10 + var12 * param3;
                  var9_int = var9_int + param3 * var11;
                  param3 = param6;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var10 = var10 + var12 * param3;
                  var9_int = var9_int + var11 * param3;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = uoa.field_d[param3];
                while (param6 > param3) {
                  var17 = var9_int >> 16;
                  if (uoa.field_e > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 == var18) {
                      if (var17 >= 0 &&
                        var17 < uoa.field_e) {
                        tl.a(var16Lifetime2 + var17, var18, param2, 1535993377, param8);
                      }
                    } else {
                      if (uoa.field_e <= var17 + var18) {
                        var18 = -var17 + (uoa.field_e - 1);
                      }
                      if (var17 >= 0) {
                        tl.a(var16Lifetime2 + var17, var18, param2, 1535993377, param8);
                      } else {
                        tl.a(var16Lifetime2, var18 + var17, param2, 1535993377, param8);
                      }
                    }
                  }
                  param3++;
                  if (param3 >= uoa.field_b) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + bea.field_g;
                }
              }
              var16Lifetime3 = -param6 + param7;
              if (0 == var16Lifetime3) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param1 << 16;
                } else {
                  var9_int = param1 << 16;
                }
                var17Lifetime2 = param4 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            } else {
              if (param7 == param3) {
                var11 = 0;
                var12 = 0;
                var9_int = param5 << 16;
                var10 = param1 << 16;
              } else {
                var15 = param7 - param6;
                if (param1 <= param5) {
                  var11 = (param4 - param1 << 16) / var15;
                  var12 = (-param5 + param4 << 16) / var14;
                  var9_int = param1 << 16;
                  var10 = param5 << 16;
                } else {
                  var11 = (-param5 + param4 << 16) / var14;
                  var12 = (-param1 + param4 << 16) / var15;
                  var9_int = param5 << 16;
                  var10 = param1 << 16;
                }
              }
              if (param3 < 0) {
                param3 = Math.min(-param3, param6 - param3);
                var9_int = var9_int + param3 * var11;
                var10 = var10 + param3 * var12;
                param3 = 0;
              }
              var13 = 0;
            }
            if (param3 < 0) {
              param3 = -param3;
              var9_int = var9_int + param3 * var11;
              var10 = var10 + param3 * var12;
              param3 = 0;
            }
            var15Lifetime1 = uoa.field_d[param3];
            while (param7 > param3) {
              var16Lifetime1 = var9_int >> 16;
              if (uoa.field_e > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < uoa.field_e) {
                    tl.a(var15Lifetime1 + var16Lifetime1, var17Lifetime1, param2, 1535993377, param8);
                  }
                } else {
                  if (uoa.field_e <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + uoa.field_e);
                  }
                  if (var16Lifetime1 < 0) {
                    tl.a(var15Lifetime1, var17Lifetime1 + var16Lifetime1, param2, 1535993377, param8);
                  } else {
                    tl.a(var15Lifetime1 + var16Lifetime1, var17Lifetime1, param2, 1535993377, param8);
                  }
                }
              }
              param3++;
              if (uoa.field_b <= param3) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + bea.field_g;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_79_0 = var9;
          stackIn_79_1 = new StringBuilder().append("vb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2) {
        param0 = param0 << 6;
        param1 = param1 << 6;
        if (param2 != -21) {
          field_i = 102;
        }
        this.field_g = param1;
        this.field_f.a(128 + param1 * ot.field_v >> 8, param0);
    }

    vb(qia param0, vg param1) {
        try {
          this.field_f = param0;
          this.field_g = param0.l();
          this.field_h = param1;
          this.field_f.e(128 + ot.field_v * this.field_g >> 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 2;
    }
}
