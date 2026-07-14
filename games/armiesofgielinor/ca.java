/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca implements uo {
    int field_b;
    int field_c;
    int field_d;
    static int[] field_a;
    static int[] field_h;
    int field_g;
    String field_e;
    static int[] field_f;
    static String field_i;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_i = null;
        field_h = null;
        if (param0 != 23582) {
            field_f = null;
        }
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 == 37) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2.equals((Object) (Object) "name")) {
            if (0 < param0) {
              ((ca) this).field_e = up.a(param1, param0, (byte) -115);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (param2.equals((Object) (Object) "mf")) {
              if ((param0 ^ -1) >= -1) {
                break L1;
              } else {
                ((ca) this).field_c = (int)tn.a(false, param0, param1);
                break L1;
              }
            } else {
              if (param2.equals((Object) (Object) "ownr")) {
                if (0 < param0) {
                  ((ca) this).field_b = (int)tn.a(false, param0, param1);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (!param2.equals((Object) (Object) "tag")) {
                  if (param2.equals((Object) (Object) "god")) {
                    if (0 < param0) {
                      ((ca) this).field_g = (int)tn.a(false, param0, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  if (param0 > 0) {
                    ((ca) this).field_d = (int)tn.a(false, param0, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(java.awt.Component param0, int param1, hd param2, boolean param3, int param4, nm param5, int param6, int param7) {
        rc.a(param7, param3, 10);
        l.field_a = rc.a(param2, param0, 0, param6);
        mt.field_e = rc.a(param2, param0, 1, param1);
        ig.field_n = new uv();
        ku.field_K = param1;
        if (param4 >= -38) {
            field_a = null;
        }
        mt.field_e.b((hn) (Object) ig.field_n);
        lk.field_e = param5;
        lk.field_e.b(te.field_n, -120);
        l.field_a.b((hn) (Object) lk.field_e);
    }

    final static long b(int param0) {
        if (param0 != 0) {
            ca.a(-47, true);
        }
        return -iq.field_h + vi.b(-53);
    }

    final static pf[] c(int param0) {
        if (param0 != 0) {
            pf[] discarded$0 = ca.c(-90);
        }
        return new pf[]{vn.field_j, ps.field_y, u.field_l};
    }

    final static void a(int param0, boolean param1) {
        if (!(-1 <= gk.field_J)) {
            if (bw.field_g) {
                qn.d(0, 0, qn.field_l, ag.field_I.field_D);
                qc.field_c.b(param1, 20);
            }
        }
        if (-1 >= bd.field_r) {
            // if_icmplt L59
        } else {
            if (vk.field_f) {
                qn.d(0, 0, qn.field_l, ag.field_I.field_D);
                ta.field_R.b(param1, 20);
            }
        }
        if (param0 != 5295) {
            ca.a(88);
        }
    }

    ca() {
        ((ca) this).field_g = -1;
        ((ca) this).field_d = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_i = "Waiting for graphics";
    }
}
