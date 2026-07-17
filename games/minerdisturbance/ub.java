/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub implements uj {
    static String field_b;
    static String field_c;
    static String[] field_a;

    public static void b() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final void a(boolean param0) {
        wm.field_e = true;
        if (param0) {
            field_a = null;
            vi.field_h = true;
            return;
        }
        vi.field_h = true;
    }

    final static boolean a() {
        gl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1 = (gl) (Object) on.field_t.b(123);
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var1.field_y <= var2) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    if (var1.field_r[var2] != null) {
                      if (var1.field_r[var2].field_c == 0) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null == var1.field_q[var2]) {
                      break L3;
                    } else {
                      if (var1.field_q[var2].field_c == 0) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
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
          throw lj.a((Throwable) (Object) var1_ref, "ub.E(" + 14921 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static int a(int param0, int param1) {
        if ((long)param1 < 65536L) {
          if ((long)param1 < 256L) {
            if (param1 >= 0) {
              return kf.field_e[param1] >> 12;
            } else {
              return -1;
            }
          } else {
            if (4096L <= (long)param1) {
              if ((long)param1 < 16384L) {
                return kf.field_e[param1 >> 6] >> 9;
              } else {
                return kf.field_e[param1 >> 8] >> 8;
              }
            } else {
              if ((long)param1 < 1024L) {
                return kf.field_e[param1 >> 2] >> 11;
              } else {
                return kf.field_e[param1 >> 4] >> 10;
              }
            }
          }
        } else {
          if ((long)param1 < 16777216L) {
            if ((long)param1 < 1048576L) {
              if ((long)param1 >= 262144L) {
                return kf.field_e[param1 >> 12] >> 6;
              } else {
                return kf.field_e[param1 >> 10] >> 7;
              }
            } else {
              if (4194304L <= (long)param1) {
                return kf.field_e[param1 >> 16] >> 4;
              } else {
                return kf.field_e[param1 >> 14] >> 5;
              }
            }
          } else {
            if (268435456L > (long)param1) {
              if ((long)param1 >= 67108864L) {
                return kf.field_e[param1 >> 20] >> 2;
              } else {
                return kf.field_e[param1 >> 18] >> 3;
              }
            } else {
              if ((long)param1 < 1073741824L) {
                return kf.field_e[param1 >> 22] >> 1;
              } else {
                return kf.field_e[param1 >> 24];
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading graphics";
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
