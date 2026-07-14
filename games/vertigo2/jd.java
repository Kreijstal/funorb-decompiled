/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_a;
    static String field_b;
    static String field_c;
    static int field_d;

    final static qj a(boolean param0) {
        String var1 = null;
        if (param0) {
          L0: {
            jd.a(13);
            var1 = hr.h(-101);
            if (var1 == null) {
              break L0;
            } else {
              if (0 > var1.indexOf('@')) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new qj(hr.h(-104), wa.b((byte) -119));
        } else {
          L1: {
            var1 = hr.h(-101);
            if (var1 == null) {
              break L1;
            } else {
              if (0 > var1.indexOf('@')) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new qj(hr.h(-104), wa.b((byte) -119));
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -61 % ((param0 - -10) / 34);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
        field_b = "Quit to website";
        field_c = "Respawning in <%0>";
    }
}
