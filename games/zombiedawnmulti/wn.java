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
        field_u = null;
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 > -122) {
            field_s = null;
            if (param1 < 4096) {
                return param1 < 2048 ? h.field_K[2048 + -param1] : -h.field_K[param1 + -2048];
            }
            return param1 >= 6144 ? h.field_K[-6144 + param1] : -h.field_K[6144 + -param1];
        }
        if (param1 < 4096) {
            return param1 < 2048 ? h.field_K[2048 + -param1] : -h.field_K[param1 + -2048];
        }
        return param1 >= 6144 ? h.field_K[-6144 + param1] : -h.field_K[6144 + -param1];
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        cj stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        cj stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        cj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        cj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        cj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cj stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_9_0 = 0;
        cj stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        cj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        cj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        cj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        cj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        cj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          dm.field_Qb = oo.field_l;
          kp.field_l = oo.field_b;
          v.a(199);
          de.field_b.a(0, qe.field_k.field_zb, 0, (byte) -74, -40 + (qe.field_k.field_z - 2));
          ql.field_b.a(jk.field_f, 0, lo.field_g.field_zb, 0, -3344);
          var1 = jk.field_f - -2;
          stackOut_0_0 = pd.field_b;
          stackOut_0_1 = lo.field_g.field_z;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (tb.field_u) {
            stackOut_2_0 = (cj) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = var1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (cj) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (cj) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1 - stackIn_3_2;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (!tb.field_u) {
            stackOut_5_0 = (cj) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (cj) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = var1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((cj) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, lo.field_g.field_zb, 0, -3344);
          up.a(false);
          kj.field_u.a(40, qe.field_k.field_z + -40, qe.field_k.field_zb, 0, -3344);
          ro.field_O.a(30, 0, cm.field_a.field_zb, 0, -3344);
          ml.field_Lb.a(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
          k.field_g.a(30, 5, 68, 5, -3344);
          ud.field_M.a(30, 5, 78, 75, -3344);
          tk.field_l.a(30, 5, 48, 155, -3344);
          sc.field_d.a(30, 5, 48, 205, -3344);
          if (tb.field_u) {
            stackOut_8_0 = 250;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 200;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0;
          da.field_h.a(30, 5, -var2 + 363, var2 + 5, -3344);
          bp.field_w.a(30, 5, cm.field_a.field_zb - 375, 370, -3344);
          ek.field_H.a(qa.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, -31465, 37);
          var3 = (2 + cm.field_a.field_zb) / 2;
          ia.field_t.a(40, -40 + cm.field_a.field_z, var3 - 2, 0, -3344);
          if (!tb.field_u) {
            var3 = 0;
            break L3;
          } else {
            break L3;
          }
        }
        pl.field_L.a(40, -40 + cm.field_a.field_z, -var3 + cm.field_a.field_zb, var3, -3344);
    }

    final pi b(int param0) {
        if (param0 != 7) {
            return null;
        }
        return ke.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Focused";
        field_t = (int)(Math.sqrt(2.0) * 9.0) + 1;
    }
}
