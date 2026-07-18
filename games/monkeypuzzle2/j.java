/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static qi field_e;
    static le field_g;
    static boolean[] field_d;
    static int field_a;
    static le field_c;
    static le[] field_f;
    static String field_b;
    static String field_h;

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_h = null;
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_9_0 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ba.a(-1)) {
                if (param0 == 5) {
                  L2: {
                    sj.field_f.a(q.a(p.field_a, (byte) -36, ei.field_a), q.a(ab.field_e, (byte) -36, qg.field_c), true);
                    if (sj.field_f.c((byte) -99)) {
                      var1_int = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var3 = 0;
                      if (var1_int == 0) {
                        break L4;
                      } else {
                        if (sj.field_f.field_a < 0) {
                          break L4;
                        } else {
                          var3 = bi.field_B[sj.field_f.field_a];
                          if (var3 == 2) {
                            tj.a((byte) -123);
                            break L3;
                          } else {
                            if (var3 != 5) {
                              break L3;
                            } else {
                              tj.a((byte) -123);
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if (ud.field_b == 2) {
                        break L3;
                      } else {
                        tj.a((byte) -96);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (var3 != 0) {
                      break L5;
                    } else {
                      if (ud.field_b != 2) {
                        break L5;
                      } else {
                        var4 = pf.a(0) + -fb.field_n;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 < var6) {
                          break L5;
                        } else {
                          var3 = 2;
                          jk.a(-125, true, 5);
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = var3;
                  stackIn_29_0 = stackOut_28_0;
                  break L0;
                } else {
                  stackOut_9_0 = 127;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                L6: {
                  sj.field_f.e(0);
                  if (sj.field_f.c((byte) -84)) {
                    var1_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (oa.field_H != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "j.B(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try again";
        field_h = "Loading...";
    }
}
