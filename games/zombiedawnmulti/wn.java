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
        int discarded$0 = 0;
        field_s = null;
        if (!param0) {
            discarded$0 = wn.a(-112, -101);
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
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -122) {
          if (-4097 < (param1 ^ -1)) {
            L0: {
              if (-2049 >= (param1 ^ -1)) {
                stackOut_18_0 = -h.field_K[param1 + -2048];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = h.field_K[2048 + -param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_14_0 = -h.field_K[6144 + -param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = h.field_K[-6144 + param1];
                stackIn_15_0 = stackOut_13_0;
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
                stackOut_8_0 = -h.field_K[param1 + -2048];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = h.field_K[2048 + -param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_4_0 = -h.field_K[6144 + -param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = h.field_K[-6144 + param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
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
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
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
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          dm.field_Qb = oo.field_l;
          kp.field_l = oo.field_b;
          v.a(param0 ^ 196);
          de.field_b.a(0, qe.field_k.field_zb, 0, (byte) -74, -40 + (qe.field_k.field_z - 2));
          ql.field_b.a(jk.field_f, 0, lo.field_g.field_zb, 0, param0 + -3347);
          var1 = jk.field_f - -2;
          stackOut_0_0 = pd.field_b;
          stackOut_0_1 = lo.field_g.field_z;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (tb.field_u) {
            stackOut_2_0 = (cj) ((Object) stackIn_2_0);
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = var1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (cj) ((Object) stackIn_1_0);
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (cj) ((Object) stackIn_3_0);
          stackOut_3_1 = stackIn_3_1 - stackIn_3_2;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (!tb.field_u) {
            stackOut_5_0 = (cj) ((Object) stackIn_5_0);
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (cj) ((Object) stackIn_4_0);
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = var1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        ((cj) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, lo.field_g.field_zb, 0, -3344);
        up.a(false);
        kj.field_u.a(40, qe.field_k.field_z + -40, qe.field_k.field_zb, 0, -3344);
        if (param0 == 3) {
          L2: {
            ro.field_O.a(30, 0, cm.field_a.field_zb, 0, -3344);
            ml.field_Lb.a(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
            k.field_g.a(30, 5, 68, 5, -3344);
            ud.field_M.a(30, 5, 78, 75, -3344);
            tk.field_l.a(30, 5, 48, 155, param0 ^ -3341);
            sc.field_d.a(30, 5, 48, 205, -3344);
            if (tb.field_u) {
              stackOut_16_0 = 250;
              stackIn_17_0 = stackOut_16_0;
              break L2;
            } else {
              stackOut_15_0 = 200;
              stackIn_17_0 = stackOut_15_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_17_0;
            da.field_h.a(30, 5, -var2 + 363, var2 + 5, -3344);
            bp.field_w.a(30, 5, cm.field_a.field_zb + -5 + -5 - 365, 370, -3344);
            ek.field_H.a(qa.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, param0 ^ -31468, 37);
            var3 = (2 + cm.field_a.field_zb) / 2;
            ia.field_t.a(40, -40 + cm.field_a.field_z, var3 - 2, 0, param0 + -3347);
            if (!tb.field_u) {
              var3 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          pl.field_L.a(40, -40 + cm.field_a.field_z, -var3 + cm.field_a.field_zb, var3, -3344);
          return;
        } else {
          L4: {
            field_t = -52;
            ro.field_O.a(30, 0, cm.field_a.field_zb, 0, -3344);
            ml.field_Lb.a(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
            k.field_g.a(30, 5, 68, 5, -3344);
            ud.field_M.a(30, 5, 78, 75, -3344);
            tk.field_l.a(30, 5, 48, 155, param0 ^ -3341);
            sc.field_d.a(30, 5, 48, 205, -3344);
            if (tb.field_u) {
              stackOut_9_0 = 250;
              stackIn_10_0 = stackOut_9_0;
              break L4;
            } else {
              stackOut_8_0 = 200;
              stackIn_10_0 = stackOut_8_0;
              break L4;
            }
          }
          L5: {
            var2 = stackIn_10_0;
            da.field_h.a(30, 5, -var2 + 363, var2 + 5, -3344);
            bp.field_w.a(30, 5, cm.field_a.field_zb + -5 + -5 - 365, 370, -3344);
            ek.field_H.a(qa.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, param0 ^ -31468, 37);
            var3 = (2 + cm.field_a.field_zb) / 2;
            ia.field_t.a(40, -40 + cm.field_a.field_z, var3 - 2, 0, param0 + -3347);
            if (!tb.field_u) {
              var3 = 0;
              break L5;
            } else {
              break L5;
            }
          }
          pl.field_L.a(40, -40 + cm.field_a.field_z, -var3 + cm.field_a.field_zb, var3, -3344);
          return;
        }
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
