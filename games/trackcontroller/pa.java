/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static ja field_c;
    static long field_b;
    static volatile int field_a;

    public static void a(byte param0) {
        if (param0 > -120) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        dh var4 = null;
        nk var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          var4 = (dh) (field_c.b(param1 - 38));
          while (var4 != null) {
            me.a(var4, 0, param0);
            var4 = (dh) (field_c.a(param1 - 30));
          }
          if (param1 != 40) {
            pa.b((byte) 41);
          }
          var5 = (nk) (qh.field_e.b(param1 ^ 42));
          while (var5 != null) {
            gj.a(2, var5, param0);
            var5 = (nk) (qh.field_e.a(10));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2), "pa.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 91) {
          return true;
        }
        return af.a(9819, gd.b((byte) 77));
    }

    static {
        field_c = new ja();
        field_a = 0;
    }
}
