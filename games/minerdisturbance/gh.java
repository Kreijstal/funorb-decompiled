/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static we field_b;
    static ea field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        il var4 = null;
        jb var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4 = (il) (Object) mf.field_h.b(67);
            L1: while (true) {
              if (var4 == null) {
                var5 = (jb) (Object) sd.field_a.b(96);
                L2: while (true) {
                  if (var5 == null) {
                    if (param1 == 21121) {
                      break L0;
                    } else {
                      gh.a(-85, -101);
                      return;
                    }
                  } else {
                    ti.a(var5, true, param0);
                    var5 = (jb) (Object) sd.field_a.b((byte) 56);
                    continue L2;
                  }
                }
              } else {
                ig.a(param0, 1, var4);
                var4 = (il) (Object) mf.field_h.b((byte) 56);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "gh.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 0;
    }

    static {
    }
}
