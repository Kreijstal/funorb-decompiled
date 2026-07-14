/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends hi {
    static String field_o;
    static String field_p;
    static String field_n;

    public static void j(int param0) {
        field_n = null;
        if (param0 != -1) {
            return;
        }
        field_p = null;
        field_o = null;
    }

    final String a(int param0, String param1) {
        if (!(((nb) this).a(param1, (byte) -99) != vh.field_h)) {
            return te.field_L;
        }
        if (param0 == -11300) {
            return null;
        }
        return null;
    }

    final qd a(String param0, byte param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (tk.a(param1 + 109, var4)) {
          if (param1 == -99) {
            var5 = (CharSequence) (Object) param0;
            var3 = th.a(103, var5);
            if (-1 > (var3 ^ -1)) {
              if ((var3 ^ -1) < -131) {
                return vh.field_h;
              } else {
                return nc.field_bb;
              }
            } else {
              return vh.field_h;
            }
          } else {
            return null;
          }
        } else {
          return vh.field_h;
        }
    }

    nb(vi param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Chompolicious";
        field_p = "Next wave in <%0> seconds";
        field_n = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
