/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        hn var3 = null;
        hn var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          if (!param1) {
            return;
          }
          var3 = (hn) (da.field_h.d(-9033));
          while (var3 != null) {
            if (var3.field_i == 9) {
              var3.c((byte) -109);
              var3 = (hn) (da.field_h.d(-9033));
              continue;
            }
            break;
          }
          var4 = ic.field_h.a(param2, -86, param0);
          ii.a(var4, 85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "di.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -10) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Leagues";
    }
}
