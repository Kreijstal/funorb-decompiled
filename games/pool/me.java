/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends ig {
    static String field_w;
    private boolean field_m;
    static String field_v;
    private String field_t;
    static di field_r;
    static int field_o;
    static int field_s;
    static dd field_p;
    static so field_y;
    static String field_u;
    static int field_x;
    private ne field_q;
    static int field_n;

    final static qb[] h(int param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        qb[] var1 = new qb[wf.field_d];
        for (var2 = param0; wf.field_d > var2; var2++) {
            var1[var2] = new qb(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], v.field_b[var2], ma.field_h);
        }
        sh.h(-1);
        return var1;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 == -1) {
          var3 = 1;
          L0: while (true) {
            if (param0 <= 1) {
              if ((param0 ^ -1) == -2) {
                return var3 * param1;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (-1 != (param0 & 1 ^ -1)) {
                  var3 = var3 * param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              param1 = param1 * param1;
              param0 = param0 >> 1;
              continue L0;
            }
          }
        } else {
          return -80;
        }
    }

    final static ij a(int param0, int param1) {
        aa var2 = null;
        ij var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        if (param0 == -2) {
          var2 = new aa(nd.field_i);
          var3 = (ij) (Object) var2.b((byte) -92);
          L0: while (true) {
            if (var3 != null) {
              if (param1 == var3.field_m) {
                return var3;
              } else {
                var3 = (ij) (Object) var2.b(-86);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void b(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.a(1, false);
        var2.a(3, false);
        int var3 = 22 / ((-52 - param0) / 62);
    }

    public static void b(boolean param0) {
        field_r = null;
        field_p = null;
        field_y = null;
        field_w = null;
        field_v = null;
        if (!param0) {
          field_r = null;
          field_u = null;
          return;
        } else {
          field_u = null;
          return;
        }
    }

    me(sl param0, sl param1) {
        super(param0);
        ((me) this).field_t = "";
        ((me) this).field_m = false;
        ((me) this).field_q = new ne(param0, param1);
    }

    final na a(String param0, boolean param1) {
        qr var3 = null;
        if (!(((me) this).field_q.a(param0, param1) != gp.field_d)) {
            return gp.field_d;
        }
        if (!(param0.equals((Object) (Object) ((me) this).field_t))) {
            var3 = nf.b((byte) -25, param0);
            if (var3.a(80)) {
                ((me) this).field_t = param0;
                ((me) this).field_m = var3.b((byte) -74);
                return ((me) this).field_m ? kr.field_e : gp.field_d;
            }
            return no.field_k;
        }
        return ((me) this).field_m ? kr.field_e : gp.field_d;
    }

    final String a(String param0, int param1) {
        if (((me) this).field_q.a(param0, true) != gp.field_d) {
          if (((me) this).a(param0, true) != gp.field_d) {
            if (param1 != 0) {
              ij discarded$2 = me.a(-101, -109);
              return hb.field_d;
            } else {
              return hb.field_d;
            }
          } else {
            return hm.field_d;
          }
        } else {
          return ((me) this).field_q.a(param0, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Spots";
        field_v = "Hide private chat and appear offline to friends";
        field_u = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_o = 0;
        field_s = field_o;
    }
}
