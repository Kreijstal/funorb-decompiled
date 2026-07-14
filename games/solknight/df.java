/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends a {
    private String field_j;
    private boolean field_k;

    final static void a(int param0, boolean param1) {
        we.field_h = 0;
        ua.field_L = 0;
        wd.field_a = 0;
        ti.field_e = uc.field_e;
        qh.field_b = new sf(2);
        qh.field_b.a(param1, -1, ad.a(ad.field_m, gb.field_j, param0), param0 + 121);
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        wg var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (!param1) {
          var7 = (CharSequence) (Object) param0;
          var3 = sj.a(var7, 0);
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (param0.equals((Object) (Object) ((df) this).field_j)) {
                break L0;
              } else {
                var4 = gb.a(param0, (byte) 122);
                if (var4 != null) {
                  if (null == var4.field_d) {
                    ((df) this).field_k = var4.field_c;
                    ((df) this).field_j = param0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((df) this).field_k) {
              return pc.field_d;
            } else {
              return hj.field_o;
            }
          }
        } else {
          var5 = null;
          String discarded$2 = ((df) this).a((String) null, true);
          var6 = (CharSequence) (Object) param0;
          var3 = sj.a(var6, 0);
          if (var3 != null) {
            return var3;
          } else {
            L1: {
              if (param0.equals((Object) (Object) ((df) this).field_j)) {
                break L1;
              } else {
                var4 = gb.a(param0, (byte) 122);
                if (var4 != null) {
                  if (null == var4.field_d) {
                    ((df) this).field_k = var4.field_c;
                    ((df) this).field_j = param0;
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
            if (!((df) this).field_k) {
              return pc.field_d;
            } else {
              return hj.field_o;
            }
          }
        }
    }

    final void a(boolean param0) {
        ((df) this).field_j = null;
        if (!param0) {
            Object var3 = null;
            String discarded$0 = ((df) this).a((String) null, true);
        }
    }

    final static void h(int param0) {
        kd.field_c = -1;
        s.field_ib = null;
        bf.field_a = param0;
        kk.field_d = 0;
        ab.field_u = false;
    }

    final qf a(String param0, byte param1) {
        wg var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        qf stackIn_12_0 = null;
        qf stackIn_16_0 = null;
        qf stackOut_15_0 = null;
        qf stackOut_14_0 = null;
        qf stackOut_11_0 = null;
        qf stackOut_10_0 = null;
        var5 = (CharSequence) (Object) param0;
        if (rc.a(111, var5)) {
          L0: {
            if (param0.equals((Object) (Object) ((df) this).field_j)) {
              break L0;
            } else {
              var3 = gb.a(param0, (byte) 100);
              if (var3 != null) {
                if (var3.field_d == null) {
                  ((df) this).field_j = param0;
                  ((df) this).field_k = var3.field_c;
                  break L0;
                } else {
                  return db.field_u;
                }
              } else {
                return db.field_u;
              }
            }
          }
          if (param1 > -109) {
            L1: {
              var4 = null;
              String discarded$8 = ((df) this).a((String) null, true);
              if (!((df) this).field_k) {
                stackOut_15_0 = rg.field_f;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              } else {
                stackOut_14_0 = ph.field_g;
                stackIn_16_0 = stackOut_14_0;
                break L1;
              }
            }
            return stackIn_16_0;
          } else {
            L2: {
              if (!((df) this).field_k) {
                stackOut_11_0 = rg.field_f;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              } else {
                stackOut_10_0 = ph.field_g;
                stackIn_12_0 = stackOut_10_0;
                break L2;
              }
            }
            return stackIn_12_0;
          }
        } else {
          return rg.field_f;
        }
    }

    df(vg param0) {
        super(param0);
        ((df) this).field_k = false;
    }

    static {
    }
}
