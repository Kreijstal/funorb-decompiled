/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends vv {
    byte[] field_u;
    int field_t;
    static String field_w;
    qh field_v;

    final int a(int param0) {
        if (param0 != 0) {
            return -42;
        }
        if (((hi) this).field_p) {
            return 0;
        }
        return 100;
    }

    public static void g(int param0) {
        field_w = null;
        if (param0 != -26236) {
            field_w = null;
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        bv.a(param0, "", (byte) 15);
        if (!param1) {
            field_w = null;
            bq.a((byte) 108, param0);
            return;
        }
        bq.a((byte) 108, param0);
    }

    final byte[] b(int param0) {
        if (((hi) this).field_p) {
          throw new RuntimeException();
        } else {
          if (param0 != 12802) {
            ((hi) this).field_v = null;
            return ((hi) this).field_u;
          } else {
            return ((hi) this).field_u;
          }
        }
    }

    hi() {
    }

    final static boolean a(int param0, String param1) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = null;
            hi.a((java.applet.Applet) null, false);
            if (null == fm.a(param1, 145)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == fm.a(param1, 145)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "None";
    }
}
