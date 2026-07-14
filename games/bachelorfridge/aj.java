/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    int field_c;
    int field_a;
    static String field_b;

    final static ee a(int param0, int param1, int param2, vr param3) {
        if (g.a(param1, param0, -30744, param3)) {
          if (param2 != 0) {
            int discarded$2 = aj.a((byte) -31, -21);
            return dr.b(param2 + -32124);
          } else {
            return dr.b(param2 + -32124);
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((aj) this).field_a = param2;
        ((aj) this).field_c = param1;
        if (param0 != -1) {
            field_b = null;
        }
    }

    public static void a(int param0) {
        if (param0 < 41) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == -20) {
          var2 = 0;
          L0: while (true) {
            if (-30 > var2) {
              if (qe.field_q[var2] != param1) {
                var2++;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return -1;
            }
          }
        } else {
          ee discarded$5 = aj.a(-51, -127, 29, (vr) null);
          var2 = 0;
          L1: while (true) {
            if (-30 < var2) {
              if (qe.field_q[var2] != param1) {
                var2++;
                continue L1;
              } else {
                return var2;
              }
            } else {
              return -1;
            }
          }
        }
    }

    aj(int param0, int param1) {
        ((aj) this).a(-1, param0, param1);
    }

    aj(aj param0) {
        ((aj) this).a(-1, param0.field_c, param0.field_a);
    }

    final static boolean a(byte param0) {
        int var1 = 74 / ((11 - param0) / 63);
        return !ut.field_m.a(false) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Played";
    }
}
