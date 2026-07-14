/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ov {
    int field_h;
    static String field_g;
    int[] field_c;
    java.awt.Image field_f;
    static ts field_i;
    static int[] field_a;
    static int[] field_e;
    static String field_d;
    int field_b;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_g = null;
        field_i = null;
        if (param0 < 33) {
            field_a = null;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 <= -34) {
          if (-1 >= (param1 ^ -1)) {
            if ((param1 ^ -1) >= -1) {
              return param1;
            } else {
              return 1;
            }
          } else {
            return -1;
          }
        } else {
          return 14;
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        lc.field_A = false;
        t.field_s = null;
        if (pg.field_a) {
          hc.field_c.e(false);
          if (param0 != 2) {
            int discarded$4 = ov.a(-6, -112);
            return;
          } else {
            return;
          }
        } else {
          var1 = jk.field_c;
          if (-1 > (var1 ^ -1)) {
            if (1 != var1) {
              t.field_s = ic.a(ph.field_d, new String[1], (byte) -128);
              t.field_s = uo.a(false, new CharSequence[3]);
              hc.field_c.n(param0 ^ -5);
              od.a(5178);
              if (param0 != 2) {
                int discarded$5 = ov.a(-6, -112);
                return;
              } else {
                return;
              }
            } else {
              t.field_s = kq.field_O;
              t.field_s = uo.a(false, new CharSequence[3]);
              hc.field_c.n(param0 ^ -5);
              od.a(5178);
              if (param0 == 2) {
                return;
              } else {
                int discarded$6 = ov.a(-6, -112);
                return;
              }
            }
          } else {
            hc.field_c.n(param0 ^ -5);
            od.a(5178);
            if (param0 == 2) {
              return;
            } else {
              int discarded$7 = ov.a(-6, -112);
              return;
            }
          }
        }
    }

    final static bj a(int param0, String param1) {
        L0: {
          if (!ut.field_o.a(true)) {
            break L0;
          } else {
            if (!param1.equals((Object) (Object) ut.field_o.b(66))) {
              ut.field_o = aj.a(false, param1);
              break L0;
            } else {
              if (param0 == 1) {
                return ut.field_o;
              } else {
                field_d = null;
                return ut.field_o;
              }
            }
          }
        }
        if (param0 != 1) {
          field_d = null;
          return ut.field_o;
        } else {
          return ut.field_o;
        }
    }

    final void a(int param0) {
        lk.a(((ov) this).field_c, ((ov) this).field_h, ((ov) this).field_b);
        if (param0 != -1) {
            Object var3 = null;
            bj discarded$0 = ov.a(111, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Invalid password.";
        field_d = "Quit";
        field_e = new int[256];
        field_i = new ts(1, 2, 2, 0);
    }
}
