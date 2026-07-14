/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hl {
    int[] field_j;
    static uf field_l;
    boolean field_i;
    static int field_k;
    int field_m;

    public static void a(byte param0) {
        if (param0 > -48) {
            field_l = null;
        }
        field_l = null;
    }

    final static void a(boolean param0, da param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var5 = null;
            ma.a(true, (da) null, -15);
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = jn.a(16, (byte) -96, param1);
            var4 = d.field_c[param2];
            if (var4 == 0) {
              break L2;
            } else {
              if (var4 >= var3) {
                if (0 != var3) {
                  break L2;
                } else {
                  ad.field_a = true;
                  break L1;
                }
              } else {
                ad.field_a = true;
                break L1;
              }
            }
          }
          d.field_c[param2] = var3;
          break L1;
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param1 != -1) {
            return true;
        }
        for (var2 = 0; var2 < param0.length; var2++) {
            if (lk.field_g[param0[var2]]) {
                return true;
            }
        }
        return false;
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ao.a(en.a(97), false);
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          var3 = HoldTheLine.field_D;
          if (param0 == -21383) {
            break L0;
          } else {
            ma.a((byte) 26);
            break L0;
          }
        }
        if (-1 != (pf.a((byte) 20, kn.b((byte) -49).field_p) ^ -1)) {
          return;
        } else {
          L1: {
            eb.field_o = null;
            ii.field_c = 0;
            qd.a(20830, 3 - -cf.field_w);
            ek.field_x = 3;
            pe.field_g = new int[4];
            if (7 != mi.field_d) {
              L2: {
                if (1 == mi.field_d) {
                  break L2;
                } else {
                  if (wb.field_c) {
                    break L2;
                  } else {
                    em.field_o = false;
                    break L2;
                  }
                }
              }
              L3: {
                bn.a(1, param0 ^ 21498);
                nm.field_b = kn.b((byte) -49);
                if (pd.a(nm.field_b, true)) {
                  bl.field_r = new sg(nm.field_b, mi.field_d, wb.field_c, em.field_o, t.field_l, ah.field_b);
                  break L3;
                } else {
                  sk.field_i = ah.field_b;
                  ca.field_r = mi.field_d;
                  bl.field_r = null;
                  on.field_r = t.field_l;
                  qn.field_k = em.field_o;
                  fl.field_j = wb.field_c;
                  break L3;
                }
              }
              kk.field_j = true;
              wm.a(param1, false, -1);
              break L1;
            } else {
              wb.field_c = false;
              kk.field_l = 4;
              t.field_j = new int[4];
              em.field_o = false;
              ah.field_b = -1;
              dk.field_g = 3;
              eg.field_a = vg.field_P;
              kk.field_m = new int[pc.field_l[cf.field_w]];
              ni.field_b = 859978912;
              hn.field_y = 0;
              nj.field_d = 1913842707 + ((1 & cf.field_w) << -1822361407) - -((2 & cf.field_w) >> -1869431583);
              tn.field_c = -1134004831;
              cm.field_a = -1329759026;
              t.field_l = go.field_g[kn.b((byte) -49).field_p][0];
              ij.a(param1, -79);
              ((ti) (Object) l.field_a[10]).field_t = 480.0f;
              break L1;
            }
          }
          return;
        }
    }

    ma() {
        ((ma) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 1;
    }
}
