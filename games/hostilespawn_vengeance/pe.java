/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends wb {
    static String field_gb;
    private boolean field_jb;
    private String field_cb;
    static ji field_ab;
    private String field_bb;
    static bd field_hb;
    static char[] field_db;
    static bd[] field_fb;
    private boolean field_kb;
    private ba field_ib;
    static vm field_eb;

    final void f(byte param0) {
        ((pe) this).field_kb = true;
        ((pe) this).field_ib.field_E = false;
        if (param0 > -71) {
            field_db = null;
        }
    }

    final static void b(boolean param0) {
        Object var2 = null;
        if (!param0) {
          field_fb = null;
          var2 = null;
          ak.a(false, (String) null, fj.field_Sb);
          return;
        } else {
          var2 = null;
          ak.a(false, (String) null, fj.field_Sb);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        field_eb.b(((pe) this).field_bb, (((pe) this).field_s >> -238948511) + param2, 103 + param0, 16777215, -1);
        if (!(null == ((pe) this).field_cb)) {
            si.a(param2 + 20, -7 + (120 + param0), 260, 8421504);
            int discarded$0 = field_eb.a(((pe) this).field_cb, param2 - -20, param0 - -128, 260, 100, 16777215, -1, 1, 0, field_eb.field_y);
        }
    }

    final void a(float param0, boolean param1, int param2, String param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          if (((pe) this).field_jb == param1) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((pe) this).field_jb = stackIn_4_1 != 0;
            if (!((pe) this).field_jb) {
              ((pe) this).field_ib.a(2113632, 4210752, -1);
              if (((pe) this).field_kb) {
                ((pe) this).field_ib.field_E = false;
                break L0;
              } else {
                ((pe) this).field_ib.field_G = (int)(65536.0f * (param0 / 100.0f));
                ((pe) this).field_bb = param3;
                if (param2 > 126) {
                  return;
                } else {
                  ((pe) this).b(-60, -80, 35);
                  return;
                }
              }
            } else {
              ((pe) this).field_ib.a(8405024, 4210752, -1);
              ((pe) this).field_ib.field_E = true;
              ((pe) this).field_ib.field_G = (int)(65536.0f * (param0 / 100.0f));
              ((pe) this).field_bb = param3;
              if (param2 > 126) {
                return;
              } else {
                ((pe) this).b(-60, -80, 35);
                return;
              }
            }
          }
        }
        ((pe) this).field_ib.field_G = (int)(65536.0f * (param0 / 100.0f));
        ((pe) this).field_bb = param3;
        if (param2 <= 126) {
          ((pe) this).b(-60, -80, 35);
          return;
        } else {
          return;
        }
    }

    final static fa[] p(int param0) {
        if (param0 != 274) {
          pe.b(true);
          return new fa[]{ub.field_b, wh.field_c, w.field_S};
        } else {
          return new fa[]{ub.field_b, wh.field_c, w.field_S};
        }
    }

    final static void a(byte param0, int param1) {
        en var2 = null;
        var2 = s.field_b;
        if (param0 != 51) {
          fa[] discarded$2 = pe.p(-61);
          var2.i(19319, param1);
          var2.d(96, 1);
          var2.d(125, 0);
          return;
        } else {
          var2.i(19319, param1);
          var2.d(96, 1);
          var2.d(125, 0);
          return;
        }
    }

    pe(gg param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((pe) this).field_cb = param1;
        if (null != ((pe) this).field_cb) {
            var3 = field_eb.b(((pe) this).field_cb, 260, field_eb.field_y);
            ((pe) this).a(300, 15767, var3 + 150);
        }
        ((pe) this).field_ib = new ba(13, 50, 274, 30, 15, 2113632, 4210752);
        ((pe) this).field_kb = false;
        ((pe) this).field_jb = false;
        ((pe) this).field_ib.field_E = true;
        ((pe) this).a(51448, (ag) (Object) ((pe) this).field_ib);
    }

    public static void q(int param0) {
        field_eb = null;
        field_db = null;
        if (param0 != 8421504) {
          pe.q(-49);
          field_hb = null;
          field_ab = null;
          field_gb = null;
          field_fb = null;
          return;
        } else {
          field_hb = null;
          field_ab = null;
          field_gb = null;
          field_fb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Play free version";
        field_db = new char[128];
    }
}
