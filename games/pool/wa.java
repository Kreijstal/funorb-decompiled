/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends tj {
    static String field_ob;
    static dd field_gb;
    static vh field_hb;
    static int[] field_ib;
    private String field_pb;
    private String field_nb;
    private gj field_kb;
    static vh field_qb;
    private boolean field_jb;
    static int[] field_mb;
    private boolean field_lb;

    final static void l(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = ir.field_h * ir.field_h;
        var2 = -(em.field_P * em.field_P) + var1;
        if (param0 != 23323) {
          field_ib = null;
          var3 = fd.field_J - -((-fd.field_J + cb.field_g) * var2 / var1);
          fl.field_q.b(var3, 2147483647, tn.field_u, 640, 120);
          mm.a(ja.field_b, cb.field_g + -24, 0, 640, 5, 118, kj.field_j);
          return;
        } else {
          var3 = fd.field_J - -((-fd.field_J + cb.field_g) * var2 / var1);
          fl.field_q.b(var3, 2147483647, tn.field_u, 640, 120);
          mm.a(ja.field_b, cb.field_g + -24, 0, 640, 5, 118, kj.field_j);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        bi.field_e.b(((wa) this).field_nb, param0 + (((wa) this).field_l >> -1287640991), param1 - -103, 16777215, -1);
        if (!(null == ((wa) this).field_pb)) {
            qh.f(param0 - -20, -7 + (param1 + 120), 260, 8421504);
            int discarded$0 = bi.field_e.a(((wa) this).field_pb, param0 - -20, 8 + (param1 - -120), 260, 100, 16777215, -1, 1, 0, bi.field_e.field_C);
        }
    }

    wa(lq param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((wa) this).field_pb = param1;
        if (null != ((wa) this).field_pb) {
            var3 = bi.field_e.b(((wa) this).field_pb, 260, bi.field_e.field_C);
            ((wa) this).b(150 + var3, 31936, 300);
        }
        ((wa) this).field_kb = new gj(13, 50, 274, 30, 15, 2113632, 4210752);
        ((wa) this).field_kb.field_N = true;
        ((wa) this).field_jb = false;
        ((wa) this).field_lb = false;
        ((wa) this).a(true, (ei) (Object) ((wa) this).field_kb);
    }

    public static void n(int param0) {
        field_ob = null;
        field_qb = null;
        field_ib = null;
        if (param0 != 7585) {
          wa.l(-78);
          field_gb = null;
          field_mb = null;
          field_hb = null;
          return;
        } else {
          field_gb = null;
          field_mb = null;
          field_hb = null;
          return;
        }
    }

    final void a(String param0, int param1, float param2, boolean param3) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (param1 == 2113632) {
          if (param3 != ((wa) this).field_lb) {
            L0: {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param3) {
                stackOut_16_0 = this;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L0;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L0;
              }
            }
            ((wa) this).field_lb = stackIn_17_1 != 0;
            if (!((wa) this).field_lb) {
              ((wa) this).field_kb.a(4210752, param1 + -2094267, 2113632);
              if (!((wa) this).field_jb) {
                ((wa) this).field_nb = param0;
                ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
                return;
              } else {
                ((wa) this).field_kb.field_N = false;
                ((wa) this).field_nb = param0;
                ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
                return;
              }
            } else {
              ((wa) this).field_kb.a(4210752, 19365, 8405024);
              ((wa) this).field_kb.field_N = true;
              ((wa) this).field_nb = param0;
              ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
              return;
            }
          } else {
            ((wa) this).field_nb = param0;
            ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
            return;
          }
        } else {
          ((wa) this).field_lb = false;
          if (param3 != ((wa) this).field_lb) {
            L1: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param3) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            ((wa) this).field_lb = stackIn_6_1 != 0;
            if (!((wa) this).field_lb) {
              ((wa) this).field_kb.a(4210752, param1 + -2094267, 2113632);
              if (!((wa) this).field_jb) {
                ((wa) this).field_nb = param0;
                ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
                return;
              } else {
                ((wa) this).field_kb.field_N = false;
                ((wa) this).field_nb = param0;
                ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
                return;
              }
            } else {
              ((wa) this).field_kb.a(4210752, 19365, 8405024);
              ((wa) this).field_kb.field_N = true;
              ((wa) this).field_nb = param0;
              ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
              return;
            }
          } else {
            ((wa) this).field_nb = param0;
            ((wa) this).field_kb.field_P = (int)(65536.0f * (param2 / 100.0f));
            return;
          }
        }
    }

    final static void i(byte param0) {
        if (param0 != 72) {
          field_ib = null;
          sq.field_c.field_e = 0;
          sq.field_c.field_a = 0;
          return;
        } else {
          sq.field_c.field_e = 0;
          sq.field_c.field_a = 0;
          return;
        }
    }

    final static void m(int param0) {
        if (param0 == 8421504) {
          if (null != vl.field_m) {
            if (vl.field_m.field_i == null) {
              vl.field_m = null;
              pf.field_c = null;
              return;
            } else {
              vl.field_m.field_i.field_Ib = false;
              vl.field_m = null;
              pf.field_c = null;
              return;
            }
          } else {
            vl.field_m = null;
            pf.field_c = null;
            return;
          }
        } else {
          field_gb = null;
          if (null == vl.field_m) {
            vl.field_m = null;
            pf.field_c = null;
            return;
          } else {
            L0: {
              if (vl.field_m.field_i != null) {
                vl.field_m.field_i.field_Ib = false;
                break L0;
              } else {
                break L0;
              }
            }
            vl.field_m = null;
            pf.field_c = null;
            return;
          }
        }
    }

    final void k(int param0) {
        ((wa) this).field_kb.field_N = false;
        if (param0 != 0) {
            ((wa) this).field_lb = true;
            ((wa) this).field_jb = true;
            return;
        }
        ((wa) this).field_jb = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Extra visit";
        field_ib = new int[128];
        field_mb = new int[8192];
    }
}
