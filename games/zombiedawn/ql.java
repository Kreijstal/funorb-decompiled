/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends pm {
    private boolean field_h;
    static String field_f;
    private String field_i;
    static float field_j;
    static vn field_g;

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 != -160793343) {
          return;
        } else {
          var1 = rf.a(false);
          var2 = co.b(param0 + 160780300);
          cj.field_i.a(var1 + (af.field_b << -160793343), wm.field_d + -ia.field_c, wh.field_c + -af.field_b, (byte) -80, var2 - -(ia.field_c << 304908225));
          d.a(false);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        am var4 = null;
        int var5 = 0;
        if (po.w(13296)) {
          return;
        } else {
          var4 = dp.field_e;
          var4.j(11, param1);
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.i(0, 97);
          var4.a(param3, (byte) 105);
          var4.i(param2, 82);
          var4.a(param0, (byte) 105);
          var4.d(60, var4.field_j - var5);
          return;
        }
    }

    final rh a(String param0, int param1) {
        eo var3 = null;
        CharSequence var4 = null;
        rh stackIn_13_0 = null;
        rh stackIn_17_0 = null;
        rh stackOut_16_0 = null;
        rh stackOut_15_0 = null;
        rh stackOut_12_0 = null;
        rh stackOut_11_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (ea.a(20000000, var4)) {
          L0: {
            if (!param0.equals((Object) (Object) ((ql) this).field_i)) {
              var3 = tm.a((byte) 51, param0);
              if (var3 != null) {
                if (null == var3.field_e) {
                  ((ql) this).field_i = param0;
                  ((ql) this).field_h = var3.field_b;
                  break L0;
                } else {
                  return gj.field_v;
                }
              } else {
                return gj.field_v;
              }
            } else {
              break L0;
            }
          }
          if (param1 != 2) {
            L1: {
              field_g = null;
              if (((ql) this).field_h) {
                stackOut_16_0 = mc.field_g;
                stackIn_17_0 = stackOut_16_0;
                break L1;
              } else {
                stackOut_15_0 = uc.field_b;
                stackIn_17_0 = stackOut_15_0;
                break L1;
              }
            }
            return stackIn_17_0;
          } else {
            L2: {
              if (((ql) this).field_h) {
                stackOut_12_0 = mc.field_g;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = uc.field_b;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            return stackIn_13_0;
          }
        } else {
          return uc.field_b;
        }
    }

    public static void b(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
            field_f = null;
        }
    }

    ql(tb param0) {
        super(param0);
        ((ql) this).field_h = false;
    }

    final void e(int param0) {
        if (param0 != -28769) {
            field_j = 0.772375226020813f;
            ((ql) this).field_i = null;
            return;
        }
        ((ql) this).field_i = null;
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        eo var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param1 < -94) {
          var6 = (CharSequence) (Object) param0;
          var3 = ed.a(var6, (byte) -105);
          if (var3 == null) {
            L0: {
              if (!param0.equals((Object) (Object) ((ql) this).field_i)) {
                var4 = tm.a((byte) 51, param0);
                if (var4 != null) {
                  if (null == var4.field_e) {
                    ((ql) this).field_h = var4.field_b;
                    ((ql) this).field_i = param0;
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
            if (!((ql) this).field_h) {
              return ma.field_i;
            } else {
              return kf.field_X;
            }
          } else {
            return var3;
          }
        } else {
          field_g = null;
          var5 = (CharSequence) (Object) param0;
          var3 = ed.a(var5, (byte) -105);
          if (var3 == null) {
            L1: {
              if (!param0.equals((Object) (Object) ((ql) this).field_i)) {
                var4 = tm.a((byte) 51, param0);
                if (var4 != null) {
                  if (null == var4.field_e) {
                    ((ql) this).field_h = var4.field_b;
                    ((ql) this).field_i = param0;
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            if (!((ql) this).field_h) {
              return ma.field_i;
            } else {
              return kf.field_X;
            }
          } else {
            return var3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Loading...";
        field_j = -1.0f;
    }
}
