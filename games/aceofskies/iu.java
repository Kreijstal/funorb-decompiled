/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu extends ao {
    static eo field_h;
    static String field_e;
    static String field_f;
    static int field_g;

    iu() {
        this.b(0);
    }

    private final void b(int param0) {
        if (param0 != 0) {
            this.b(-8);
        }
    }

    final static wp[] a(gk param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        if (param2 != -86) {
          var6 = (String) null;
          wp[] discarded$2 = iu.a((gk) null, (String) null, (byte) 65, (String) null);
          var4 = param0.b(param1, 0);
          var5 = param0.a(-67, var4, param3);
          return ur.a(101, var4, var5, param0);
        } else {
          var4 = param0.b(param1, 0);
          var5 = param0.a(-67, var4, param3);
          return ur.a(101, var4, var5, param0);
        }
    }

    public static void a(byte param0) {
        if (param0 != 119) {
          field_g = -109;
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "arcade game";
        field_e = "Log in / Create account";
        field_g = 500;
        field_h = new eo(0);
    }
}
