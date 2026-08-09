/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_a;

    final static ms a(boolean param0, String param1, String param2, int param3, long param4) {
        RuntimeException var6 = null;
        jm stackIn_6_0 = null;
        ee stackIn_8_0 = null;
        ms stackIn_11_0 = null;
        kp stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param4 ^ -1L) != -1L) {
                break L1;
              } else {
                if (param2 != null) {
                  stackIn_8_0 = new ee(param2, param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              stackIn_6_0 = new jm(param4, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 4684) {
                stackIn_13_0 = new kp(param4, param1);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_11_0 = (ms) null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("dd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ms) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ms) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return (ms) ((Object) stackIn_13_0);
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -14279) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 - -param2;
              var6 = param0 + param4;
              if (param3 <= gf.field_i) {
                stackIn_4_0 = gf.field_i;
                break L1;
              } else {
                stackIn_4_0 = param3;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (gf.field_a >= param4) {
                stackIn_7_0 = gf.field_a;
                break L2;
              } else {
                stackIn_7_0 = param4;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (gf.field_l <= var5_int) {
                stackIn_10_0 = gf.field_l;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (param1 == 1) {
                break L4;
              } else {
                dd.a(-10);
                break L4;
              }
            }
            L5: {
              if (gf.field_f > var6) {
                stackIn_15_0 = var6;
                break L5;
              } else {
                stackIn_15_0 = gf.field_f;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (gf.field_i > param3) {
                break L6;
              } else {
                if (gf.field_l > param3) {
                  var11 = gf.field_b * var8 + param3;
                  var12 = var10 + 1 + -var8 >> 632687489;
                  L7: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L6;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 = var11 + gf.field_b * 2;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (param4 < gf.field_a) {
                break L8;
              } else {
                if (gf.field_f > var6) {
                  var11 = var7 + param4 * gf.field_b;
                  var12 = -var7 + (1 - -var9) >> -552467103;
                  L9: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L8;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (gf.field_i > var5_int) {
                break L10;
              } else {
                if (var5_int >= gf.field_l) {
                  break L10;
                } else {
                  var11 = gf.field_b * ((1 & var5_int + -param3) + var8) + var5_int;
                  var12 = 1 - (-var10 + var8) >> 279857089;
                  L11: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L10;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 = var11 + gf.field_b * 2;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (param4 < gf.field_a) {
                break L12;
              } else {
                if (gf.field_f <= var6) {
                  break L12;
                } else {
                  var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                  var12 = -var7 + (1 - -var9) >> 1568068993;
                  L13: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L12;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var5), "dd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        fb var4 = null;
        sl var5 = null;
        int var3 = -27 % ((12 - param2) / 47);
        if (param0 != kf.field_g) {
            var4 = (fb) ((Object) ea.field_b.a(65280, (long)kf.field_g));
            kf.field_g = param0;
            if (!(var4 == null)) {
                var4.field_jc = null;
            }
            var5 = js.field_f;
            var5.h(param1, 255);
            var5.c(3, (byte) -92);
            var5.c(11, (byte) -69);
            var5.d(param0, 255);
        }
    }

    static {
        field_a = "Cancel";
    }
}
