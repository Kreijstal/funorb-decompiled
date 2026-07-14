/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static int field_d;
    static String field_e;
    static cg field_c;
    static int[] field_a;
    static int field_b;
    static int field_f;

    public static void a(int param0) {
        field_a = null;
        int var1 = 75 % ((param0 - 79) / 33);
        field_e = null;
        field_c = null;
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = stellarshard.field_B;
        if (param0 < -107) {
          var2 = 0;
          L0: while (true) {
            if (param1.length() > var2) {
              var3 = param1.charAt(var2);
              if (qc.a(-1750942672, (char) var3)) {
                var2++;
                var2++;
                var2++;
                continue L0;
              } else {
                if (!bh.a(-1, (char) var3)) {
                  return true;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          lg.a(-86);
          var2 = 0;
          if (param1.length() > var2) {
            var3 = param1.charAt(var2);
            if (!qc.a(-1750942672, (char) var3)) {
              if (!bh.a(-1, (char) var3)) {
                return true;
              } else {
                var2++;
                var2++;
                var2++;
                var2++;
                return false;
              }
            } else {
              var2++;
              var2++;
              var2++;
              var2++;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{2, 7, 4, 5, 6, 7};
        field_e = "Waiting for graphics";
        field_c = new cg();
        field_f = 34015232;
    }
}
