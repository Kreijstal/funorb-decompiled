/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int[] field_c;
    static String field_e;
    static double field_d;
    static String field_f;
    static int[] field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(jp param0, int param1, int param2, pb param3, int param4, int param5, jp param6) {
        fc.a(-72, param3.field_p);
        lb.g(0, 0, param3.field_i, param3.field_q, um.field_u[param5], 928072);
        og.a(-124, 128, 8, param0, 16777215, (-param0.field_x + param3.field_i) / 2, 85 + (param1 + -param0.field_z));
        if (param4 != -8562) {
          return;
        } else {
          og.a(-113, 8, 128, param6, 16777215, (param3.field_i + -param0.field_x) / 2, 480 + param1 + (-param0.field_z - -(60 / param2)));
          sc.b(-90);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 == 29605) {
          var3 = 1;
          L0: while (true) {
            if ((param0 ^ -1) >= -2) {
              if (1 == param0) {
                return param2 * var3;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (0 == (param0 & 1)) {
                  break L1;
                } else {
                  var3 = var3 * param2;
                  break L1;
                }
              }
              param2 = param2 * param2;
              param0 = param0 >> 1;
              continue L0;
            }
          }
        } else {
          return -85;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "+<%0>";
        field_f = "Yes";
        field_c = new int[]{12658477, 3952770, 16494651, 26679, 16711935};
        field_d = Math.atan2(1.0, 0.0);
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = new int[2];
    }
}
