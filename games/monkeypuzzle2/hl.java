/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    private boolean field_b;
    static li field_d;
    private int field_e;
    private long field_j;
    static int[] field_f;
    private String field_h;
    static int field_a;
    int[] field_l;
    int field_k;
    int field_g;
    String field_c;
    int field_i;

    final int a(int param0) {
        if (param0 == 2147483647) {
          if (!((hl) this).field_b) {
            if (((hl) this).field_i != 2) {
              if (~((hl) this).field_j == ~sb.field_e) {
                return 1;
              } else {
                if (2 == ci.field_b) {
                  if (!em.a((byte) 119, ((hl) this).field_h)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (((hl) this).field_e <= 0) {
                if (~((hl) this).field_j == ~sb.field_e) {
                  return 1;
                } else {
                  if (2 == ci.field_b) {
                    if (em.a((byte) 119, ((hl) this).field_h)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 2;
              }
            }
          } else {
            return 2;
          }
        } else {
          ((hl) this).field_k = 45;
          if (!((hl) this).field_b) {
            if (((hl) this).field_i == 2) {
              if (((hl) this).field_e > 0) {
                return 2;
              } else {
                if (~((hl) this).field_j == ~sb.field_e) {
                  return 1;
                } else {
                  if (2 == ci.field_b) {
                    if (em.a((byte) 119, ((hl) this).field_h)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                }
              }
            } else {
              if (~((hl) this).field_j == ~sb.field_e) {
                return 1;
              } else {
                if (2 == ci.field_b) {
                  if (!em.a((byte) 119, ((hl) this).field_h)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            }
          } else {
            return 2;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 2147483647;
            var4 = 0;
            if (param0 == 1) {
              L1: while (true) {
                if (17 <= var4) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    var5 = -param2 + (int)pe.field_d[var4].field_e[0];
                    var6 = (int)pe.field_d[var4].field_e[1] + -param1;
                    if (var5 * var5 + var6 * var6 < var3_int) {
                      var3_int = var6 * var6 + var5 * var5;
                      break L2;
                    } else {
                      var4++;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -108;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "hl.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    final static void a(byte param0, boolean param1) {
        ll.a((byte) 91, false, param1);
        if (param0 == -60) {
            return;
        }
        int discarded$0 = hl.a(34, -93, -26);
    }

    public static void c(int param0) {
        field_d = null;
        field_f = null;
        if (param0 == 2) {
            return;
        }
        hl.c(-3);
    }

    final static void b(int param0) {
        int var1 = -60 / ((param0 - -76) / 35);
        wg.field_j.k(121);
        if (!(vl.field_f != null)) {
            vl.field_f = new ul(wg.field_j, rc.field_i);
        }
        wg.field_j.b((byte) -97, (we) (Object) vl.field_f);
    }

    hl(boolean param0) {
        ((hl) this).field_e = o.field_c;
        ((hl) this).field_k = c.field_b;
        ((hl) this).field_g = sd.field_b;
        if (!param0) {
            ((hl) this).field_l = null;
        } else {
            ((hl) this).field_l = wh.field_e;
        }
        ((hl) this).field_h = i.field_h;
        ((hl) this).field_i = lf.field_c;
        ((hl) this).field_j = bi.field_z;
        ((hl) this).field_b = eg.field_j;
        ((hl) this).field_c = ba.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
    }
}
