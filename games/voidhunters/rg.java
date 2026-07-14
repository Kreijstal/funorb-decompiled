/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg implements dja {
    static String field_a;
    static boolean field_b;
    static String field_c;

    public final tv a(byte param0) {
        int var2 = -61 / ((param0 - -64) / 50);
        return (tv) (Object) new oca();
    }

    final static int b(byte param0) {
        int var1 = 0;
        L0: {
          var1 = 8 % ((param0 - 63) / 33);
          if (!vba.f((byte) -89)) {
            break L0;
          } else {
            if (null != qn.field_h.g(0)) {
              return qn.field_h.g(0).field_r;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = null;
        }
        return (tv[]) (Object) new oca[param1];
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int[] var15 = null;
        int var13 = VoidHunters.field_G;
        int var7 = param5 + param4;
        int var8 = -param5 + param1;
        for (var11 = param4; var11 < var7; var11++) {
            ww.a(param3, param0, rba.field_b[var11], (byte) 75, param2);
        }
        int var10 = -param5 + param0;
        int var9 = param2 - -param5;
        for (var11 = param1; var8 < var11; var11--) {
            ww.a(param3, param0, rba.field_b[var11], (byte) 75, param2);
        }
        var11 = var7;
        if (param6 <= 56) {
            return;
        }
        while (var8 >= var11) {
            var15 = rba.field_b[var11];
            ww.a(param3, var9, var15, (byte) 75, param2);
            ww.a(param3, param0, var15, (byte) 75, var10);
            var11++;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 > -111) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Login: ";
        field_c = "Very long range";
    }
}
