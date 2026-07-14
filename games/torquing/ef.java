/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int[] field_d;
    static ul field_b;
    static ce field_a;
    static char[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 < 88) {
          return;
        } else {
          L0: {
            if (j.field_q > param2) {
              break L0;
            } else {
              if (param2 > qk.field_p) {
                break L0;
              } else {
                param3 = ln.a(qg.field_z, kn.field_e, param3, 111);
                param0 = ln.a(qg.field_z, kn.field_e, param0, 96);
                rh.a((byte) -111, param0, param2, param3, param1);
                break L0;
              }
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 3) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{1, 2, 3, 5, 2, 3, 5, 10, 1, 1, 2, 3, 5, 10, 2, 3, 4};
        field_b = new ul();
        field_c = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
