/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tt extends ms {
    static String field_k;
    static int field_l;

    final static wb[] a(byte param0, int param1, ki param2, int param3) {
        if (!k.a(param2, param1, param3, -23046)) {
            return null;
        }
        if (param0 > -79) {
            return null;
        }
        return ul.a(255);
    }

    final static void a(int param0) {
        if (param0 != 30692) {
          field_k = null;
          ki.field_f = c.field_u[0];
          iv.field_i = c.field_u[1];
          hc.field_f = c.field_u[2];
          return;
        } else {
          ki.field_f = c.field_u[0];
          iv.field_i = c.field_u[1];
          hc.field_f = c.field_u[2];
          return;
        }
    }

    public static void c(boolean param0) {
        field_k = null;
        if (!param0) {
            field_k = null;
        }
    }

    tt(int param0, boolean param1) {
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 < -127) {
          var3 = param1;
          if (var3 != 6) {
            if (var3 == 7) {
              var2 = dp.a(-26346, 0);
              return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
            } else {
              var2 = dp.a(-26346, param1);
              return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
            }
          } else {
            var2 = dp.a(-26346, 0);
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          }
        } else {
          field_l = -86;
          var3 = param1;
          if (var3 == 6) {
            var2 = dp.a(-26346, 0);
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          } else {
            L0: {
              if (var3 != 7) {
                var2 = dp.a(-26346, param1);
                break L0;
              } else {
                var2 = dp.a(-26346, 0);
                break L0;
              }
            }
            return ((8388607 ^ var2 >> 564229153) & 8355711) + var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "DEFEAT.";
        field_l = 256;
    }
}
