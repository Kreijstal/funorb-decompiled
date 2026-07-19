/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema implements isa {
    static String field_a;
    static int field_b;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.field_p < var6_int) {
                    break L3;
                  } else {
                    var7 = 152 - -(var6_int * 48 / param0.field_p);
                    var8 = var7 | (var7 << 1951373904 | var7 << -514818360);
                    bea.c(param0.field_i + param1, param0.field_n + (param3 + var6_int), param0.field_m, var8);
                    var6_int++;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param2 == 16777215) {
                  break L2;
                } else {
                  discarded$1 = ema.a(false, 4, -88, -72, -24);
                  break L2;
                }
              }
              var6_int = 1;
              L4: while (true) {
                if (var6_int > 5) {
                  break L0;
                } else {
                  var7 = param0.field_m + param0.field_i + (param1 + -(param0.field_m >> 1008819969) + -5) - -var6_int;
                  var8 = (param0.field_m >> 1093457473) + -(var6_int * 2);
                  var9 = (param0.field_p - 4 >> 495510017) + (param0.field_n + (param3 - -var6_int));
                  if (var10 == 0) {
                    L5: {
                      if (bea.field_h > var9) {
                        break L5;
                      } else {
                        if (bea.field_k > var9) {
                          L6: {
                            if (var7 <= bea.field_b) {
                              break L6;
                            } else {
                              bea.field_l[var9 * bea.field_g - (-var7 + 1)] = sea.c(16711422, bea.field_l[var7 + (bea.field_g * var9 - 1)]) >> -12545151;
                              break L6;
                            }
                          }
                          if (var7 + var8 >= bea.field_d) {
                            break L5;
                          } else {
                            bea.field_l[var7 + var9 * bea.field_g + var8] = sea.c(8355711, bea.field_l[var8 + bea.field_g * var9 + var7] >> 2005619425);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    bea.c(var7, var9, var8, 0);
                    var6_int++;
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("ema.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        jpa var8 = null;
        jpa var9 = null;
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
        if (param2 >= param1) {
          if (0 <= param4) {
            if (param2 < var9.field_i) {
              if (param4 < var9.field_a) {
                var6 = var9.field_f[param2 + param4 * var8.field_i];
                if (var6 >= 0) {
                  if (0 >= var8.field_g[var6]) {
                    L1: {
                      var7 = 0;
                      if (param0) {
                        var9.b();
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return var7 != 0;
                  } else {
                    L2: {
                      var7 = 1;
                      if (param0) {
                        var9.b();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return var7 != 0;
                  }
                } else {
                  L3: {
                    var7 = 0;
                    if (param0) {
                      var9.b();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var7 != 0;
                }
              } else {
                L4: {
                  if (param0) {
                    var9.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return false;
              }
            } else {
              L5: {
                if (param0) {
                  var9.b();
                  break L5;
                } else {
                  break L5;
                }
              }
              return false;
            }
          } else {
            L6: {
              if (param0) {
                var9.b();
                break L6;
              } else {
                break L6;
              }
            }
            return false;
          }
        } else {
          if (!param0) {
            return false;
          } else {
            var9.b();
            return false;
          }
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_a = null;
        if (param0 != 48) {
            discarded$0 = ema.a(false, 111, 21, -70, 126);
        }
    }

    static {
        field_a = "Your email address is used to identify this account";
    }
}
