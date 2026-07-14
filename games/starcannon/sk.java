/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_a;
    static boolean field_b;
    static og field_c;

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = StarCannon.field_A;
          ki.b(param0, param4, param1 + 1, 10000536);
          ki.b(param0, param2 + param4, 1 + param1, 12105912);
          var5 = 1;
          if (ki.field_e <= var5 + param4) {
            break L0;
          } else {
            var5 = -param4 + ki.field_e;
            break L0;
          }
        }
        L1: {
          var6 = param2;
          if (ki.field_i < var6 + param4) {
            var6 = -param4 + ki.field_i;
            break L1;
          } else {
            break L1;
          }
        }
        if (param3) {
          var7 = var5;
          L2: while (true) {
            if (var7 >= var6) {
              return;
            } else {
              var8 = 152 - -(48 * var7 / param2);
              var9 = var8 << -1021771376 | var8 << -1364739832 | var8;
              ki.field_a[param0 + ki.field_j * (param4 + var7)] = var9;
              ki.field_a[param0 + ki.field_j * (param4 + var7) + param1] = var9;
              var7++;
              continue L2;
            }
          }
        } else {
          field_b = true;
          var7 = var5;
          L3: while (true) {
            if (var7 >= var6) {
              return;
            } else {
              var8 = 152 - -(48 * var7 / param2);
              var9 = var8 << -1021771376 | var8 << -1364739832 | var8;
              ki.field_a[param0 + ki.field_j * (param4 + var7)] = var9;
              ki.field_a[param0 + ki.field_j * (param4 + var7) + param1] = var9;
              var7++;
              continue L3;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (param0) {
            sk.a(89, -5, -15, false, 94);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
        field_c = new og();
    }
}
