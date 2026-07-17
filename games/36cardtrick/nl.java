/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int[] field_c;
    static int field_b;
    static String field_a;
    static volatile int field_d;
    static boolean[] field_e;

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (cd.field_e == 11) {
                ie.f(-11);
            }
            int var2_int = -107 % ((param1 - -26) / 62);
            ti.a(he.field_g, (byte) 54, ck.field_G, sg.field_b);
            ll.a(0, (byte) 115, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "nl.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        var7 = Main.field_T;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ge.b((byte) -114)) {
                L2: {
                  cg.field_e.a(af.a(ij.field_e, true, eg.field_b), (byte) 123, af.a(jc.field_N, param0, ag.field_a));
                  if (!cg.field_e.f(-85)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (cg.field_e.field_k < 0) {
                        break L4;
                      } else {
                        var3 = dd.field_j[cg.field_e.field_k];
                        if (var3 == 2) {
                          re.c(3);
                          break L3;
                        } else {
                          if (var3 == 5) {
                            re.c(3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (v.field_R != 2) {
                      re.c(3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    if (v.field_R == 2) {
                      var4 = -jl.field_c + id.a(54);
                      var6 = (int)((10999L - var4) / 1000L);
                      if (0 >= var6) {
                        var3 = 2;
                        sc.a(5, (byte) 126, true);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_27_0 = var3;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                L6: {
                  cg.field_e.b((byte) 76);
                  if (cg.field_e.f(-85)) {
                    var1_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (tb.field_d != 13) {
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
          throw ma.a((Throwable) (Object) var1, "nl.C(" + param0 + 41);
        }
        return stackIn_28_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Orb coins: <%0>";
        field_d = 0;
        field_e = new boolean[64];
    }
}
