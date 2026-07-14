/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static nc field_d;
    static hb field_b;
    static int[] field_e;
    static boolean[] field_a;
    static String field_c;

    final static void a(eh param0, int param1, int param2) {
        nh.field_cb.a((da) (Object) param0, -66);
        sa.a((byte) 18, param1, param0);
        if (param2 != 160) {
            field_b = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 64) {
            return;
        }
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(byte param0) {
        if (!(vc.a(0))) {
            return;
        }
        gj.a(-1, 4, false);
        if (param0 != 116) {
            ki.a(76);
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        Object var4 = null;
        if (param0 == -18) {
          if (!param1) {
            return pf.field_c.a(param2);
          } else {
            return ec.field_c.a(param2);
          }
        } else {
          var4 = null;
          ki.a((eh) null, -37, 108);
          if (!param1) {
            return pf.field_c.a(param2);
          } else {
            return ec.field_c.a(param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{64, 96, 96, 64, 96, 96, 64, 96, 64, 160};
        field_d = null;
        field_a = new boolean[64];
        field_b = new hb("");
        field_c = "This entry doesn't match";
    }
}
