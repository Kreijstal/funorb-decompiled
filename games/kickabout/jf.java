/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends tm {
    static hd field_B;
    static String field_A;
    static hd field_D;

    public static void g(int param0) {
        Object var2 = null;
        if (param0 < 26) {
          var2 = null;
          jf.a(70, (up) null, -110);
          field_D = null;
          field_A = null;
          field_B = null;
          return;
        } else {
          field_D = null;
          field_A = null;
          field_B = null;
          return;
        }
    }

    jf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            return null;
        }
        return new li((Object) (Object) os.a(106, (String) param1[0].field_d));
    }

    final static void a(int param0, up param1, int param2) {
        np.field_Jb.a((gn) (Object) new ie(param2, param1), 3);
        int var3 = -77 % ((param0 - -44) / 63);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "<%0> is not on your ignore list.";
    }
}
