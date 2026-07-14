/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static jf[] field_a;
    static String field_b;

    final static void a(int param0) {
        String var1 = null;
        if (!fe.field_g) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != nk.field_a) {
              nk.field_a.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != 11173) {
            return;
          } else {
            var1 = fd.c((byte) 61);
            vk.field_c = new ci(var1, (String) null, true, false, false);
            q.field_N.b((lk) (Object) ed.field_c, false);
            ed.field_c.a(param0 ^ 437, (lk) (Object) vk.field_c);
            ed.field_c.i((byte) -85);
            return;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        qh.field_e = aj.field_e[param1];
        if (!param0) {
          field_a = null;
          pc.field_p = hc.field_d[param1];
          ii.field_l = nl.field_b[param1];
          return;
        } else {
          pc.field_p = hc.field_d[param1];
          ii.field_l = nl.field_b[param1];
          return;
        }
    }

    final static rg a(int param0, String param1) {
        if (vc.field_F != qg.field_g) {
          if (param0 == 1059) {
            if (he.field_p == vc.field_F) {
              if (!param1.equals((Object) (Object) t.field_t)) {
                vc.field_F = qg.field_g;
                oa.field_c = null;
                t.field_t = param1;
                return null;
              } else {
                vc.field_F = wj.field_a;
                return oa.field_c;
              }
            } else {
              vc.field_F = qg.field_g;
              oa.field_c = null;
              t.field_t = param1;
              return null;
            }
          } else {
            field_b = null;
            if (he.field_p == vc.field_F) {
              if (!param1.equals((Object) (Object) t.field_t)) {
                vc.field_F = qg.field_g;
                oa.field_c = null;
                t.field_t = param1;
                return null;
              } else {
                vc.field_F = wj.field_a;
                return oa.field_c;
              }
            } else {
              vc.field_F = qg.field_g;
              oa.field_c = null;
              t.field_t = param1;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        int var1 = -102 / ((param0 - -62) / 48);
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Mouse over an icon for details";
    }
}
