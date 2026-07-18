/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iwa {
    static String field_a;
    static int field_b;
    static String field_c;

    public static void a() {
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        lsa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            var4 = (lsa) (Object) vfa.field_p.d(0);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                fgb.a(62, 2, var4);
                var4 = (lsa) (Object) vfa.field_p.a((byte) 109);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "iwa.B(" + -30 + ',' + 2 + ')');
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
