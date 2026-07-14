/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iwa {
    static String field_a;
    static int field_b;
    static String field_c;

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -68) {
            iwa.a((byte) -94, 6);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        lsa var4 = null;
        var3 = VoidHunters.field_G;
        var4 = (lsa) (Object) vfa.field_p.d(0);
        L0: while (true) {
          if (var4 == null) {
            if (param0 != -30) {
              field_b = -29;
              return;
            } else {
              return;
            }
          } else {
            fgb.a(62, param1, var4);
            var4 = (lsa) (Object) vfa.field_p.a((byte) 109);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Blueprint Assault";
        field_c = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
