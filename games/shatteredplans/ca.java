/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends oh {
    static String field_i;
    static a field_h;
    static int field_j;

    public static void a(int param0) {
        field_i = null;
        if (param0 != 2105376) {
            Object var2 = null;
            ca.a(72, -63, 69, (String) null, -119, 55, -75, -55, 113);
        }
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          mb.field_n.field_z = param3;
          if (em.field_h != 2) {
            cb.field_l.field_z = qi.field_m;
            break L0;
          } else {
            cb.field_l.field_z = kh.field_Kb;
            break L0;
          }
        }
        var9 = 495;
        var10 = 5;
        sg.field_Ab.a(var9 + param6, param2, (byte) 88, var10, 5);
        uq.field_j.a(-cg.field_C.field_K + sg.field_Ab.field_K, param2, (byte) 66, 0, 0);
        cg.field_C.a(cg.field_C.field_K, param2, (byte) 112, 0, uq.field_j.field_K);
        var10 = var10 + (param2 - -param4);
        hd.field_m.a(hd.field_m.e(false), param1, (byte) 77, var10, 5);
        var11 = cb.field_l.e(false);
        cb.field_l.a(var11, param1, (byte) 39, var10, -var11 + (-5 + var9));
        var12 = 5 + (var10 + param1);
        mb.field_n.a(var9, param7, (byte) 70, 0, 0);
        fe.field_w.a(var9, var12, (byte) 48, param7, 0);
        fe.field_w.field_F = cs.a(16, 3, fe.field_w.field_mb, 11579568, 8421504, 2105376);
        var12 = var12 + param7;
        fa.field_X.a(var9, var12, (byte) 106, -(var12 / 2) + param8, -(var9 / 2) + param0);
    }

    ca(fs param0) {
    }

    final static void a(java.applet.Applet param0, bc param1, bc param2, bc param3, boolean param4, bc param5) {
        int var7 = 0;
        int var8 = 0;
        bi[][] var9 = null;
        bi[][] var10 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = new bi[la.field_r.length][];
        var10 = var9;
        var7 = 0;
        L0: while (true) {
          if (var7 >= la.field_r.length) {
            wl.field_b = ah.field_Q;
            qr.a(hn.field_j, pg.field_C, ga.field_w, ub.field_Db, jd.field_d, 5, w.field_J, param1, param3, 6, param2, var10, -117, param4, var10);
            gn.field_y = id.a(2, param5, "", "lobbyicon");
            hm.field_o = false;
            pe.field_D = ms.field_c;
            ra.a(115, 200);
            rj.a(-94, param2, param1);
            nh.a(param0, 0, 0, (byte) -3, cg.field_B, 16777215);
            return;
          } else {
            if (la.field_r[var7] != null) {
              var9[var7] = ae.a(69, "", param5, la.field_r[var7]);
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Updates will sent to the email address you've given";
    }
}
