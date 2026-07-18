/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static gd field_a;
    static fb field_b;
    static pd field_c;

    public static void a() {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        lk var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (null == og.field_e) {
                break L1;
              } else {
                if (og.field_e.field_J == null) {
                  break L1;
                } else {
                  var3 = (lk) (Object) og.field_e.field_J.e(-24172);
                  L2: while (true) {
                    if (var3 == null) {
                      break L0;
                    } else {
                      var3.g(255);
                      var3 = (lk) (Object) og.field_e.field_J.a(4);
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "hi.A(" + 1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fb();
    }
}
