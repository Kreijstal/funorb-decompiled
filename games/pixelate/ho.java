/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_e;
    static ak field_g;
    static String[] field_a;
    static String field_f;
    static int field_c;
    static String field_b;
    static String field_d;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (we.field_o == null) {
              L1: {
                we.field_o = new String[35];
                we.field_o[3] = ah.field_u;
                we.field_o[7] = ge.field_b;
                we.field_o[9] = ih.field_e;
                we.field_o[6] = wk.field_f;
                we.field_o[0] = jm.field_s;
                we.field_o[28] = od.field_Nb;
                we.field_o[1] = jo.field_c;
                we.field_o[11] = al.field_d;
                we.field_o[29] = ge.field_a;
                if (param0 == -29810) {
                  break L1;
                } else {
                  ho.a(false, -69);
                  break L1;
                }
              }
              we.field_o[8] = null;
              we.field_o[5] = cm.field_l;
              we.field_o[2] = sk.field_b;
              we.field_o[13] = ra.field_f;
              we.field_o[4] = nn.field_l;
              we.field_o[19] = cl.field_c;
              we.field_o[17] = dg.field_c[0];
              we.field_o[15] = re.field_k[1];
              we.field_o[24] = mj.field_i;
              we.field_o[22] = pg.field_d;
              we.field_o[20] = fk.field_p;
              we.field_o[26] = qh.field_f;
              we.field_o[16] = re.field_k[2];
              we.field_o[23] = td.field_a;
              we.field_o[27] = kl.field_d;
              we.field_o[21] = mj.field_e;
              we.field_o[25] = ip.field_z;
              we.field_o[18] = dg.field_c[1];
              we.field_o[14] = re.field_k[0];
              wc.field_m[3] = vh.field_b;
              wc.field_m[6] = oe.field_Vb;
              wc.field_m[2] = bo.field_a;
              wc.field_m[4] = ce.field_e;
              wc.field_m[1] = ro.field_f;
              wc.field_m[7] = qf.field_d;
              dn.field_a = new String[][]{hm.field_f, qo.field_t, um.field_l, ol.field_p, ui.field_h, qg.field_d};
              ln.field_m = new String[][]{up.field_a, gp.field_Hb, qh.field_d, wk.field_i, tn.field_k, gj.field_R, uk.field_q, vd.field_d};
              wc.field_m[0] = bn.field_L;
              wc.field_m[5] = wa.field_e;
              var1_int = 0;
              L2: while (true) {
                if (var1_int >= wc.field_m.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (null == wc.field_m[var1_int]) {
                      wc.field_m[var1_int] = bl.field_f;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var1_int++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ho.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        kk.a((byte) -61, param0);
        if (param1 != 12402) {
            return;
        }
        cl.a((byte) 95, param0);
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 11799) {
            ho.a(-116);
        }
        field_g = null;
    }

    static {
        field_e = 1;
        field_f = "Send private Quick Chat to <%0>";
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = 0;
        field_b = "Error connecting to server. Please try using a different server.";
        field_d = "To Customer Support";
    }
}
