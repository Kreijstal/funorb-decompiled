/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_g;
    static String field_b;
    static long field_e;
    static ij field_a;
    static tk field_d;
    static km[] field_c;
    static String field_f;

    final static rk a(int param0, int param1, int param2, um param3) {
        if (tj.a(param2, param0, param3, (byte) 83)) {
          if (param1 != 3807) {
            field_b = null;
            return th.b(param1 ^ 3807);
          } else {
            return th.b(param1 ^ 3807);
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, le param1, int param2, boolean param3, le param4, int param5) {
        Object var7 = null;
        ek.field_b = param5;
        if (param3) {
          var7 = null;
          gi.a(-26, (le) null, 18, false, (le) null, 96);
          kl.field_i = param2;
          ie.field_b = param4;
          in.field_d = param1;
          m.field_d = param0;
          return;
        } else {
          kl.field_i = param2;
          ie.field_b = param4;
          in.field_d = param1;
          m.field_d = param0;
          return;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_f = null;
        if (!param0) {
          var2 = null;
          gi.a(108, (le) null, -27, false, (le) null, -31);
          field_g = null;
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please enter your date of birth to enable chat:";
        field_a = new ij();
        field_d = new tk();
        field_f = null;
    }
}
