/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static vna field_a;
    static int field_c;

    public static void a(byte param0) {
        if (param0 < 8) {
            field_a = (vna) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
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
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param0;
              var6 = param1 - -param2;
              if (bea.field_b >= param0) {
                stackIn_4_0 = bea.field_b;
                break L1;
              } else {
                stackIn_4_0 = param0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param1 > bea.field_h) {
                stackIn_7_0 = param1;
                break L2;
              } else {
                stackIn_7_0 = bea.field_h;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (bea.field_d <= var5_int) {
                stackIn_10_0 = bea.field_d;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            var9 = stackIn_10_0;
            if (!param4) {
              L4: {
                if (bea.field_k <= var6) {
                  stackIn_15_0 = bea.field_k;
                  break L4;
                } else {
                  stackIn_15_0 = var6;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (param0 < bea.field_b) {
                  break L5;
                } else {
                  if (bea.field_d > param0) {
                    var11 = param0 + var8 * bea.field_g;
                    var12 = -var8 + var10 + 1 >> -1595865439;
                    L6: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L5;
                      } else {
                        bea.field_l[var11] = 16777215;
                        var11 = var11 + 2 * bea.field_g;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (bea.field_h > param1) {
                  break L7;
                } else {
                  if (bea.field_k > var6) {
                    var11 = var7 + bea.field_g * param1;
                    var12 = -var7 + (var9 + 1) >> 734063105;
                    L8: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L7;
                      } else {
                        bea.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (var5_int < bea.field_b) {
                  break L9;
                } else {
                  if (var5_int < bea.field_d) {
                    var11 = var5_int + (var8 + (-param0 + var5_int & 1)) * bea.field_g;
                    var12 = var10 + 1 + -var8 >> -1323923199;
                    L10: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L9;
                      } else {
                        bea.field_l[var11] = 16777215;
                        var11 = var11 + 2 * bea.field_g;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (bea.field_h > param1) {
                  break L11;
                } else {
                  if (bea.field_k > var6) {
                    var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                    var12 = var9 + 1 + -var7 >> -2064929471;
                    L12: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L11;
                      } else {
                        bea.field_l[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "nn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_c = 3;
        field_a = new vna();
    }
}
