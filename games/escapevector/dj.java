/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static String field_b;
    static boolean[] field_a;
    static fn[] field_d;
    static hl field_c;

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        oh var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            eh.field_k = true;
            var3_ref = (oh) (Object) wa.field_c.a(false);
            L1: while (true) {
              if (var3_ref == null) {
                var3_ref = (oh) (Object) si.field_u.a(false);
                L2: while (true) {
                  if (var3_ref == null) {
                    if (param1 < -5) {
                      break L0;
                    } else {
                      field_c = null;
                      return;
                    }
                  } else {
                    L3: {
                      if (var3_ref.field_m >= 0) {
                        em.g(param2 + var3_ref.field_i, param0 + var3_ref.field_q, var3_ref.field_s, hi.field_q);
                        break L3;
                      } else {
                        em.g(var3_ref.field_i + param2, param0 + -var3_ref.field_s + var3_ref.field_q, var3_ref.field_s, hi.field_q);
                        break L3;
                      }
                    }
                    var3_ref = (oh) (Object) si.field_u.b((byte) 70);
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (var3_ref.field_m < 0) {
                    em.e(var3_ref.field_i + -var3_ref.field_s - -param2, param0 + var3_ref.field_q, var3_ref.field_s, hi.field_q);
                    break L4;
                  } else {
                    em.e(param2 + var3_ref.field_i, param0 + var3_ref.field_q, var3_ref.field_s, hi.field_q);
                    break L4;
                  }
                }
                var3_ref = (oh) (Object) wa.field_c.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "dj.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= -34) {
          var2 = param1 & 255;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 >= 128) {
              if (var2 >= 160) {
                return (char)var2;
              } else {
                L0: {
                  var3 = cn.field_c[-128 + var2];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          }
        } else {
          char discarded$1 = dj.a(-28, (byte) 6);
          var2 = param1 & 255;
          if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          } else {
            if (var2 < 128) {
              return (char)var2;
            } else {
              L1: {
                if (var2 < 160) {
                  L2: {
                    var3 = cn.field_c[-128 + var2];
                    if (var3 == 0) {
                      var3 = 63;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          }
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        var2 = EscapeVector.field_A;
        try {
          L0: {
            boolean discarded$12 = bo.field_F.a(true, (byte) -33, oj.field_G, ph.field_a);
            bo.field_F.m(0);
            L1: while (true) {
              if (!pn.p(-116)) {
                if (param0 == 6445) {
                  if (-1 != rf.field_a) {
                    var1_int = rf.field_a;
                    lj.a(-1, param0 + -6378);
                    stackOut_9_0 = var1_int;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    if (!ei.field_i) {
                      if (ui.field_b != dg.field_o) {
                        if (!di.field_g.b(0)) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          if (dg.field_o != dn.field_q) {
                            stackOut_24_0 = -1;
                            stackIn_25_0 = stackOut_24_0;
                            break L0;
                          } else {
                            stackOut_22_0 = 2;
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0;
                          }
                        }
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    } else {
                      stackOut_12_0 = 3;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  }
                } else {
                  stackOut_5_0 = -79;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$13 = bo.field_F.a(jc.field_c, nk.field_n, (byte) -116);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "dj.C(" + param0 + 41);
        }
        return stackIn_25_0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        int var1 = 2;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
