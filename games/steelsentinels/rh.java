/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends ck {
    byte[] field_r;
    static String field_p;
    static gh field_u;
    int field_x;
    static rj[] field_o;
    static cj field_q;
    static String[] field_t;
    static wk[] field_v;
    static int field_s;
    static gh field_w;

    final static void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (vb.field_e) {
          L0: {
            qf.field_c.a((byte) -80, param1);
            var4 = jk.field_i.m(109) ? 1 : 0;
            if (lb.field_gc == 0) {
              break L0;
            } else {
              if (var4 != 0) {
                break L0;
              } else {
                pm.a((byte) 48);
                param1 = false;
                break L0;
              }
            }
          }
          L1: {
            if (param1) {
              jk.field_i.a((byte) 68, param2, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (var4 == 0) {
            var5 = jk.field_i.j(0) + jk.field_i.field_Rb;
            if (var5 <= 640) {
              if (var5 < 635) {
                if (0 >= ed.field_i) {
                  return;
                } else {
                  ed.field_i = ed.field_i - 5;
                  return;
                }
              } else {
                return;
              }
            } else {
              ed.field_i = ed.field_i + 5;
              return;
            }
          } else {
            qf.field_c.a((byte) -37, param1);
            var5 = jk.field_i.j(0) + jk.field_i.field_Rb;
            if (var5 <= 640) {
              if (var5 < 635) {
                if (0 >= ed.field_i) {
                  return;
                } else {
                  ed.field_i = ed.field_i - 5;
                  return;
                }
              } else {
                return;
              }
            } else {
              ed.field_i = ed.field_i + 5;
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a() {
        if (an.field_i == null) {
            return;
        }
        if (null == an.field_i.field_c) {
            return;
        }
        an.field_i.field_c.field_G = false;
    }

    public static void b() {
        field_q = null;
        field_u = null;
        field_t = null;
        field_p = null;
        field_w = null;
        field_o = null;
        field_v = null;
    }

    final static void a(int param0, int param1, jm param2) {
        kj var3 = null;
        try {
            var3 = mm.field_g;
            var3.a(param0, (byte) -117);
            var3.a((byte) 123, param2.field_q);
            var3.d(param2.field_s, 77);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "rh.A(" + param0 + ',' + 0 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    rh(byte[] param0) {
        try {
            ((rh) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Logging in...";
        field_t = new String[]{"KNEEL BEFORE YOUR CONQUEROR!", "Lord Ba'al, help me!", "Lord Ba'al, help us!"};
        field_u = null;
        field_v = new wk[26];
        field_s = 0;
    }
}
