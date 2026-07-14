/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static String field_f;
    static int field_e;
    static String field_d;
    static db field_c;
    ad field_g;
    static int field_h;
    static a field_a;
    static de field_b;

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (param0 == -13) {
          if (var2 != 0) {
            if (var2 >= 128) {
              if (160 <= var2) {
                return (char)var2;
              } else {
                L0: {
                  var3 = hc.field_o[var2 - 128];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          field_a = null;
          if (var2 != 0) {
            if (var2 < 128) {
              return (char)var2;
            } else {
              L1: {
                if (160 > var2) {
                  L2: {
                    var3 = hc.field_o[var2 - 128];
                    if (var3 == 0) {
                      var3 = 63;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        }
    }

    final static void a(boolean param0) {
        if (null == wa.field_e) {
          if (param0) {
            mk.a(-109);
            return;
          } else {
            return;
          }
        } else {
          wa.field_e.d(-15488);
          wa.field_e = null;
          if (!param0) {
            return;
          } else {
            mk.a(-109);
            return;
          }
        }
    }

    final static void a(int param0, String param1, int param2, boolean param3, long param4, int param5) {
        nd.field_Lb.f(param5, (byte) -92);
        nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
        int var7 = nd.field_Lb.field_t;
        nd.field_Lb.a(-1, param4);
        nd.field_Lb.a(param1, 0);
        nd.field_Lb.a(param2, false);
        if (param0 >= -95) {
            field_c = null;
            nd.field_Lb.a(param3 ? 1 : 0, false);
            nd.field_Lb.b(-var7 + nd.field_Lb.field_t, -2);
            return;
        }
        nd.field_Lb.a(param3 ? 1 : 0, false);
        nd.field_Lb.b(-var7 + nd.field_Lb.field_t, -2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = 24;
        var7 = 5;
        ((mk) this).field_g.b(0, param2, param1, var7, param0, param4, var6);
        mi.field_Kb.a((byte) -108, go.field_d.field_Hb, 0, qe.field_d, 0);
        th.field_i.a((byte) -110, -2 + (-2 + go.field_d.field_Hb) - ha.field_e + -80, qe.field_d + 2, 18, 0);
        eo.field_b.a((byte) -126, 82 - -ha.field_e, qe.field_d + 2, 18, -80 + (go.field_d.field_Hb - ha.field_e + -2));
        if (param3 <= 52) {
          return;
        } else {
          pj.field_f.a(-2328, 0, 20, -20 + (-qe.field_d + (go.field_d.field_R - 2)), go.field_d.field_Hb, 2, 20 + (qe.field_d + 2), ha.field_e);
          fl.field_n.a(20, 2, ha.field_e, 2);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
          mk.a(-19, (String) null, -33, true, 19L, 86);
          field_f = null;
          field_d = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    mk(String param0, hl param1) {
        String[] var3 = new String[]{param0, am.field_a, ec.field_g};
        hl[] var4 = new hl[]{param1, go.field_d, (hl) (Object) fl.field_n};
        ((mk) this).field_g = new ad(0L, te.field_O, var3, rc.field_S, var4, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Off";
        field_c = new db(7, 0, 1, 1);
        field_h = 20;
        field_a = new a();
    }
}
