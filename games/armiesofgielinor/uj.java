/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends mk {
    private boolean field_k;
    static je field_n;
    private String field_m;
    static int[] field_o;
    static je field_l;
    static int field_j;

    final gu a(int param0, String param1) {
        wd var3 = null;
        CharSequence var4 = null;
        gu stackIn_7_0 = null;
        gu stackIn_14_0 = null;
        gu stackIn_21_0 = null;
        gu stackIn_28_0 = null;
        gu stackOut_27_0 = null;
        gu stackOut_26_0 = null;
        gu stackOut_20_0 = null;
        gu stackOut_19_0 = null;
        gu stackOut_13_0 = null;
        gu stackOut_12_0 = null;
        gu stackOut_6_0 = null;
        gu stackOut_5_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (vq.a(var4, true)) {
          if (param0 == -3137) {
            if (!param1.equals((Object) (Object) ((uj) this).field_m)) {
              var3 = ji.a(0, param1);
              if (var3 != null) {
                if (null != var3.field_i) {
                  return so.field_e;
                } else {
                  L0: {
                    ((uj) this).field_m = param1;
                    ((uj) this).field_k = var3.field_a;
                    if (((uj) this).field_k) {
                      stackOut_27_0 = oo.field_g;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      stackOut_26_0 = rn.field_e;
                      stackIn_28_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                  return (gu) (Object) stackIn_28_0;
                }
              } else {
                return so.field_e;
              }
            } else {
              L1: {
                if (((uj) this).field_k) {
                  stackOut_20_0 = oo.field_g;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                } else {
                  stackOut_19_0 = rn.field_e;
                  stackIn_21_0 = stackOut_19_0;
                  break L1;
                }
              }
              return (gu) (Object) stackIn_21_0;
            }
          } else {
            field_o = null;
            if (!param1.equals((Object) (Object) ((uj) this).field_m)) {
              var3 = ji.a(0, param1);
              if (var3 != null) {
                if (null != var3.field_i) {
                  return so.field_e;
                } else {
                  L2: {
                    ((uj) this).field_m = param1;
                    ((uj) this).field_k = var3.field_a;
                    if (((uj) this).field_k) {
                      stackOut_13_0 = oo.field_g;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = rn.field_e;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  return (gu) (Object) stackIn_14_0;
                }
              } else {
                return so.field_e;
              }
            } else {
              L3: {
                if (((uj) this).field_k) {
                  stackOut_6_0 = oo.field_g;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = rn.field_e;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return (gu) (Object) stackIn_7_0;
            }
          }
        } else {
          return rn.field_e;
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        wd var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param1;
        var3 = hw.a(var5, false);
        if (var3 == null) {
          L0: {
            if (!param1.equals((Object) (Object) ((uj) this).field_m)) {
              var4 = ji.a(0, param1);
              if (var4 != null) {
                if (var4.field_i == null) {
                  ((uj) this).field_k = var4.field_a;
                  ((uj) this).field_m = param1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (((uj) this).field_k) {
            if (param0 < 89) {
              ((uj) this).g(5);
              return fa.field_d;
            } else {
              return fa.field_d;
            }
          } else {
            return oc.field_Ob;
          }
        } else {
          return var3;
        }
    }

    public static void h(int param0) {
        field_n = null;
        field_o = null;
        field_l = null;
        if (param0 != 29151) {
            field_j = -105;
        }
    }

    final void g(int param0) {
        if (param0 != 50) {
            ((uj) this).field_k = false;
            ((uj) this).field_m = null;
            return;
        }
        ((uj) this).field_m = null;
    }

    final static me[] c(byte param0) {
        if (param0 <= 100) {
          uj.h(67);
          return new me[]{jk.field_b, na.field_G, oa.field_F, vh.field_l, tl.field_i, nn.field_c, ab.field_d, lg.field_e, du.field_e, kb.field_y, lo.field_q, nf.field_Ib, rs.field_v, kq.field_M};
        } else {
          return new me[]{jk.field_b, na.field_G, oa.field_F, vh.field_l, tl.field_i, nn.field_c, ab.field_d, lg.field_e, du.field_e, kb.field_y, lo.field_q, nf.field_Ib, rs.field_v, kq.field_M};
        }
    }

    uj(fn param0) {
        super(param0);
        ((uj) this).field_k = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 3;
        field_o = new int[]{53, 52, 49, 50, 51};
    }
}
