/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends li {
    int field_t;
    static int[] field_w;
    static int[] field_v;
    pk field_n;
    int field_p;
    int field_u;
    int field_q;
    int field_s;
    static int field_o;
    static String field_r;

    public static void f(int param0) {
        field_w = null;
        field_r = null;
        field_v = null;
    }

    final static cr e(int param0) {
        return vd.field_d.field_Nb;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 != -14) {
          L0: {
            field_v = null;
            if (param2 < param3) {
              stackOut_11_0 = param3;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (param2 <= param1) {
                stackOut_10_0 = param2;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = param1;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (param2 < param3) {
              stackOut_5_0 = param3;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (param2 <= param1) {
                stackOut_4_0 = param2;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = param1;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            boolean discarded$4 = ch.field_e.a(qj.field_c, true, (byte) -71, qe.field_Z);
            ch.field_e.l(0);
            L1: while (true) {
              if (!gf.a(false)) {
                if (nm.field_F == -1) {
                  if (!ed.field_t) {
                    if (bf.field_b == um.field_F) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (cl.field_c.a((byte) -79)) {
                        if (bf.field_b != un.field_Hb) {
                          stackOut_22_0 = -1;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    }
                  } else {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  var1_int = nm.field_F;
                  rh.b(-14, -1);
                  stackOut_7_0 = var1_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                boolean discarded$5 = ch.field_e.a(-92, de.field_f, ji.field_r);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "pk.A(" + 1 + 41);
        }
        return stackIn_23_0;
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        gg var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = -36 % ((-24 - param0) / 47);
            tg.field_e = param1;
            var3 = (gg) (Object) fm.field_b.a((byte) 100);
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  if (ro.field_b == null) {
                    break L2;
                  } else {
                    var3 = (gg) (Object) ro.field_b.a((byte) 100);
                    L3: while (true) {
                      if (var3 == null) {
                        break L2;
                      } else {
                        L4: {
                          if (!var3.field_q.b(114)) {
                            var3.c(2);
                            break L4;
                          } else {
                            var3.field_r.g(128 + tg.field_e * var3.field_p >> 8);
                            break L4;
                          }
                        }
                        var3 = (gg) (Object) ro.field_b.b(41);
                        continue L3;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  if (!var3.field_q.b(99)) {
                    var3.c(2);
                    break L5;
                  } else {
                    var3.field_r.g(128 + var3.field_p * tg.field_e >> 8);
                    break L5;
                  }
                }
                var3 = (gg) (Object) fm.field_b.b(117);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "pk.B(" + param0 + 44 + param1 + 41);
        }
    }

    pk(int param0, int param1, int param2, int param3, int param4) {
        ((pk) this).field_p = param2;
        ((pk) this).field_t = param3;
        ((pk) this).field_u = param0;
        ((pk) this).field_q = param4;
        ((pk) this).field_s = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[8192];
        field_v = new int[8192];
        field_r = "Create a free Account";
    }
}
