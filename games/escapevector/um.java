/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static byte[] field_b;
    static fc field_d;
    static String field_a;
    static String field_c;

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 17830) {
          if ((ff.field_e ^ -1) <= -11) {
            if (nf.field_u) {
              return false;
            } else {
              L0: {
                if (rb.a(true)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_c = null;
          if ((ff.field_e ^ -1) <= -11) {
            if (nf.field_u) {
              return false;
            } else {
              L1: {
                if (rb.a(true)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[65536];
        qg.a(field_b, 0, 65536, (byte) -128);
        field_a = "Loading...";
        field_d = new fc();
        field_c = "LEFT ARROW";
    }
}
