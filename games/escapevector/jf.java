/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends bj implements sg, qb {
    static ed field_H;
    static String field_M;
    static int field_J;
    static String field_K;
    static String field_O;
    private hc field_N;
    private qc field_G;
    static String[] field_I;
    private ue field_L;

    public static void j(int param0) {
        field_K = null;
        field_H = null;
        field_I = null;
        field_O = null;
        if (param0 != 1) {
          boolean discarded$2 = jf.l(51);
          field_M = null;
          return;
        } else {
          field_M = null;
          return;
        }
    }

    private final String a(byte param0) {
        if (param0 <= 113) {
            Object var3 = null;
            ((jf) this).a((hc) null, -9, -71, 98, 16);
            return "</col></u>";
        }
        return "</col></u>";
    }

    jf(qc param0) {
        super(0, 0, 288, 0, (db) null);
        ((jf) this).field_G = param0;
        ((jf) this).field_N = new hc(bm.field_d, (wn) null);
        ((jf) this).field_N.field_s = (db) (Object) new ck();
        String var7 = r.a(mh.field_c, -63, new String[2]);
        int var3 = 20;
        k var4 = new k(sb.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, sb.field_a.field_r, -1, 2147483647, true);
        ((jf) this).field_L = new ue(var7, (db) (Object) var4);
        ((jf) this).field_L.field_i = "";
        ((jf) this).field_L.a(ah.field_m, (byte) 102, 0);
        ((jf) this).field_L.a(ah.field_m, (byte) 104, 1);
        ((jf) this).field_L.field_q = (wn) this;
        ((jf) this).field_L.field_g = ((jf) this).field_g - 40;
        ((jf) this).field_L.b(2463, 26, -40 + ((jf) this).field_g, var3);
        var3 = var3 + (15 + ((jf) this).field_L.field_x);
        ((jf) this).b((hm) (Object) ((jf) this).field_L, false);
        int var5 = 4;
        int var6 = 200;
        ((jf) this).field_N.a(var6, var3, -var6 + 300 >> 1896692001, true, 40);
        ((jf) this).field_N.field_q = (wn) this;
        ((jf) this).b((hm) (Object) ((jf) this).field_N, false);
        ((jf) this).a(300, 0, 0, true, var5 + (var3 + 55));
    }

    final static boolean l(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 3) {
          L0: {
            field_M = null;
            if (kb.field_d <= 250) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (kb.field_d <= 250) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(int param0, ue param1, int param2, int param3) {
        int var6 = 0;
        var6 = EscapeVector.field_A;
        if (param2 != 0) {
          if (1 != param2) {
            if (param2 == 2) {
              qd.a(12, "conduct.ws");
              if (param0 != -2861) {
                field_H = null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -2861) {
                field_H = null;
                return;
              } else {
                return;
              }
            }
          } else {
            qd.a(12, "privacy.ws");
            if (param0 == -2861) {
              return;
            } else {
              field_H = null;
              return;
            }
          }
        } else {
          qd.a(param0 ^ -2849, "terms.ws");
          if (param0 == -2861) {
            return;
          } else {
            field_H = null;
            return;
          }
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, 18)) {
          return true;
        } else {
          if (param3 > 0) {
            if (98 != param2) {
              if (-100 != (param2 ^ -1)) {
                return false;
              } else {
                return ((jf) this).a(param0, true);
              }
            } else {
              return ((jf) this).a((byte) 22, param0);
            }
          } else {
            return false;
          }
        }
    }

    private final String k(int param0) {
        if (param0 >= -90) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param3 != 1) {
          L0: {
            var7 = null;
            ((jf) this).a(-113, (ue) null, -113, -16);
            if (param0 == ((jf) this).field_N) {
              sm.b((byte) -125);
              ((jf) this).field_G.o(-18861);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 == ((jf) this).field_N) {
              sm.b((byte) -125);
              ((jf) this).field_G.o(-18861);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Level will restart shortly.";
        field_K = "Level: ";
        field_O = "Create a free account to store your progress.";
    }
}
