/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int field_c;
    static int field_a;
    static int[] field_d;
    static int field_b;

    final static void a(String param0, int param1, byte param2) {
        int var3 = 0;
        s.field_c = false;
        ic.field_a = false;
        if (param2 == -77) {
          if (null != fa.field_G) {
            if (fa.field_G.field_G) {
              L0: {
                var3 = 1;
                if (8 != param1) {
                  break L0;
                } else {
                  L1: {
                    param1 = 2;
                    if (tc.field_x) {
                      param0 = pk.field_b;
                      break L1;
                    } else {
                      param0 = ag.field_k;
                      break L1;
                    }
                  }
                  wi.field_c.b((byte) -79, lc.field_hb);
                  break L0;
                }
              }
              L2: {
                if (10 != param1) {
                  break L2;
                } else {
                  qc.a(false);
                  var3 = 0;
                  break L2;
                }
              }
              L3: {
                if (var3 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (ic.field_a) {
                      param0 = fb.a(oh.field_b, param2 ^ -50, new String[1]);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!vj.field_V) {
                      break L5;
                    } else {
                      param0 = jl.field_k;
                      break L5;
                    }
                  }
                  fa.field_G.a(param0, param1, true);
                  break L3;
                }
              }
              if (256 != param1) {
                if (-11 != (param1 ^ -1)) {
                  if (!tc.field_x) {
                    wi.field_c.a(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 98) {
            field_c = -122;
        }
    }

    final static int a(CharSequence param0, int param1) {
        Object var3 = null;
        if (param1 != 10) {
          var3 = null;
          pd.a((String) null, 75, (byte) -104);
          return cc.a(param0, 10, true, param1 ^ -60);
        } else {
          return cc.a(param0, 10, true, param1 ^ -60);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_c = 0;
        field_b = 0;
    }
}
