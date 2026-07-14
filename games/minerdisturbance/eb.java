/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static ta field_f;
    static int field_b;
    static ek field_d;
    static String field_a;
    static String field_g;
    static String field_c;
    static int field_e;

    final static bj a(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        if (!param4) {
          field_c = null;
          return eg.a(-104, param1, false, param2, param0, param3);
        } else {
          return eg.a(-104, param1, false, param2, param0, param3);
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_d = null;
        field_a = null;
        field_g = null;
        if (param0 < 125) {
          field_d = null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void a(byte param0) {
        if ((fh.field_b ^ -1) == -11) {
          dg.a((byte) 117);
          fh.field_b = 11;
          if (param0 <= -2) {
            ul.field_a = true;
            return;
          } else {
            field_d = null;
            ul.field_a = true;
            return;
          }
        } else {
          if (!wc.b(false)) {
            dg.a((byte) 117);
            fh.field_b = 11;
            if (param0 > -2) {
              field_d = null;
              ul.field_a = true;
              return;
            } else {
              ul.field_a = true;
              return;
            }
          } else {
            if (param0 <= -2) {
              ul.field_a = true;
              return;
            } else {
              field_d = null;
              ul.field_a = true;
              return;
            }
          }
        }
    }

    final static boolean a(bj param0, byte param1) {
        if (param1 <= 122) {
            eb.b((byte) 53);
            return param0.b(-1);
        }
        return param0.b(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "Visit the Account Management section on the main site to view.";
        field_f = new ta();
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_g = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = 0;
    }
}
