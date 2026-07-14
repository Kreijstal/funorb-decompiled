/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static rk field_a;
    static int field_b;
    static char[] field_c;
    static String field_d;

    public static void a(byte param0) {
        int var1 = 95 % ((param0 - -65) / 53);
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = StarCannon.field_A;
        if (-11 < (rk.field_d ^ -1)) {
          L0: {
            var3 = 0;
            if (!v.field_b) {
              break L0;
            } else {
              v.field_b = false;
              var3 = 1;
              break L0;
            }
          }
          ci.a(ec.b((byte) -128), nb.field_d, j.b(-127), var3 != 0, param0 + -28066);
          if (param0 != 320) {
            ee.a((byte) 1);
            return;
          } else {
            return;
          }
        } else {
          if (m.a(param0 + -436)) {
            if (bl.field_a != 0) {
              oi.a(param1, (byte) 67);
              if (param0 != 320) {
                ee.a((byte) 1);
                return;
              } else {
                return;
              }
            } else {
              ai.a(param2, false, (byte) 114);
              dd.a(param1, 0, 0, -23466);
              if (param0 == 320) {
                return;
              } else {
                ee.a((byte) 1);
                return;
              }
            }
          } else {
            ki.b();
            lh.a(240, (byte) -95, 320);
            dd.a(param1, 0, 0, param0 + -23786);
            if (param0 == 320) {
              return;
            } else {
              ee.a((byte) 1);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new rk();
        field_c = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
