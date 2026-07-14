/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_a;
    static we field_b;

    final static ob a(byte[] param0, int param1) {
        ob var2 = null;
        if (param0 != null) {
          var2 = new ob(param0, fa.field_b, e.field_b, gf.field_g, ge.field_c, fl.field_g, wo.field_f);
          re.b(param1 ^ -28512);
          if (param1 != -28628) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 61 % ((-1 - param0) / 61);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
