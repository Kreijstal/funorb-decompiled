/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_c;
    static ko[] field_b;
    static int field_a;

    final static boolean a(js param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -17900) {
          var2 = 0;
          L0: while (true) {
            if (param0.field_x > var2) {
              if (param0.field_D[var2] > 50) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        if (param0 < 32) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 - param1 & param0 >> 2092116319;
        return var3 + ((param0 >>> -685991521) + param0) % param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new ko[255];
        for (var0 = 0; field_b.length > var0; var0++) {
            field_b[var0] = new ko();
        }
    }
}
