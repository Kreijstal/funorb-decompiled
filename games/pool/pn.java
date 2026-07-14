/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    int field_o;
    int field_e;
    String field_q;
    int[] field_d;
    int field_p;
    int field_h;
    vh field_u;
    boolean field_g;
    String field_n;
    static String[] field_i;
    String field_f;
    static String field_t;
    long field_b;
    int field_m;
    static String field_c;
    String field_j;
    static hj field_k;
    static String field_a;
    static dd field_l;
    static int field_s;
    static int[] field_r;

    public static void a(int param0) {
        Object var2 = null;
        field_k = null;
        field_l = null;
        if (param0 != 0) {
          var2 = null;
          pn.a((byte) -13, (String) null);
          field_c = null;
          field_a = null;
          field_t = null;
          field_r = null;
          field_i = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_t = null;
          field_r = null;
          field_i = null;
          return;
        }
    }

    final static qb[] a(int param0, di param1, int param2, int param3) {
        if (vj.a(param2, param1, param0, (byte) 121)) {
          if (param3 != 120) {
            field_i = null;
            return me.h(0);
          } else {
            return me.h(0);
          }
        } else {
          return null;
        }
    }

    final int b(int param0) {
        if (!((pn) this).field_g) {
          if (-3 == (((pn) this).field_p ^ -1)) {
            if (0 >= ((pn) this).field_h) {
              if ((ve.field_m ^ -1L) != (((pn) this).field_b ^ -1L)) {
                if (param0 == 14842) {
                  if (th.field_a == 2) {
                    if (lq.a(((pn) this).field_q, -1)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  ((pn) this).field_o = -18;
                  if (th.field_a == 2) {
                    if (!lq.a(((pn) this).field_q, -1)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          } else {
            if ((ve.field_m ^ -1L) != (((pn) this).field_b ^ -1L)) {
              if (param0 == 14842) {
                if (th.field_a == 2) {
                  if (!lq.a(((pn) this).field_q, -1)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              } else {
                ((pn) this).field_o = -18;
                if (th.field_a == 2) {
                  if (!lq.a(((pn) this).field_q, -1)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 1;
            }
          }
        } else {
          return 2;
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tf.field_d = true;
        t.field_b.field_nb = param1;
        var2 = sh.field_P.field_e;
        if (param0 != 75) {
          return;
        } else {
          var3 = sh.field_P.field_k;
          var4 = t.field_b.field_I.b(param1, 272, t.field_b.field_M);
          var5 = -(var4 / 2) + var3 / 2 - 103;
          ln.field_q.b(var5, param0 ^ 2147483572, (-320 + var2) / 2, 320, -(var5 * 2) + -120 + var3);
          ln.field_q.field_F = rp.a(32450, 3, 2105376, ln.field_q.field_Db, 11579568, 8421504);
          t.field_b.b(16, param0 + 2147483572, 24, -24 + (ln.field_q.field_gb + -24), ln.field_q.field_Db + -44);
          sb.field_a.b(-20 + ln.field_q.field_Db - 24, param0 ^ 2147483572, 120, 80, 24);
          return;
        }
    }

    pn(boolean param0) {
        ((pn) this).field_n = tp.field_g;
        ((pn) this).field_p = um.field_d;
        if (!param0) {
            ((pn) this).field_d = null;
        } else {
            ((pn) this).field_d = ci.field_p;
        }
        ((pn) this).field_f = np.field_a;
        ((pn) this).field_j = n.field_S;
        ((pn) this).field_g = qg.field_d;
        ((pn) this).field_q = lh.field_f;
        ((pn) this).field_h = df.field_e;
        ((pn) this).field_e = m.field_e;
        ((pn) this).field_o = pp.field_b;
        ((pn) this).field_m = wq.field_a;
        ((pn) this).field_b = qg.field_c;
    }

    pn(int param0, String param1, int param2, String param3, String param4) {
        ((pn) this).field_f = param4;
        ((pn) this).field_j = param1;
        ((pn) this).field_o = param2;
        ((pn) this).field_q = param1;
        ((pn) this).field_e = 0;
        ((pn) this).field_m = 0;
        ((pn) this).field_d = null;
        ((pn) this).field_b = 0L;
        ((pn) this).field_n = param3;
        ((pn) this).field_g = true;
        ((pn) this).field_p = param0;
        ((pn) this).field_h = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Concluded";
        field_t = "Reds";
        field_k = new hj(15, 0, 1, 0);
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_r = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
    }
}
