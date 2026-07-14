/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_i;
    static bb field_h;
    static ag field_a;
    static int field_e;
    static vd field_c;
    static String field_b;
    static String field_g;
    static nh field_d;
    static he[] field_f;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if ((param1 & 7) == 0) {
            break L0;
          } else {
            var2 = -(param1 & 7) + 8;
            break L0;
          }
        }
        var3 = param1 - -var2;
        if (param0 != -17077) {
          field_f = null;
          return var3;
        } else {
          return var3;
        }
    }

    final static sd[] b(byte param0) {
        if (param0 >= -103) {
          int discarded$2 = eg.a(99, 71);
          return new sd[]{p.field_d, ka.field_q, mf.field_A};
        } else {
          return new sd[]{p.field_d, ka.field_q, mf.field_A};
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        if (param1 < 69) {
            return 87;
        }
        return fj.a(param0, param2, 84, true);
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        } else {
          field_f = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_d = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final static void a(byte param0) {
        if (!(uj.field_j == null)) {
            uj.field_j.b(50);
            uj.field_j = null;
        }
        if (param0 != 126) {
            sd[] discarded$0 = eg.b((byte) 72);
            return;
        }
    }

    final static nh[] a(byte param0, int param1, int param2, int param3) {
        if (param0 < 66) {
          sd[] discarded$2 = eg.b((byte) 0);
          return af.a(param1, 1, param2, (byte) 32, param3);
        } else {
          return af.a(param1, 1, param2, (byte) 32, param3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_h = new bb();
        field_e = 4;
        field_c = new vd();
        field_b = "Please try again in a few minutes.";
        field_g = "Change display name";
    }
}
