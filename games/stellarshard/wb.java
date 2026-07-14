/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static oj field_f;
    static int[] field_g;
    static char[] field_d;
    static String field_i;
    static String field_c;
    static String field_b;
    static int[] field_e;
    static java.security.SecureRandom field_a;
    static String field_h;

    final static pb[] a(int param0, int param1, pf param2, int param3) {
        if (param3 != 55) {
            return null;
        }
        if (!tl.a(param2, (byte) -5, param1, param0)) {
            return null;
        }
        return ma.a(false);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static va a(int param0, int param1, int param2, ej param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        va var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        var9 = oe.a(param3, param4, param2, param5, param0, -1);
        var6 = var9;
        if (var9 == null) {
          return null;
        } else {
          var7 = new va();
          var7.field_d = var9;
          java.awt.Component discarded$2 = var7.field_d.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param4, param2);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          var8 = 120 % ((param1 - 78) / 48);
          return var7;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 >= -48) {
          field_f = null;
          field_f = null;
          field_i = null;
          field_e = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_i = null;
          field_e = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new oj();
        field_g = new int[8192];
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_i = "SCANNER";
        field_h = "Error connecting to server. Please try using a different server.";
    }
}
