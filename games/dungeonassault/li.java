/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static md field_a;
    static cn[] field_l;
    static int field_j;
    static int field_k;
    static String[] field_b;
    static int field_h;
    static String field_d;
    static String field_c;
    static int field_g;
    static String field_e;
    static String field_i;
    static String[] field_f;

    final static void c(int param0) {
        ta.field_a.b(1, (lm) (Object) new ia());
        if (param0 != 316) {
            field_j = 24;
        }
    }

    final static void a(int param0) {
        if (param0 != -8) {
            li.a(true);
        }
        np.a((byte) -123, m.c(true));
    }

    public static void a(boolean param0) {
        if (param0) {
            field_j = 33;
        }
        field_e = null;
        field_b = null;
        field_d = null;
        field_i = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_l = null;
    }

    final static cn[] a(int param0, int param1, nh param2, int param3) {
        if (!kk.a(param2, param3 + -3, param0, param1)) {
            return null;
        }
        if (param3 != 4) {
            return null;
        }
        return ib.b(-10718);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          jh.c();
          if (param0 <= -57) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          if (null == wm.field_c) {
            bn.field_f = new cn(256, 256);
            wm.field_c = new cn(316, 316);
            wm.field_c.field_w = -16;
            wm.field_c.field_A = -16;
            break L1;
          } else {
            break L1;
          }
        }
        bn.field_f.e();
        gf.a();
        var1 = 0;
        var2 = 0;
        L2: while (true) {
          if ((var2 ^ -1) <= -8) {
            wm.field_c.e();
            gf.a();
            bn.field_f.e(16, 16, 8454143);
            gf.d(8, 8, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
            bn.field_f.e(16, 16, 0);
            gf.d(4, 4, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
            jh.b();
            return;
          } else {
            var3 = 0;
            L3: while (true) {
              if ((var3 ^ -1) <= -8) {
                var2++;
                continue L2;
              } else {
                if (null != qj.field_c[var1]) {
                  gf.b(var3 * 36 + 4, 4 - -(36 * var2), 32, 32, 16777215);
                  var1++;
                  var3++;
                  continue L3;
                } else {
                  var1++;
                  var3++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 3;
        field_c = "Select two rooms to spy out";
        field_d = "Try not to get snared in this spider's webs; the gigantic tarantula is always alert; it likes nothing more than the sweet meat of a raider or two.";
        field_b = new String[6];
        field_e = "Risk of waking dragon: ";
        field_a = new md();
        field_i = "More suggestions";
        field_f = new String[]{"Scout", "A creature born to the labyrinth, the enhanced senses of the <%0> can sometimes be used to determine what lies beyond the next door. (Single use)"};
    }
}
