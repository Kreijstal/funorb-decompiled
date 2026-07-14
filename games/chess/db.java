/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vm {
    static int field_p;
    private boolean field_o;
    static int[] field_n;
    private oc field_q;
    static String[] field_m;
    private String field_l;

    public static void d(boolean param0) {
        field_m = null;
        if (!param0) {
            return;
        }
        field_n = null;
    }

    final static void i(int param0) {
        int var2 = 0;
        var2 = Chess.field_G;
        if (param0 > -9) {
          db.d(false);
          if (!oc.field_p.field_m) {
            if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) == 0) {
              if (-1 == (oc.field_p.field_B.field_c ^ -1)) {
                if ((1 << oc.field_p.field_B.field_h) + -1 != (oc.field_p.field_A | 1 << oc.field_p.field_a)) {
                  fm.field_R[36] = od.field_U;
                  return;
                } else {
                  fm.field_R[36] = vh.field_h;
                  return;
                }
              } else {
                fm.field_R[36] = qa.field_d;
                return;
              }
            } else {
              fm.field_R[36] = jh.field_d;
              return;
            }
          } else {
            if (-1 == (1 << oc.field_p.field_a & oc.field_p.field_B.field_c)) {
              if (-1 == oc.field_p.field_B.field_c) {
                if ((oc.field_p.field_A | 1 << oc.field_p.field_a) != -1 + (1 << oc.field_p.field_B.field_h)) {
                  fm.field_R[36] = hk.field_J;
                  return;
                } else {
                  fm.field_R[36] = jc.field_c;
                  return;
                }
              } else {
                fm.field_R[36] = ig.field_e;
                return;
              }
            } else {
              fm.field_R[36] = dj.field_w;
              return;
            }
          }
        } else {
          if (!oc.field_p.field_m) {
            if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) == 0) {
              if (-1 == (oc.field_p.field_B.field_c ^ -1)) {
                if ((1 << oc.field_p.field_B.field_h) + -1 != (oc.field_p.field_A | 1 << oc.field_p.field_a)) {
                  fm.field_R[36] = od.field_U;
                  return;
                } else {
                  fm.field_R[36] = vh.field_h;
                  return;
                }
              } else {
                fm.field_R[36] = qa.field_d;
                return;
              }
            } else {
              fm.field_R[36] = jh.field_d;
              return;
            }
          } else {
            if (-1 == (1 << oc.field_p.field_a & oc.field_p.field_B.field_c)) {
              if (-1 == oc.field_p.field_B.field_c) {
                if ((oc.field_p.field_A | 1 << oc.field_p.field_a) != -1 + (1 << oc.field_p.field_B.field_h)) {
                  fm.field_R[36] = hk.field_J;
                  return;
                } else {
                  fm.field_R[36] = jc.field_c;
                  return;
                }
              } else {
                fm.field_R[36] = ig.field_e;
                return;
              }
            } else {
              fm.field_R[36] = dj.field_w;
              return;
            }
          }
        }
    }

    final static void h(int param0) {
        if (param0 != 12082) {
            return;
        }
        if (!ad.field_b) {
            throw new IllegalStateException();
        }
        vh.field_e = true;
        vf.a(true, -125);
        rm.field_Q = 0;
    }

    final String a(String param0, int param1) {
        if (((db) this).field_q.a((byte) -114, param0) != qk.field_b) {
          if (param1 == -9316) {
            if (((db) this).a((byte) -117, param0) == qk.field_b) {
              return v.field_h;
            } else {
              return ie.field_c;
            }
          } else {
            return null;
          }
        } else {
          return ((db) this).field_q.a(param0, -9316);
        }
    }

    final mk a(byte param0, String param1) {
        mh var4 = null;
        int var3 = 28 / ((-49 - param0) / 62);
        if (!(((db) this).field_q.a((byte) -116, param1) != qk.field_b)) {
            return qk.field_b;
        }
        if (!(param1.equals((Object) (Object) ((db) this).field_l))) {
            var4 = va.a(26447, param1);
            if (var4.b((byte) 123)) {
                ((db) this).field_l = param1;
                ((db) this).field_o = var4.c(-79);
                return ((db) this).field_o ? oa.field_a : qk.field_b;
            }
            return ek.field_d;
        }
        return ((db) this).field_o ? oa.field_a : qk.field_b;
    }

    final static void a(int param0, int param1, int param2) {
        nk var3 = null;
        var3 = qn.field_U;
        var3.f(param0, -83);
        var3.c(3, (byte) 83);
        var3.c(9, (byte) 103);
        if (param2 != 28113) {
          return;
        } else {
          var3.b(param1, 113);
          return;
        }
    }

    final static ci j(int param0) {
        if (param0 != -1) {
            db.a(33, 69, -51);
            return se.field_S.field_Kb;
        }
        return se.field_S.field_Kb;
    }

    db(qn param0, qn param1) {
        super(param0);
        ((db) this).field_o = false;
        ((db) this).field_l = "";
        ((db) this).field_q = new oc(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_n = new int[8192];
    }
}
