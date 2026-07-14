/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends da {
    static int field_m;
    private String field_l;
    static int[] field_q;
    private boolean field_p;
    static cr field_o;
    static String field_r;
    static int field_n;

    final ba a(int param0, String param1) {
        ch var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        ba stackIn_7_0 = null;
        ba stackIn_14_0 = null;
        ba stackIn_21_0 = null;
        ba stackIn_28_0 = null;
        ba stackOut_27_0 = null;
        ba stackOut_26_0 = null;
        ba stackOut_20_0 = null;
        ba stackOut_19_0 = null;
        ba stackOut_13_0 = null;
        ba stackOut_12_0 = null;
        ba stackOut_6_0 = null;
        ba stackOut_5_0 = null;
        var5 = (CharSequence) (Object) param1;
        if (jc.a((byte) 82, var5)) {
          if (param0 == -1) {
            if (!param1.equals((Object) (Object) ((hk) this).field_l)) {
              var3 = qe.a(param1, (byte) 54);
              if (var3 != null) {
                if (var3.field_j != null) {
                  return dj.field_c;
                } else {
                  L0: {
                    ((hk) this).field_p = var3.field_a;
                    ((hk) this).field_l = param1;
                    if (!((hk) this).field_p) {
                      stackOut_27_0 = ir.field_a;
                      stackIn_28_0 = stackOut_27_0;
                      break L0;
                    } else {
                      stackOut_26_0 = qm.field_G;
                      stackIn_28_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                  return stackIn_28_0;
                }
              } else {
                return dj.field_c;
              }
            } else {
              L1: {
                if (!((hk) this).field_p) {
                  stackOut_20_0 = ir.field_a;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                } else {
                  stackOut_19_0 = qm.field_G;
                  stackIn_21_0 = stackOut_19_0;
                  break L1;
                }
              }
              return stackIn_21_0;
            }
          } else {
            var4 = null;
            ba discarded$1 = ((hk) this).a(86, (String) null);
            if (!param1.equals((Object) (Object) ((hk) this).field_l)) {
              var3 = qe.a(param1, (byte) 54);
              if (var3 != null) {
                if (var3.field_j != null) {
                  return dj.field_c;
                } else {
                  L2: {
                    ((hk) this).field_p = var3.field_a;
                    ((hk) this).field_l = param1;
                    if (!((hk) this).field_p) {
                      stackOut_13_0 = ir.field_a;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = qm.field_G;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  return stackIn_14_0;
                }
              } else {
                return dj.field_c;
              }
            } else {
              L3: {
                if (!((hk) this).field_p) {
                  stackOut_6_0 = ir.field_a;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = qm.field_G;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0;
            }
          }
        } else {
          return ir.field_a;
        }
    }

    final static void a(int param0, byte param1, int param2) {
        mi var3 = null;
        var3 = uh.field_Wb;
        var3.j(param0, param1 ^ 75);
        if (param1 != 60) {
          field_r = null;
          var3.f(3, 91);
          var3.f(8, param1 + 41);
          var3.d(param2, param1 ^ -1739);
          return;
        } else {
          var3.f(3, 91);
          var3.f(8, param1 + 41);
          var3.d(param2, param1 ^ -1739);
          return;
        }
    }

    final String b(int param0, String param1) {
        String var3 = null;
        ch var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        if (param0 == 3614) {
          var6 = (CharSequence) (Object) param1;
          var3 = gm.a((byte) 92, var6);
          if (var3 == null) {
            L0: {
              if (!param1.equals((Object) (Object) ((hk) this).field_l)) {
                var4 = qe.a(param1, (byte) 61);
                if (var4 != null) {
                  if (null == var4.field_j) {
                    ((hk) this).field_p = var4.field_a;
                    ((hk) this).field_l = param1;
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
            if (!((hk) this).field_p) {
              return wa.field_g;
            } else {
              return sf.field_c;
            }
          } else {
            return var3;
          }
        } else {
          field_o = null;
          var5 = (CharSequence) (Object) param1;
          var3 = gm.a((byte) 92, var5);
          if (var3 == null) {
            L1: {
              if (!param1.equals((Object) (Object) ((hk) this).field_l)) {
                var4 = qe.a(param1, (byte) 61);
                if (var4 != null) {
                  if (null == var4.field_j) {
                    ((hk) this).field_p = var4.field_a;
                    ((hk) this).field_l = param1;
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
            if (!((hk) this).field_p) {
              return wa.field_g;
            } else {
              return sf.field_c;
            }
          } else {
            return var3;
          }
        }
    }

    final void h(int param0) {
        ((hk) this).field_l = null;
        if (param0 != -1) {
            Object var3 = null;
            hk.a(-74, (java.awt.Component) null);
        }
    }

    hk(kp param0) {
        super(param0);
        ((hk) this).field_p = false;
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_m = 2;
            return jp.field_o;
        }
        return jp.field_o;
    }

    public static void c(byte param0) {
        field_o = null;
        field_r = null;
        if (param0 >= -61) {
            int discarded$0 = hk.a(true);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != 3) {
          hk.g(98);
          param1.addMouseListener((java.awt.event.MouseListener) (Object) as.field_b);
          param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) as.field_b);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) as.field_b);
          return;
        } else {
          param1.addMouseListener((java.awt.event.MouseListener) (Object) as.field_b);
          param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) as.field_b);
          param1.addFocusListener((java.awt.event.FocusListener) (Object) as.field_b);
          return;
        }
    }

    final static void g(int param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        if (param0 != 3) {
          field_m = -23;
          qe.field_V = id.field_f.f(param0 ^ 131);
          var2 = (CharSequence) (Object) qe.field_V;
          Vertigo2.field_F = rc.a(var2, param0 + 317);
          return;
        } else {
          qe.field_V = id.field_f.f(param0 ^ 131);
          var3 = (CharSequence) (Object) qe.field_V;
          Vertigo2.field_F = rc.a(var3, param0 + 317);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
        field_r = "Paint-off";
    }
}
