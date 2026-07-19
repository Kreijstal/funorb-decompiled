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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param1) {
              var3 = (hn) ((Object) da.field_h.d(-9033));
              L1: while (true) {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (-10 != (var3.field_i ^ -1)) {
                      break L2;
                    } else {
                      var3.c((byte) -109);
                      var3 = (hn) ((Object) da.field_h.d(-9033));
                      continue L1;
                    }
                  }
                }
                var4 = ic.field_h.a(param2, -86, param0);
                ii.a(var4, 85);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "di.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
