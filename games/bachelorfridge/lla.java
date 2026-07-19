/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lla extends pu {
    static sna field_l;

    public static void d(byte param0) {
        if (param0 != 0) {
            lla.d((byte) 46);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static void a(boolean param0, byte param1, int param2) {
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        iea.field_d = new eaa();
        cb.field_m = mka.a(8698113, 8698113, 8698113, (byte) -125, jha.field_g, 8698113, 10724259, 8698113);
        cb.field_m.field_N = 1;
        bu.field_j = mka.a(16700762, 16700762, 16700762, (byte) -119, jha.field_g, 16700762, 16777215, 16700762);
        if (-1 != (param2 ^ -1)) {
          if (param2 != 1) {
            vu.field_p.field_N = 1;
            vu.field_p.field_A = eq.field_b;
            vu.field_p.field_eb = eq.field_b;
            vu.field_p.field_db = eq.field_b;
            nla.field_b = mka.a(16700762, 16700762, 16700762, (byte) -119, jha.field_g, 16700762, 16700762, 16700762);
            nla.field_b.field_A = tq.field_g;
            nla.field_b.field_eb = tq.field_g;
            if (param1 == 99) {
              L0: {
                nla.field_b.field_db = tq.field_g;
                nla.field_b.field_N = 1;
                nha.field_e = new gba("scrollbar", vu.field_p, new kv(8, 8), new kv(8, 8), cb.field_m, vu.field_p, true);
                ika.field_a = new gba("scrollbar", nla.field_b, new kv(8, 8), new kv(8, 8), bu.field_j, nla.field_b, true);
                mda.field_b = new sna();
                qg.field_b = new sna();
                dga.field_a = param2;
                if (-1 == (dga.field_a ^ -1)) {
                  oha.b((byte) -34);
                  break L0;
                } else {
                  break L0;
                }
              }
              iaa.a(-123);
              if (dga.field_a != 0) {
                if ((dga.field_a ^ -1) == -2) {
                  mda.field_b.a(400, 31407, 400, 105, 350);
                  qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                  uaa.a(false);
                  lf.a(114);
                  qg.field_b.a(507, 31407, 170, 442, 161);
                  ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                  ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                  return;
                } else {
                  qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                  uaa.a(false);
                  lf.a(114);
                  qg.field_b.a(507, 31407, 170, 442, 161);
                  ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                  ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                  return;
                }
              } else {
                mda.field_b.a(jfa.field_q[baa.field_Q].field_d * 100, param1 ^ 31436, 400, 105, 350);
                qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                uaa.a(false);
                lf.a(114);
                qg.field_b.a(507, 31407, 170, 442, 161);
                ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                return;
              }
            } else {
              return;
            }
          } else {
            vu.field_p = mka.a(13553358, 13558251, 13558251, (byte) -123, jha.field_g, 216853739, 2302755, 13553358);
            vu.field_p.field_N = 1;
            vu.field_p.field_A = eq.field_b;
            vu.field_p.field_eb = eq.field_b;
            vu.field_p.field_db = eq.field_b;
            nla.field_b = mka.a(16700762, 16700762, 16700762, (byte) -119, jha.field_g, 16700762, 16700762, 16700762);
            nla.field_b.field_A = tq.field_g;
            nla.field_b.field_eb = tq.field_g;
            if (param1 == 99) {
              L1: {
                nla.field_b.field_db = tq.field_g;
                nla.field_b.field_N = 1;
                nha.field_e = new gba("scrollbar", vu.field_p, new kv(8, 8), new kv(8, 8), cb.field_m, vu.field_p, true);
                ika.field_a = new gba("scrollbar", nla.field_b, new kv(8, 8), new kv(8, 8), bu.field_j, nla.field_b, true);
                mda.field_b = new sna();
                qg.field_b = new sna();
                dga.field_a = param2;
                if (-1 == (dga.field_a ^ -1)) {
                  oha.b((byte) -34);
                  break L1;
                } else {
                  break L1;
                }
              }
              iaa.a(-123);
              if (dga.field_a != 0) {
                if ((dga.field_a ^ -1) != -2) {
                  qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                  uaa.a(false);
                  lf.a(114);
                  qg.field_b.a(507, 31407, 170, 442, 161);
                  ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                  ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                  return;
                } else {
                  mda.field_b.a(400, 31407, 400, 105, 350);
                  qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                  uaa.a(false);
                  lf.a(114);
                  qg.field_b.a(507, 31407, 170, 442, 161);
                  ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                  ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                  return;
                }
              } else {
                mda.field_b.a(jfa.field_q[baa.field_Q].field_d * 100, param1 ^ 31436, 400, 105, 350);
                qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                uaa.a(false);
                lf.a(114);
                qg.field_b.a(507, 31407, 170, 442, 161);
                ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          vu.field_p = mka.a(8698113, 8698113, 8698113, (byte) -119, jha.field_g, 8698113, 8698113, 8698113);
          vu.field_p.field_N = 1;
          vu.field_p.field_A = eq.field_b;
          vu.field_p.field_eb = eq.field_b;
          vu.field_p.field_db = eq.field_b;
          nla.field_b = mka.a(16700762, 16700762, 16700762, (byte) -119, jha.field_g, 16700762, 16700762, 16700762);
          nla.field_b.field_A = tq.field_g;
          nla.field_b.field_eb = tq.field_g;
          if (param1 == 99) {
            L2: {
              nla.field_b.field_db = tq.field_g;
              nla.field_b.field_N = 1;
              nha.field_e = new gba("scrollbar", vu.field_p, new kv(8, 8), new kv(8, 8), cb.field_m, vu.field_p, true);
              ika.field_a = new gba("scrollbar", nla.field_b, new kv(8, 8), new kv(8, 8), bu.field_j, nla.field_b, true);
              mda.field_b = new sna();
              qg.field_b = new sna();
              dga.field_a = param2;
              if (-1 == (dga.field_a ^ -1)) {
                oha.b((byte) -34);
                break L2;
              } else {
                break L2;
              }
            }
            iaa.a(-123);
            if (dga.field_a != 0) {
              if ((dga.field_a ^ -1) != -2) {
                qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                uaa.a(false);
                lf.a(114);
                qg.field_b.a(507, 31407, 170, 442, 161);
                ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                return;
              } else {
                mda.field_b.a(400, 31407, 400, 105, 350);
                qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
                uaa.a(false);
                lf.a(114);
                qg.field_b.a(507, 31407, 170, 442, 161);
                ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
                ug.field_q.a(0, 161, false, 19, 122, 442, 170);
                return;
              }
            } else {
              mda.field_b.a(jfa.field_q[baa.field_Q].field_d * 100, param1 ^ 31436, 400, 105, 350);
              qm.field_d = new wl("foodlist", mda.field_b, bu.field_j, nha.field_e);
              uaa.a(false);
              lf.a(114);
              qg.field_b.a(507, 31407, 170, 442, 161);
              ug.field_q = new wl("basket", qg.field_b, bu.field_j, ika.field_a);
              ug.field_q.a(0, 161, false, 19, 122, 442, 170);
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
    }
}
