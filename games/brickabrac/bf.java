/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends d {
    static int[] field_M;
    static jp field_L;
    static jp field_K;
    static vl field_N;

    public static void a(int param0) {
        if (param0 != 8192) {
            return;
        }
        field_N = null;
        field_K = null;
        field_M = null;
        field_L = null;
    }

    final static void a(String param0, int param1, float param2, boolean param3) {
        Object var5 = null;
        if (param1 == 8192) {
          if (sj.field_b == null) {
            sj.field_b = new tb(mf.field_f, ke.field_b);
            mf.field_f.a(param1 + -8287, (oc) (Object) sj.field_b);
            sj.field_b.a(param2, param0, param3, (byte) 86);
            lb.d();
            wc.a(true, -1);
            return;
          } else {
            sj.field_b.a(param2, param0, param3, (byte) 86);
            lb.d();
            wc.a(true, -1);
            return;
          }
        } else {
          var5 = null;
          bf.a((String) null, 67, -0.11976710706949234f, true);
          if (sj.field_b != null) {
            sj.field_b.a(param2, param0, param3, (byte) 86);
            lb.d();
            wc.a(true, -1);
            return;
          } else {
            sj.field_b = new tb(mf.field_f, ke.field_b);
            mf.field_f.a(param1 + -8287, (oc) (Object) sj.field_b);
            sj.field_b.a(param2, param0, param3, (byte) 86);
            lb.d();
            wc.a(true, -1);
            return;
          }
        }
    }

    bf(String param0, uh param1, boolean param2) {
        this(param0, param1);
        ((bf) this).field_F = param2 ? true : false;
    }

    private bf(String param0, uh param1) {
        this(param0, bj.field_T.field_q, param1);
        ((bf) this).field_l = bj.field_T.field_o;
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0;
        Object stackOut_7_0;
        int stackOut_7_1;
        Object stackOut_6_0;
        int stackOut_6_1;
        Object stackOut_1_0;
        Object stackOut_3_0;
        int stackOut_3_1;
        Object stackOut_2_0;
        int stackOut_2_1;
        if (param2 > -8) {
          L0: {
            field_L = null;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (((bf) this).field_F) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((bf) this).field_F = stackIn_8_1 != 0;
          super.a(param0, param1, -69, param3);
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((bf) this).field_F) {
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
          ((bf) this).field_F = stackIn_4_1 != 0;
          super.a(param0, param1, -69, param3);
          return;
        }
    }

    private bf(String param0, ub param1, uh param2) {
        super(param0, param1, param2);
        ((bf) this).field_l = bj.field_T.field_o;
    }

    final static void a(boolean param0, boolean param1, int param2, String param3) {
        lm.a(-1);
        mf.field_f.a(-127);
        if (param2 != -15947) {
          field_K = null;
          eo.field_k = new hk(gf.field_d, (String) null, cg.field_l, param0, param1);
          rj.field_c = new bh(mf.field_f, (oc) (Object) eo.field_k);
          mf.field_f.a(-117, (oc) (Object) rj.field_c);
          return;
        } else {
          eo.field_k = new hk(gf.field_d, (String) null, cg.field_l, param0, param1);
          rj.field_c = new bh(mf.field_f, (oc) (Object) eo.field_k);
          mf.field_f.a(-117, (oc) (Object) rj.field_c);
          return;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        id var3 = null;
        var2 = BrickABrac.field_J ? 1 : 0;
        o.field_e = null;
        fh.field_d = false;
        nl.field_f = null;
        if (ua.field_c == null) {
          if (param0 >= 29) {
            L0: {
              eq.field_m = null;
              if (rq.field_a != null) {
                rq.field_a.c((byte) -91);
                rq.field_a = null;
                break L0;
              } else {
                break L0;
              }
            }
            pn.field_i = null;
            if (null == mp.field_Tb) {
              BrickABrac.field_F = null;
              if (eq.field_m != null) {
                var3 = (id) (Object) eq.field_m.b((byte) 120);
                L1: while (true) {
                  if (var3 == null) {
                    eq.field_m = null;
                    return;
                  } else {
                    var3.d(3);
                    var3 = (id) (Object) eq.field_m.a(false);
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              mp.field_Tb.c((byte) -84);
              mp.field_Tb = null;
              BrickABrac.field_F = null;
              if (eq.field_m != null) {
                var3 = (id) (Object) eq.field_m.b((byte) 120);
                L2: while (true) {
                  if (var3 == null) {
                    eq.field_m = null;
                    return;
                  } else {
                    var3.d(3);
                    var3 = (id) (Object) eq.field_m.a(false);
                    continue L2;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ua.field_c.c((byte) -57);
          ua.field_c = null;
          if (param0 >= 29) {
            L3: {
              eq.field_m = null;
              if (rq.field_a != null) {
                rq.field_a.c((byte) -91);
                rq.field_a = null;
                break L3;
              } else {
                break L3;
              }
            }
            pn.field_i = null;
            if (null != mp.field_Tb) {
              mp.field_Tb.c((byte) -84);
              mp.field_Tb = null;
              BrickABrac.field_F = null;
              if (eq.field_m != null) {
                var3 = (id) (Object) eq.field_m.b((byte) 120);
                L4: while (true) {
                  if (var3 == null) {
                    eq.field_m = null;
                    return;
                  } else {
                    var3.d(3);
                    var3 = (id) (Object) eq.field_m.a(false);
                    continue L4;
                  }
                }
              } else {
                return;
              }
            } else {
              BrickABrac.field_F = null;
              if (eq.field_m != null) {
                var3 = (id) (Object) eq.field_m.b((byte) 120);
                L5: while (true) {
                  if (var3 == null) {
                    eq.field_m = null;
                    return;
                  } else {
                    var3.d(3);
                    var3 = (id) (Object) eq.field_m.a(false);
                    continue L5;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[8192];
    }
}
