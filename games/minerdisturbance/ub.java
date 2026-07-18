/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub implements uj {
    static String field_b;
    static String field_c;
    static String[] field_a;

    public static void b(int param0) {
        if (param0 < 16) {
            return;
        }
        try {
            field_b = null;
            field_a = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ub.C(" + param0 + ')');
        }
    }

    public final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wm.field_e = true;
              if (!param0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            vi.field_h = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ub.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0) {
        gl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_2_0 = 0;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1 = (gl) (Object) on.field_t.b(123);
            if (null != var1) {
              L1: {
                if (param0 == 14921) {
                  break L1;
                } else {
                  ub.b(20);
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var1.field_y <= var2) {
                    break L3;
                  } else {
                    L4: {
                      if (var1.field_r[var2] != null) {
                        if (var1.field_r[var2].field_c == 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0 != 0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (null == var1.field_q[var2]) {
                        break L5;
                      } else {
                        if (var1.field_q[var2].field_c == 0) {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1_ref, "ub.E(" + param0 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_51_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            if ((long)param1 < 65536L) {
              if ((long)param1 < 256L) {
                if (param1 >= 0) {
                  stackOut_51_0 = kf.field_e[param1] >> -361594260;
                  stackIn_52_0 = stackOut_51_0;
                  return stackIn_52_0;
                } else {
                  if (param0 == -1237818874) {
                    stackOut_56_0 = -1;
                    stackIn_57_0 = stackOut_56_0;
                    break L0;
                  } else {
                    stackOut_54_0 = -44;
                    stackIn_55_0 = stackOut_54_0;
                    return stackIn_55_0;
                  }
                }
              } else {
                if (4096L <= (long)param1) {
                  if ((long)param1 >= 16384L) {
                    stackOut_46_0 = kf.field_e[param1 >> -863587544] >> 981058664;
                    stackIn_47_0 = stackOut_46_0;
                    return stackIn_47_0;
                  } else {
                    stackOut_44_0 = kf.field_e[param1 >> 322530438] >> 1292354889;
                    stackIn_45_0 = stackOut_44_0;
                    return stackIn_45_0;
                  }
                } else {
                  if ((long)param1 >= 1024L) {
                    stackOut_41_0 = kf.field_e[param1 >> 2051455268] >> 650198538;
                    stackIn_42_0 = stackOut_41_0;
                    return stackIn_42_0;
                  } else {
                    stackOut_39_0 = kf.field_e[param1 >> -206365630] >> -827018549;
                    stackIn_40_0 = stackOut_39_0;
                    return stackIn_40_0;
                  }
                }
              }
            } else {
              if ((long)param1 < 16777216L) {
                if ((long)param1 < 1048576L) {
                  if ((long)param1 < 262144L) {
                    stackOut_30_0 = kf.field_e[param1 >> 1195618794] >> -1819869721;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  } else {
                    stackOut_28_0 = kf.field_e[param1 >> 84699372] >> -1237818874;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0;
                  }
                } else {
                  if (4194304L > (long)param1) {
                    stackOut_25_0 = kf.field_e[param1 >> -46653010] >> -409953499;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0;
                  } else {
                    stackOut_23_0 = kf.field_e[param1 >> 1917331472] >> 1243186116;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  }
                }
              } else {
                if (268435456L > (long)param1) {
                  if ((long)param1 < 67108864L) {
                    stackOut_17_0 = kf.field_e[param1 >> -958800846] >> -603744541;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    stackOut_15_0 = kf.field_e[param1 >> -1969152204] >> -1453080126;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  if ((long)param1 >= 1073741824L) {
                    stackOut_12_0 = kf.field_e[param1 >> 474927544];
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    stackOut_10_0 = kf.field_e[param1 >> 686868886] >> -417431263;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ub.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_57_0;
    }

    public final String a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        try {
          L0: {
            var2_int = -85 / ((param0 - -33) / 62);
            stackOut_0_0 = "Just render player and light";
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ub.A(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading graphics";
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
