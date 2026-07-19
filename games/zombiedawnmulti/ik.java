/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String field_e;
    static int field_c;
    static String field_b;
    static cj field_d;
    static String[] field_a;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_ref = um.field_c;
            synchronized (var1_ref) {
              L1: {
                L2: {
                  L3: {
                    lp.field_j = kj.field_j;
                    em.field_cb = em.field_cb + 1;
                    if (0 <= qf.field_f) {
                      break L3;
                    } else {
                      var2 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if ((var2 ^ -1) <= -113) {
                              break L6;
                            } else {
                              lc.field_m[var2] = false;
                              var2++;
                              if (var4 != 0) {
                                break L5;
                              } else {
                                if (var4 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          qf.field_f = fh.field_j;
                          break L5;
                        }
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L7: while (true) {
                    if (fh.field_j == qf.field_f) {
                      break L2;
                    } else {
                      var2 = ln.field_f[fh.field_j];
                      fh.field_j = fh.field_j + 1 & 127;
                      stackOut_12_0 = -1;
                      stackOut_12_1 = var2 ^ -1;
                      stackIn_23_0 = stackOut_12_0;
                      stackIn_23_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L8: {
                          L9: {
                            if (stackIn_13_0 < stackIn_13_1) {
                              break L9;
                            } else {
                              lc.field_m[var2] = true;
                              if (var4 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          lc.field_m[var2 ^ -1] = false;
                          break L8;
                        }
                        if (var4 == 0) {
                          continue L7;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                kj.field_j = f.field_c;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            L10: {
              if (decompiledRegionSelector0 == 0) {
                break L10;
              } else {
                stackOut_22_0 = -88;
                stackOut_22_1 = (param0 - -17) / 55;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L10;
              }
            }
            var1_int = stackIn_23_0 % stackIn_23_1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ik.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 <= 37) {
            return;
        }
        field_d = null;
    }

    static {
        field_b = "This research item is only available to FunOrb members. See the 'Account' section of the website for details.";
        field_e = "<%0> cannot join; the game is full.";
    }
}
