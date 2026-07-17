/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int field_a;
    static int field_c;
    static int field_b;
    static int[] field_d;

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
            return;
        }
        nj.a(cq.field_b, (byte) -125, param0, param3, param4, param1);
        if (param0 > param1) {
            mj.field_b.c(param3 - -(-mj.field_b.field_w + param0 >> 1), param4);
            jp.field_T.c(param3 - -(-jp.field_T.field_w + param0 >> 1), -jp.field_T.field_y + (param1 + param4));
        } else {
            bi.field_a.c(param3, (param1 + -bi.field_a.field_y >> 1) + param4);
            wk.field_T.c(param3 - -param0 - wk.field_T.field_w, param4 - -(-wk.field_T.field_y + param1 >> 1));
        }
    }

    public static void a(int param0) {
        field_d = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (100 != param0) {
            break L0;
          } else {
            if (to.field_p > 0) {
              int fieldTemp$3 = to.field_p - 1;
              to.field_p = to.field_p - 1;
              var2_ref_byte__ = uf.field_y[fieldTemp$3];
              uf.field_y[to.field_p] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 != 5000) {
            break L1;
          } else {
            if (em.field_I > 0) {
              int fieldTemp$4 = em.field_I - 1;
              em.field_I = em.field_I - 1;
              var2_ref_byte__ = th.field_j[fieldTemp$4];
              th.field_j[em.field_I] = null;
              return var2_ref_byte__;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (ii.field_a <= 0) {
              break L2;
            } else {
              int fieldTemp$5 = ii.field_a - 1;
              ii.field_a = ii.field_a - 1;
              var2_ref_byte__ = ec.field_g[fieldTemp$5];
              ec.field_g[ii.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L3: {
          if (param1 == -1) {
            break L3;
          } else {
            field_c = 109;
            break L3;
          }
        }
        L4: {
          if (null != nk.field_l) {
            var2 = 0;
            L5: while (true) {
              if (~var2 <= ~s.field_f.length) {
                break L4;
              } else {
                L6: {
                  if (~s.field_f[var2] != ~param0) {
                    break L6;
                  } else {
                    if (ho.field_l[var2] <= 0) {
                      break L6;
                    } else {
                      ho.field_l[var2] = ho.field_l[var2] - 1;
                      var3 = nk.field_l[var2][ho.field_l[var2] - 1];
                      nk.field_l[var2][ho.field_l[var2]] = null;
                      return var3;
                    }
                  }
                }
                var2++;
                continue L5;
              }
            }
          } else {
            break L4;
          }
        }
        return new byte[param0];
    }

    final static void a(boolean param0) {
        jo.field_J = 0;
        ne.field_n = -1;
        if (!param0) {
            return;
        }
        nn.field_d = false;
        id.field_b = -1;
        pj.field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = new int[8192];
    }
}
