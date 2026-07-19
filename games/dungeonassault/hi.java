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
        int decompiledRegionSelector0 = 0;
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
                  var3 = (lk) ((Object) og.field_e.field_J.e(-24172));
                  L2: while (true) {
                    if (var3 == null) {
                      if (param0 == 1) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        field_c = (pd) null;
                        return;
                      }
                    } else {
                      var3.g(255);
                      var3 = (lk) ((Object) og.field_e.field_J.a(param0 + 3));
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "hi.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_b = new fb();
    }
}
