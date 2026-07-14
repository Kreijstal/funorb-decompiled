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
        if (param0 != -8105) {
            return;
        }
        field_r = null;
        field_v = null;
    }

    final static cr e(int param0) {
        if (param0 != 2) {
            return null;
        }
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
        int var1 = 0;
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        boolean discarded$12 = ch.field_e.a(qj.field_c, true, (byte) -71, qe.field_Z);
        if (param0 == 1) {
          ch.field_e.l(0);
          L0: while (true) {
            if (!gf.a(false)) {
              if (0 == (nm.field_F ^ -1)) {
                if (!ed.field_t) {
                  if (bf.field_b == um.field_F) {
                    return 1;
                  } else {
                    if (cl.field_c.a((byte) -79)) {
                      if (bf.field_b == un.field_Hb) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  }
                } else {
                  return 3;
                }
              } else {
                var1 = nm.field_F;
                rh.b(-14, -1);
                return var1;
              }
            } else {
              boolean discarded$13 = ch.field_e.a(param0 + -93, de.field_f, ji.field_r);
              continue L0;
            }
          }
        } else {
          return 16;
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        gg var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var2 = -36 % ((-24 - param0) / 47);
        tg.field_e = param1;
        var3 = (gg) (Object) fm.field_b.a((byte) 100);
        L0: while (true) {
          if (var3 == null) {
            if (ro.field_b != null) {
              var3 = (gg) (Object) ro.field_b.a((byte) 100);
              L1: while (true) {
                if (var3 != null) {
                  L2: {
                    if (!var3.field_q.b(114)) {
                      var3.c(2);
                      break L2;
                    } else {
                      var3.field_r.g(128 + tg.field_e * var3.field_p >> 125100744);
                      break L2;
                    }
                  }
                  var3 = (gg) (Object) ro.field_b.b(41);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            L3: {
              if (!var3.field_q.b(99)) {
                var3.c(2);
                break L3;
              } else {
                var3.field_r.g(128 + var3.field_p * tg.field_e >> 462771688);
                break L3;
              }
            }
            var3 = (gg) (Object) fm.field_b.b(117);
            continue L0;
          }
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
