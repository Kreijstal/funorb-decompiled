/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static String field_e;
    static ka field_b;
    private boolean field_f;
    static k field_d;
    private String field_c;
    static int field_g;
    static int field_a;

    final static byte[] a(byte param0, String param1) {
        int var2 = 43 % ((44 - param0) / 60);
        return dn.field_i.a(-127, param1, "");
    }

    final String b(byte param0) {
        int var2 = 82 / ((param0 - 48) / 58);
        return ((da) this).field_c;
    }

    public static void a(int param0) {
        Object var2 = null;
        field_e = null;
        if (param0 <= 88) {
          var2 = null;
          byte[] discarded$2 = da.a((byte) 80, (String) null);
          field_b = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          return;
        }
    }

    da(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        int var2 = 25 % ((param0 - -1) / 41);
        return ((da) this).field_f;
    }

    da(String param0, boolean param1) {
        ((da) this).field_c = param0;
        if (((da) this).field_c == null) {
            ((da) this).field_c = "";
        }
        ((da) this).field_f = param1 ? true : false;
        if (0 == ((da) this).field_c.length()) {
            ((da) this).field_f = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Fullscreen mode";
        field_b = new ka(0, 0);
        field_d = new k(10, 2, 2, 0);
    }
}
