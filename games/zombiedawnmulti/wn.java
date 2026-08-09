/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends pp {
    static String field_s;
    static int field_t;
    static fm field_u;
    static long field_r;

    wn(long param0, String param1) {
        super(param0, param1);
    }

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
            wn.a(-112, -101);
            field_u = null;
            return;
        }
        field_u = null;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -122) {
          if (-4097 < (param1 ^ -1)) {
            L0: {
              if (-2049 >= (param1 ^ -1)) {
                stackIn_19_0 = -h.field_K[param1 + -2048];
                break L0;
              } else {
                stackIn_19_0 = h.field_K[2048 + -param1];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 < (param1 ^ -1)) {
                stackIn_15_0 = -h.field_K[6144 + -param1];
                break L1;
              } else {
                stackIn_15_0 = h.field_K[-6144 + param1];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_s = (String) null;
          if (-4097 < (param1 ^ -1)) {
            L2: {
              if (-2049 >= (param1 ^ -1)) {
                stackIn_9_0 = -h.field_K[param1 + -2048];
                break L2;
              } else {
                stackIn_9_0 = h.field_K[2048 + -param1];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 < (param1 ^ -1)) {
                stackIn_5_0 = -h.field_K[6144 + -param1];
                break L3;
              } else {
                stackIn_5_0 = h.field_K[-6144 + param1];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        dm.field_Qb = oo.field_l;
        kp.field_l = oo.field_b;
        v.a(param0 ^ 196);
        de.field_b.a(0, qe.field_k.field_zb, 0, (byte) -74, -40 + (qe.field_k.field_z - 2));
        ql.field_b.a(jk.field_f, 0, lo.field_g.field_zb, 0, param0 + -3347);
        int var1 = jk.field_f - -2;
        pd.field_b.a(lo.field_g.field_z - (!tb.field_u ? 0 : var1), tb.field_u ? var1 : 0, lo.field_g.field_zb, 0, -3344);
        up.a(false);
        kj.field_u.a(40, qe.field_k.field_z + -40, qe.field_k.field_zb, 0, -3344);
        if (param0 != 3) {
            field_t = -52;
            ro.field_O.a(30, 0, cm.field_a.field_zb, 0, -3344);
            ml.field_Lb.a(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
            k.field_g.a(30, 5, 68, 5, -3344);
            ud.field_M.a(30, 5, 78, 75, -3344);
            tk.field_l.a(30, 5, 48, 155, param0 ^ -3341);
            sc.field_d.a(30, 5, 48, 205, -3344);
            var2 = !tb.field_u ? 200 : 250;
            da.field_h.a(30, 5, -var2 + 363, var2 + 5, -3344);
            bp.field_w.a(30, 5, cm.field_a.field_zb + -5 + -5 - 365, 370, -3344);
            ek.field_H.a(qa.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, param0 ^ -31468, 37);
            var3 = (2 + cm.field_a.field_zb) / 2;
            ia.field_t.a(40, -40 + cm.field_a.field_z, var3 - 2, 0, param0 + -3347);
            if (!(tb.field_u)) {
                var3 = 0;
            }
            pl.field_L.a(40, -40 + cm.field_a.field_z, -var3 + cm.field_a.field_zb, var3, -3344);
            return;
        }
        ro.field_O.a(30, 0, cm.field_a.field_zb, 0, -3344);
        ml.field_Lb.a(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
        k.field_g.a(30, 5, 68, 5, -3344);
        ud.field_M.a(30, 5, 78, 75, -3344);
        tk.field_l.a(30, 5, 48, 155, param0 ^ -3341);
        sc.field_d.a(30, 5, 48, 205, -3344);
        var2 = !tb.field_u ? 200 : 250;
        da.field_h.a(30, 5, -var2 + 363, var2 + 5, -3344);
        bp.field_w.a(30, 5, cm.field_a.field_zb + -5 + -5 - 365, 370, -3344);
        ek.field_H.a(qa.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, param0 ^ -31468, 37);
        var3 = (2 + cm.field_a.field_zb) / 2;
        ia.field_t.a(40, -40 + cm.field_a.field_z, var3 - 2, 0, param0 + -3347);
        if (!(tb.field_u)) {
            var3 = 0;
        }
        pl.field_L.a(40, -40 + cm.field_a.field_z, -var3 + cm.field_a.field_zb, var3, -3344);
    }

    final pi b(int param0) {
        if (param0 != 7) {
            return (pi) null;
        }
        return ke.field_f;
    }

    static {
        field_s = "Focused";
        field_t = (int)(Math.sqrt(2.0) * 9.0) + 1;
    }
}
