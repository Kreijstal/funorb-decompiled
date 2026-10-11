/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static gd field_a;
    static fb field_b;
    static pd field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 > -81) {
          field_c = (pd) null;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        lk var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          if (null != og.field_e &&
            og.field_e.field_J != null) {
            var3 = (lk) (og.field_e.field_J.e(-24172));
            while (var3 != null) {
              var3.g(255);
              var3 = (lk) (og.field_e.field_J.a(param0 + 3));
            }
            if (param0 == 1) {
              return;
            }
            field_c = (pd) null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "hi.A(" + param0 + ')');
        }
    }

    static {
        field_b = new fb();
    }
}
