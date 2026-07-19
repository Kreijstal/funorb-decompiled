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
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final void a(boolean param0) {
        wm.field_e = true;
        if (param0) {
            field_a = (String[]) null;
            vi.field_h = true;
            return;
        }
        vi.field_h = true;
    }

    final static boolean a(int param0) {
        gl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        gl var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4 = (gl) ((Object) on.field_t.b(123));
            var1 = var4;
            if (var1 != null) {
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
                if (var1.field_y <= var2) {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (var4.field_r[var2] != null) {
                      if (var4.field_r[var2].field_c == 0) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null == var4.field_q[var2]) {
                      break L4;
                    } else {
                      if (var4.field_q[var2].field_c == 0) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "ub.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (-65537L < ((long)param1 ^ -1L)) {
          if (-257L < ((long)param1 ^ -1L)) {
            if (-1 >= (param1 ^ -1)) {
              return kf.field_e[param1] >> -361594260;
            } else {
              if (param0 != -1237818874) {
                return -44;
              } else {
                return -1;
              }
            }
          } else {
            if (4096L <= (long)param1) {
              if ((long)param1 < 16384L) {
                return kf.field_e[param1 >> 322530438] >> 1292354889;
              } else {
                return kf.field_e[param1 >> -863587544] >> 981058664;
              }
            } else {
              if (((long)param1 ^ -1L) > -1025L) {
                return kf.field_e[param1 >> -206365630] >> -827018549;
              } else {
                return kf.field_e[param1 >> 2051455268] >> 650198538;
              }
            }
          }
        } else {
          if (((long)param1 ^ -1L) > -16777217L) {
            if ((long)param1 < 1048576L) {
              if ((long)param1 >= 262144L) {
                return kf.field_e[param1 >> 84699372] >> -1237818874;
              } else {
                return kf.field_e[param1 >> 1195618794] >> -1819869721;
              }
            } else {
              if (4194304L <= (long)param1) {
                return kf.field_e[param1 >> 1917331472] >> 1243186116;
              } else {
                return kf.field_e[param1 >> -46653010] >> -409953499;
              }
            }
          } else {
            if (268435456L > (long)param1) {
              if ((long)param1 >= 67108864L) {
                return kf.field_e[param1 >> -1969152204] >> -1453080126;
              } else {
                return kf.field_e[param1 >> -958800846] >> -603744541;
              }
            } else {
              if (-1073741825L < ((long)param1 ^ -1L)) {
                return kf.field_e[param1 >> 686868886] >> -417431263;
              } else {
                return kf.field_e[param1 >> 474927544];
              }
            }
          }
        }
    }

    public final String a(byte param0) {
        int var2 = -85 / ((param0 - -33) / 62);
        return "Just render player and light";
    }

    static {
        field_c = "Loading graphics";
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
