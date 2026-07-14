/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ed field_c;
    static nn field_a;
    static String field_b;

    final static boolean a(char param0, int param1) {
        if (param1 != 21654) {
            Object var3 = null;
            ml.a((ik) null, -66, (byte) -72);
            return d.a(param0, -11217);
        }
        return d.a(param0, -11217);
    }

    public static void a(int param0) {
        if (param0 >= -112) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static ce a(int param0, mf param1, ec param2, int param3, int param4) {
        byte[] var5 = null;
        byte[] var6 = null;
        var6 = param1.a(param4, (byte) -97, param3);
        var5 = var6;
        if (var6 != null) {
          if (param0 != -15618) {
            return null;
          } else {
            return new ce(new n(var6), param2);
          }
        } else {
          return null;
        }
    }

    final static void a(ik param0, int param1, byte param2) {
        vj.field_d.a(-12328, (hg) (Object) param0);
        ig.a(-75, param1, param0);
        if (param2 != 101) {
            ml.a(-42);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password is valid";
    }
}
