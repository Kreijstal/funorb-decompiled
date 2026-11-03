/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um {
    static int field_c;
    static int field_d;
    static String ratingDrawn;
    private static int field_b;
    static boolean field_e;

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        kg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Pool.field_O;
        try {
          var4 = (kg) (ArchiveLoadStep.field_c.last((byte) 65));
          while (var4 != null) {
            fr.a(98, var4, param1);
            var4 = (kg) (ArchiveLoadStep.field_c.previous((byte) -5));
          }
          if (param0 != 10) {
            field_e = false;
          }
          var2 = LoginTextValue.field_f.last((byte) -34);
          while (var2 != null) {
            hi.a(1, param1);
            var2 = LoginTextValue.field_f.previous((byte) -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "um.T(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        ratingDrawn = null;
        if (param0 <= 107) {
          um.releaseStatics(-2);
        }
    }

    static {
        field_b = 10;
        field_c = 1 << field_b;
        ratingDrawn = "Drawn";
    }
}
