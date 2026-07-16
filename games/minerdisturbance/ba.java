/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends kn implements be, sh {
    static ln field_K;
    private uk field_J;
    static boolean field_M;
    private tn field_L;
    private hc field_I;

    ba(uk param0) {
        super(0, 0, 288, 0, (ad) null);
        ((ba) this).field_J = param0;
        ((ba) this).field_I = new hc(oh.field_A, (rm) null);
        ((ba) this).field_I.field_A = (ad) (Object) new wi();
        String var7 = oa.a((byte) -98, tk.field_b, new String[2]);
        int var3 = 20;
        eg var4 = new eg(bn.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, bn.field_d.field_I, -1, 2147483647, true);
        ((ba) this).field_L = new tn(var7, (ad) (Object) var4);
        ((ba) this).field_L.field_n = "";
        ((ba) this).field_L.a(-24, 0, wk.field_d);
        ((ba) this).field_L.a(-100, 1, wk.field_d);
        ((ba) this).field_L.field_v = -40 + ((ba) this).field_v;
        ((ba) this).field_L.field_y = (rm) this;
        ((ba) this).field_L.b(26, -40 + ((ba) this).field_v, 32088, var3);
        var3 = var3 + (15 + ((ba) this).field_L.field_q);
        ((ba) this).a(-1, (fe) (Object) ((ba) this).field_L);
        int var5 = 4;
        int var6 = 200;
        ((ba) this).field_I.a(40, -82, -var6 + 300 >> 464878913, var6, var3);
        ((ba) this).field_I.field_y = (rm) this;
        ((ba) this).a(-1, (fe) (Object) ((ba) this).field_I);
        ((ba) this).a(var5 + var3 + 55, -99, 0, 300, 0);
    }

    private final String e(byte param0) {
        if (param0 != -65) {
            field_K = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(tn param0, int param1, int param2, int param3) {
        int var6 = MinerDisturbance.field_ab;
        if (param2 != 12278) {
            String discarded$1 = this.a(true);
            if (-1 == (param3 ^ -1)) {
                qd.a(5, "terms.ws");
                return;
            }
            if ((param3 ^ -1) != -2) {
                if (2 != param3) {
                    return;
                }
                qd.a(5, "conduct.ws");
                return;
            }
            qd.a(5, "privacy.ws");
            return;
        }
        if (-1 == (param3 ^ -1)) {
            qd.a(5, "terms.ws");
            return;
        }
        if ((param3 ^ -1) != -2) {
            if (2 != param3) {
                return;
            }
            qd.a(5, "conduct.ws");
            return;
        }
        qd.a(5, "privacy.ws");
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 < 49) {
            field_M = false;
        }
    }

    private final String a(boolean param0) {
        if (param0) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 == param3) {
            return ((ba) this).b(param1, 0);
          } else {
            if ((param3 ^ -1) != -100) {
              return false;
            } else {
              return ((ba) this).a(param1, (byte) 12);
            }
          }
        } else {
          return true;
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        if (param1 == 6) {
          if (((ba) this).field_I == param2) {
            pb.d(-94);
            ((ba) this).field_J.s(2121792);
            return;
          } else {
            return;
          }
        } else {
          ba.a((byte) 20);
          if (((ba) this).field_I != param2) {
            return;
          } else {
            pb.d(-94);
            ((ba) this).field_J.s(2121792);
            return;
          }
        }
    }

    final static void a(bj param0, bj param1, bj param2, boolean param3, bj param4) {
        ri var6 = null;
        di stackIn_2_0 = null;
        di stackIn_3_0 = null;
        di stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        di stackOut_1_0 = null;
        di stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        di stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ph.field_a = wh.a(param4, "", "md_title_music");
        h.field_d = wh.a(param4, "", "md_game_music");
        df.field_b = wh.a(param4, "", "md_volcano_music");
        eg.field_p = wh.a(param4, "", "md_ice_music");
        hl.field_a = wh.a(param4, "", "md_ice_panic_music");
        al.field_s = wh.a(param4, "", "md_win");
        aa.field_e = wh.a(param4, "", "md_lose");
        var6 = new ri(param0, param1);
        boolean discarded$7 = km.field_a.a(false, ph.field_a, var6, 0, param2);
        if (!param3) {
          return;
        } else {
          L0: {
            boolean discarded$8 = km.field_a.a(false, h.field_d, var6, 0, param2);
            stackOut_1_0 = km.field_a;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param3) {
              stackOut_3_0 = (di) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (di) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          boolean discarded$9 = ((di) (Object) stackIn_4_0).a(stackIn_4_1 != 0, df.field_b, var6, 0, param2);
          boolean discarded$10 = km.field_a.a(false, eg.field_p, var6, 0, param2);
          boolean discarded$11 = km.field_a.a(false, hl.field_a, var6, 0, param2);
          boolean discarded$12 = km.field_a.a(false, al.field_s, var6, 0, param2);
          boolean discarded$13 = km.field_a.a(false, aa.field_e, var6, 0, param2);
          km.field_a.e(100);
          return;
        }
    }

    static {
    }
}
