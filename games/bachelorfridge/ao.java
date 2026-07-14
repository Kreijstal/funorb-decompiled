/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ao extends kda {
    static d field_d;
    static String field_c;

    ao() {
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 113 % ((param0 - 21) / 43);
        field_d = null;
    }

    final static void a(int param0, kv[] param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        if (param1 != null) {
          if ((param2 ^ -1) < -1) {
            var5 = param1[0].field_n;
            var6 = param1[2].field_n;
            if (param3 != -128) {
              return;
            } else {
              var7 = param1[1].field_n;
              param1[0].e(param0, param4);
              param1[2].e(param0 + param2 + -var6, param4);
              dg.a(eha.field_q);
              dg.c(param0 - -var5, param4, -var6 + param0 + param2, param4 + param1[1].field_o);
              var8 = param0 + var5;
              var9 = -var6 + param2 + param0;
              param0 = var8;
              L0: while (true) {
                if (var9 <= param0) {
                  dg.b(eha.field_q);
                  return;
                } else {
                  param1[1].e(param0, param4);
                  param0 = param0 + var7;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Month";
    }
}
