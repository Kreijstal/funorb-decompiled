/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static er[] field_b;
    static nj field_a;
    static int field_c;

    final static void a(byte param0) {
        if (param0 >= -36) {
          field_b = null;
          ql.i(34);
          al.a((byte) -41);
          up.field_z = null;
          bm.g(0);
          return;
        } else {
          ql.i(34);
          al.a((byte) -41);
          up.field_z = null;
          bm.g(0);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -7) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        param1--;
        param3--;
        var5 = -7 + param3;
        L0: while (true) {
          if (var5 > param1) {
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            param1++;
            param2[param1] = param4;
            continue L0;
          } else {
            L1: while (true) {
              if (param1 >= param3) {
                if (param0 > -73) {
                  field_c = -5;
                  return;
                } else {
                  return;
                }
              } else {
                param1++;
                param2[param1] = param4;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nj();
    }
}
