/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema implements isa {
    static String field_a;
    static int field_b;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (param0.field_p < var6) {
            L1: {
              if (param2 == 16777215) {
                break L1;
              } else {
                boolean discarded$1 = ema.a(false, 4, -88, -72, -24);
                break L1;
              }
            }
            var6 = 1;
            L2: while (true) {
              if (var6 > 5) {
                return;
              } else {
                L3: {
                  var7 = param0.field_m + param0.field_i + (param1 + -(param0.field_m >> 1008819969) + -5) - -var6;
                  var8 = (param0.field_m >> 1093457473) + -(var6 * 2);
                  var9 = (param0.field_p - 4 >> 495510017) + (param0.field_n + (param3 - -var6));
                  if (bea.field_h > var9) {
                    break L3;
                  } else {
                    if (bea.field_k > var9) {
                      L4: {
                        if (var7 <= bea.field_b) {
                          break L4;
                        } else {
                          bea.field_l[var9 * bea.field_g - (-var7 + 1)] = sea.c(16711422, bea.field_l[var7 + (bea.field_g * var9 - 1)]) >> -12545151;
                          break L4;
                        }
                      }
                      if (var7 + var8 >= bea.field_d) {
                        break L3;
                      } else {
                        bea.field_l[var7 + var9 * bea.field_g + var8] = sea.c(8355711, bea.field_l[var8 + bea.field_g * var9 + var7] >> 2005619425);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                bea.c(var7, var9, var8, 0);
                var6++;
                continue L2;
              }
            }
          } else {
            var7 = 152 - -(var6 * 48 / param0.field_p);
            var8 = var7 | (var7 << 1951373904 | var7 << -514818360);
            bea.c(param0.field_i + param1, param0.field_n + (param3 + var6), param0.field_m, var8);
            var6++;
            continue L0;
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        jpa var8 = null;
        jpa var9 = null;
        int stackIn_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var8 = lm.field_p[param3];
          var9 = var8;
          var6 = 0;
          if (param0) {
            var9.b();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 < param1) {
            break L1;
          } else {
            if (0 > param4) {
              break L1;
            } else {
              if (param2 >= var9.field_i) {
                break L1;
              } else {
                if (param4 < var9.field_a) {
                  L2: {
                    var6 = var9.field_f[param2 + param4 * var8.field_i];
                    if (var6 >= 0) {
                      if (0 < var8.field_g[var6]) {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L2;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_17_0 = stackOut_14_0;
                        break L2;
                      }
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_17_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var7 = stackIn_17_0;
                    if (param0) {
                      var9.b();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var7 != 0;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        if (param0) {
          var9.b();
          return false;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 48) {
            boolean discarded$0 = ema.a(false, 111, 21, -70, 126);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Your email address is used to identify this account";
    }
}
