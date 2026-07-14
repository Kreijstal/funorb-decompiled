/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends ksa {
    static int field_d;
    private static String field_z;

    protected za() {
    }

    final static int c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (null != fwa.field_g) {
          var1 = 0;
          var2 = 0;
          L0: while (true) {
            if (var2 >= 12) {
              return var1;
            } else {
              var3 = fwa.field_g.field_c[var2];
              if (!fwa.field_g.a(var3, true, false)) {
                if (!fwa.field_g.c(var3, -40)) {
                  var2++;
                  continue L0;
                } else {
                  var1++;
                  var2++;
                  continue L0;
                }
              } else {
                var1++;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          L1: {
            if (param0 == -93) {
              break L1;
            } else {
              int discarded$1 = za.c((byte) 43);
              break L1;
            }
          }
          return 12;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "za.C(";
    }
}
