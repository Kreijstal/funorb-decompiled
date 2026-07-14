/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static String field_c;
    static String[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 8) {
            return;
        }
        field_c = null;
    }

    final static void a(mh param0, byte param1, byte[] param2, mh param3, int param4, int param5, mh param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        wc.field_e = param9;
        oc.field_p = -1L;
        jg.field_c = param2;
        cq.field_p = param2.length;
        fh.field_d = false;
        rh.field_d = new byte[(wc.field_e + 7) / 8];
        o.field_e = null;
        nl.field_f = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (jg.field_c.length <= var11) {
            L1: {
              var10 = (7 + var10) / 8;
              lj.field_p = new byte[var10];
              if (param3.field_bb == null) {
                param3.field_bb = new vl();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ua.field_c = param3.field_bb;
              ua.field_c.c((byte) -60);
              eq.field_m = new mk(param5);
              m.field_h = -1;
              re.field_i = 0;
              uf.field_c = 0;
              ko.field_s = -1;
              if (param6.field_bb == null) {
                param6.field_bb = new vl();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              rq.field_a = param6.field_bb;
              rq.field_a.c((byte) -48);
              pn.field_i = new mk(param8);
              if (param0.field_bb == null) {
                param0.field_bb = new vl();
                break L3;
              } else {
                break L3;
              }
            }
            mp.field_Tb = param0.field_bb;
            mp.field_Tb.c((byte) -61);
            if (param1 != 86) {
              return;
            } else {
              BrickABrac.field_F = new mk(param7);
              ic.field_b = 0L;
              cm.field_o = param4;
              return;
            }
          } else {
            var10 = var10 + (jg.field_c[var11] & 255);
            var11++;
            continue L0;
          }
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        Object var4 = null;
        if (param2 == 0) {
          if (!param0) {
            return ni.field_Wb.c(param1);
          } else {
            return kp.field_b.c(param1);
          }
        } else {
          var4 = null;
          l discarded$5 = hm.a(-91, (oe) null, 44);
          if (!param0) {
            return ni.field_Wb.c(param1);
          } else {
            return kp.field_b.c(param1);
          }
        }
    }

    final static l a(int param0, oe param1, int param2) {
        if (param0 != 0) {
          field_b = null;
          return sk.a((byte) -9, kl.b(param1, 100, param2));
        } else {
          return sk.a((byte) -9, kl.b(param1, 100, param2));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Withdraw invitation to <%0> to join this game";
        field_a = "Private";
    }
}
